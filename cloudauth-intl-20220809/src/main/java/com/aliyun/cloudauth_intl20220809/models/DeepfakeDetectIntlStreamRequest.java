// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeepfakeDetectIntlStreamRequest extends TeaModel {
    /**
     * <p>Enter the Base64 encoded format of the face image; for video formats, it is recommended to input via stream.</p>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceBase64")
    public String faceBase64;

    /**
     * <p>Image input stream.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("FaceFile")
    public String faceFile;

    /**
     * <p>Face material input type:</p>
     * <ul>
     * <li>IMAGE (default): Face image</li>
     * <li>VIDEO: Face video</li>
     * </ul>
     * <p>Note: Video processing takes longer, it is recommended to set the timeout &gt; 3S.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("FaceInputType")
    public String faceInputType;

    /**
     * <p>Enter the URL address of the face image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceUrl")
    public String faceUrl;

    /**
     * <p>A unique identifier for the merchant\&quot;s request, consisting of a 32-character alphanumeric combination.</p>
     * <p>The first few characters are composed of a custom abbreviation defined by the merchant, the middle part can include a period of time, and the latter part can use a random or incremental sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The product solution to be integrated.
     * Value: FACE_DEEPFAKE</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_DEEPFAKE</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Your custom authentication scenario ID, used for querying related records by entering this scenario ID in the console later.</p>
     * <p>Supports a combination of 10 characters, including letters, numbers, or underscores.</p>
     * 
     * <strong>example:</strong>
     * <p>123****123</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static DeepfakeDetectIntlStreamRequest build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectIntlStreamRequest self = new DeepfakeDetectIntlStreamRequest();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectIntlStreamRequest setFaceBase64(String faceBase64) {
        this.faceBase64 = faceBase64;
        return this;
    }
    public String getFaceBase64() {
        return this.faceBase64;
    }

    public DeepfakeDetectIntlStreamRequest setFaceFile(String faceFile) {
        this.faceFile = faceFile;
        return this;
    }
    public String getFaceFile() {
        return this.faceFile;
    }

    public DeepfakeDetectIntlStreamRequest setFaceInputType(String faceInputType) {
        this.faceInputType = faceInputType;
        return this;
    }
    public String getFaceInputType() {
        return this.faceInputType;
    }

    public DeepfakeDetectIntlStreamRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public DeepfakeDetectIntlStreamRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DeepfakeDetectIntlStreamRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeepfakeDetectIntlStreamRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
