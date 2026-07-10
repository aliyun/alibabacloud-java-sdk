// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyRequest extends TeaModel {
    /**
     * <p>Specifies whether the SDK enables strict face quality detection:</p>
     * <ul>
     * <li><p><strong>Y</strong>: enabled.</p>
     * </li>
     * <li><p><strong>N</strong>: disabled (default).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If this parameter is enabled, the SDK must integrate the <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/description-of-sdk-package-clipping">strict face quality detection module</a>. Strict quality detection may reduce the face authentication success rate.</li>
     * <li>Only Android SDK 2.3.24 and later versions are supported.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("AppQualityCheck")
    public String appQualityCheck;

    /**
     * <p>The user authorization ID. Maximum length: 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>92d46b9e9e2d703f2897f350d5bd4149</p>
     */
    @NameInMap("AuthId")
    public String authId;

    /**
     * <p>The date of birth on the certificate.</p>
     * <p>This field is required when <strong>CertType</strong> is set to <strong>PASSPORT</strong> and <strong>Mode</strong> is set to <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1993-10-10</p>
     */
    @NameInMap("Birthday")
    public String birthday;

    /**
     * <p>The security token that you generate to prevent duplication and tampering.</p>
     * <p>If this value is set, the <strong>CallbackToken</strong> field is displayed in the callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>The callback URL for the authentication result. The callback request method is GET by default, and the callback URL must start with <code>https</code>. After authentication is complete, the platform calls back this URL and automatically appends the <code>certifyId</code> and <code>passed</code> fields. The <code>passed</code> field returns the subcode value. Example: <code>https://www.alibabacloud.com?callbackToken=1000004826&amp;certifyId=shaxxxx&amp;passed=200.</code></p>
     * <notice>
     * 
     * <ul>
     * <li>The callback is triggered only when authentication is complete (including both passed and failed). If the user abandons authentication, an abnormal break occurs, or authentication is not performed, no notification is sent. After receiving the callback notification, invoke the query operation to obtain authentication details if needed.</li>
     * <li>The URL is validated for public network access before the operation is invoked. If the URL is not accessible over the public network, a 401 error is returned.</li>
     * <li>After receiving the callback, return HTTP status code 200. Otherwise, a retry is triggered with two callbacks within 3 seconds.</li>
     * </ul>
     * </notice>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>Specifies whether to enable the camera selection feature:</p>
     * <ul>
     * <li><p><strong>Y</strong>: enabled.</p>
     * </li>
     * <li><p><strong>N</strong>: disabled (default).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This feature takes effect only for PC integration mode. After this feature is enabled, users can select a camera for authentication.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("CameraSelection")
    public String cameraSelection;

    /**
     * <p>The real name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The certificate number.</p>
     * 
     * <strong>example:</strong>
     * <p>330103xxxxxxxxxxxx</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>The certificate type.
     * Currently, only ID cards are supported. Set this parameter to IDENTITY_CARD.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <blockquote>
     * <p>Warning: This parameter will be deprecated.</warning></p>
     * </blockquote>
     * <p>The CertifyId from a previous successful ID Verification. The photo from that authentication is used as the comparison photo.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select only one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0bfa7c493f850e5178b9f8613634c9xx</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>The type of the returned <strong>CertifyUrl</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>L</strong>: original long URL.</p>
     * </li>
     * <li><p><strong>S</strong> (default): short URL.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>L</p>
     */
    @NameInMap("CertifyUrlStyle")
    public String certifyUrlStyle;

    /**
     * <p>The Web SDK device type. Valid values: <strong>WEB</strong> or <strong>H5</strong>.</p>
     * <blockquote>
     * <p>Only Web SDK device types are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WEB</p>
     */
    @NameInMap("CertifyUrlType")
    public String certifyUrlType;

    /**
     * <p>Specifies whether to allow cropping of the face photo. By default, cropping is not allowed.</p>
     * <ul>
     * <li><p>T: allows cropping.</p>
     * </li>
     * <li><p>F: does not allow cropping.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the requested image is not captured by a standard liveness detection SDK, allow cropping of the face photo. After this feature is enabled, the requested image is cropped and corrected before the request is sent to the service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableBeauty")
    public String enableBeauty;

    /**
     * <p>The encryption algorithm. Currently, only the SM2 algorithm is supported.</p>
     * <p>After encrypted transmission is enabled, pass in the encrypted CertName and CertNo. For more information about encryption, refer to <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/description-of-parameter-encryption#task-2229332">Parameter encryption description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SM2</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The Base64-encoded photo.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select only one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    /**
     * <p>The OSS photo URL. Currently, only authorized OSS photo URLs are supported.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select only one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    /**
     * <p>The device assistant tag type. Valid values: <strong>DeviceRisk</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>Selecting device assistant output incurs additional fees. For more information, refer to <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/face-guard">Paid value-added services</a>.</li>
     * <li>If you do not need device assistant tag output, do not pass this parameter or pass an empty value.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DeviceRisk</p>
     */
    @NameInMap("FaceGuardOutput")
    public String faceGuardOutput;

    /**
     * <p>Specifies whether to display the &quot;I have completed authentication&quot; button on the H5 fallback page after authentication is complete:</p>
     * <ul>
     * <li><strong>Y</strong>: enabled.</li>
     * <li><strong>N</strong> (default): disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("H5DegradeConfirmBtn")
    public String h5DegradeConfirmBtn;

    /**
     * <p>The IP address of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>114.xxx.xxx.xxx</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>The Metainfo environment parameter, which must be obtained through the client SDK.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:11501568,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>The mobile phone number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>130xxxxxxxx</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The method for obtaining passport NFC verification elements:</p>
     * <ul>
     * <li><p><strong>1</strong>: user input. The end user manually enters certificate element information using the UI provided by the Alibaba Cloud SDK.</p>
     * </li>
     * <li><p><strong>3</strong>: external parameter input. Certificate element information is passed in externally.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To decode the encrypted information on the passport chip through NFC, three passport elements are required: name, date of birth, and certificate expiration date.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The liveness detection type. Valid values:</p>
     * <blockquote>
     * <p>The liveness detection type supports only the following values. Custom actions or combinations are not supported.</p>
     * </blockquote>
     * <p>Note:
     * The liveness detection type supports only the following values. Custom actions or combinations are not supported.</p>
     * <ul>
     * <li><p><strong>LIVENESS</strong> (default): blink</p>
     * </li>
     * <li><p><strong>PHOTINUS_LIVENESS</strong>: blink + colorful light</p>
     * </li>
     * <li><p><strong>MULTI_ACTION</strong>: blink + head shake (the order of blink and head shake is random)</p>
     * </li>
     * <li><p><strong>MOVE_ACTION</strong> (recommended): move closer/farther + blink</p>
     * </li>
     * <li><p><strong>MOVE_PHOTINUS</strong>: move closer/farther + colorful light</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><strong>The default liveness detection type</strong> is supported in the following versions:<ul>
     * <li>Android SDK 1.2.6 and later</li>
     * <li>iOS SDK 1.2.4 and later</li>
     * <li>Harmony SDK 1.0.0 and later</li>
     * </ul>
     * </li>
     * <li>Other types are supported in the latest Android/iOS/Harmony SDK versions. Integrate the latest version.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MOVE_ACTION</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Specifies whether to block authentication when multiple faces are detected on the device. Valid values:</p>
     * <ul>
     * <li><p><strong>Y</strong>: blocked. The client prompts the user to redo face authentication.</p>
     * </li>
     * <li><p><strong>N</strong> (default): not blocked. The largest face in the frame is sent to the server for security detection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("NeedMultiFaceCheck")
    public String needMultiFaceCheck;

    /**
     * <p>The bucket name of the authorized OSS space.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select only one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The file name in the authorized OSS space.</p>
     * <blockquote>
     * <p>You can use one of the following four methods to submit a photo: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select only one method.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <p>The unique identifier of the merchant request.</p>
     * <p>The value is a 32-character alphanumeric string. The first few characters are a custom abbreviation defined by the merchant, the middle part can be a time segment, and the last part can be a random or incremental sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>The fallback configuration when WebRTC or WebAssembly is incompatible during mobile H5 authentication.</p>
     * <ul>
     * <li><p><strong>keep</strong>: fallback is not supported. The system returns directly.</p>
     * </li>
     * <li><p><strong>url</strong> (default): fallback is supported. An authentication URL is returned. The user opens or switches to a browser to authenticate using this URL.</p>
     * </li>
     * <li><p><strong>video</strong>: fallback is supported. The system camera records a 3 to 5 second blink video for authentication.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When the fallback mode is Video, the following features are disabled and product security is reduced. Configure this mode only for security scenarios.</p>
     * <ul>
     * <li>The liveness detection type setting does not take effect.</li>
     * <li>The VideoEvidence feature is not supported.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("ProcedurePriority")
    public String procedurePriority;

    /**
     * <p>A fixed value. This parameter varies depending on the product plan:</p>
     * <ul>
     * <li>APP authentication plan: set to ID_PRO.</li>
     * <li>Face liveness verification plan: set to PV_FV.</li>
     * <li>Liveness detection plan: set to LR_FR.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies whether to enable the rare character mode:</p>
     * <ul>
     * <li><p><strong>Y</strong>: enabled. An information input box is displayed before authentication. The user must enter the name with rare characters and the ID card number, and agree to the protocol before starting the authentication process.</p>
     * </li>
     * <li><p><strong>N</strong>: disabled (default).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("RarelyCharacters")
    public String rarelyCharacters;

    /**
     * <p>Specifies whether to read the certificate photo:</p>
     * <ul>
     * <li><p><strong>Y</strong>: read.</p>
     * </li>
     * <li><p><strong>N</strong>: do not read.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the certificate face photo is needed in subsequent authentication steps, set this parameter to Y.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("ReadImg")
    public String readImg;

    /**
     * <p>The redirect URL for the merchant business page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("ReturnUrl")
    public String returnUrl;

    /**
     * <p>The authentication scenario ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The elderly-friendly configuration parameter. This parameter takes effect for each authentication request. You can select different parameters for each authentication request based on the business attributes, customer distribution, and operational characteristics of your app. Valid values (default: 0):</p>
     * <ul>
     * <li><p><strong>0</strong>: disabled. The elderly-friendly mode is not enabled for the current authentication request.</p>
     * </li>
     * <li><p><strong>1</strong>: enabled. The elderly-friendly mode is enabled for the current authentication request.</p>
     * </li>
     * <li><p><strong>2</strong>: user choice.</p>
     * </li>
     * </ul>
     * <p>Allows the end user to select the authentication mode. The product guide page provides two authentication entries: &quot;Start Authentication&quot; and &quot;Elderly Authentication Mode&quot;. When the user selects &quot;Elderly Authentication Mode&quot;, the system enters elderly-friendly mode.</p>
     * <blockquote>
     * <ul>
     * <li>The elderly-friendly parameter takes effect only when the liveness detection type <strong>Model</strong> is set to <strong>LIVENESS</strong> or <strong>MULTI_ACTION</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SuitableType")
    public String suitableType;

    /**
     * <p>The UI configuration file URL.</p>
     * <p>You can view the complete configuration in <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/web-sdk-ui-custom-configuration-description">Web SDK UI custom configuration</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("UiCustomUrl")
    public String uiCustomUrl;

    /**
     * <p>The custom user ID defined by the business. Keep this value unique.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The certificate expiration date.</p>
     * <p>This field is required when <strong>CertType</strong> is set to <strong>PASSPORT</strong> and <strong>Mode</strong> is set to <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2039-06-10</p>
     */
    @NameInMap("ValidityDate")
    public String validityDate;

    /**
     * <p>Specifies whether to enable video evidence:</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled.</p>
     * </li>
     * <li><p><strong>false</strong>: disabled (default).</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Because video files are large, the system discards video files to prioritize the transmission of essential authentication images when the network is unstable. Set video as a weak dependency in your business logic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoEvidence")
    public String videoEvidence;

    /**
     * <p>The custom voluntary content. This parameter is required when personalized settings are enabled. The format is a JSON string of a String List.</p>
     * <ul>
     * <li><p>For read-aloud scenarios: the content cannot exceed 60 Chinese characters (excluding punctuation), and the List contains only 1 element.</p>
     * </li>
     * <li><p>For Q&amp;A scenarios: a maximum of 3 questions can be set. Each question cannot exceed 30 Chinese characters, and each question is a separate element in the List.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;本人王先生同意***协议。&quot;]</p>
     */
    @NameInMap("VoluntaryCustomizedContent")
    public String voluntaryCustomizedContent;

    public static InitFaceVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitFaceVerifyRequest self = new InitFaceVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitFaceVerifyRequest setAppQualityCheck(String appQualityCheck) {
        this.appQualityCheck = appQualityCheck;
        return this;
    }
    public String getAppQualityCheck() {
        return this.appQualityCheck;
    }

    public InitFaceVerifyRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public InitFaceVerifyRequest setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }
    public String getBirthday() {
        return this.birthday;
    }

    public InitFaceVerifyRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitFaceVerifyRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitFaceVerifyRequest setCameraSelection(String cameraSelection) {
        this.cameraSelection = cameraSelection;
        return this;
    }
    public String getCameraSelection() {
        return this.cameraSelection;
    }

    public InitFaceVerifyRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public InitFaceVerifyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public InitFaceVerifyRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public InitFaceVerifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public InitFaceVerifyRequest setCertifyUrlStyle(String certifyUrlStyle) {
        this.certifyUrlStyle = certifyUrlStyle;
        return this;
    }
    public String getCertifyUrlStyle() {
        return this.certifyUrlStyle;
    }

    public InitFaceVerifyRequest setCertifyUrlType(String certifyUrlType) {
        this.certifyUrlType = certifyUrlType;
        return this;
    }
    public String getCertifyUrlType() {
        return this.certifyUrlType;
    }

    public InitFaceVerifyRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public InitFaceVerifyRequest setEnableBeauty(String enableBeauty) {
        this.enableBeauty = enableBeauty;
        return this;
    }
    public String getEnableBeauty() {
        return this.enableBeauty;
    }

    public InitFaceVerifyRequest setEncryptType(String encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public String getEncryptType() {
        return this.encryptType;
    }

    public InitFaceVerifyRequest setFaceContrastPicture(String faceContrastPicture) {
        this.faceContrastPicture = faceContrastPicture;
        return this;
    }
    public String getFaceContrastPicture() {
        return this.faceContrastPicture;
    }

    public InitFaceVerifyRequest setFaceContrastPictureUrl(String faceContrastPictureUrl) {
        this.faceContrastPictureUrl = faceContrastPictureUrl;
        return this;
    }
    public String getFaceContrastPictureUrl() {
        return this.faceContrastPictureUrl;
    }

    public InitFaceVerifyRequest setFaceGuardOutput(String faceGuardOutput) {
        this.faceGuardOutput = faceGuardOutput;
        return this;
    }
    public String getFaceGuardOutput() {
        return this.faceGuardOutput;
    }

    public InitFaceVerifyRequest setH5DegradeConfirmBtn(String h5DegradeConfirmBtn) {
        this.h5DegradeConfirmBtn = h5DegradeConfirmBtn;
        return this;
    }
    public String getH5DegradeConfirmBtn() {
        return this.h5DegradeConfirmBtn;
    }

    public InitFaceVerifyRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public InitFaceVerifyRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitFaceVerifyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InitFaceVerifyRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public InitFaceVerifyRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitFaceVerifyRequest setNeedMultiFaceCheck(String needMultiFaceCheck) {
        this.needMultiFaceCheck = needMultiFaceCheck;
        return this;
    }
    public String getNeedMultiFaceCheck() {
        return this.needMultiFaceCheck;
    }

    public InitFaceVerifyRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public InitFaceVerifyRequest setOssObjectName(String ossObjectName) {
        this.ossObjectName = ossObjectName;
        return this;
    }
    public String getOssObjectName() {
        return this.ossObjectName;
    }

    public InitFaceVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public InitFaceVerifyRequest setProcedurePriority(String procedurePriority) {
        this.procedurePriority = procedurePriority;
        return this;
    }
    public String getProcedurePriority() {
        return this.procedurePriority;
    }

    public InitFaceVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitFaceVerifyRequest setRarelyCharacters(String rarelyCharacters) {
        this.rarelyCharacters = rarelyCharacters;
        return this;
    }
    public String getRarelyCharacters() {
        return this.rarelyCharacters;
    }

    public InitFaceVerifyRequest setReadImg(String readImg) {
        this.readImg = readImg;
        return this;
    }
    public String getReadImg() {
        return this.readImg;
    }

    public InitFaceVerifyRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitFaceVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public InitFaceVerifyRequest setSuitableType(String suitableType) {
        this.suitableType = suitableType;
        return this;
    }
    public String getSuitableType() {
        return this.suitableType;
    }

    public InitFaceVerifyRequest setUiCustomUrl(String uiCustomUrl) {
        this.uiCustomUrl = uiCustomUrl;
        return this;
    }
    public String getUiCustomUrl() {
        return this.uiCustomUrl;
    }

    public InitFaceVerifyRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public InitFaceVerifyRequest setValidityDate(String validityDate) {
        this.validityDate = validityDate;
        return this;
    }
    public String getValidityDate() {
        return this.validityDate;
    }

    public InitFaceVerifyRequest setVideoEvidence(String videoEvidence) {
        this.videoEvidence = videoEvidence;
        return this;
    }
    public String getVideoEvidence() {
        return this.videoEvidence;
    }

    public InitFaceVerifyRequest setVoluntaryCustomizedContent(String voluntaryCustomizedContent) {
        this.voluntaryCustomizedContent = voluntaryCustomizedContent;
        return this;
    }
    public String getVoluntaryCustomizedContent() {
        return this.voluntaryCustomizedContent;
    }

}
