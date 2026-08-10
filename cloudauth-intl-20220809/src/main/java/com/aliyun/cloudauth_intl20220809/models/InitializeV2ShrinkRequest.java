// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class InitializeV2ShrinkRequest extends TeaModel {
    /**
     * <p><warning>This feature is not supported by the <strong>Web SDK</strong>. To use this feature, refer to the App SDK integration.</warning></p>
     * <p>Specifies whether to enable strict face quality detection. Valid values:</p>
     * <ul>
     * <li>Y: Enabled. This is the default value.</li>
     * <li>N: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("AppQualityCheck")
    public String appQualityCheck;

    /**
     * <p>Specifies whether to enable authoritative identity verification. Currently, this applies only to second-generation ID cards in the Chinese mainland. This is an input parameter for the IDV product.</p>
     * 
     * <strong>example:</strong>
     * <p>T</p>
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
     * <p>The callback URL for the authentication result notification. The callback request method is GET by default, and the callback URL must start with https. After the authentication is complete, the platform calls back this URL and automatically appends the transactionId, passed, and subcode fields.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com?callbackToken=1000004826&transactionId=shaxxxx&passed=Y&subCode=200">https://www.aliyun.com?callbackToken=1000004826&amp;transactionId=shaxxxx&amp;passed=Y&amp;subCode=200</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>Specifies whether to enable the adaptive color-changing window frame.</p>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("ChameleonFrameEnable")
    public String chameleonFrameEnable;

    /**
     * <p>Specifies whether to enable cropping. This is an input parameter for the IDV product.</p>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("Crop")
    public String crop;

    /**
     * <p>The date of birth on the document.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DateOfBirth")
    public String dateOfBirth;

    /**
     * <p>The expiration date on the document.</p>
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
     * <p>Zhang**</p>
     */
    @NameInMap("DocName")
    public String docName;

    /**
     * <p>The document number of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>410***************</p>
     */
    @NameInMap("DocNo")
    public String docNo;

    /**
     * <p>The custom configuration for whether to collect additional pages.</p>
     * 
     * <strong>example:</strong>
     * <p>OCR_ID_BACK</p>
     */
    @NameInMap("DocPageConfig")
    public String docPageConfigShrink;

    /**
     * <p>The document capture photo mode.</p>
     * 
     * <strong>example:</strong>
     * <p>manual</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>The document type.</p>
     * <blockquote>
     * <p>For the eKYC_PRO and ID_OCR_MAX solutions, see the official documentation at <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/certificate-code-table?spm=a2c63.p38356.help-menu-445633.d_2_8_2_0.279147abwKAWbr">https://www.alibabacloud.com/help/zh/ekyc/latest/certificate-code-table?spm=a2c63.p38356.help-menu-445633.d_2_8_2_0.279147abwKAWbr</a></p>
     * </blockquote>
     * <blockquote>
     * <p>For the ID_OCR, eKYC, and eKYC_MIN solutions, see the document type list in the official documentation at <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/gnhekqy05ni51m4c?spm=a2c63.p38356.help-menu-445633.d_2_3_1_0_0_0.6243244777KoZ7">https://www.alibabacloud.com/help/zh/ekyc/latest/gnhekqy05ni51m4c?spm=a2c63.p38356.help-menu-445633.d_2_3_1_0_0_0.6243244777KoZ7</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>00000001</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Specifies whether to collect a verification video.</p>
     * <ul>
     * <li><p>N: No verification video is collected. This is the default value.</p>
     * </li>
     * <li><p>Y: A short video (1 to 2 seconds) of the user\&quot;s face verification process is collected during authentication and returned through the query operation.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Because video files are large, the system discards video files when the network is unstable to prioritize the transmission of images required for authentication.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("DocVideo")
    public String docVideo;

    /**
     * <p>The document number.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("DocumentNumber")
    public String documentNumber;

    /**
     * <p>Specifies whether the recognition result page is editable during the document OCR recognition step:</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("EditOcrResult")
    public String editOcrResult;

    /**
     * <p>The Indonesian email address. This field takes effect only when Authorize is set to T.</p>
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
     * <p>The face libraries to compare against.</p>
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
     * <p>The file stream of the face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("FacePictureFile")
    public String facePictureFile;

    /**
     * <p>The URL of the face photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg">https://digital-face-prod8.oss-cn-hangzhou.aliyuncs.com/1669520556530-expo/default/face/20221127114236530_w3kx2e6t.jpg</a></p>
     */
    @NameInMap("FacePictureUrl")
    public String facePictureUrl;

    /**
     * <p>The face registration library.</p>
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
     * <p>The face image quality. This is an input parameter for the IDV product.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdFaceQuality")
    public String idFaceQuality;

    /**
     * <p>Specifies whether to enable document anti-spoofing detection. This is an input parameter for the IDV product.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>The custom OCR quality detection threshold mode:</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IdThreshold")
    public String idThreshold;

    /**
     * <p>The language configuration. This is an input parameter for the IDV product.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("LanguageConfig")
    public String languageConfig;

    /**
     * <p>The source of the MRTD verification parameter input. This parameter is required to decrypt information when reading document chip data via NFC.</p>
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
     * <p>The merchant-defined unique business ID used for subsequent troubleshooting. The value supports a combination of letters and numbers with a maximum length of 32 characters. Ensure that the value is unique.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a***353888</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The custom user ID, or another identifier that can identify a specific user, such as a phone number or email address. We strongly recommend that you hash or otherwise de-identify this value before passing it in.</p>
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
     * <p>{\&quot;bioMetaInfo\&quot;:\&quot;4.1.0:2916352,0\&quot;,\&quot;deviceType\&quot;:\&quot;web\&quot;,\&quot;ua\&quot;:\&quot;Mozilla/5.0\&quot;}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>The Indonesian phone number. The format must start with +62 followed by 9 to 11 digits. This field takes effect only when Authorize is set to T.</p>
     * 
     * <strong>example:</strong>
     * <p>+6281293671234</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <p>The type of liveness detection to perform.</p>
     * <ul>
     * <li><p><strong>LIVENESS</strong> (default): Blink-based liveness detection.</p>
     * </li>
     * <li><p><strong>PHOTINUS_LIVENESS</strong>: Dual detection that combines blink-based liveness detection and colorful light liveness detection.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>For supported SDK versions, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/sdk-publishing-record?spm=a2c63.p38356.0.i99">SDK release notes</a>.</li>
     * <li>Colorful light dual detection is not supported on PCs.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PHOTINUS_LIVENESS</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Specifies whether to enable OCR. This is an input parameter for the IDV product.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Ocr")
    public String ocr;

    /**
     * <p>Specifies whether to additionally return OCR recognition results in a standardized format:</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OcrValueStandard")
    public String ocrValueStandard;

    /**
     * <p>The configuration for capture pages. Separate multiple pages with commas (,). Valid values:</p>
     * <ul>
     * <li><p><strong>01</strong>: the portrait side of the identity document.</p>
     * </li>
     * <li><p><strong>01,02</strong>: the portrait side and back side of the identity document.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When this parameter is set to 01,02, only China identity cards and Vietnam identity cards are supported.</p>
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
     * <li><p><strong>url (default)</strong>: Degradation is supported. The page displays the authentication URL, and the user can copy the URL to open it or switch browsers to continue authentication.</p>
     * </li>
     * <li><p><strong>keep</strong>: Degradation is not supported. The error reason is directly returned, and the authentication process ends.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is not supported on PC.</li>
     * <li>If the business scenario involves completing authentication within a webpage embedded in an app, set this parameter to keep to disallow URL degradation.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("ProcedurePriority")
    public String procedurePriority;

    /**
     * <p>The product plan to use.</p>
     * <blockquote>
     * <p><strong>Note</strong> For more information, see the official documentation: <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/product-introduction?spm=a2c63.p38356.0.i1">https://www.alibabacloud.com/help/zh/ekyc/latest/product-introduction?spm=a2c63.p38356.0.i1</a></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>eKYC</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Specifies the order of document and face verification steps. Valid values:</p>
     * <ul>
     * <li>DOC_FACE: Document first, then face. This is the default value.</li>
     * <li>FACE_DOC: Face first, then document.</li>
     * </ul>
     * <blockquote>
     * <p><strong>Note</strong>: This parameter is required only when ProductCode is set to KYC_GLOBAL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DOC_FACE</p>
     */
    @NameInMap("ProductFlow")
    public String productFlow;

    /**
     * <p>The number of duplicate faces to return.</p>
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
     * <p>Specifies whether to save the face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SaveFacePicture")
    public String saveFacePicture;

    /**
     * <p>The scene code. This is an input parameter for the IDV product.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("SceneCode")
    public String sceneCode;

    /**
     * <p>The mode that represents different security levels of the authentication process. Valid values:</p>
     * <ul>
     * <li>01: Normal mode (default).</li>
     * <li>02: Safe mode. A relatively strict mode that can be used for high-risk scenarios (input parameter for IDV products).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("SecurityLevel")
    public String securityLevel;

    /**
     * <p>Specifies whether to display the album upload entry during the document OCR recognition step:</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowAlbumIcon")
    public String showAlbumIcon;

    /**
     * <p>Specifies whether to display the guide page:</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowGuidePage")
    public String showGuidePage;

    /**
     * <p>Specifies whether to display the recognition result page during the document OCR recognition step:</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ShowOcrResult")
    public String showOcrResult;

    /**
     * <p>The custom UI configuration. Convert your custom UI configuration to a JSON string based on the configuration template, and pass it in through this parameter. For more information, see <a href="https://www.alibabacloud.com/help/zh/ekyc/latest/idv-kyc-custom-skin?spm=a2c63.p38356.0.i60">IDV UI style customization</a>.</p>
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
     * <p>The Base64-encoded face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("TargetFacePicture")
    public String targetFacePicture;

    /**
     * <p>The file stream of the reference face photo.</p>
     * 
     * <strong>example:</strong>
     * <p>InputStream</p>
     */
    @NameInMap("TargetFacePictureFile")
    public String targetFacePictureFile;

    /**
     * <p>The URL of the face photo. The URL must be a publicly accessible HTTP or HTTPS link.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.xxxxx.com/1.jpg">https://www.xxxxx.com/1.jpg</a></p>
     */
    @NameInMap("TargetFacePictureUrl")
    public String targetFacePictureUrl;

    /**
     * <p>The custom action pool configuration for liveness detection.</p>
     * 
     * <strong>example:</strong>
     * <p>01,02,07</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The number of actions to randomly select from TemplateConfig.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TemplateRanCount")
    public String templateRanCount;

    /**
     * <p>The execution order of liveness detection actions in TemplateConfig.</p>
     * 
     * <strong>example:</strong>
     * <p>Seq</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>Specifies whether to overwrite the existing face with the current face when the MerchantUserId already exists during automatic registration. Valid values: Y (overwrite) and N (do not overwrite and return a message indicating that the UserId already exists).</p>
     */
    @NameInMap("UpdateFaceIfUserExists")
    public String updateFaceIfUserExists;

    /**
     * <p>When <strong>DocType</strong> is set to 01000000 (global passport), specifies whether to enable NFC verification.</p>
     * <ul>
     * <li><strong>Y</strong>: Enable NFC verification.</li>
     * <li><strong>N</strong>: Disable NFC verification.</li>
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

    public static InitializeV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeV2ShrinkRequest self = new InitializeV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InitializeV2ShrinkRequest setAppQualityCheck(String appQualityCheck) {
        this.appQualityCheck = appQualityCheck;
        return this;
    }
    public String getAppQualityCheck() {
        return this.appQualityCheck;
    }

    public InitializeV2ShrinkRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public InitializeV2ShrinkRequest setAutoDocPageConfig(String autoDocPageConfig) {
        this.autoDocPageConfig = autoDocPageConfig;
        return this;
    }
    public String getAutoDocPageConfig() {
        return this.autoDocPageConfig;
    }

    public InitializeV2ShrinkRequest setAutoRegistration(String autoRegistration) {
        this.autoRegistration = autoRegistration;
        return this;
    }
    public String getAutoRegistration() {
        return this.autoRegistration;
    }

    public InitializeV2ShrinkRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitializeV2ShrinkRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitializeV2ShrinkRequest setChameleonFrameEnable(String chameleonFrameEnable) {
        this.chameleonFrameEnable = chameleonFrameEnable;
        return this;
    }
    public String getChameleonFrameEnable() {
        return this.chameleonFrameEnable;
    }

    public InitializeV2ShrinkRequest setCrop(String crop) {
        this.crop = crop;
        return this;
    }
    public String getCrop() {
        return this.crop;
    }

    public InitializeV2ShrinkRequest setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public InitializeV2ShrinkRequest setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
        return this;
    }
    public String getDateOfExpiry() {
        return this.dateOfExpiry;
    }

    public InitializeV2ShrinkRequest setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public InitializeV2ShrinkRequest setDocNo(String docNo) {
        this.docNo = docNo;
        return this;
    }
    public String getDocNo() {
        return this.docNo;
    }

    public InitializeV2ShrinkRequest setDocPageConfigShrink(String docPageConfigShrink) {
        this.docPageConfigShrink = docPageConfigShrink;
        return this;
    }
    public String getDocPageConfigShrink() {
        return this.docPageConfigShrink;
    }

    public InitializeV2ShrinkRequest setDocScanMode(String docScanMode) {
        this.docScanMode = docScanMode;
        return this;
    }
    public String getDocScanMode() {
        return this.docScanMode;
    }

    public InitializeV2ShrinkRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public InitializeV2ShrinkRequest setDocVideo(String docVideo) {
        this.docVideo = docVideo;
        return this;
    }
    public String getDocVideo() {
        return this.docVideo;
    }

    public InitializeV2ShrinkRequest setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }
    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public InitializeV2ShrinkRequest setEditOcrResult(String editOcrResult) {
        this.editOcrResult = editOcrResult;
        return this;
    }
    public String getEditOcrResult() {
        return this.editOcrResult;
    }

    public InitializeV2ShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public InitializeV2ShrinkRequest setExperienceCode(String experienceCode) {
        this.experienceCode = experienceCode;
        return this;
    }
    public String getExperienceCode() {
        return this.experienceCode;
    }

    public InitializeV2ShrinkRequest setFaceAttributeCheck(String faceAttributeCheck) {
        this.faceAttributeCheck = faceAttributeCheck;
        return this;
    }
    public String getFaceAttributeCheck() {
        return this.faceAttributeCheck;
    }

    public InitializeV2ShrinkRequest setFaceGroupCodes(String faceGroupCodes) {
        this.faceGroupCodes = faceGroupCodes;
        return this;
    }
    public String getFaceGroupCodes() {
        return this.faceGroupCodes;
    }

    public InitializeV2ShrinkRequest setFacePictureBase64(String facePictureBase64) {
        this.facePictureBase64 = facePictureBase64;
        return this;
    }
    public String getFacePictureBase64() {
        return this.facePictureBase64;
    }

    public InitializeV2ShrinkRequest setFacePictureFile(String facePictureFile) {
        this.facePictureFile = facePictureFile;
        return this;
    }
    public String getFacePictureFile() {
        return this.facePictureFile;
    }

    public InitializeV2ShrinkRequest setFacePictureUrl(String facePictureUrl) {
        this.facePictureUrl = facePictureUrl;
        return this;
    }
    public String getFacePictureUrl() {
        return this.facePictureUrl;
    }

    public InitializeV2ShrinkRequest setFaceRegisterGroupCode(String faceRegisterGroupCode) {
        this.faceRegisterGroupCode = faceRegisterGroupCode;
        return this;
    }
    public String getFaceRegisterGroupCode() {
        return this.faceRegisterGroupCode;
    }

    public InitializeV2ShrinkRequest setFaceVerifyThreshold(String faceVerifyThreshold) {
        this.faceVerifyThreshold = faceVerifyThreshold;
        return this;
    }
    public String getFaceVerifyThreshold() {
        return this.faceVerifyThreshold;
    }

    public InitializeV2ShrinkRequest setIdFaceQuality(String idFaceQuality) {
        this.idFaceQuality = idFaceQuality;
        return this;
    }
    public String getIdFaceQuality() {
        return this.idFaceQuality;
    }

    public InitializeV2ShrinkRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public InitializeV2ShrinkRequest setIdThreshold(String idThreshold) {
        this.idThreshold = idThreshold;
        return this;
    }
    public String getIdThreshold() {
        return this.idThreshold;
    }

    public InitializeV2ShrinkRequest setLanguageConfig(String languageConfig) {
        this.languageConfig = languageConfig;
        return this;
    }
    public String getLanguageConfig() {
        return this.languageConfig;
    }

    public InitializeV2ShrinkRequest setMRTDInput(String MRTDInput) {
        this.MRTDInput = MRTDInput;
        return this;
    }
    public String getMRTDInput() {
        return this.MRTDInput;
    }

    public InitializeV2ShrinkRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public InitializeV2ShrinkRequest setMerchantUserId(String merchantUserId) {
        this.merchantUserId = merchantUserId;
        return this;
    }
    public String getMerchantUserId() {
        return this.merchantUserId;
    }

    public InitializeV2ShrinkRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitializeV2ShrinkRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public InitializeV2ShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitializeV2ShrinkRequest setOcr(String ocr) {
        this.ocr = ocr;
        return this;
    }
    public String getOcr() {
        return this.ocr;
    }

    public InitializeV2ShrinkRequest setOcrValueStandard(String ocrValueStandard) {
        this.ocrValueStandard = ocrValueStandard;
        return this;
    }
    public String getOcrValueStandard() {
        return this.ocrValueStandard;
    }

    public InitializeV2ShrinkRequest setPages(String pages) {
        this.pages = pages;
        return this;
    }
    public String getPages() {
        return this.pages;
    }

    public InitializeV2ShrinkRequest setProcedurePriority(String procedurePriority) {
        this.procedurePriority = procedurePriority;
        return this;
    }
    public String getProcedurePriority() {
        return this.procedurePriority;
    }

    public InitializeV2ShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitializeV2ShrinkRequest setProductFlow(String productFlow) {
        this.productFlow = productFlow;
        return this;
    }
    public String getProductFlow() {
        return this.productFlow;
    }

    public InitializeV2ShrinkRequest setReturnFaces(String returnFaces) {
        this.returnFaces = returnFaces;
        return this;
    }
    public String getReturnFaces() {
        return this.returnFaces;
    }

    public InitializeV2ShrinkRequest setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public InitializeV2ShrinkRequest setSaveFacePicture(String saveFacePicture) {
        this.saveFacePicture = saveFacePicture;
        return this;
    }
    public String getSaveFacePicture() {
        return this.saveFacePicture;
    }

    public InitializeV2ShrinkRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public InitializeV2ShrinkRequest setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }
    public String getSecurityLevel() {
        return this.securityLevel;
    }

    public InitializeV2ShrinkRequest setShowAlbumIcon(String showAlbumIcon) {
        this.showAlbumIcon = showAlbumIcon;
        return this;
    }
    public String getShowAlbumIcon() {
        return this.showAlbumIcon;
    }

    public InitializeV2ShrinkRequest setShowGuidePage(String showGuidePage) {
        this.showGuidePage = showGuidePage;
        return this;
    }
    public String getShowGuidePage() {
        return this.showGuidePage;
    }

    public InitializeV2ShrinkRequest setShowOcrResult(String showOcrResult) {
        this.showOcrResult = showOcrResult;
        return this;
    }
    public String getShowOcrResult() {
        return this.showOcrResult;
    }

    public InitializeV2ShrinkRequest setStyleConfig(String styleConfig) {
        this.styleConfig = styleConfig;
        return this;
    }
    public String getStyleConfig() {
        return this.styleConfig;
    }

    public InitializeV2ShrinkRequest setTargetFacePicture(String targetFacePicture) {
        this.targetFacePicture = targetFacePicture;
        return this;
    }
    public String getTargetFacePicture() {
        return this.targetFacePicture;
    }

    public InitializeV2ShrinkRequest setTargetFacePictureFile(String targetFacePictureFile) {
        this.targetFacePictureFile = targetFacePictureFile;
        return this;
    }
    public String getTargetFacePictureFile() {
        return this.targetFacePictureFile;
    }

    public InitializeV2ShrinkRequest setTargetFacePictureUrl(String targetFacePictureUrl) {
        this.targetFacePictureUrl = targetFacePictureUrl;
        return this;
    }
    public String getTargetFacePictureUrl() {
        return this.targetFacePictureUrl;
    }

    public InitializeV2ShrinkRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public InitializeV2ShrinkRequest setTemplateRanCount(String templateRanCount) {
        this.templateRanCount = templateRanCount;
        return this;
    }
    public String getTemplateRanCount() {
        return this.templateRanCount;
    }

    public InitializeV2ShrinkRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public InitializeV2ShrinkRequest setUpdateFaceIfUserExists(String updateFaceIfUserExists) {
        this.updateFaceIfUserExists = updateFaceIfUserExists;
        return this;
    }
    public String getUpdateFaceIfUserExists() {
        return this.updateFaceIfUserExists;
    }

    public InitializeV2ShrinkRequest setUseNFC(String useNFC) {
        this.useNFC = useNFC;
        return this;
    }
    public String getUseNFC() {
        return this.useNFC;
    }

    public InitializeV2ShrinkRequest setVerifyModel(String verifyModel) {
        this.verifyModel = verifyModel;
        return this;
    }
    public String getVerifyModel() {
        return this.verifyModel;
    }

}
