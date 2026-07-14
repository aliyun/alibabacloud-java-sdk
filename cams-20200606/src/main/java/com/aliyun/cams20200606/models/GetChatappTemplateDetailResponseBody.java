// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li><p>OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>{ 		&quot;category&quot;: &quot;ACCOUNT_UPDATE&quot;, 		&quot;name&quot;: &quot;account_notice&quot;, 		&quot;language&quot;: &quot;en_US&quot;, 		&quot;templateCode&quot;: &quot;744c4b5c79c9432497a075bdfca3****&quot;, 		&quot;auditStatus&quot;: &quot;APPROVED&quot;, 		&quot;components&quot;: &quot;[{\&quot;type\&quot;:\&quot;BODY\&quot;,\&quot;text\&quot;:\&quot;body_text$(textVariable)\&quot;},{\&quot;type\&quot;:\&quot;HEADER\&quot;,\&quot;formate\&quot;:\&quot;IMAGE\&quot;,\&quot;url\&quot;:\&quot;$(linkVariable)\&quot;},{\&quot;type\&quot;:\&quot;FOOTER\&quot;,\&quot;text\&quot;:\&quot;footer-text\&quot;},{\&quot;type\&quot;:\&quot;BUTTONS\&quot;,\&quot;buttons\&quot;:[{\&quot;type\&quot;:\&quot;PHONE_NUMBER\&quot;,\&quot;text\&quot;:\&quot;phone-button-text\&quot;,\&quot;phone_number\&quot;:\&quot;+861388888****\&quot;},{\&quot;type\&quot;:\&quot;URL\&quot;,\&quot;text\&quot;:\&quot;url-button-text\&quot;,\&quot;url\&quot;:\&quot;<a href="https://www.website.com/%5C%5C%22%7D%5D%7D%5D">https://www.website.com/\\&quot;}]}]</a>&quot;, 		&quot;example&quot;: &quot;{\&quot;textVariable\&quot;: \&quot;text\&quot;, \&quot;linkVariable\&quot;: \&quot;link\&quot;}&quot; 	}</p>
     */
    @NameInMap("Data")
    public GetChatappTemplateDetailResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>744c4b5c79c9432497a075bdfca3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatappTemplateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateDetailResponseBody self = new GetChatappTemplateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatappTemplateDetailResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetChatappTemplateDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatappTemplateDetailResponseBody setData(GetChatappTemplateDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetChatappTemplateDetailResponseBodyData getData() {
        return this.data;
    }

    public GetChatappTemplateDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatappTemplateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs extends TeaModel {
        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>nextCard</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The intent code.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("IntentCode")
        public String intentCode;

        /**
         * <p>The next template language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("NextLanguageCode")
        public String nextLanguageCode;

        /**
         * <p>The next template code.</p>
         * 
         * <strong>example:</strong>
         * <p>20939920093993</p>
         */
        @NameInMap("NextTemplateCode")
        public String nextTemplateCode;

        /**
         * <p>The next template name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("NextTemplateName")
        public String nextTemplateName;

        public static GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs self = new GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs setIntentCode(String intentCode) {
            this.intentCode = intentCode;
            return this;
        }
        public String getIntentCode() {
            return this.intentCode;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs setNextLanguageCode(String nextLanguageCode) {
            this.nextLanguageCode = nextLanguageCode;
            return this;
        }
        public String getNextLanguageCode() {
            return this.nextLanguageCode;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs setNextTemplateCode(String nextTemplateCode) {
            this.nextTemplateCode = nextTemplateCode;
            return this;
        }
        public String getNextTemplateCode() {
            return this.nextTemplateCode;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs setNextTemplateName(String nextTemplateName) {
            this.nextTemplateName = nextTemplateName;
            return this;
        }
        public String getNextTemplateName() {
            return this.nextTemplateName;
        }

    }

    public static class GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps extends TeaModel {
        /**
         * <p>The package name.</p>
         * 
         * <strong>example:</strong>
         * <p>com.test</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The package signature hash.</p>
         * 
         * <strong>example:</strong>
         * <p>29kdkeik939</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        public static GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps self = new GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps setSignatureHash(String signatureHash) {
            this.signatureHash = signatureHash;
            return this;
        }
        public String getSignatureHash() {
            return this.signatureHash;
        }

    }

    public static class GetChatappTemplateDetailResponseBodyDataComponentsButtons extends TeaModel {
        /**
         * <p>Required when the WhatsApp template Category is Authentication and Button Type is ONE_TAP. The button text for the WhatsApp autofill operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Autofill</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>202039ksjs</p>
         */
        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <p>The extended attributes.</p>
         */
        @NameInMap("ExtendAttrs")
        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs extendAttrs;

        /**
         * <p>The flow data event type. Valid values:</p>
         * <ul>
         * <li><p>NAVIGATE: navigation</p>
         * </li>
         * <li><p>DATA_EXCHANGE: data exchange</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAVIGATE</p>
         */
        @NameInMap("FlowAction")
        public String flowAction;

        /**
         * <p>Flow ID</p>
         * 
         * <strong>example:</strong>
         * <p>3838292983</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>Valid when the WhatsApp template Category is Marketing and Button Type is QUICK_REPLY. Indicates that the button is a marketing opt-out button. If the customer clicks this button and the send control operation is configured on the Chat App platform, subsequent marketing messages will not be sent to the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>The navigate screen. Required when FlowAction is set to NAVIGATE.</p>
         * 
         * <strong>example:</strong>
         * <p>DETAILS</p>
         */
        @NameInMap("NavigateScreen")
        public String navigateScreen;

        /**
         * <p>Required when the WhatsApp template Category is Authentication and Button Type is ONE_TAP. The package name of the application launched by WhatsApp.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The phone number. Valid only when the button type is <strong>PHONE_NUMBER</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>+861398745****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Required when the WhatsApp template Category is Authentication and Button Type is ONE_TAP. The signature hash value used by WhatsApp to launch the application.</p>
         * 
         * <strong>example:</strong>
         * <p>2993839</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        /**
         * <p>The applications supported by ONE_TAP/ZERO_TAP verification code.</p>
         */
        @NameInMap("SupportedApps")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps> supportedApps;

        /**
         * <p>The display name of the button.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The button type.</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: call button</p>
         * </li>
         * <li><p><strong>URL</strong>: web page button</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: quick reply button</p>
         * </li>
         * <li><p><strong>COPY_CODE</strong>: copy verification code or coupon code</p>
         * </li>
         * <li><p><strong>ONE_TAP</strong>: autofill button for AUTHENTICATION templates</p>
         * </li>
         * <li><p><strong>ZERO_TAP</strong>: autofill button for AUTHENTICATION templates</p>
         * </li>
         * <li><p><strong>MPM</strong>: multi-product catalog</p>
         * </li>
         * <li><p><strong>CATALOG</strong>: catalog</p>
         * </li>
         * <li><p><strong>FLOW</strong>: open WhatsApp flow</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For WhatsApp templates with Category set to AUTHENTICATION, only one button is allowed, and the type can only be COPY_CODE or ONE_TAP. If the type is COPY_CODE, Text is required. If the type is ONE_TAP, Text (displayed when the target application is not installed on the device, indicating the name of the copy verification code button), SignatureHash, PackageName, and AutofillText are required.</li>
         * <li>Viber templates allow only one button, and it must be of the URL type.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PHONE_NUMBER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL that is accessed when the link button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type.</p>
         * <ul>
         * <li><p><strong>static</strong>: static.</p>
         * </li>
         * <li><p><strong>dynamic</strong>: dynamic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("UrlType")
        public String urlType;

        public static GetChatappTemplateDetailResponseBodyDataComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponentsButtons self = new GetChatappTemplateDetailResponseBodyDataComponentsButtons();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setAutofillText(String autofillText) {
            this.autofillText = autofillText;
            return this;
        }
        public String getAutofillText() {
            return this.autofillText;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setCouponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }
        public String getCouponCode() {
            return this.couponCode;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setExtendAttrs(GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs extendAttrs) {
            this.extendAttrs = extendAttrs;
            return this;
        }
        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs getExtendAttrs() {
            return this.extendAttrs;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setFlowAction(String flowAction) {
            this.flowAction = flowAction;
            return this;
        }
        public String getFlowAction() {
            return this.flowAction;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setIsOptOut(Boolean isOptOut) {
            this.isOptOut = isOptOut;
            return this;
        }
        public Boolean getIsOptOut() {
            return this.isOptOut;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setNavigateScreen(String navigateScreen) {
            this.navigateScreen = navigateScreen;
            return this;
        }
        public String getNavigateScreen() {
            return this.navigateScreen;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setSignatureHash(String signatureHash) {
            this.signatureHash = signatureHash;
            return this;
        }
        public String getSignatureHash() {
            return this.signatureHash;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setSupportedApps(java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps> supportedApps) {
            this.supportedApps = supportedApps;
            return this;
        }
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps> getSupportedApps() {
            return this.supportedApps;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

    }

    public static class GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons extends TeaModel {
        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>+861380005****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The button content.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The button type for carousel templates. Valid values: URL, PHONE_NUMBER, and QUICK_REPLY.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL accessed when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type. Valid values:</p>
         * <ul>
         * <li><p>static: static.</p>
         * </li>
         * <li><p>dynamic: dynamic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("UrlType")
        public String urlType;

        public static GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons self = new GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

    }

    public static class GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents extends TeaModel {
        /**
         * <p>The list of card buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The header type in carousel templates. Only IMAGE and VIDEO are supported. All cards must have the same header type.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The text content of the card.</p>
         * 
         * <strong>example:</strong>
         * <p>Body</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The component type.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The web address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents self = new GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents setButtons(java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons> buttons) {
            this.buttons = buttons;
            return this;
        }
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons> getButtons() {
            return this.buttons;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetChatappTemplateDetailResponseBodyDataComponentsCards extends TeaModel {
        /**
         * <p>The list of card components.</p>
         */
        @NameInMap("CardComponents")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents> cardComponents;

        public static GetChatappTemplateDetailResponseBodyDataComponentsCards build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponentsCards self = new GetChatappTemplateDetailResponseBodyDataComponentsCards();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyDataComponentsCards setCardComponents(java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents> cardComponents) {
            this.cardComponents = cardComponents;
            return this;
        }
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponents> getCardComponents() {
            return this.cardComponents;
        }

    }

    public static class GetChatappTemplateDetailResponseBodyDataComponents extends TeaModel {
        /**
         * <p>Valid for WhatsApp templates when Category is Authentication and Component Type is Body. Displays a recommendation on the Body not to share the verification code with others.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The list of buttons. Applicable only to the <strong>BUTTONS</strong> component.</p>
         * <blockquote>
         * <p>WhatsApp button quantity rules:</p>
         * <ul>
         * <li>When the WhatsApp category is MARKETING or UTILITY, a maximum of 10 buttons are allowed.</li>
         * <li>Only one PHONE_NUMBER button is allowed.</li>
         * <li>A maximum of two URL buttons are allowed.</li>
         * <li>QUICK_REPLY buttons cannot appear in a mixed order with PHONE_NUMBER or URL buttons.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons;

        /**
         * <p>The description of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The list of carousel cards.</p>
         */
        @NameInMap("Cards")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCards> cards;

        /**
         * <p>The verification code validity period (in minutes) for WhatsApp Authentication templates. Valid only for WhatsApp messages when Category is Authentication and Component Type is Footer. This information is displayed in the Footer.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The video duration for Viber video messages. Valid values: 0 to 600.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type for Viber file messages.</p>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The format.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The latitude of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>28.001</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <p>The address of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("LocationAddress")
        public String locationAddress;

        /**
         * <p>The name of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>hangzhou</p>
         */
        @NameInMap("LocationName")
        public String locationName;

        /**
         * <p>The longitude of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>120.002</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        /**
         * <p>The coupon code expiration variable for LTO templates.</p>
         * 
         * <strong>example:</strong>
         * <p>$(offerExpirationTimeMs)</p>
         */
        @NameInMap("OfferExpirationTimeMs")
        public String offerExpirationTimeMs;

        /**
         * <p>The text of the message to be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail for Viber video messages.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.png">https://img.png</a></p>
         */
        @NameInMap("ThumbUrl")
        public String thumbUrl;

        /**
         * <p>The component type.</p>
         * <ul>
         * <li><p><strong>BODY</strong></p>
         * </li>
         * <li><p><strong>HEADER</strong></p>
         * </li>
         * <li><p><strong>FOOTER</strong></p>
         * </li>
         * <li><p><strong>BUTTONS</strong></p>
         * </li>
         * <li><p><strong>CAROUSEL</strong></p>
         * </li>
         * <li><p><strong>LIMITED_TIME_OFFER</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For WhatsApp templates, the character length of the <strong>BODY</strong> component cannot exceed 1024 characters. The character length of the <strong>HEADER</strong> and <strong>FOOTER</strong> components cannot exceed 60 characters.</li>
         * <li>For Viber templates, the <strong>FOOTER</strong>, <strong>CAROUSEL</strong>, and <strong>LIMITED_TIME_OFFER</strong> types are invalid.</li>
         * <li>In Viber templates, images, videos, and files are placed in the <strong>HEADER</strong> (the device displays images below the text).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>BODY</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The media URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://image.developer.aliyundoc.com">https://image.developer.aliyundoc.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>Specifies whether the coupon code has an expiration time in limited-time offer (LTO) templates.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasExpiration")
        public Boolean hasExpiration;

        public static GetChatappTemplateDetailResponseBodyDataComponents build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponents self = new GetChatappTemplateDetailResponseBodyDataComponents();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setAddSecretRecommendation(Boolean addSecretRecommendation) {
            this.addSecretRecommendation = addSecretRecommendation;
            return this;
        }
        public Boolean getAddSecretRecommendation() {
            return this.addSecretRecommendation;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setButtons(java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons) {
            this.buttons = buttons;
            return this;
        }
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> getButtons() {
            return this.buttons;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setCards(java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCards> cards) {
            this.cards = cards;
            return this;
        }
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCards> getCards() {
            return this.cards;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setCodeExpirationMinutes(Integer codeExpirationMinutes) {
            this.codeExpirationMinutes = codeExpirationMinutes;
            return this;
        }
        public Integer getCodeExpirationMinutes() {
            return this.codeExpirationMinutes;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setLocationAddress(String locationAddress) {
            this.locationAddress = locationAddress;
            return this;
        }
        public String getLocationAddress() {
            return this.locationAddress;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setLocationName(String locationName) {
            this.locationName = locationName;
            return this;
        }
        public String getLocationName() {
            return this.locationName;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setOfferExpirationTimeMs(String offerExpirationTimeMs) {
            this.offerExpirationTimeMs = offerExpirationTimeMs;
            return this;
        }
        public String getOfferExpirationTimeMs() {
            return this.offerExpirationTimeMs;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setHasExpiration(Boolean hasExpiration) {
            this.hasExpiration = hasExpiration;
            return this;
        }
        public Boolean getHasExpiration() {
            return this.hasExpiration;
        }

    }

    public static class GetChatappTemplateDetailResponseBodyData extends TeaModel {
        @NameInMap("AllowSend")
        public Boolean allowSend;

        /**
         * <p>The audit status. Valid values:</p>
         * <ul>
         * <li><p><strong>pass</strong>: Approved.</p>
         * </li>
         * <li><p><strong>fail</strong>: Rejected.</p>
         * </li>
         * <li><p><strong>auditing</strong>: Under review.</p>
         * </li>
         * <li><p><strong>unaudit</strong>: Review suspended.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The WhatsApp template category. Valid values:</p>
         * <ul>
         * <li><p><strong>UTILITY</strong>: transaction-related.</p>
         * </li>
         * <li><p><strong>MARKETING</strong>: marketing template.</p>
         * </li>
         * <li><p><strong>AUTHENTICATION</strong>: identity verification.</p>
         * </li>
         * </ul>
         * <p>Viber template category. Valid values:</p>
         * <ul>
         * <li><p><strong>text</strong>: text only</p>
         * </li>
         * <li><p><strong>image</strong>: image only</p>
         * </li>
         * <li><p><strong>text_image_button</strong>: text + image + button</p>
         * </li>
         * <li><p><strong>text_button</strong>: text + button</p>
         * </li>
         * <li><p><strong>document</strong>: file</p>
         * </li>
         * <li><p><strong>video</strong>: video</p>
         * </li>
         * <li><p><strong>text_video</strong>: text + video</p>
         * </li>
         * <li><p><strong>text_video_button</strong>: text + video + button</p>
         * </li>
         * <li><p><strong>text_image</strong>: text + image</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>When the Viber template value is text_video_button, the button does not open a web page. Instead, it opens the video of the current message within the web page. Therefore, you do not need to enter any address information in the URL of the button.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UTILITY</p>
         */
        @NameInMap("Category")
        public String category;

        @NameInMap("CategoryChangePaused")
        public Boolean categoryChangePaused;

        /**
         * <p>The list of message template components.</p>
         */
        @NameInMap("Components")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponents> components;

        /**
         * <p>The variable examples.</p>
         */
        @NameInMap("Example")
        public java.util.Map<String, String> example;

        /**
         * <p>The language of the template. For detailed language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>en_US</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The message validity period when sending messages with WhatsApp Authentication templates.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MessageSendTtlSeconds")
        public Integer messageSendTtlSeconds;

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_whatsapp</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The template quality.</p>
         * <ul>
         * <li>RED (low quality)</li>
         * <li>YELLOW (medium quality)</li>
         * <li>UNKNOWN (unknown quality)</li>
         * <li>GREEN (high quality)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GREEN</p>
         */
        @NameInMap("QualityScore")
        public String qualityScore;

        /**
         * <p>The reason why the template was rejected during review.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>744c4b5c79c9432497a075bdfca3****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The templatetype.</p>
         * <ul>
         * <li><p><strong>WHATSAPP</strong></p>
         * </li>
         * <li><p><strong>VIBER</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static GetChatappTemplateDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyData self = new GetChatappTemplateDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatappTemplateDetailResponseBodyData setAllowSend(Boolean allowSend) {
            this.allowSend = allowSend;
            return this;
        }
        public Boolean getAllowSend() {
            return this.allowSend;
        }

        public GetChatappTemplateDetailResponseBodyData setAuditStatus(String auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public String getAuditStatus() {
            return this.auditStatus;
        }

        public GetChatappTemplateDetailResponseBodyData setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetChatappTemplateDetailResponseBodyData setCategoryChangePaused(Boolean categoryChangePaused) {
            this.categoryChangePaused = categoryChangePaused;
            return this;
        }
        public Boolean getCategoryChangePaused() {
            return this.categoryChangePaused;
        }

        public GetChatappTemplateDetailResponseBodyData setComponents(java.util.List<GetChatappTemplateDetailResponseBodyDataComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponents> getComponents() {
            return this.components;
        }

        public GetChatappTemplateDetailResponseBodyData setExample(java.util.Map<String, String> example) {
            this.example = example;
            return this;
        }
        public java.util.Map<String, String> getExample() {
            return this.example;
        }

        public GetChatappTemplateDetailResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetChatappTemplateDetailResponseBodyData setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
            this.messageSendTtlSeconds = messageSendTtlSeconds;
            return this;
        }
        public Integer getMessageSendTtlSeconds() {
            return this.messageSendTtlSeconds;
        }

        public GetChatappTemplateDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetChatappTemplateDetailResponseBodyData setQualityScore(String qualityScore) {
            this.qualityScore = qualityScore;
            return this;
        }
        public String getQualityScore() {
            return this.qualityScore;
        }

        public GetChatappTemplateDetailResponseBodyData setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetChatappTemplateDetailResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetChatappTemplateDetailResponseBodyData setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
