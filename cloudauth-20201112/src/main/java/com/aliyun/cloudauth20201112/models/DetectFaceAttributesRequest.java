// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesRequest extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("ImageFile")
    public String imageFile;

    public static DetectFaceAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesRequest self = new DetectFaceAttributesRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DetectFaceAttributesRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DetectFaceAttributesRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DetectFaceAttributesRequest setImageFile(String imageFile) {
        this.imageFile = imageFile;
        return this;
    }
    public String getImageFile() {
        return this.imageFile;
    }

}
