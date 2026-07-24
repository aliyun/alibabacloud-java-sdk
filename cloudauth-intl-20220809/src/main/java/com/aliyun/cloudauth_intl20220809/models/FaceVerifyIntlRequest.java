// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceVerifyIntlRequest extends TeaModel {
    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>Specifies whether to automatically register the face to the specified face library when no duplicate face is found during retrieval. Valid values:</p>
     * <ul>
     * <li>0: Automatic registration.</li>
     * <li>1: No registration. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRegistration")
    public String autoRegistration;

    @NameInMap("FaceAttributeCheck")
    public String faceAttributeCheck;

    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>The face library codes created by the customer through the console. A maximum of 10 face libraries can be queried at the same time. Separate multiple face library codes with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1232344，23444</p>
     */
    @NameInMap("FaceGroupCodes")
    public String faceGroupCodes;

    /**
     * <p>Specifies whether to check the quality of the face image. Valid values:</p>
     * <ul>
     * <li>Y: Enabled.</li>
     * <li>N: Disabled. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("FaceQualityCheck")
    public String faceQualityCheck;

    /**
     * <p>Required when ProductCode is set to FACE_IDU_MIN.</p>
     * <p>The code of the face library for registration.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceRegisterGroupCode")
    public String faceRegisterGroupCode;

    /**
     * <p>A custom unique business identifier used for subsequent troubleshooting. The value supports a combination of letters and digits up to 32 characters in length. Make sure the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>A custom user ID or other identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, such as by hashing the value.</p>
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
     * <p>Specifies the number of faces to return when multiple faces exist above the matching threshold. Default value: 1. Maximum value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnFaces")
    public String returnFaces;

    /**
     * <p>The Base64-encoded portrait image.</p>
     * <blockquote>
     * <p><strong>Note</strong></p>
     * <ul>
     * <li>If you use this method to pass in the image, check the image size and do not pass in an excessively large image.</li>
     * <li>Specify one of the following parameters: SourceFacePicture, SourceFacePictureUrl, or SourceFacePictureFile.</li>
     * </ul>
     * </blockquote>
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
     * <p>The publicly accessible HTTPS URL of the portrait image.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face1.jpeg</p>
     */
    @NameInMap("SourceFacePictureUrl")
    public String sourceFacePictureUrl;

    /**
     * <p>The Base64-encoded reference face image.</p>
     * <blockquote>
     * <p><strong>Note</strong></p>
     * <ul>
     * <li>If you use this method to pass in the image, check the image size and do not pass in an excessively large image.</li>
     * <li>Specify one of the following parameters: TargetFacePicture, TargetFacePictureUrl, or TargetFacePictureFile.</li>
     * </ul>
     * </blockquote>
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
     * <p>Required when ProductCode is set to FACE_IDU_MIN. The verification type. Valid values:</p>
     * <ul>
     * <li><p>0: retrieve pattern</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Pass in a face library and a user face image (sourceFacePicture). The system automatically retrieves the face library to check whether the specified face image (sourceFacePicture) already exists. Passive liveness detection can be enabled for the face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Real-person create an account where duplicate registration is not allowed.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><p>1 (default): authenticate pattern</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Pass in a specified face image (sourceFacePicture) and a reference face image (TargetFacePicture). The system automatically authenticates whether the faces match. Passive liveness detection can be enabled for the specified face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Authenticating the identity of the user when modifying logon credentials or account information.</li>
     * </ul>
     * </blockquote>
     * </li>
     * <li><p>2: comprehensive pattern</p>
     * <blockquote>
     * <ul>
     * <li>Feature: Pass in a face library, a specified face image (sourceFacePicture), and a reference face image (TargetFacePicture). The system automatically retrieves the face library to check whether the specified face image (sourceFacePicture) exists, authenticates whether it matches the reference face, and supports enabling passive liveness detection for the specified face image (sourceFacePicture).</li>
     * <li>Recommended scenario: Authenticating that the user is a new user and the operation is performed by the user in person.</li>
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

    public FaceVerifyIntlRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
