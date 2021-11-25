// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class CreateSetResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FaceCount")
    public Integer faceCount;

    @NameInMap("ImageCount")
    public Integer imageCount;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SetId")
    public String setId;

    @NameInMap("SetName")
    public String setName;

    @NameInMap("VideoCount")
    public Integer videoCount;

    @NameInMap("VideoLength")
    public Integer videoLength;

    public static CreateSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSetResponseBody self = new CreateSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSetResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public CreateSetResponseBody setFaceCount(Integer faceCount) {
        this.faceCount = faceCount;
        return this;
    }
    public Integer getFaceCount() {
        return this.faceCount;
    }

    public CreateSetResponseBody setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public CreateSetResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public CreateSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSetResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public CreateSetResponseBody setSetName(String setName) {
        this.setName = setName;
        return this;
    }
    public String getSetName() {
        return this.setName;
    }

    public CreateSetResponseBody setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Integer getVideoCount() {
        return this.videoCount;
    }

    public CreateSetResponseBody setVideoLength(Integer videoLength) {
        this.videoLength = videoLength;
        return this;
    }
    public Integer getVideoLength() {
        return this.videoLength;
    }

}
