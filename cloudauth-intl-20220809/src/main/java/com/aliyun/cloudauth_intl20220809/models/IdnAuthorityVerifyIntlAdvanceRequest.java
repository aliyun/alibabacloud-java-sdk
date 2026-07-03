// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class IdnAuthorityVerifyIntlAdvanceRequest extends TeaModel {
    /**
     * <p>The date of birth.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2000-01-01</p>
     */
    @NameInMap("BirthDate")
    public String birthDate;

    /**
     * <p>The email address of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a*@gmail.com</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The full name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ray</p>
     */
    @NameInMap("FullName")
    public String fullName;

    /**
     * <p>The ID card number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3612841***47001</p>
     */
    @NameInMap("IdNumber")
    public String idNumber;

    /**
     * <p>The merchant-side custom business unique identifier, which is used for subsequent troubleshooting. The value can be a combination of letters and digits with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dso932dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID, or another identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize the value of this field in advance, for example, by hashing the value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The Indonesian mobile phone number. The number must start with +62, followed by 9 to 11 digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>+6281293671234</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The product solution to use. Set the value to IDN_META.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDN_META</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom authentication scenario ID. You can use this scenario ID to query related records in the console. The value can be a combination of letters, digits, or underscores with a maximum length of 10 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The Base64-encoded facial photo.</p>
     * <blockquote>
     * <p><strong>Note</strong></p>
     * </blockquote>
     * <ul>
     * <li>If you use this method to pass the ID photo, check the photo size and do not pass an excessively large photo.</li>
     * <li>Specify one of the following parameters: SourceFacePicture, SourceFacePictureUrl, or SourceFacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>The file stream of the facial photo.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("SourceFacePictureFile")
    public java.io.InputStream sourceFacePictureFileObject;

    /**
     * <p>The URL of the facial photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p>https://***face1.jpeg</p>
     */
    @NameInMap("SourceFacePictureUrl")
    public String sourceFacePictureUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    public static IdnAuthorityVerifyIntlAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        IdnAuthorityVerifyIntlAdvanceRequest self = new IdnAuthorityVerifyIntlAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    public String getBirthDate() {
        return this.birthDate;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setSourceFacePicture(String sourceFacePicture) {
        this.sourceFacePicture = sourceFacePicture;
        return this;
    }
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setSourceFacePictureFileObject(java.io.InputStream sourceFacePictureFileObject) {
        this.sourceFacePictureFileObject = sourceFacePictureFileObject;
        return this;
    }
    public java.io.InputStream getSourceFacePictureFileObject() {
        return this.sourceFacePictureFileObject;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setSourceFacePictureUrl(String sourceFacePictureUrl) {
        this.sourceFacePictureUrl = sourceFacePictureUrl;
        return this;
    }
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    public IdnAuthorityVerifyIntlAdvanceRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
