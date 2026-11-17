// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceVerifyIntlRequest extends TeaModel {
    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>Specifies whether to automatically register the face to the specified face library when no duplicate face is retrieved. Valid values:</p>
     * <ul>
     * <li>0: automatically register.</li>
     * <li>1: do not register. This is the default value.</li>
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
     * <li>N: do not return. This is the default value.</li>
     * <li>Y: return. The result is included in Result.ExtFaceInfo.FaceAttributeInfo.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("FaceAttributeCheck")
    public String faceAttributeCheck;

    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>The codes of the face libraries created by the customer in the console. You can query up to 10 face libraries at the same time. Separate multiple face library codes with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>1232344，23444</p>
     */
    @NameInMap("FaceGroupCodes")
    public String faceGroupCodes;

    /**
     * <p>Specifies whether to check the quality of the face image. Valid values:</p>
     * <ul>
     * <li>Y: enabled.</li>
     * <li>N: disabled. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>The code of the face library for face registration.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceRegisterGroupCode")
    public String faceRegisterGroupCode;

    /**
     * <p>The custom unique business identifier used for subsequent troubleshooting. The value must be a unique combination of up to 32 letters and digits.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or another identifier that can identify a specific user, such as a mobile phone number or email address. Desensitize the value of this field in advance, such as by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The product code. Valid values: FACE_VERIFY_MIN and FACE_IDU_MIN.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FACE_VERIFY_MIN</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>The custom number of faces to return when multiple faces exceed the matching threshold. Default value: 1. Maximum value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnFaces")
    public String returnFaces;

    /**
     * <p>The Base64-encoded portrait photo.</p>
     * <p>Note</p>
     * <ul>
     * <li>If you use this method to pass the portrait photo, check the photo size and do not pass oversized photos.</li>
     * <li>Specify only one of the following parameters: SourceFacePicture, SourceFacePictureUrl, and SourceFacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>The file stream of the face image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("SourceFacePictureFile")
    public String sourceFacePictureFile;

    /**
     * <p>The URL of the portrait image. The URL must be a publicly accessible HTTPS link.</p>
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
     * <li>If you use this method to pass the reference photo, check the photo size and do not pass oversized photos.</li>
     * <li>Specify only one of the following parameters: TargetFacePicture, TargetFacePictureUrl, and TargetFacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>The file stream of the reference face image.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("TargetFacePictureFile")
    public String targetFacePictureFile;

    /**
     * <p>The HTTPS URL of the reference face image.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face2.jpeg</p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    /**
     * <p>Specifies whether to overwrite the existing face with the current face when the MerchantUserId already exists during automatic registration. Valid values:</p>
     * <ul>
     * <li>Y: overwrite.</li>
     * <li>N: do not overwrite and return that the UserId already exists.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("UpdateFaceIfUserExists")
    public String updateFaceIfUserExists;

    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>The verification type. Valid values:</p>
     * <ul>
     * <li><p>0: retrieval mode.</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Passes the face library and the user face image (SourceFacePicture). The system automatically retrieves whether the specified face image (SourceFacePicture) already exists in the face library. Passive liveness detection can be enabled for the face image (SourceFacePicture).</li>
     * <li>Recommended scenario: Scenarios where real persons create an account and duplicate registrations are not allowed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><p>1: verification mode. This is the default value.</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Passes the specified face image (SourceFacePicture) and the reference face image (TargetFacePicture). The system automatically verifies whether the faces match. Passive liveness detection can be enabled for the specified face image (SourceFacePicture).</li>
     * <li>Recommended scenario: Scenarios where you need to verify whether the operation is performed by the user in person when modifying logon or account information.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><p>2: comprehensive mode.</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Passes the face library, the specified face image (SourceFacePicture), and the reference face image (TargetFacePicture) at the same time. The system automatically retrieves whether the specified face image (SourceFacePicture) exists in the face library and whether it matches the reference face. Passive liveness detection can be enabled for the specified face image (SourceFacePicture).</li>
     * <li>Recommended scenario: Scenarios where you need to verify that the user is a new user and the operation is performed in person.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VerifyModel")
    public String verifyModel;

    public static FaceVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceVerifyIntlRequest self = new FaceVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public FaceVerifyIntlRequest setAutoRegistration(String autoRegistration) {
        this.autoRegistration = autoRegistration;
        return this;
    }
    public String getAutoRegistration() {
        return this.autoRegistration;
    }

    public FaceVerifyIntlRequest setFaceAttributeCheck(String faceAttributeCheck) {
        this.faceAttributeCheck = faceAttributeCheck;
        return this;
    }
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    public FaceVerifyIntlRequest setFaceGroupCodes(String faceGroupCodes) {
        this.faceGroupCodes = faceGroupCodes;
        return this;
    }
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    public FaceVerifyIntlRequest setFaceQualityCheck(String faceQualityCheck) {
        this.faceQualityCheck = faceQualityCheck;
        return this;
    }
    public String getFaceQualityCheck() {
        return this.faceQualityCheck;
    }

    public FaceVerifyIntlRequest setFaceRegisterGroupCode(String faceRegisterGroupCode) {
        this.faceRegisterGroupCode = faceRegisterGroupCode;
        return this;
    }
    public String getFaceRegisterGroupCode() {
        return this.faceRegisterGroupCode;
    }

    public FaceVerifyIntlRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public FaceVerifyIntlRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public FaceVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public FaceVerifyIntlRequest setReturnFaces(String returnFaces) {
        this.returnFaces = returnFaces;
        return this;
    }
    public String getReturnFaces() {
        return this.returnFaces;
    }

    public FaceVerifyIntlRequest setSourceFacePicture(String sourceFacePicture) {
        this.sourceFacePicture = sourceFacePicture;
        return this;
    }
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    public FaceVerifyIntlRequest setSourceFacePictureFile(String sourceFacePictureFile) {
        this.sourceFacePictureFile = sourceFacePictureFile;
        return this;
    }
    public String getSourceFacePictureFile() {
        return this.sourceFacePictureFile;
    }

    public FaceVerifyIntlRequest setSourceFacePictureUrl(String sourceFacePictureUrl) {
        this.sourceFacePictureUrl = sourceFacePictureUrl;
        return this;
    }
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    public FaceVerifyIntlRequest setTargetFacePicture(String targetFacePicture) {
        this.targetFacePicture = targetFacePicture;
        return this;
    }
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    public FaceVerifyIntlRequest setTargetFacePictureFile(String targetFacePictureFile) {
        this.targetFacePictureFile = targetFacePictureFile;
        return this;
    }
    public String getTargetFacePictureFile() {
        return this.targetFacePictureFile;
    }

    public FaceVerifyIntlRequest setTargetFacePictureUrl(String targetFacePictureUrl) {
        this.targetFacePictureUrl = targetFacePictureUrl;
        return this;
    }
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

    public FaceVerifyIntlRequest setUpdateFaceIfUserExists(String updateFaceIfUserExists) {
        this.updateFaceIfUserExists = updateFaceIfUserExists;
        return this;
    }
    public String getUpdateFaceIfUserExists() {
        return this.updateFaceIfUserExists;
    }

    public FaceVerifyIntlRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
