// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyRequest extends TeaModel {
    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("SourceFaceContrastPicture")
    public String sourceFaceContrastPicture;

    @NameInMap("SourceFaceContrastPictureUrl")
    public String sourceFaceContrastPictureUrl;

    @NameInMap("SourceCertifyId")
    public String sourceCertifyId;

    @NameInMap("SourceOssBucketName")
    public String sourceOssBucketName;

    @NameInMap("SourceOssObjectName")
    public String sourceOssObjectName;

    @NameInMap("TargetFaceContrastPicture")
    public String targetFaceContrastPicture;

    @NameInMap("TargetFaceContrastPictureUrl")
    public String targetFaceContrastPictureUrl;

    @NameInMap("TargetCertifyId")
    public String targetCertifyId;

    @NameInMap("TargetOssBucketName")
    public String targetOssBucketName;

    @NameInMap("TargetOssObjectName")
    public String targetOssObjectName;

    @NameInMap("Crop")
    public String crop;

    public static CompareFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceVerifyRequest self = new CompareFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CompareFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public CompareFaceVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public CompareFaceVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CompareFaceVerifyRequest setSourceFaceContrastPicture(String sourceFaceContrastPicture) {
        this.sourceFaceContrastPicture = sourceFaceContrastPicture;
        return this;
    }
    public String getSourceFaceContrastPicture() {
        return this.sourceFaceContrastPicture;
    }

    public CompareFaceVerifyRequest setSourceFaceContrastPictureUrl(String sourceFaceContrastPictureUrl) {
        this.sourceFaceContrastPictureUrl = sourceFaceContrastPictureUrl;
        return this;
    }
    public String getSourceFaceContrastPictureUrl() {
        return this.sourceFaceContrastPictureUrl;
    }

    public CompareFaceVerifyRequest setSourceCertifyId(String sourceCertifyId) {
        this.sourceCertifyId = sourceCertifyId;
        return this;
    }
    public String getSourceCertifyId() {
        return this.sourceCertifyId;
    }

    public CompareFaceVerifyRequest setSourceOssBucketName(String sourceOssBucketName) {
        this.sourceOssBucketName = sourceOssBucketName;
        return this;
    }
    public String getSourceOssBucketName() {
        return this.sourceOssBucketName;
    }

    public CompareFaceVerifyRequest setSourceOssObjectName(String sourceOssObjectName) {
        this.sourceOssObjectName = sourceOssObjectName;
        return this;
    }
    public String getSourceOssObjectName() {
        return this.sourceOssObjectName;
    }

    public CompareFaceVerifyRequest setTargetFaceContrastPicture(String targetFaceContrastPicture) {
        this.targetFaceContrastPicture = targetFaceContrastPicture;
        return this;
    }
    public String getTargetFaceContrastPicture() {
        return this.targetFaceContrastPicture;
    }

    public CompareFaceVerifyRequest setTargetFaceContrastPictureUrl(String targetFaceContrastPictureUrl) {
        this.targetFaceContrastPictureUrl = targetFaceContrastPictureUrl;
        return this;
    }
    public String getTargetFaceContrastPictureUrl() {
        return this.targetFaceContrastPictureUrl;
    }

    public CompareFaceVerifyRequest setTargetCertifyId(String targetCertifyId) {
        this.targetCertifyId = targetCertifyId;
        return this;
    }
    public String getTargetCertifyId() {
        return this.targetCertifyId;
    }

    public CompareFaceVerifyRequest setTargetOssBucketName(String targetOssBucketName) {
        this.targetOssBucketName = targetOssBucketName;
        return this;
    }
    public String getTargetOssBucketName() {
        return this.targetOssBucketName;
    }

    public CompareFaceVerifyRequest setTargetOssObjectName(String targetOssObjectName) {
        this.targetOssObjectName = targetOssObjectName;
        return this;
    }
    public String getTargetOssObjectName() {
        return this.targetOssObjectName;
    }

    public CompareFaceVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

}
