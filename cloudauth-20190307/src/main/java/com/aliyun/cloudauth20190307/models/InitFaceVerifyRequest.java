// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitFaceVerifyRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable strict face quality detection in the SDK. Valid values:</p>
     * <ul>
     * <li><p><strong>Y</strong>: Enables strict face quality detection.</p>
     * </li>
     * <li><p><strong>N</strong>: Does not enable strict face quality detection. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you enable this parameter, the SDK must integrate the <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/description-of-sdk-package-clipping">strict face quality detection module</a>. Affected by strict quality detection, the success rate of face scanning may decrease.</li>
     * <li>Only Android SDK 2.3.24 and later are supported.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("AppQualityCheck")
    public String appQualityCheck;

    /**
     * <p>The user authorization ID. The maximum length is 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>92d46b9e9e2d703f2897f350d5bd4149</p>
     */
    @NameInMap("AuthId")
    public String authId;

    /**
     * <p>The date of birth on the ID document.</p>
     * <p>This parameter is required when the <strong>CertType</strong> parameter is set to <strong>PASSPORT</strong> and the <strong>Mode</strong> parameter is set to <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1993-10-10</p>
     */
    @NameInMap("Birthday")
    public String birthday;

    /**
     * <p>The security token that you generate to prevent duplicate and tampered requests.</p>
     * <p>If you specify this parameter, the <strong>CallbackToken</strong> field is displayed in the callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>The callback URL for authentication result notifications. The default callback request method is GET. The callback URL must start with <code>https</code>. After the authentication is completed, the platform invokes this URL and automatically appends the <code>certifyId</code> and <code>passed</code> fields. The value of the <code>passed</code> field is the subcode. Example: <code>https://www.aliyun.com?callbackToken=1000004826&amp;certifyId=shaxxxx&amp;passed=200</code>.</p>
     * <notice>
     * 
     * <ul>
     * <li>The callback is triggered only when the authentication is completed, including both successful and failed authentications. If the authentication is abandoned, an abnormal break occurs, or the authentication is not performed, no notification is sent. We recommend that you invoke the query API operation to obtain the authentication details after you receive the callback notification if needed.</li>
     * <li>The accessibility of the URL is verified before the API operation is invoked. If the URL does not support public network access, a 401 error is returned.</li>
     * <li>The API operation must return HTTP status code 200 after the callback. Otherwise, a retry is triggered, and two callbacks are sent within 3 seconds.</li>
     * </ul>
     * </notice>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>Specifies whether to enable the camera selection feature. Valid values:</p>
     * <ul>
     * <li><p><strong>Y</strong>: Enables the feature.</p>
     * </li>
     * <li><p><strong>N</strong>: Does not enable the feature. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This feature takes effect only in the PC integration mode. After this feature is enabled, users can select a camera for authentication.</p>
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
     * <p>Zhang San</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The ID document number.</p>
     * 
     * <strong>example:</strong>
     * <p>330103xxxxxxxxxxxx</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>The type of the ID document.</p>
     * <p>Only ID cards are supported. Set the value to IDENTITY_CARD.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p><strong>[Deprecated]</strong></p>
     * <p>The CertifyId of a previous successful ID Verification. The photo used in the previous authentication is used as the comparison photo.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
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
     * <li><p><strong>L</strong>: Original long URL.</p>
     * </li>
     * <li><p><strong>S</strong> (default): Short URL.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>L</p>
     */
    @NameInMap("CertifyUrlStyle")
    public String certifyUrlStyle;

    /**
     * <p>The device type of the Web SDK. Valid values: <strong>WEB</strong> and <strong>H5</strong>.</p>
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
     * <p>Specifies whether to allow face image cropping. By default, cropping is not allowed. Valid values:</p>
     * <ul>
     * <li><p>T: Cropping is allowed.</p>
     * </li>
     * <li><p>F: Cropping is not allowed.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If the requested image is not collected by the standard liveness detection SDK, we recommend that you allow face image cropping. After this feature is enabled, the requested image is cropped and corrected before the request is sent to the service.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>Specifies whether to allow album upload. Valid values: Y and N. Default value: N.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableAlbumUpload")
    public String enableAlbumUpload;

    /**
     * <p>Specifies whether to enable the beauty filter. Valid values: Y and N.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableBeauty")
    public String enableBeauty;

    /**
     * <p>Specifies whether to enable speech synthesis for H5 willingness authentication. Valid values: Y and N. Default value: Y.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("EnableTts")
    public String enableTts;

    /**
     * <p>The encryption algorithm. Only the SM2 algorithm is supported.</p>
     * <p>After encrypted transmission is enabled, you must pass the encrypted CertName and CertNo. For more information about encryption, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/description-of-parameter-encryption#task-2229332">Parameter encryption</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>SM2</p>
     */
    @NameInMap("EncryptType")
    public String encryptType;

    /**
     * <p>The Base64-encoded image.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/9j/4AAQSkZJRgABAQAASxxxxxxx</p>
     */
    @NameInMap("FaceContrastPicture")
    public String faceContrastPicture;

    /**
     * <p>The URL of the image in OSS. Only authorized OSS image URLs are supported.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg">https://cn-shanghai-aliyun-cloudauth-xxxxxx.oss-cn-shanghai.aliyuncs.com/verify/xxxxx/xxxxx.jpeg</a></p>
     */
    @NameInMap("FaceContrastPictureUrl")
    public String faceContrastPictureUrl;

    /**
     * <p>The type of the Device Assistant tag. Set the value to <strong>DeviceRisk</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>Outputting Device Assistant tags incurs additional fees. For more information, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/face-guard">Value-added services</a>.</li>
     * <li>If you do not need to output Device Assistant tags, you can leave this parameter empty or do not pass it.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DeviceRisk</p>
     */
    @NameInMap("FaceGuardOutput")
    public String faceGuardOutput;

    /**
     * <p>Specifies whether to display the I Have Completed Authentication button on the H5 downgrade page after authentication is completed. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: Displays the button.</li>
     * <li><strong>N</strong> (default): Hides the button.</li>
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
     * <p>The Metainfo environment parameter. You must obtain this parameter by using the client SDK.</p>
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
     * <p>The method to obtain the passport NFC verification elements. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: User input. The end user manually enters the ID document element information by using the UI provided by the Alibaba Cloud SDK.</p>
     * </li>
     * <li><p><strong>3</strong>: External parameter input. The ID document element information is passed from external sources.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When the NFC decoder decrypts the encrypted information of the passport chip, it needs to obtain three passport elements: name, date of birth, and expiration date.</p>
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
     * <p>Only the following liveness detection types are supported. Custom actions or combinations are not supported.</p>
     * </blockquote>
     * <p>Description
     * Only the following liveness detection types are supported. Custom actions or combinations are not supported.</p>
     * <ul>
     * <li><p><strong>LIVENESS</strong> (default): Blinking.</p>
     * </li>
     * <li><p><strong>PHOTINUS_LIVENESS</strong>: Blinking and colorful light reflection.</p>
     * </li>
     * <li><p><strong>MULTI_ACTION</strong>: Blinking and head turning (the order is random).</p>
     * </li>
     * <li><p><strong>MOVE_ACTION</strong> (recommended): Moving closer or farther and blinking.</p>
     * </li>
     * <li><p><strong>MOVE_PHOTINUS</strong>: Moving closer or farther and colorful light reflection.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><strong>The default liveness detection type</strong> is supported in the following SDK versions:<ul>
     * <li>Android SDK 1.2.6 and later</li>
     * <li>iOS SDK 1.2.4 and later</li>
     * <li>Harmony SDK 1.0.0 and later</li>
     * </ul>
     * </li>
     * <li>Other types are supported in the latest SDK versions for Android, iOS, and Harmony. We recommend that you integrate the latest SDK version.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MOVE_ACTION</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Specifies whether to intercept the request when multiple faces are detected on the terminal. Valid values:</p>
     * <ul>
     * <li><p><strong>Y</strong>: Intercepts the request. The client prompts the user to scan the face again.</p>
     * </li>
     * <li><p><strong>N</strong> (default): Does not intercept the request. The largest face in the face scanning screen is sent to the server for security detection.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("NeedMultiFaceCheck")
    public String needMultiFaceCheck;

    /**
     * <p>The name of the authorized OSS bucket.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-aliyun-cloudauth-xxxxx</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The name of the object in the authorized OSS bucket.</p>
     * <blockquote>
     * <p>You can specify only one of the following parameters to pass the image: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>verify/xxxxx/xxxxxx.jpeg</p>
     */
    @NameInMap("OssObjectName")
    public String ossObjectName;

    /**
     * <p>The unique identifier of the merchant request.</p>
     * <p>The value is a 32-character alphanumeric string. The first few characters are a custom abbreviation of the merchant, the middle part can be a period of time, and the last part can be a random or incremental sequence.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c353888</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>The downgrade configuration when WebRTC or WebAssembly is incompatible during mobile H5 authentication. Valid values:</p>
     * <ul>
     * <li><p><strong>keep</strong>: Downgrade is not supported. The result is directly returned.</p>
     * </li>
     * <li><p><strong>url</strong> (default): Downgrade is supported. The authentication URL is returned. The user opens or switches to a browser by using this URL for authentication.</p>
     * </li>
     * <li><p><strong>video</strong>: Downgrade is supported. The system camera is used to record a 3- to 5-second blinking video for authentication.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When the downgrade mode is set to video, the following features become invalid and product security is reduced. We recommend that you configure this mode only for security scenarios.</p>
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
     * <p>The fixed value. The value of this parameter varies based on the product solution:</p>
     * <ul>
     * <li>APP authentication solution: Set the value to ID_PRO.</li>
     * <li>Face liveness verification solution: Set the value to PV_FV.</li>
     * <li>Liveness detection solution: Set the value to LR_FR.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ID_PRO</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies whether to enable the rare character mode. Valid values:</p>
     * <ul>
     * <li><p><strong>Y</strong>: Enables the mode. Before authentication, an information input box appears. The user must enter the name with rare characters and the ID card number, and agree to the agreement before the authentication process starts.</p>
     * </li>
     * <li><p><strong>N</strong>: Does not enable the mode. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("RarelyCharacters")
    public String rarelyCharacters;

    /**
     * <p>Specifies whether to read the ID document photo. Valid values:</p>
     * <ul>
     * <li><p><strong>Y</strong>: Reads the photo.</p>
     * </li>
     * <li><p><strong>N</strong>: Does not read the photo.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you need to use the face photo from the ID document in subsequent authentication steps, we recommend that you set this parameter to Y.</p>
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
     * <p>The ID of the authentication scenario.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000006</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>The age-friendly configuration parameter. This parameter takes effect for each authentication request. You can select different parameters for each authentication request based on the business property, customer distribution, and operation attribute of your app. The following options are available. Default value: 0.</p>
     * <ul>
     * <li><p><strong>0</strong>: Disables the age-friendly pattern for the current authentication request.</p>
     * </li>
     * <li><p><strong>1</strong>: Enables the age-friendly pattern for the current authentication request.</p>
     * </li>
     * <li><p><strong>2</strong>: Allows the user to select the pattern.</p>
     * </li>
     * </ul>
     * <p>The end user can select the authentication pattern. The product guide page provides two authentication entries: Start Authentication and Senior Authentication Pattern. When the user selects Senior Authentication Pattern, the system enters the age-friendly pattern.</p>
     * <blockquote>
     * <ul>
     * <li>The age-friendly parameter takes effect only when the liveness detection type <strong>Model</strong> is set to <strong>LIVENESS</strong> or <strong>MULTI_ACTION</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SuitableType")
    public String suitableType;

    /**
     * <p>The URL of the UI configuration file.</p>
     * <p>For the complete configuration, see <a href="https://www.alibabacloud.com/help/en/id-verification/financial-grade-id-verification/web-sdk-ui-custom-configuration-description">Web SDK UI custom configuration</a>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
     */
    @NameInMap("UiCustomUrl")
    public String uiCustomUrl;

    /**
     * <p>The custom user ID in the customer business. Make sure that the ID is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The expiration date of the ID document.</p>
     * <p>This parameter is required when the <strong>CertType</strong> parameter is set to <strong>PASSPORT</strong> and the <strong>Mode</strong> parameter is set to <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2039-06-10</p>
     */
    @NameInMap("ValidityDate")
    public String validityDate;

    /**
     * <p>Specifies whether to enable video evidence. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables video evidence.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not enable video evidence. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Because video files are large, the system discards video files to prioritize the transmission of necessary authentication images when the network is unstable. We recommend that you set your business to weakly depend on videos.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("VideoEvidence")
    public String videoEvidence;

    /**
     * <p>The custom willingness content. This parameter is required when personalized settings are enabled. The value is a JSON string of a string list.</p>
     * <ul>
     * <li><p>In the read-along scenario: The content cannot exceed 60 Chinese characters (excluding punctuation marks), and the list contains only one element.</p>
     * </li>
     * <li><p>In the Q&amp;A scenario: You can configure up to three questions. Each question cannot exceed 30 Chinese characters, and each question is an element in the list.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;I, Mr. Wang, agree to the *** agreement.&quot;]</p>
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

    public InitFaceVerifyRequest setEnableAlbumUpload(String enableAlbumUpload) {
        this.enableAlbumUpload = enableAlbumUpload;
        return this;
    }
    public String getEnableAlbumUpload() {
        return this.enableAlbumUpload;
    }

    public InitFaceVerifyRequest setEnableBeauty(String enableBeauty) {
        this.enableBeauty = enableBeauty;
        return this;
    }
    public String getEnableBeauty() {
        return this.enableBeauty;
    }

    public InitFaceVerifyRequest setEnableTts(String enableTts) {
        this.enableTts = enableTts;
        return this;
    }
    public String getEnableTts() {
        return this.enableTts;
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
