// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeShrinkRequest extends TeaModel {
    /**
     * <p><warning>This feature is not supported by <strong>Web SDK</strong>. Please refer to the App SDK integration if needed.</warning></p>
     * <p>Whether to enable strict face quality check:</p>
     * <ul>
     * <li>Y: Enabled (default)</li>
     * <li>N: Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("AppQualityCheck")
    public String appQualityCheck;

    /**
     * <p>Whether to enable authoritative identity verification, currently applicable only to the second-generation ID card in mainland China. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    /**
     * <p>Whether to enable automatic registration</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoRegistration")
    public String autoRegistration;

    /**
     * <p>Security token used for preventing duplication and tampering. If this parameter is passed, the CallbackToken field will be displayed in the callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>7ca5c68d869344ea8eeb30cdfd544544-6358700</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>Callback notification URL for authentication results. The default callback request method is GET, and the callback URL must start with https. After completing the authentication, the platform will call back this URL and automatically add the transactionId, passed, and subcode fields.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com?callbackToken=1000004826&transactionId=shaxxxx&passed=Y&subCode=200">https://www.aliyun.com?callbackToken=1000004826&amp;transactionId=shaxxxx&amp;passed=Y&amp;subCode=200</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>Whether to enable adaptive color-changing window border</p>
     * <ul>
     * <li><strong>Y</strong>: Enabled</li>
     * <li><strong>N</strong>: Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("ChameleonFrameEnable")
    public String chameleonFrameEnable;

    /**
     * <p>Whether to crop. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>Date of birth on the document</p>
     * <p><strong>MRTDInput = 2</strong> is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DateOfBirth")
    public String dateOfBirth;

    /**
     * <p>Expiration date on the document</p>
     * <p><strong>MRTDInput = 2</strong> is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DateOfExpiry")
    public String dateOfExpiry;

    /**
     * <p>The real name of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>User\&quot;s document number.</p>
     * 
     * <strong>example:</strong>
     * <p>411xxxxxxxxxxx0001</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>Customer-defined input for whether to capture additional pages</p>
     */
    @NameInMap("DocPageConfig")
    public String docPageConfigShrink;

    /**
     * <p>Document capture mode.</p>
     * <ul>
     * <li>manual: Manual capture.</li>
     * <li>auto: Automatic capture (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>Document type</p>
     * <blockquote>
     * <p>For eKYC_PRO and ID_OCR_MAX solutions, see the official documentation: <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/certificate-code-table?spm=a2c63.p38356.help-menu-445633.d_2_8_2_0.279147abwKAWbr">https://www.alibabacloud.com/help/zh/ekyc/latest/certificate-code-table?spm=a2c63.p38356.help-menu-445633.d_2_8_2_0.279147abwKAWbr</a></p>
     * </blockquote>
     * <blockquote>
     * <p>For ID_OCR, eKYC, and eYKC_MIN solutions, see the official documentation: Document Type List <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/gnhekqy05ni51m4c?spm=a2c63.p38356.help-menu-445633.d_2_3_1_0_0_0.6243244777KoZ7">https://www.alibabacloud.com/help/zh/ekyc/latest/gnhekqy05ni51m4c?spm=a2c63.p38356.help-menu-445633.d_2_3_1_0_0_0.6243244777KoZ7</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Whether to require evidence video.</p>
     * <ul>
     * <li><p>N: Not required (default).</p>
     * </li>
     * <li><p>Y: During the authentication process, a 1-2 second video of the user\&quot;s face will be captured and returned via the query interface.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Due to the large size of video files, the system may discard them in case of network instability, prioritizing the transmission of necessary images for authentication.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("DocVideo")
    public String docVideo;

    /**
     * <p>Document number</p>
     * <p><strong>MRTDInput = 2</strong> is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DocumentNumber")
    public String documentNumber;

    /**
     * <p>Whether the OCR result page is editable in the document OCR recognition process:</p>
     * <ul>
     * <li><p><strong>0</strong>: Not editable</p>
     * </li>
     * <li><p><strong>1</strong> (default): Editable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EditOcrResult")
    public String editOcrResult;

    /**
     * <p>Enter an Indonesian email address. This field is only effective when Authorize=T.</p>
     * <blockquote>
     * <ul>
     * <li>This field is required only when the Indonesian data source is enabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:evxxx@imigxxxxx.go.id">evxxx@imigxxxxx.go.id</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Experience code</p>
     * 
     * <strong>example:</strong>
     * <p>9be7b7d0180041219e5ab03ac6dab5fb</p>
     */
    @NameInMap("ExperienceCode")
    public String experienceCode;

    /**
     * <p>The face library to be compared</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceGroupCodes")
    public String faceGroupCodes;

    /**
     * <p>Base64 encoded photo. If you choose to pass the face photo via FacePictureBase64, please check the photo size and avoid uploading overly large photos.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <p>URL of the face photo. A publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>Face library for registration.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceRegisterGroupCode")
    public String faceRegisterGroupCode;

    /**
     * <p>Face verification threshold</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("FaceVerifyThreshold")
    public String faceVerifyThreshold;

    /**
     * <p>Face image quality. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <p>Whether to enable certificate anti-counterfeiting detection. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>Custom OCR quality check threshold mode:</p>
     * <ul>
     * <li><strong>0</strong>: Standard mode</li>
     * <li><strong>1</strong>: Strict mode</li>
     * <li><strong>2</strong>: Lenient mode</li>
     * <li><strong>3</strong> (default): Quality check disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>Language configuration. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("LanguageConfig")
    public String languageConfig;

    /**
     * <p>Source of MRTD verification parameters. This parameter is required for decrypting information when reading the document chip via NFC.</p>
     * <ul>
     * <li><p><strong>0</strong>: User input</p>
     * </li>
     * <li><p><strong>1</strong>: OCR read</p>
     * </li>
     * <li><p><strong>2</strong>: Passed through the interface</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MRTDInput")
    public String MRTDInput;

    /**
     * <p>A unique business identifier defined by the merchant, used for subsequent troubleshooting. It supports a combination of letters and numbers, with a maximum length of 32 characters. Ensure its uniqueness.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>Your custom user ID or other identifiers that can uniquely identify a specific user, such as a phone number or email address. It is strongly recommended to pre-desensitize the value of this field, for example, by hashing it.</p>
     * 
     * <strong>example:</strong>
     * <p>1221****6543</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>Metainfo environment parameter, which needs to be obtained through the client SDK.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;bioMetaInfo\&quot;:\&quot;4.1.0:2916352,0\&quot;,\&quot;deviceType\&quot;:\&quot;web\&quot;,\&quot;ua\&quot;:\&quot;Mozilla/5.0 (Macintosh</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>Enter an Indonesian phone number, which must be in the format (starting with +62, followed by 9-11 digits). This field is only effective when Authorize=T.</p>
     * <blockquote>
     * <ul>
     * <li>This field is required only when the Indonesian data source is enabled.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>+6281293671234</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>Type of liveness detection to be performed:</p>
     * <ul>
     * <li><p><strong>LIVENESS</strong> (default): Blinking action liveness detection.</p>
     * </li>
     * <li><p><strong>PHOTINUS_LIVENESS</strong>: Dual liveness detection with blinking action and photinus liveness.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For supported SDK versions, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/sdk-publishing-record?spm=a2c63.p38356.0.i99">SDK Release Records</a>.</li>
     * <li>PC does not support dual liveness detection with photinus.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PHOTINUS_LIVENESS</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Whether to enable OCR. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Ocr")
    public String ocr;

    /**
     * <p>Page configuration for collection, multiple pages are connected using commas. Value range:</p>
     * <ul>
     * <li><p><strong>01</strong>: Front side of the document</p>
     * </li>
     * <li><p><strong>01,02</strong>: Front and back sides of the document</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When this value is set to 01,02, it currently only supports Chinese and Vietnamese IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("Pages")
    public String pages;

    /**
     * <p>When compatibility issues occur with H5-based mobile authentication, whether to allow a fallback handling method.</p>
     * <ul>
     * <li><p><strong>url</strong> (default): Fallback supported. The page displays the authentication URL, which users can copy and open or switch browsers to continue the authentication process.</p>
     * </li>
     * <li><p><strong>keep</strong>: Fallback not supported. The error reason is returned directly, and the authentication process ends.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This switch is not supported on PC.</li>
     * <li>If the business scenario involves completing authentication within an embedded web page in an app, it is recommended to set this parameter to keep, disallowing URL fallback.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("ProcedurePriority")
    public String procedurePriority;

    /**
     * <p>The product solution to be integrated</p>
     * <blockquote>
     * <p>For more details, see the official documentation: <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/product-introduction?spm=a2c63.p38356.0.i1">https://www.alibabacloud.com/help/zh/ekyc/latest/product-introduction?spm=a2c63.p38356.0.i1</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eKYC</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Supports card and face sequence arrangement:</p>
     * <ul>
     * <li>DOC_FACE (default)</li>
     * <li>FACE_DOC</li>
     * </ul>
     * <p>Note: This parameter is required only when ProductCode is KYC_GLOBAL.</p>
     * 
     * <strong>example:</strong>
     * <p>DOC_FACE</p>
     */
    @NameInMap("ProductFlow")
    public String productFlow;

    /**
     * <p>Number of duplicate faces returned</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnFaces")
    public String returnFaces;

    /**
     * <p>Callback URL on the client side.</p>
     * 
     * <strong>example:</strong>
     * <p>http*****</p>
     */
    @NameInMap("ReturnUrl")
    public String returnUrl;

    /**
     * <p>Whether to save the face image</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SaveFacePicture")
    public String saveFacePicture;

    /**
     * <p>Scene code. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>123****123</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>Represents different security levels in the authentication process. Available values:</p>
     * <p>01: Normal mode (default).
     * 02: Secure mode, a relatively strict mode suitable for high-risk scenarios. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("SecurityLevel")
    public String securityLevel;

    /**
     * <p>Whether to display the album upload entry during the document OCR recognition phase:</p>
     * <ul>
     * <li><p><strong>1</strong>: Display (default)</p>
     * </li>
     * <li><p><strong>0</strong>: Do not display</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowAlbumIcon")
    public String showAlbumIcon;

    /**
     * <p>Switch for displaying the guide page:</p>
     * <ul>
     * <li><p><strong>1</strong>: Display (default)</p>
     * </li>
     * <li><p><strong>0</strong>: Do not display</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowGuidePage")
    public String showGuidePage;

    /**
     * <p>Whether to display the recognition result page during the document OCR recognition phase:</p>
     * <ul>
     * <li><p><strong>1</strong>: Display (default)</p>
     * </li>
     * <li><p><strong>0</strong>: Do not display</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowOcrResult")
    public String showOcrResult;

    /**
     * <p>Custom UI configuration. Based on the configuration template, convert your custom UI settings into a JSON string and pass it through this interface. For more information, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/idv-kyc-custom-skin?spm=a2c63.p38356.0.i60">IDV UI Customization</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;guidepage:&quot;: {<strong><strong>}, 
     *   &quot;ocrPage&quot;: {</strong></strong>},
     *   &quot;ocrResultPage&quot;: [<strong><strong>],
     *   &quot;facePage&quot;: {</strong></strong>},
     * }</p>
     */
    @NameInMap("StyleConfig")
    public String styleConfig;

    /**
     * <p>Base64 encoding of the portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>Portrait image URL, accessible via HTTP or HTTPS on the public network.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.xxxxx.com/1.jpg">https://www.xxxxx.com/1.jpg</a></p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    @NameInMap("TemplateConfig")
    public String templateConfig;

    @NameInMap("TemplateRanCount")
    public String templateRanCount;

    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>Optional to enable NFC verification when <strong>DocType</strong>=01000000 (global passport).</p>
     * <ul>
     * <li><strong>Y</strong> (Enabled)</li>
     * <li><strong>N</strong> (Disabled)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("UseNFC")
    public String useNFC;

    /**
     * <p>The type of verification</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VerifyModel")
    public String verifyModel;

    public static InitializeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeShrinkRequest self = new InitializeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InitializeShrinkRequest setAppQualityCheck(String appQualityCheck) {
        this.appQualityCheck = appQualityCheck;
        return this;
    }
    public String getAppQualityCheck() {
        return this.appQualityCheck;
    }

    public InitializeShrinkRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public InitializeShrinkRequest setAutoRegistration(String autoRegistration) {
        this.autoRegistration = autoRegistration;
        return this;
    }
    public String getAutoRegistration() {
        return this.autoRegistration;
    }

    public InitializeShrinkRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitializeShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitializeShrinkRequest setChameleonFrameEnable(String chameleonFrameEnable) {
        this.chameleonFrameEnable = chameleonFrameEnable;
        return this;
    }
    public String getChameleonFrameEnable() {
        return this.chameleonFrameEnable;
    }

    public InitializeShrinkRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public InitializeShrinkRequest setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public InitializeShrinkRequest setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
        return this;
    }
    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public InitializeShrinkRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public InitializeShrinkRequest setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }
    public String getDocNo() {
        return this.docNo;
    }

    public InitializeShrinkRequest setDocPageConfigShrink(String docPageConfigShrink) {
        this.docPageConfigShrink = docPageConfigShrink;
        return this;
    }
    public String getDocPageConfigShrink() {
        return this.docPageConfigShrink;
    }

    public InitializeShrinkRequest setDocScanMode(String docScanMode) {
        this.docScanMode = docScanMode;
        return this;
    }
    public String getDocScanMode() {
        return this.docScanMode;
    }

    public InitializeShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public InitializeShrinkRequest setDocVideo(String docVideo) {
        this.docVideo = docVideo;
        return this;
    }
    public String getDocVideo() {
        return this.docVideo;
    }

    public InitializeShrinkRequest setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public InitializeShrinkRequest setEditOcrResult(String editOcrResult) {
        this.editOcrResult = editOcrResult;
        return this;
    }
    public String getEditOcrResult() {
        return this.editOcrResult;
    }

    public InitializeShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public InitializeShrinkRequest setExperienceCode(String experienceCode) {
        this.experienceCode = experienceCode;
        return this;
    }
    public String getExperienceCode() {
        return this.experienceCode;
    }

    public InitializeShrinkRequest setFaceGroupCodes(String faceGroupCodes) {
        this.faceGroupCodes = faceGroupCodes;
        return this;
    }
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    public InitializeShrinkRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public InitializeShrinkRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public InitializeShrinkRequest setFaceRegisterGroupCode(String faceRegisterGroupCode) {
        this.faceRegisterGroupCode = faceRegisterGroupCode;
        return this;
    }
    public String getFaceRegisterGroupCode() {
        return this.faceRegisterGroupCode;
    }

    public InitializeShrinkRequest setFaceVerifyThreshold(String faceVerifyThreshold) {
        this.faceVerifyThreshold = faceVerifyThreshold;
        return this;
    }
    public String getFaceVerifyThreshold() {
        return this.faceVerifyThreshold;
    }

    public InitializeShrinkRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public InitializeShrinkRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public InitializeShrinkRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public InitializeShrinkRequest setLanguageConfig(String languageConfig) {
        this.languageConfig = languageConfig;
        return this;
    }
    public String getLanguageConfig() {
        return this.languageConfig;
    }

    public InitializeShrinkRequest setMRTDInput(String MRTDInput) {
        this.MRTDInput = MRTDInput;
        return this;
    }
    public String getMRTDInput() {
        return this.MRTDInput;
    }

    public InitializeShrinkRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public InitializeShrinkRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public InitializeShrinkRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitializeShrinkRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InitializeShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitializeShrinkRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public InitializeShrinkRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public InitializeShrinkRequest setProcedurePriority(String procedurePriority) {
        this.procedurePriority = procedurePriority;
        return this;
    }
    public String getProcedurePriority() {
        return this.procedurePriority;
    }

    public InitializeShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitializeShrinkRequest setProductFlow(String productFlow) {
        this.productFlow = productFlow;
        return this;
    }
    public String getProductFlow() {
        return this.productFlow;
    }

    public InitializeShrinkRequest setReturnFaces(String returnFaces) {
        this.returnFaces = returnFaces;
        return this;
    }
    public String getReturnFaces() {
        return this.returnFaces;
    }

    public InitializeShrinkRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitializeShrinkRequest setSaveFacePicture(String saveFacePicture) {
        this.saveFacePicture = saveFacePicture;
        return this;
    }
    public String getSaveFacePicture() {
        return this.saveFacePicture;
    }

    public InitializeShrinkRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public InitializeShrinkRequest setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public InitializeShrinkRequest setShowAlbumIcon(String showAlbumIcon) {
        this.showAlbumIcon = showAlbumIcon;
        return this;
    }
    public String getShowAlbumIcon() {
        return this.showAlbumIcon;
    }

    public InitializeShrinkRequest setShowGuidePage(String showGuidePage) {
        this.showGuidePage = showGuidePage;
        return this;
    }
    public String getShowGuidePage() {
        return this.showGuidePage;
    }

    public InitializeShrinkRequest setShowOcrResult(String showOcrResult) {
        this.showOcrResult = showOcrResult;
        return this;
    }
    public String getShowOcrResult() {
        return this.showOcrResult;
    }

    public InitializeShrinkRequest setStyleConfig(String styleConfig) {
        this.styleConfig = styleConfig;
        return this;
    }
    public String getStyleConfig() {
        return this.styleConfig;
    }

    public InitializeShrinkRequest setTargetFacePicture(String targetFacePicture) {
        this.targetFacePicture = targetFacePicture;
        return this;
    }
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    public InitializeShrinkRequest setTargetFacePictureUrl(String targetFacePictureUrl) {
        this.targetFacePictureUrl = targetFacePictureUrl;
        return this;
    }
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

    public InitializeShrinkRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public InitializeShrinkRequest setTemplateRanCount(String templateRanCount) {
        this.templateRanCount = templateRanCount;
        return this;
    }
    public String getTemplateRanCount() {
        return this.templateRanCount;
    }

    public InitializeShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public InitializeShrinkRequest setUseNFC(String useNFC) {
        this.useNFC = useNFC;
        return this;
    }
    public String getUseNFC() {
        return this.useNFC;
    }

    public InitializeShrinkRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
