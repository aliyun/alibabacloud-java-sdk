// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceCrossCompareIntlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CompareModel")
    public String compareModel;

    /**
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("FaceVerifyThreshold")
    public String faceVerifyThreshold;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_CROSS_COMPARE</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceAFacePicture")
    public String sourceAFacePicture;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
     */
    @NameInMap("SourceAFacePictureUrl")
    public String sourceAFacePictureUrl;

    /**
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceBFacePicture")
    public String sourceBFacePicture;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.xxx.com/1.jpg">https://www.xxx.com/1.jpg</a></p>
     */
    @NameInMap("SourceBFacePictureUrl")
    public String sourceBFacePictureUrl;

    /**
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceCFacePicture")
    public String sourceCFacePicture;

    /**
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
