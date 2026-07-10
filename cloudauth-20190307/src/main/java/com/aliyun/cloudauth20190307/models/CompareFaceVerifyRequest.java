// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CompareFaceVerifyRequest extends TeaModel {
    /**
     * <p>Specifies whether cropping is allowed. Default value: F.</p>
     * <ul>
     * <li>T: detection is required.</li>
     * <li>F: detection is required. (Default: F).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The unique identifier of the merchant request.</p>
     * <p>The value is a 32-character alphanumeric string. The first few characters are a custom abbreviation defined by the merchant, the middle part can be a time segment, and the last part can be a random or incremental sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>Fixed value: PV_FC.</p>
     * 
     * <strong>example:</strong>
     * <p>PV_FC</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The verification scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The CertifyId from a previous successful ID Verification. The photo captured during that verification is used as the face comparison photo.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("SourceCertifyId")
    public String sourceCertifyId;

    /**
     * <p>The Base64-encoded photo.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("SourceFaceContrastPicture")
    public String sourceFaceContrastPicture;

    /**
     * <p>The OSS photo URL. Only authorized OSS photo URLs are supported.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("SourceFaceContrastPictureUrl")
    public String sourceFaceContrastPictureUrl;

    /**
     * <p>The bucket name of the authorized OSS space.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("SourceOssBucketName")
    public String sourceOssBucketName;

    /**
     * <p>The file name in the authorized OSS space.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("SourceOssObjectName")
    public String sourceOssObjectName;

    /**
     * <p>The CertifyId from a previous successful ID Verification. The photo captured during that verification is used as the face comparison photo.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("TargetCertifyId")
    public String targetCertifyId;

    /**
     * <p>The Base64-encoded reference photo.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("TargetFaceContrastPicture")
    public String targetFaceContrastPicture;

    /**
     * <p>The OSS URL of the reference photo. Only authorized OSS photo URLs are supported.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("TargetFaceContrastPictureUrl")
    public String targetFaceContrastPictureUrl;

    /**
     * <p>The bucket name of the authorized OSS space.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("TargetOssBucketName")
    public String targetOssBucketName;

    /**
     * <p>The file name in the authorized OSS space.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a reference face photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one method.</p>
     * </blockquote>
     * 
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
