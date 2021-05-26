// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20201112.models;

import com.aliyun.tea.*;

public class DetectFaceAttributesAdvanceRequest extends TeaModel {
    @NameInMap("ImageFileObject")
    @Validation(required = true)
    public java.io.InputStream imageFileObject;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("ImageUrl")
    public String imageUrl;

    public static DetectFaceAttributesAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectFaceAttributesAdvanceRequest self = new DetectFaceAttributesAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public DetectFaceAttributesAdvanceRequest setImageFileObject(java.io.InputStream imageFileObject) {
        this.imageFileObject = imageFileObject;
        return this;
    }
    public java.io.InputStream getImageFileObject() {
        return this.imageFileObject;
    }

    public DetectFaceAttributesAdvanceRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DetectFaceAttributesAdvanceRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DetectFaceAttributesAdvanceRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
