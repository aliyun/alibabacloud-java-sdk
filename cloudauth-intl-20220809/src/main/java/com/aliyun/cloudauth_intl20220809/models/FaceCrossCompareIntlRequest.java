// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCrossCompareIntlRequest extends TeaModel {
    /**
     * <p>The comparison mode. Valid values:</p>
     * <ul>
     * <li>0: chain comparison (default). A:B and B:C.</li>
     * <li>1: circular comparison. A:B, B:C, and C:A.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CompareModel")
    public String compareModel;

    /**
     * <p>The face matching threshold. This parameter is reserved by the system and does not support custom values.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("FaceVerifyThreshold")
    public String faceVerifyThreshold;

    /**
     * <p>The custom unique business identifier, used for subsequent troubleshooting. The value is a combination of letters and digits with a length of 32 characters. Ensure that the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The product solution to use. Valid values:
     * FACE_CROSS_COMPARE.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_CROSS_COMPARE</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom business scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The Base64-encoded face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceAFacePicture")
    public String sourceAFacePicture;

    /**
     * <p>The URL of the face photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
     */
    @NameInMap("SourceAFacePictureUrl")
    public String sourceAFacePictureUrl;

    /**
     * <p>The Base64-encoded face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceBFacePicture")
    public String sourceBFacePicture;

    /**
     * <p>The URL of the face photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
     */
    @NameInMap("SourceBFacePictureUrl")
    public String sourceBFacePictureUrl;

    /**
     * <p>The Base64-encoded face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceCFacePicture")
    public String sourceCFacePicture;

    /**
     * <p>The URL of the face photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
     */
    @NameInMap("SourceCFacePictureUrl")
    public String sourceCFacePictureUrl;

    public static FaceCrossCompareIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceCrossCompareIntlRequest self = new FaceCrossCompareIntlRequest();
        return TeaModel.build(map, self);
    }

    public FaceCrossCompareIntlRequest setCompareModel(String compareModel) {
        this.compareModel = compareModel;
        return this;
    }
    public String getCompareModel() {
        return this.compareModel;
    }

    public FaceCrossCompareIntlRequest setFaceVerifyThreshold(String faceVerifyThreshold) {
        this.faceVerifyThreshold = faceVerifyThreshold;
        return this;
    }
    public String getFaceVerifyThreshold() {
        return this.faceVerifyThreshold;
    }

    public FaceCrossCompareIntlRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceCrossCompareIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public FaceCrossCompareIntlRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public FaceCrossCompareIntlRequest setSourceAFacePicture(String sourceAFacePicture) {
        this.sourceAFacePicture = sourceAFacePicture;
        return this;
    }
    public String getSourceAFacePicture() {
        return this.sourceAFacePicture;
    }

    public FaceCrossCompareIntlRequest setSourceAFacePictureUrl(String sourceAFacePictureUrl) {
        this.sourceAFacePictureUrl = sourceAFacePictureUrl;
        return this;
    }
    public String getSourceAFacePictureUrl() {
        return this.sourceAFacePictureUrl;
    }

    public FaceCrossCompareIntlRequest setSourceBFacePicture(String sourceBFacePicture) {
        this.sourceBFacePicture = sourceBFacePicture;
        return this;
    }
    public String getSourceBFacePicture() {
        return this.sourceBFacePicture;
    }

    public FaceCrossCompareIntlRequest setSourceBFacePictureUrl(String sourceBFacePictureUrl) {
        this.sourceBFacePictureUrl = sourceBFacePictureUrl;
        return this;
    }
    public String getSourceBFacePictureUrl() {
        return this.sourceBFacePictureUrl;
    }

    public FaceCrossCompareIntlRequest setSourceCFacePicture(String sourceCFacePicture) {
        this.sourceCFacePicture = sourceCFacePicture;
        return this;
    }
    public String getSourceCFacePicture() {
        return this.sourceCFacePicture;
    }

    public FaceCrossCompareIntlRequest setSourceCFacePictureUrl(String sourceCFacePictureUrl) {
        this.sourceCFacePictureUrl = sourceCFacePictureUrl;
        return this;
    }
    public String getSourceCFacePictureUrl() {
        return this.sourceCFacePictureUrl;
    }

}
