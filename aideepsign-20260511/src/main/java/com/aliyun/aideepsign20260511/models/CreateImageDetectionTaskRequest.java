// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateImageDetectionTaskRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The credential type code. This parameter is required when <code>DetectType</code> is set to <code>credential</code>. Valid values: <code>0101</code> (ID card), <code>0102</code> (bank card), <code>0104</code> (teacher qualification certificate), <code>0107</code> (student ID), <code>0108</code> (driver license), <code>0201</code> (storefront photo), <code>0202</code> (counter photo), <code>0203</code> (scene photo), <code>0301</code> (business license).</p>
     * 
     * <strong>example:</strong>
     * <p>0101</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <p>The detection type. Valid values: <code>auto</code> (automatic, default), <code>aigc</code> (AIGC detection only), <code>credential</code> (credential detection only).</p>
     * 
     * <strong>example:</strong>
     * <p>auto</p>
     */
    @NameInMap("DetectType")
    public String detectType;

    /**
     * <p>The URL of the image to be detected. Only HTTP and HTTPS protocols are supported. You must specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/id-card.jpg">https://example.com/id-card.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>The <code>ObjectKey</code> of the image to be detected in OSS. When you use <code>ObjectKey</code>, make sure that the key belongs to the namespace of the current caller. You must specify at least one of <code>ImageUrl</code> and <code>ObjectKey</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>deepsign/123456789/scan/abc12345.jpg</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    public static CreateImageDetectionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateImageDetectionTaskRequest self = new CreateImageDetectionTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateImageDetectionTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateImageDetectionTaskRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CreateImageDetectionTaskRequest setDetectType(String detectType) {
        this.detectType = detectType;
        return this;
    }
    public String getDetectType() {
        return this.detectType;
    }

    public CreateImageDetectionTaskRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CreateImageDetectionTaskRequest setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

}
