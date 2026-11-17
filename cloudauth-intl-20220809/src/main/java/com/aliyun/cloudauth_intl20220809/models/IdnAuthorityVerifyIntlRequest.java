// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class IdnAuthorityVerifyIntlRequest extends TeaModel {
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
     * <p>The custom unique business identifier on the merchant side, which is used for subsequent troubleshooting. The value can be up to 32 characters in length and can contain letters and digits. Make sure that the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dso932dsjsd22</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID or other identifier that identifies a specific user, such as a mobile phone number or email address. Desensitize the value of this field in advance, such as by hashing the value.</p>
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
     * <p>The product solution to be integrated. Valid value: IDN_META.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDN_META</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom authentication scenario ID, which is used to query related records by entering this scenario ID in the console later. The value can be up to 10 characters in length and can contain letters, digits, and underscores.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The Base64-encoded portrait photo.</p>
     * <p>Note</p>
     * <ul>
     * <li>If you choose this method to pass the ID photo, check the photo size and do not pass oversized photos.</li>
     * <li>Specify only one of the following parameters: SourceFacePicture, SourceFacePictureUrl, and SourceFacePictureFile.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("SourceFacePicture")
    public String sourceFacePicture;

    /**
     * <p>The file stream of the portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("SourceFacePictureFile")
    public String sourceFacePictureFile;

    /**
     * <p>The URL of the portrait photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
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

    public static IdnAuthorityVerifyIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        IdnAuthorityVerifyIntlRequest self = new IdnAuthorityVerifyIntlRequest();
        return TeaModel.build(map, self);
    }

    public IdnAuthorityVerifyIntlRequest setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    public String getBirthDate() {
        return this.birthDate;
    }

    public IdnAuthorityVerifyIntlRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public IdnAuthorityVerifyIntlRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public String getFullName() {
        return this.fullName;
    }

    public IdnAuthorityVerifyIntlRequest setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public IdnAuthorityVerifyIntlRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public IdnAuthorityVerifyIntlRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public IdnAuthorityVerifyIntlRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public IdnAuthorityVerifyIntlRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public IdnAuthorityVerifyIntlRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public IdnAuthorityVerifyIntlRequest setSourceFacePicture(String sourceFacePicture) {
        this.sourceFacePicture = sourceFacePicture;
        return this;
    }
    public String getSourceFacePicture() {
        return this.sourceFacePicture;
    }

    public IdnAuthorityVerifyIntlRequest setSourceFacePictureFile(String sourceFacePictureFile) {
        this.sourceFacePictureFile = sourceFacePictureFile;
        return this;
    }
    public String getSourceFacePictureFile() {
        return this.sourceFacePictureFile;
    }

    public IdnAuthorityVerifyIntlRequest setSourceFacePictureUrl(String sourceFacePictureUrl) {
        this.sourceFacePictureUrl = sourceFacePictureUrl;
        return this;
    }
    public String getSourceFacePictureUrl() {
        return this.sourceFacePictureUrl;
    }

    public IdnAuthorityVerifyIntlRequest setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
