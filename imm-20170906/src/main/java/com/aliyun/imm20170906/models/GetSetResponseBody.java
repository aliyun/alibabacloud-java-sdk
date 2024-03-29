// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetSetResponseBody extends TeaModel {
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

    public static GetSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSetResponseBody self = new GetSetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSetResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetSetResponseBody setFaceCount(Integer faceCount) {
        this.faceCount = faceCount;
        return this;
    }
    public Integer getFaceCount() {
        return this.faceCount;
    }

    public GetSetResponseBody setImageCount(Integer imageCount) {
        this.imageCount = imageCount;
        return this;
    }
    public Integer getImageCount() {
        return this.imageCount;
    }

    public GetSetResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSetResponseBody setSetId(String setId) {
        this.setId = setId;
        return this;
    }
    public String getSetId() {
        return this.setId;
    }

    public GetSetResponseBody setSetName(String setName) {
        this.setName = setName;
        return this;
    }
    public String getSetName() {
        return this.setName;
    }

    public GetSetResponseBody setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
        return this;
    }
    public Integer getVideoCount() {
        return this.videoCount;
    }

    public GetSetResponseBody setVideoLength(Integer videoLength) {
        this.videoLength = videoLength;
        return this;
    }
    public Integer getVideoLength() {
        return this.videoLength;
    }

}
