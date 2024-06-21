// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code.</p>
     * <ul>
     * <li>Example: OK. This value indicates that the request is successful.</li>
     * <li>Other codes indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
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
         * <p>The language of the next template.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("NextLanguageCode")
        public String nextLanguageCode;

        /**
         * <p>The code of the next template.</p>
         * 
         * <strong>example:</strong>
         * <p>20939920093993</p>
         */
        @NameInMap("NextTemplateCode")
        public String nextTemplateCode;

        /**
         * <p>The name of the next template.</p>
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
        @NameInMap("PackageName")
        public String packageName;

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
         * <p>The text of the one-tap autofill button. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.</p>
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
         * <p>The extended fields.</p>
         */
        @NameInMap("ExtendAttrs")
        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs extendAttrs;

        /**
         * <p>flow 数据事件类型
         * 取值范围：NAVIGATE/DATA_EXCHANGE</p>
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
         * <p>The unsubscribe button. This parameter is valid if Category is set to MARKETING and the Type sub-parameter of the Buttons parameter is set to QUICK_REPLY in a WhatsApp message template. After you configure message sending in the ChatApp Message Service console, marketing messages will not be sent to customers if they click this button.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>跳转屏 
         * 在FlowAction=NAVIGATE时必填</p>
         * 
         * <strong>example:</strong>
         * <p>DETAILS</p>
         */
        @NameInMap("NavigateScreen")
        public String navigateScreen;

        /**
         * <p>The app package name that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The phone number. This parameter is valid only if the Type sub-parameter of the Buttons parameter is set to <strong>PHONE_NUMBER</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>861398745****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The app signing key hash that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.</p>
         * 
         * <strong>example:</strong>
         * <p>2993839</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        @NameInMap("SupportedApps")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtonsSupportedApps> supportedApps;

        /**
         * <p>The display name of the button.</p>
         * 
         * <strong>example:</strong>
         * <p>Call</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The type of the button. Valid values:</p>
         * <ul>
         * <li><strong>PHONE_NUMBER</strong>: phone call button</li>
         * <li><strong>URL</strong>: URL button</li>
         * <li><strong>QUICK_REPLY</strong>: quick reply button</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>In a message template, a quick reply button cannot be used together with a phone call button or a URL button.</p>
         * </li>
         * <li><p>You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.</p>
         * </li>
         * <li><p>You can add only one button to a Viber message template, and you must set the Type sub-parameter of the Buttons parameter to URL.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PHONE_NUMBER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to which you are redirected when you click the URL button.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The type of the URL. Valid values:</p>
         * <ul>
         * <li><strong>static</strong></li>
         * <li><strong>dynamic</strong></li>
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
         * <p>+86138000</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The button content.</p>
         * 
         * <strong>example:</strong>
         * <p>Button text</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The type of the button in the carousel template. Valid values: URL, PHONE_NUMBER, and QUICK_REQLY.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be accessed when you click the URL button.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The type of the URL. Valid values: static and dynamic.</p>
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
         * <p>The card buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The type of the header in the carousel template. The header can only be an image or a video. The headers of all cards must be the same.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The card text.</p>
         * 
         * <strong>example:</strong>
         * <p>Body</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The type of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL address.</p>
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
         * <p>The card components.</p>
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
         * <p>The note indicating that customers cannot share verification codes with others. The note is displayed in the message body. This parameter is valid if Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to BODY in a WhatsApp message template.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The buttons. Specify this parameter only if you set the Type sub-parameter of the Components parameter to <strong>BUTTONS</strong>. Before you specify this parameter, the format of the value must be changed from JSON to String.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons;

        /**
         * <p>The description of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>The new file has been uploaded.</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The carousel cards.</p>
         */
        @NameInMap("Cards")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCards> cards;

        /**
         * <p>The validity period of the verification code in the WhatsApp authentication template. Unit: minutes. This parameter is valid only when Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to FOOTER in a WhatsApp message template. The validity period of the verification code is displayed in the footer.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The length of the video in the Viber message template. Valid values: 0 to 600. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>Express file</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the document attached in the Viber message template.</p>
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
         * <p>Hangzhou</p>
         */
        @NameInMap("LocationAddress")
        public String locationAddress;

        /**
         * <p>The name of the location.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
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
         * <p>The variable when the coupon code expires in the limited-time offer template.</p>
         * 
         * <strong>example:</strong>
         * <p>$(offerExpirationTimeMs)</p>
         */
        @NameInMap("OfferExpirationTimeMs")
        public String offerExpirationTimeMs;

        /**
         * <p>The text of the message that you want to send.</p>
         * 
         * <strong>example:</strong>
         * <p>Hello</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail URL of the video in the Viber message template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.png">https://img.png</a></p>
         */
        @NameInMap("ThumbUrl")
        public String thumbUrl;

        /**
         * <p>The type of the component. Valid values:</p>
         * <ul>
         * <li><strong>BODY</strong></li>
         * <li><strong>HEADER</strong></li>
         * <li><strong>FOOTER</strong></li>
         * <li><strong>BUTTONS</strong></li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The following limits apply to components in WhatsApp message templates: A <strong>BODY</strong> component cannot exceed 1,024 characters in length. A <strong>HEADER</strong> or <strong>FOOTER</strong> component cannot exceed 60 characters in length.</p>
         * </li>
         * <li><p><strong>FOOTER</strong> components are not supported in Viber message templates.</p>
         * </li>
         * <li><p>In a Viber message template, media resources such as images, videos, and documents are placed in the <strong>HEADER</strong> component. If a Viber message contains both text and an image, the image is placed below the text in the message received on a device.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BODY</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the media resource.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://image.developer.aliyundoc.com">https://image.developer.aliyundoc.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>Indicates whether the coupon code will expire in the limited-time offer template.</p>
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
        /**
         * <p>The review status of the message template. Valid values:</p>
         * <ul>
         * <li><strong>pass</strong>: The message template is approved.</li>
         * <li><strong>fail</strong>: The message template is rejected.</li>
         * <li><strong>auditing</strong>: The message template is being reviewed.</li>
         * <li><strong>unaudit</strong>: The review is suspended.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The category of the template when the returned value of TemplateType is WHATSAPP. Valid values:</p>
         * <ul>
         * <li><strong>UTILITY</strong>: a transactional template</li>
         * <li><strong>MARKETING</strong>: a marketing template</li>
         * <li><strong>AUTHENTICATION</strong>: an identity authentication template</li>
         * </ul>
         * <p>The category of the template when the returned value of the TemplateType parameter is VIBER. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: a template that contains only text</li>
         * <li><strong>image</strong>: a template that contains only images</li>
         * <li><strong>text_image_button</strong>: a template that contains text, images, and buttons</li>
         * <li><strong>text_button</strong>: a template that contains text and buttons</li>
         * <li><strong>document</strong>: a template that contains only files</li>
         * <li><strong>video</strong>: a template that contains only videos</li>
         * <li><strong>text_video</strong>: a template that contains text and videos</li>
         * <li><strong>text_video_button</strong>: a template that contains text, videos, and buttons</li>
         * <li><strong>text_image</strong>: a template that contains text and images</li>
         * </ul>
         * <blockquote>
         * <p>If Category is set to text_video_button, users cannot open a web page by clicking the button. Users can open only the video in the message. In this case, you do not need to specify the Url parameter for the URL button in the template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TRANSACTIONAL</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The components of the message template.</p>
         */
        @NameInMap("Components")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponents> components;

        /**
         * <p>The examples of variables.</p>
         */
        @NameInMap("Example")
        public java.util.Map<String, String> example;

        /**
         * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>en_US</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The validity period of the WhatsApp authentication message.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("MessageSendTtlSeconds")
        public Integer messageSendTtlSeconds;

        /**
         * <p>The name of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_whatsapp</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The quality of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>GREEN</p>
         */
        @NameInMap("QualityScore")
        public String qualityScore;

        /**
         * <p>The reason why the template was rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>744c4b5c79c9432497a075bdfca3****</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The type of the message template. Valid values:</p>
         * <ul>
         * <li><strong>WHATSAPP</strong></li>
         * <li><strong>VIBER</strong></li>
         * <li>LINE (developing)</li>
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
