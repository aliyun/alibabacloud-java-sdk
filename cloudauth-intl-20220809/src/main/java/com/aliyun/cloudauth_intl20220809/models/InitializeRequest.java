// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeRequest extends TeaModel {
    /**
     * <p><warning>This feature is <strong>not supported by Web SDK</strong>. To use this feature, refer to App SDK integration.</warning></p>
     * <p>Specifies whether to enable strict face quality detection:</p>
     * <ul>
     * <li>Y: enable (default)</li>
     * <li>N: do not enable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("AppQualityCheck")
    public String appQualityCheck;

    /**
     * <p>Specifies whether to enable authoritative identity verification. Currently, this applies only to second-generation ID cards in the Chinese mainland. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Authorize")
    public String authorize;

    @NameInMap("AutoDocPageConfig")
    public String autoDocPageConfig;

    /**
     * <p>Specifies whether to enable automatic registration.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AutoRegistration")
    public String autoRegistration;

    /**
     * <p>The security token used for anti-replay and anti-tampering verification. If this parameter is passed in, the CallbackToken field is displayed in the callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>7ca5c68d869344ea8eeb30cdfd544544-6358700</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>The callback notification URL for the authentication result. The default callback request method is GET, and the callback URL must start with https. After authentication is completed, the platform calls back this URL and automatically adds the transactionId, passed, and subcode fields.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com?callbackToken=1000004826&transactionId=shaxxxx&passed=Y&subCode=200">https://www.aliyun.com?callbackToken=1000004826&amp;transactionId=shaxxxx&amp;passed=Y&amp;subCode=200</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>Specifies whether to enable the adaptive color-changing window frame.</p>
     * <ul>
     * <li><strong>Y</strong>: enable</li>
     * <li><strong>N</strong>: do not enable</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("ChameleonFrameEnable")
    public String chameleonFrameEnable;

    /**
     * <p>Specifies whether to crop. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The date of birth on the document.</p>
     * <p>Required when <strong>MRTDInput = 2</strong>.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DateOfBirth")
    public String dateOfBirth;

    /**
     * <p>The expiry date on the document.</p>
     * <p>Required when <strong>MRTDInput</strong> = 2.</p>
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
     * <p>John Smith.</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The document number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>411xxxxxxxxxxx0001</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>The custom configuration for whether to capture additional pages.</p>
     */
    @NameInMap("DocPageConfig")
    public java.util.List<String> docPageConfig;

    /**
     * <p>The document capture photo mode.</p>
     * <ul>
     * <li>manual: manual capture.</li>
     * <li>auto: automatic capture (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>The document type.</p>
     * <blockquote>
     * <p>For eKYC_PRO and ID_OCR_MAX solutions, see the official documentation: <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/certificate-code-table?spm=a2c63.p38356.help-menu-445633.d_2_8_2_0.279147abwKAWbr">https://www.alibabacloud.com/help/zh/ekyc/latest/certificate-code-table?spm=a2c63.p38356.help-menu-445633.d_2_8_2_0.279147abwKAWbr</a></p>
     * </blockquote>
     * <blockquote>
     * <p>For ID_OCR, eKYC, and eKYC_MIN solutions, see the official documentation for the document type list: <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/gnhekqy05ni51m4c?spm=a2c63.p38356.help-menu-445633.d_2_3_1_0_0_0.6243244777KoZ7">https://www.alibabacloud.com/help/zh/ekyc/latest/gnhekqy05ni51m4c?spm=a2c63.p38356.help-menu-445633.d_2_3_1_0_0_0.6243244777KoZ7</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Specifies whether to store the verification video.</p>
     * <ul>
     * <li><p>N: not required (default).</p>
     * </li>
     * <li><p>Y: during authentication, the system simultaneously captures the user\&quot;s face verification video (1–2s video file) and returns it through the query operation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Because video files are large, the system discards video files when the network is unstable to prioritize the transmission of essential authentication images.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("DocVideo")
    public String docVideo;

    /**
     * <p>The document number.</p>
     * <p>Required when <strong>MRTDInput = 2</strong>.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DocumentNumber")
    public String documentNumber;

    /**
     * <p>Specifies whether the recognition result page is editable during the document OCR recognition phase:</p>
     * <ul>
     * <li><p><strong>0</strong>: not editable</p>
     * </li>
     * <li><p><strong>1</strong> (default): editable</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EditOcrResult")
    public String editOcrResult;

    /**
     * <p>The Indonesian email address. This field takes effect only when Authorize=T.</p>
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
     * <p>The experience code.</p>
     * 
     * <strong>example:</strong>
     * <p>9be7b7d0180041219e5ab03ac6dab5fb</p>
     */
    @NameInMap("ExperienceCode")
    public String experienceCode;

    @NameInMap("FaceAttributeCheck")
    public String faceAttributeCheck;

    /**
     * <p>The face libraries for comparison.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceGroupCodes")
    public String faceGroupCodes;

    /**
     * <p>The Base64-encoded face photo. If you use FacePictureBase64 to pass in the face photo, check the photo size and do not pass in an excessively large photo.</p>
     * 
     * <strong>example:</strong>
     * <p>Base64</p>
     */
    @NameInMap("FacePictureBase64")
    public String facePictureBase64;

    /**
     * <p>The face photo URL. A publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>The registration face library.</p>
     * 
     * <strong>example:</strong>
     * <p>0e0c34a77f</p>
     */
    @NameInMap("FaceRegisterGroupCode")
    public String faceRegisterGroupCode;

    /**
     * <p>The face verification threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("FaceVerifyThreshold")
    public String faceVerifyThreshold;

    /**
     * <p>The face image quality. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <p>Specifies whether to enable document anti-forgery detection. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>The custom OCR quality detection threshold mode:</p>
     * <ul>
     * <li><strong>0</strong>: standard mode</li>
     * <li><strong>1</strong>: strict mode</li>
     * <li><strong>2</strong>: loose mode</li>
     * <li><strong>3</strong> (default): disable quality detection</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>The language configuration. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("LanguageConfig")
    public String languageConfig;

    /**
     * <p>The MRTD verification parameter input source. This parameter is required to decrypt information when reading document chip information via NFC.</p>
     * <ul>
     * <li><p><strong>0</strong>: user input</p>
     * </li>
     * <li><p><strong>1</strong>: OCR reading</p>
     * </li>
     * <li><p><strong>2</strong>: API input</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MRTDInput")
    public String MRTDInput;

    /**
     * <p>The merchant-defined unique business ID used for subsequent troubleshooting. The value can contain letters and digits with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>Your custom user ID or other identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you desensitize this field value in advance, such as by hashing the value.</p>
     * 
     * <strong>example:</strong>
     * <p>1221****6543</p>
     */
    @NameInMap("MerchantUserId")
    public String merchantUserId;

    /**
     * <p>The Metainfo environment parameter, which must be obtained through the client SDK.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;bioMetaInfo\&quot;:\&quot;4.1.0:2916352,0\&quot;,\&quot;deviceType\&quot;:\&quot;web\&quot;,\&quot;ua\&quot;:\&quot;Mozilla/5.0 (Macintosh</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>The Indonesian phone number. The format must be verified (starting with +62, followed by 9–11 digits). This field takes effect only when Authorize=T.</p>
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
     * <p>The type of liveness detection to perform:</p>
     * <ul>
     * <li><p><strong>LIVENESS</strong> (default): blink action liveness detection.</p>
     * </li>
     * <li><p><strong>PHOTINUS_LIVENESS</strong>: blink action liveness + colorful liveness dual detection.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For supported SDK versions, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/sdk-publishing-record?spm=a2c63.p38356.0.i99">SDK release notes</a>.</li>
     * <li>PC does not support colorful liveness dual detection.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PHOTINUS_LIVENESS</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Specifies whether to enable OCR. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Ocr")
    public String ocr;

    /**
     * <p>Specifies whether to return additional OCR recognition standardized format fields:</p>
     * <p>0: no (default)</p>
     * <p>1: yes</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The collection page configuration. Use commas to connect multiple pages. Valid values:</p>
     * <ul>
     * <li><p><strong>01</strong>: document portrait page</p>
     * </li>
     * <li><p><strong>01,02</strong>: document portrait page and back page</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When this value is set to 01,02, only Chinese ID cards and Vietnamese ID cards are currently supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("Pages")
    public String pages;

    /**
     * <p>Specifies whether to allow a degraded processing method when compatibility issues occur during mobile H5 authentication.</p>
     * <ul>
     * <li><p><strong>url (default)</strong>: supports degradation. The page displays the authentication URL, and the user can copy the URL or switch browsers to continue authentication.</p>
     * </li>
     * <li><p><strong>keep</strong>: does not support degradation. Directly returns the error reason and ends the authentication flow.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>PC does not support this switch.</li>
     * <li>If the business scenario involves completing authentication within an in-app embedded web page, set this parameter to keep to disallow URL degradation.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("ProcedurePriority")
    public String procedurePriority;

    /**
     * <p>The product solution to be integrated.</p>
     * <blockquote>
     * <p>For more information, see the official documentation: <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/product-introduction?spm=a2c63.p38356.0.i1">https://www.alibabacloud.com/help/zh/ekyc/latest/product-introduction?spm=a2c63.p38356.0.i1</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eKYC</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies the order of document and face capture:</p>
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
     * <p>The number of duplicate faces returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReturnFaces")
    public String returnFaces;

    /**
     * <p>The client-side callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>http*****</p>
     */
    @NameInMap("ReturnUrl")
    public String returnUrl;

    /**
     * <p>Specifies whether to save the face picture.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SaveFacePicture")
    public String saveFacePicture;

    /**
     * <p>The scene code. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>123****123</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The pattern that represents different security levels of the authentication flow. Valid values:</p>
     * <p>01: normal pattern (default).
     * 02: safe mode, a relatively strict pattern that is active for high-risk scenarios. (IDV product input parameter)</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("SecurityLevel")
    public String securityLevel;

    /**
     * <p>Specifies whether to display the album upload entry during the document OCR recognition phase:</p>
     * <ul>
     * <li><p><strong>1</strong>: display (default)</p>
     * </li>
     * <li><p><strong>0</strong>: do not display</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowAlbumIcon")
    public String showAlbumIcon;

    /**
     * <p>Specifies whether to display the guide page:</p>
     * <ul>
     * <li><p><strong>1</strong>: display (default)</p>
     * </li>
     * <li><p><strong>0</strong>: do not display</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowGuidePage")
    public String showGuidePage;

    /**
     * <p>Specifies whether to display the recognition result page during the document OCR recognition phase:</p>
     * <ul>
     * <li><p><strong>1</strong>: display (default)</p>
     * </li>
     * <li><p><strong>0</strong>: do not display</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowOcrResult")
    public String showOcrResult;

    /**
     * <p>The custom UI configuration. Convert your custom UI configuration to a JSON string based on the configuration template and pass it in through this operation. For more information, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/idv-kyc-custom-skin?spm=a2c63.p38356.0.i60">IDV UI style customization</a>.</p>
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
     * <p>The Base64-encoded portrait photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>The portrait image URL. A publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.xxxxx.com/1.jpg">https://www.xxxxx.com/1.jpg</a></p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    /**
     * <p>The custom action pool configuration for liveness detection.
     * This parameter is required when Model is TEMPLATE.
     * Configuration rule: separate multiple action codes with commas. Best Practices: include at least one frontal face action (such as blink), and do not exceed 3 actions in total.
     * Action lookup table:</p>
     * <ul>
     * <li>Blink: 01</li>
     * <li>Open Mouth: 02</li>
     * <li>Shake Head Left: 03</li>
     * <li>Shake Head Right: 04</li>
     * <li>Move Farther: 05</li>
     * <li>Move Closer: 06</li>
     * <li>Photinus: 07</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01,02,07</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The number of actions randomly selected from TemplateConfig.
     * Takes effect only when TemplateType is Ran.</p>
     * <ul>
     * <li>Validation rules:</li>
     * <li>The value must be greater than 1. The value must be less than or equal to the total number of actions configured in TemplateConfig. If not specified, the default value equals the total number of actions in TemplateConfig.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TemplateRanCount")
    public String templateRanCount;

    /**
     * <p>The execution order of liveness detection actions in TemplateConfig.
     * This parameter is required when Model is TEMPLATE.</p>
     * <ul>
     * <li>Seq: executes in the order configured in TemplateConfig from left to right.</li>
     * <li>Ran: executes in random order. When this option is selected, TemplateConfig must contain more than one action.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Seq</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>When <strong>DocType</strong> = 01000000 (global passport), specifies whether to enable NFC verification.</p>
     * <ul>
     * <li><strong>Y</strong> (enable)</li>
     * <li><strong>N</strong> (do not enable)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("UseNFC")
    public String useNFC;

    /**
     * <p>The verification type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VerifyModel")
    public String verifyModel;

    public static InitializeRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeRequest self = new InitializeRequest();
        return TeaModel.build(map, self);
    }

    public InitializeRequest setAppQualityCheck(String appQualityCheck) {
        this.appQualityCheck = appQualityCheck;
        return this;
    }
    public String getAppQualityCheck() {
        return this.appQualityCheck;
    }

    public InitializeRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public InitializeRequest setAutoDocPageConfig(String autoDocPageConfig) {
        this.autoDocPageConfig = autoDocPageConfig;
        return this;
    }
    public String getAutoDocPageConfig() {
        return this.autoDocPageConfig;
    }

    public InitializeRequest setAutoRegistration(String autoRegistration) {
        this.autoRegistration = autoRegistration;
        return this;
    }
    public String getAutoRegistration() {
        return this.autoRegistration;
    }

    public InitializeRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitializeRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitializeRequest setChameleonFrameEnable(String chameleonFrameEnable) {
        this.chameleonFrameEnable = chameleonFrameEnable;
        return this;
    }
    public String getChameleonFrameEnable() {
        return this.chameleonFrameEnable;
    }

    public InitializeRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public InitializeRequest setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public InitializeRequest setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
        return this;
    }
    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public InitializeRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public InitializeRequest setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }
    public String getDocNo() {
        return this.docNo;
    }

    public InitializeRequest setDocPageConfig(java.util.List<String> docPageConfig) {
        this.docPageConfig = docPageConfig;
        return this;
    }
    public java.util.List<String> getDocPageConfig() {
        return this.docPageConfig;
    }

    public InitializeRequest setDocScanMode(String docScanMode) {
        this.docScanMode = docScanMode;
        return this;
    }
    public String getDocScanMode() {
        return this.docScanMode;
    }

    public InitializeRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public InitializeRequest setDocVideo(String docVideo) {
        this.docVideo = docVideo;
        return this;
    }
    public String getDocVideo() {
        return this.docVideo;
    }

    public InitializeRequest setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public InitializeRequest setEditOcrResult(String editOcrResult) {
        this.editOcrResult = editOcrResult;
        return this;
    }
    public String getEditOcrResult() {
        return this.editOcrResult;
    }

    public InitializeRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public InitializeRequest setExperienceCode(String experienceCode) {
        this.experienceCode = experienceCode;
        return this;
    }
    public String getExperienceCode() {
        return this.experienceCode;
    }

    public InitializeRequest setFaceAttributeCheck(String faceAttributeCheck) {
        this.faceAttributeCheck = faceAttributeCheck;
        return this;
    }
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    public InitializeRequest setFaceGroupCodes(String faceGroupCodes) {
        this.faceGroupCodes = faceGroupCodes;
        return this;
    }
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    public InitializeRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public InitializeRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public InitializeRequest setFaceRegisterGroupCode(String faceRegisterGroupCode) {
        this.faceRegisterGroupCode = faceRegisterGroupCode;
        return this;
    }
    public String getFaceRegisterGroupCode() {
        return this.faceRegisterGroupCode;
    }

    public InitializeRequest setFaceVerifyThreshold(String faceVerifyThreshold) {
        this.faceVerifyThreshold = faceVerifyThreshold;
        return this;
    }
    public String getFaceVerifyThreshold() {
        return this.faceVerifyThreshold;
    }

    public InitializeRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public InitializeRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public InitializeRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public InitializeRequest setLanguageConfig(String languageConfig) {
        this.languageConfig = languageConfig;
        return this;
    }
    public String getLanguageConfig() {
        return this.languageConfig;
    }

    public InitializeRequest setMRTDInput(String MRTDInput) {
        this.MRTDInput = MRTDInput;
        return this;
    }
    public String getMRTDInput() {
        return this.MRTDInput;
    }

    public InitializeRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public InitializeRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public InitializeRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitializeRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InitializeRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitializeRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public InitializeRequest setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public InitializeRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public InitializeRequest setProcedurePriority(String procedurePriority) {
        this.procedurePriority = procedurePriority;
        return this;
    }
    public String getProcedurePriority() {
        return this.procedurePriority;
    }

    public InitializeRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitializeRequest setProductFlow(String productFlow) {
        this.productFlow = productFlow;
        return this;
    }
    public String getProductFlow() {
        return this.productFlow;
    }

    public InitializeRequest setReturnFaces(String returnFaces) {
        this.returnFaces = returnFaces;
        return this;
    }
    public String getReturnFaces() {
        return this.returnFaces;
    }

    public InitializeRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitializeRequest setSaveFacePicture(String saveFacePicture) {
        this.saveFacePicture = saveFacePicture;
        return this;
    }
    public String getSaveFacePicture() {
        return this.saveFacePicture;
    }

    public InitializeRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public InitializeRequest setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public InitializeRequest setShowAlbumIcon(String showAlbumIcon) {
        this.showAlbumIcon = showAlbumIcon;
        return this;
    }
    public String getShowAlbumIcon() {
        return this.showAlbumIcon;
    }

    public InitializeRequest setShowGuidePage(String showGuidePage) {
        this.showGuidePage = showGuidePage;
        return this;
    }
    public String getShowGuidePage() {
        return this.showGuidePage;
    }

    public InitializeRequest setShowOcrResult(String showOcrResult) {
        this.showOcrResult = showOcrResult;
        return this;
    }
    public String getShowOcrResult() {
        return this.showOcrResult;
    }

    public InitializeRequest setStyleConfig(String styleConfig) {
        this.styleConfig = styleConfig;
        return this;
    }
    public String getStyleConfig() {
        return this.styleConfig;
    }

    public InitializeRequest setTargetFacePicture(String targetFacePicture) {
        this.targetFacePicture = targetFacePicture;
        return this;
    }
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    public InitializeRequest setTargetFacePictureUrl(String targetFacePictureUrl) {
        this.targetFacePictureUrl = targetFacePictureUrl;
        return this;
    }
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

    public InitializeRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public InitializeRequest setTemplateRanCount(String templateRanCount) {
        this.templateRanCount = templateRanCount;
        return this;
    }
    public String getTemplateRanCount() {
        return this.templateRanCount;
    }

    public InitializeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public InitializeRequest setUseNFC(String useNFC) {
        this.useNFC = useNFC;
        return this;
    }
    public String getUseNFC() {
        return this.useNFC;
    }

    public InitializeRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
