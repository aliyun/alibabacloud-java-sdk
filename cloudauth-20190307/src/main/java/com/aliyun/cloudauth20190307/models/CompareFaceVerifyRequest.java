// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyRequest extends TeaModel {
    @NameInMap("Crop")
    public String crop;

    /**
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <strong>example:</strong>
     * <p>PV_FC</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("SourceCertifyId")
    public String sourceCertifyId;

    /**
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("SourceFaceContrastPicture")
    public String sourceFaceContrastPicture;

    /**
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("SourceFaceContrastPictureUrl")
    public String sourceFaceContrastPictureUrl;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("SourceOssBucketName")
    public String sourceOssBucketName;

    /**
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("SourceOssObjectName")
    public String sourceOssObjectName;

    /**
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("TargetCertifyId")
    public String targetCertifyId;

    /**
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("TargetFaceContrastPicture")
    public String targetFaceContrastPicture;

    /**
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("TargetFaceContrastPictureUrl")
    public String targetFaceContrastPictureUrl;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("TargetOssBucketName")
    public String targetOssBucketName;

    /**
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("TargetOssObjectName")
    public String targetOssObjectName;

    public static CompareFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceVerifyRequest self = new CompareFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CompareFaceVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
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

    public CompareFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public CompareFaceVerifyRequest setSourceCertifyId(String sourceCertifyId) {
        this.sourceCertifyId = sourceCertifyId;
        return this;
    }
    public String getSourceCertifyId() {
        return this.sourceCertifyId;
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

    public CompareFaceVerifyRequest setTargetCertifyId(String targetCertifyId) {
        this.targetCertifyId = targetCertifyId;
        return this;
    }
    public String getTargetCertifyId() {
        return this.targetCertifyId;
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

}
