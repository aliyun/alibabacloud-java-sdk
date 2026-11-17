// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCompareRequest extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> Specifies whether to enable the quality check for the input face image.</p>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("FacePictureQualityCheck")
    public String facePictureQualityCheck;

    /**
     * <p>The face quality check.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The custom unique business identifier on the merchant side, which is used for subsequent troubleshooting. It supports a combination of letters and digits, with a maximum length of 32 characters. Make sure that the identifier is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The Base64-encoded portrait photo.</p>
     * <p>Note</p>
     * <ul>
     * <li>If you choose this method to pass the ID photo, check the photo size and do not pass oversized photos.</li>
     * <li>Specify either SourceFacePicture or SourceFacePictureUrl.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>The HTTPS or HTTP URL of the face image.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face1.jpeg</p>
     */
    @NameInMap("SourceFacePictureUrl")
    public String sourceFacePictureUrl;

    /**
     * <p>The Base64-encoded reference photo.</p>
     * <p>Note</p>
     * <ul>
     * <li>If you choose this method to pass the ID photo, check the photo size and do not pass oversized photos.</li>
     * <li>Specify either TargetFacePicture or TargetFacePictureUrl.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>The HTTPS or HTTP URL of the reference face image.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face2.jpeg</p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    public static FaceCompareRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceCompareRequest self = new FaceCompareRequest();
        return TeaModel.build(map, self);
    }

    public FaceCompareRequest setFacePictureQualityCheck(String facePictureQualityCheck) {
        this.facePictureQualityCheck = facePictureQualityCheck;
        return this;
    }
    public String getFacePictureQualityCheck() {
        return this.facePictureQualityCheck;
    }

    public FaceCompareRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public FaceCompareRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceCompareRequest setSourceFacePicture(String sourceFacePicture) {
        this.sourceFacePicture = sourceFacePicture;
        return this;
    }
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    public FaceCompareRequest setSourceFacePictureUrl(String sourceFacePictureUrl) {
        this.sourceFacePictureUrl = sourceFacePictureUrl;
        return this;
    }
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    public FaceCompareRequest setTargetFacePicture(String targetFacePicture) {
        this.targetFacePicture = targetFacePicture;
        return this;
    }
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    public FaceCompareRequest setTargetFacePictureUrl(String targetFacePictureUrl) {
        this.targetFacePictureUrl = targetFacePictureUrl;
        return this;
    }
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

}
