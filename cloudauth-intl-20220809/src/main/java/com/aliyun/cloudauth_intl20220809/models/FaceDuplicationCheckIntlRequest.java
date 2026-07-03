// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceDuplicationCheckIntlRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically register the face in the specified face library when no duplicate face is found during the search. Valid values:</p>
     * <ul>
     * <li>0: Automatic registration.</li>
     * <li>1: No registration (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRegistration")
    public String autoRegistration;

    /**
     * <p>The face library codes created by the customer in the console. A maximum of 10 face libraries can be queried at the same time. Separate multiple face library codes with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1232344，23444</p>
     */
    @NameInMap("FaceGroupCodes")
    public String faceGroupCodes;

    /**
     * <p>Specifies whether to enable face quality check.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>The face library for registration.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceRegisterGroupCode")
    public String faceRegisterGroupCode;

    /**
     * <p>The face matching threshold. &gt;Warning: This is a reserved field and is not currently enabled.</warning></p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("FaceVerifyThreshold")
    public String faceVerifyThreshold;

    /**
     * <p>Specifies whether to enable passive liveness detection. Valid values:</p>
     * <ul>
     * <li>0: Disabled.</li>
     * <li>1: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Liveness")
    public String liveness;

    /**
     * <p>The custom unique business identifier, used for subsequent troubleshooting. The value is a combination of letters and digits up to 32 characters in length. Ensure that the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID, or another identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, for example, by hashing the value.</p>
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
     * <p>Specifies the number of faces to return when multiple faces above the matching threshold exist.</p>
     * <ul>
     * <li>Default value: 1.</li>
     * <li>Maximum value: 5.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnFaces")
    public String returnFaces;

    /**
     * <p>Specifies the type of face data to save. Valid values:</p>
     * <ul>
     * <li>0: face image (default)</li>
     * <li>1: feature<blockquote>
     * <p>Warning: This is a reserved field and is not currently enabled.</warning></p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SaveFacePicture")
    public String saveFacePicture;

    /**
     * <p>The custom verification scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The Base64-encoded face image.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>The URL of the face image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face1.jpeg</p>
     */
    @NameInMap("SourceFacePictureUrl")
    public String sourceFacePictureUrl;

    /**
     * <p>The Base64-encoded face image.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>The URL of the face image. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face2.jpeg</p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    /**
     * <p>The authentication type. Valid values:</p>
     * <ul>
     * <li><p>0: retrieval pattern</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Submits a face library and a user face image (sourceFacePicture). The system automatically retrieves faces from the face library to determine whether the specified face image (sourceFacePicture) already exists. Passive liveness detection can be enabled for the face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Real-person scenarios where you want to create an account and duplicate registration is not allowed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><p>1 (default): authentication pattern</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Submits a specified face image (sourceFacePicture) and a retained face image (TargetFacePicture). The system automatically authenticates whether the faces match. Passive liveness detection can be enabled for the specified face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Authenticating the identity of the operator when logon credentials or account information is modified.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><p>2: comprehensive pattern</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Submits a face library, a specified face image (sourceFacePicture), and a retained face image (TargetFacePicture). The system automatically retrieves faces from the face library to determine whether the specified face image (sourceFacePicture) exists and whether it matches the retained face image. Passive liveness detection can be enabled for the specified face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Authenticating that the user is new and the operation is performed by the user in person.</li>
     * </ul>
     * </blockquote>
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

    public FaceDuplicationCheckIntlRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
