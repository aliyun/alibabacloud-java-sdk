// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceDuplicationCheckIntlRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically register the face to the specified face library if no duplicate face is found during the search. Valid values:</p>
     * <ul>
     * <li>0: Register.</li>
     * <li>1: Do not register. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRegistration")
    public String autoRegistration;

    /**
     * <p>Specifies whether to return additional face attribute information. Valid values:</p>
     * <ul>
     * <li>N: Do not return. This is the default value.</li>
     * <li>Y: Return. The result is located in Result.ExtFaceInfo.FaceAttributeInfo.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("FaceAttributeCheck")
    public String faceAttributeCheck;

    /**
     * <p>The codes of the face libraries created by the customer in the console. A maximum of 10 face libraries can be queried at the same time. Separate multiple face library codes with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>1232344，23444</p>
     */
    @NameInMap("FaceGroupCodes")
    public String faceGroupCodes;

    /**
     * <p>The face quality check.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The code of the face library for face registration.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceRegisterGroupCode")
    public String faceRegisterGroupCode;

    /**
     * <p>The face matching threshold. <warning>Reserved field. Not enabled yet.</warning></p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("FaceVerifyThreshold")
    public String faceVerifyThreshold;

    /**
     * <p>Specifies whether to enable passive liveness detection. Valid values:</p>
     * <ul>
     * <li>0: Disable.</li>
     * <li>1: Enable.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The custom unique business identifier used for subsequent troubleshooting. The value supports a combination of up to 32 letters and digits. Make sure that the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or other identifier that can identify a specific user, such as a mobile phone number or email address. Desensitize the value of this field in advance, such as by hashing the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The product code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_IDU_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies the number of faces to return when multiple faces exceed the matching threshold. Default value: 1. Maximum value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnFaces")
    public String returnFaces;

    /**
     * <p>Specifies the type of face data to save. Valid values:</p>
     * <ul>
     * <li>0: Face image. This is the default value.</li>
     * <li>1: Face feature.
     * <warning>Reserved field. Not enabled yet.</warning></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SaveFacePicture")
    public String saveFacePicture;

    /**
     * <p>The custom authentication scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The Base64-encoded portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>The URL of the portrait image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face1.jpeg</p>
     */
    @NameInMap("SourceFacePictureUrl")
    public String sourceFacePictureUrl;

    /**
     * <p>The Base64-encoded portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>The URL of the portrait image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face2.jpeg</p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    /**
     * <p>Specifies whether to overwrite the original face with the current face if the MerchantUserId already exists during automatic registration. Valid values:</p>
     * <ul>
     * <li>Y: Overwrite.</li>
     * <li>N: Do not overwrite and return that the UserId already exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("UpdateFaceIfUserExists")
    public String updateFaceIfUserExists;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li>0: Retrieve pattern<ul>
     * <li>Feature: The system receives a face library and a user face image (sourceFacePicture), and automatically retrieves from the face library to check whether the specified face image (sourceFacePicture) already exists. Passive liveness detection can be enabled for the face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Scenarios where a real person needs to create an account and duplicate registration is not allowed.</li>
     * </ul>
     * </li>
     * <li>1 (default): Authenticate pattern<ul>
     * <li>Feature: The system receives a specified face image (sourceFacePicture) and a retained face image (TargetFacePicture), and automatically authenticates whether the faces match. Passive liveness detection can be enabled for the specified face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Scenarios where it is required to authenticate whether the operation is performed by the user when modifying logon or account information.</li>
     * </ul>
     * </li>
     * <li>2: Comprehensive pattern<ul>
     * <li>Feature: The system receives a face library, a specified face image (sourceFacePicture), and a retained face image (TargetFacePicture) at the same time, and automatically retrieves from the face library to check whether the specified face image (sourceFacePicture) exists and authenticates whether it matches the retained face. Passive liveness detection can be enabled for the specified face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Scenarios where it is required to authenticate that the user is a new user and the operation is performed by the user.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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

    public FaceDuplicationCheckIntlRequest setFaceAttributeCheck(String faceAttributeCheck) {
        this.faceAttributeCheck = faceAttributeCheck;
        return this;
    }
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    public FaceDuplicationCheckIntlRequest setFaceGroupCodes(String faceGroupCodes) {
        this.faceGroupCodes = faceGroupCodes;
        return this;
    }
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    public FaceDuplicationCheckIntlRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
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

    public FaceDuplicationCheckIntlRequest setUpdateFaceIfUserExists(String updateFaceIfUserExists) {
        this.updateFaceIfUserExists = updateFaceIfUserExists;
        return this;
    }
    public String getUpdateFaceIfUserExists() {
        return this.updateFaceIfUserExists;
    }

    public FaceDuplicationCheckIntlRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
