// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceDuplicationCheckIntlRequest extends TeaModel {
    /**
     * <p>Indicates whether to automatically register the face to the specified face library if no duplicate face is found.</p>
     * <ul>
     * <li>0- Auto-register (default)</li>
     * <li>1- Do not register</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoRegistration")
    public String autoRegistration;

    /**
     * <p>The face library code created through the console, supporting up to 10 face libraries simultaneously. When multiple face library codes are passed, they should be separated by commas.</p>
     * 
     * <strong>example:</strong>
     * <p>1232344，23444</p>
     */
    @NameInMap("FaceGroupCodes")
    public String faceGroupCodes;

    /**
     * <p>Face registration library.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceRegisterGroupCode")
    public String faceRegisterGroupCode;

    /**
     * <p>Face matching threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("FaceVerifyThreshold")
    public String faceVerifyThreshold;

    /**
     * <p>Whether to enable silent liveness detection</p>
     * <ul>
     * <li>0- Disabled</li>
     * <li>1- Enabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>A unique business identifier for troubleshooting purposes. It supports a combination of 32 alphanumeric characters, please ensure its uniqueness.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>Your custom user ID or other identifiers that can uniquely identify a specific user, such as a phone number or email address. It is strongly recommended to pre-desensitize the value of this field, for example, by hashing it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Product code</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_IDU_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>When there are multiple faces above the matching threshold, you can use this parameter to customize the number of returned faces</p>
     * <ul>
     * <li>Default returns 1</li>
     * <li>Maximum support 5</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnFaces")
    public String returnFaces;

    /**
     * <p>Distinguishes between saving the face image and features</p>
     * <ul>
     * <li>0- Face (default)</li>
     * <li>1- Features</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SaveFacePicture")
    public String saveFacePicture;

    /**
     * <p>Your custom authentication scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>Base64 encoded portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>Portrait image URL, accessible via public HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face1.jpeg</p>
     */
    @NameInMap("SourceFacePictureUrl")
    public String sourceFacePictureUrl;

    /**
     * <p>Base64 encoded portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>Portrait image URL, accessible via public HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face2.jpeg</p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    /**
     * <p>Verification type</p>
     * <ul>
     * <li>0- 1:N (default)</li>
     * <li>1- 1:1</li>
     * <li>2- 1:N + 1:1</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VerifyModel")
    public String verifyModel;

    public static FaceDuplicationCheckIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceDuplicationCheckIntlRequest self = new FaceDuplicationCheckIntlRequest();
        return TeaModel.build(map, self);
    }

    public FaceDuplicationCheckIntlRequest setAutoRegistration(String autoRegistration) {
        this.autoRegistration = autoRegistration;
        return this;
    }
    public String getAutoRegistration() {
        return this.autoRegistration;
    }

    public FaceDuplicationCheckIntlRequest setFaceGroupCodes(String faceGroupCodes) {
        this.faceGroupCodes = faceGroupCodes;
        return this;
    }
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    public FaceDuplicationCheckIntlRequest setFaceRegisterGroupCode(String faceRegisterGroupCode) {
        this.faceRegisterGroupCode = faceRegisterGroupCode;
        return this;
    }
    public String getFaceRegisterGroupCode() {
        return this.faceRegisterGroupCode;
    }

    public FaceDuplicationCheckIntlRequest setFaceVerifyThreshold(String faceVerifyThreshold) {
        this.faceVerifyThreshold = faceVerifyThreshold;
        return this;
    }
    public String getFaceVerifyThreshold() {
        return this.faceVerifyThreshold;
    }

    public FaceDuplicationCheckIntlRequest setLiveness(String liveness) {
        this.liveness = liveness;
        return this;
    }
    public String getLiveness() {
        return this.liveness;
    }

    public FaceDuplicationCheckIntlRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceDuplicationCheckIntlRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public FaceDuplicationCheckIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public FaceDuplicationCheckIntlRequest setReturnFaces(String returnFaces) {
        this.returnFaces = returnFaces;
        return this;
    }
    public String getReturnFaces() {
        return this.returnFaces;
    }

    public FaceDuplicationCheckIntlRequest setSaveFacePicture(String saveFacePicture) {
        this.saveFacePicture = saveFacePicture;
        return this;
    }
    public String getSaveFacePicture() {
        return this.saveFacePicture;
    }

    public FaceDuplicationCheckIntlRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public FaceDuplicationCheckIntlRequest setSourceFacePicture(String sourceFacePicture) {
        this.sourceFacePicture = sourceFacePicture;
        return this;
    }
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    public FaceDuplicationCheckIntlRequest setSourceFacePictureUrl(String sourceFacePictureUrl) {
        this.sourceFacePictureUrl = sourceFacePictureUrl;
        return this;
    }
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    public FaceDuplicationCheckIntlRequest setTargetFacePicture(String targetFacePicture) {
        this.targetFacePicture = targetFacePicture;
        return this;
    }
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    public FaceDuplicationCheckIntlRequest setTargetFacePictureUrl(String targetFacePictureUrl) {
        this.targetFacePictureUrl = targetFacePictureUrl;
        return this;
    }
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

    public FaceDuplicationCheckIntlRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
