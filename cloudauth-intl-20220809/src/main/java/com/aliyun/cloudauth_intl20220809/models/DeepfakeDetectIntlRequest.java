// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeepfakeDetectIntlRequest extends TeaModel {
    /**
     * <p>The Base64-encoded content of the facial image.</p>
     * <blockquote>
     * <p>Specify either FaceUrl or FaceBase64.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceBase64")
    public String faceBase64;

    /**
     * <p>Set the value to <strong>IMAGE</strong> to specify a facial image.</p>
     * 
     * <strong>example:</strong>
     * <p>IMAGE</p>
     */
    @NameInMap("FaceInputType")
    public String faceInputType;

    /**
     * <p>The URL of the facial image.</p>
     * <blockquote>
     * <p>Specify either FaceUrl or FaceBase64.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceUrl")
    public String faceUrl;

    /**
     * <p>The unique identifier of the merchant request. The value is a 32-character combination of letters and digits. The first few characters are a custom merchant abbreviation, the middle part can contain a timestamp, and the last part can be a random or incremental sequence.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The product solution to use. Set the value to <strong>FACE_DEEPFAKE</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_DEEPFAKE</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom scene ID for authentication. You can use this scene ID to query related records in the console. The value can be up to 10 characters long and can contain letters, digits, and underscores.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    public static DeepfakeDetectIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeepfakeDetectIntlRequest self = new DeepfakeDetectIntlRequest();
        return TeaModel.build(map, self);
    }

    public DeepfakeDetectIntlRequest setFaceBase64(String faceBase64) {
        this.faceBase64 = faceBase64;
        return this;
    }
    public String getFaceBase64() {
        return this.faceBase64;
    }

    public DeepfakeDetectIntlRequest setFaceInputType(String faceInputType) {
        this.faceInputType = faceInputType;
        return this;
    }
    public String getFaceInputType() {
        return this.faceInputType;
    }

    public DeepfakeDetectIntlRequest setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
        return this;
    }
    public String getFaceUrl() {
        return this.faceUrl;
    }

    public DeepfakeDetectIntlRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public DeepfakeDetectIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DeepfakeDetectIntlRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
