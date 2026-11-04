// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow Facebook to automatically change the category of the template to improve the approval rate. This property is valid only when TemplateType is set to WHATSAPP.</p>
     * <blockquote>
     * <p>Notice: <strong>[Deprecated]</strong> WhatsApp no longer supports this property.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>WhatsApp template categories:</p>
     * <ul>
     * <li><p><strong>UTILITY</strong>: Transaction-related.</p>
     * </li>
     * <li><p><strong>MARKETING</strong>: Marketing templates.</p>
     * </li>
     * <li><p><strong>AUTHENTICATION</strong>: Authenticate identity.</p>
     * </li>
     * </ul>
     * <p>Viber template categories:</p>
     * <ul>
     * <li><p><strong>UTILITY</strong>: Transaction-related.</p>
     * </li>
     * <li><p><strong>MARKETING</strong>: Marketing templates.</p>
     * </li>
     * <li><p><strong>AUTHENTICATION</strong>: Authenticate identity.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UTILITY</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Specifies whether to pause sending the template when a utility template is changed to a marketing template. This property is valid only for WhatsApp templates.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CategoryChangePaused")
    public Boolean categoryChangePaused;

    /**
     * <p>The list of message template components.</p>
     * <blockquote>
     * <p>When Category is set to AUTHENTICATION, Components cannot contain nodes with Type set to HEADER. Additionally, when Type is set to BODY or FOOTER, the Text content must be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateChatappTemplateRequestComponents> components;

    /**
     * <p>The SpaceId of the ISV sub-customer or the instance ID of the direct customer.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WabaId of the ISV customer.</p>
     * <blockquote>
     * <p><strong>[Deprecated]</strong> Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The example for creating a template.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_whatsapp</p>
     */
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    /**
     * <p>The ISV verification code used to verify whether the RAM user is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <p>The template language. For detailed language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The validity period for sending template messages in WhatsApp.</p>
     * <ul>
     * <li>AUTHENTICATION: 30 to 900. </li>
     * <li>UTILITY: 30 to 43200.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>The template name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_whatsapp</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>productSetId</p>
     * 
     * <strong>example:</strong>
     * <p>9928**</p>
     */
    @NameInMap("ProductSetId")
    public String productSetId;

    /**
     * <p>The templatetype.</p>
     * <ul>
     * <li><p><strong>WHATSAPP</strong></p>
     * </li>
     * <li><p><strong>VIBER</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateRequest self = new CreateChatappTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatappTemplateRequest setAllowCategoryChange(Boolean allowCategoryChange) {
        this.allowCategoryChange = allowCategoryChange;
        return this;
    }
    public Boolean getAllowCategoryChange() {
        return this.allowCategoryChange;
    }

    public CreateChatappTemplateRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateChatappTemplateRequest setCategoryChangePaused(Boolean categoryChangePaused) {
        this.categoryChangePaused = categoryChangePaused;
        return this;
    }
    public Boolean getCategoryChangePaused() {
        return this.categoryChangePaused;
    }

    public CreateChatappTemplateRequest setComponents(java.util.List<CreateChatappTemplateRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<CreateChatappTemplateRequestComponents> getComponents() {
        return this.components;
    }

    public CreateChatappTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    @Deprecated
    public CreateChatappTemplateRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public CreateChatappTemplateRequest setExample(java.util.Map<String, String> example) {
        this.example = example;
        return this;
    }
    public java.util.Map<String, String> getExample() {
        return this.example;
    }

    @Deprecated
    public CreateChatappTemplateRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public CreateChatappTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateChatappTemplateRequest setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
        return this;
    }
    public Integer getMessageSendTtlSeconds() {
        return this.messageSendTtlSeconds;
    }

    public CreateChatappTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChatappTemplateRequest setProductSetId(String productSetId) {
        this.productSetId = productSetId;
        return this;
    }
    public String getProductSetId() {
        return this.productSetId;
    }

    public CreateChatappTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class CreateChatappTemplateRequestComponentsButtonsSupportedApps extends TeaModel {
        /**
         * <p>The package name of the app invoked by WhatsApp. This parameter is required for WhatsApp templates where Category is set to AUTHENTICATION and Button Type is set to ONE_TAP or ZERO_TAP.</p>
         * 
         * <strong>example:</strong>
         * <p>com.kuaidian.waimaistaff</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The signature hash value of the app invoked by WhatsApp. This parameter is required for WhatsApp templates where Category is set to AUTHENTICATION and Button Type is set to ONE_TAP or ZERO_TAP.</p>
         * 
         * <strong>example:</strong>
         * <p>ieid83kdiek</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        public static CreateChatappTemplateRequestComponentsButtonsSupportedApps build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponentsButtonsSupportedApps self = new CreateChatappTemplateRequestComponentsButtonsSupportedApps();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateRequestComponentsButtonsSupportedApps setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public CreateChatappTemplateRequestComponentsButtonsSupportedApps setSignatureHash(String signatureHash) {
            this.signatureHash = signatureHash;
            return this;
        }
        public String getSignatureHash() {
            return this.signatureHash;
        }

    }

    public static class CreateChatappTemplateRequestComponentsButtons extends TeaModel {
        /**
         * <p>The button text for the WhatsApp autofill operation. This parameter is required for WhatsApp templates where Category is set to AUTHENTICATION and Button Type is set to ONE_TAP or ZERO_TAP.</p>
         * 
         * <strong>example:</strong>
         * <p>Autofill</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        /**
         * <p>The coupon code value. Only letters and digits are supported. You can pass a variable such as $(couponCode) and specify the actual coupon code when sending the message.</p>
         * 
         * <strong>example:</strong>
         * <p>120293</p>
         */
        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <p>The flow data event type. Valid values:</p>
         * <ul>
         * <li><p>DATA_EXCHANGE: data exchange.</p>
         * </li>
         * <li><p>NAVIGATE: navigation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAVIGATE</p>
         */
        @NameInMap("FlowAction")
        public String flowAction;

        /**
         * <p>The flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>479884093605****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>Specifies whether the button is a marketing opt-out button. If a customer clicks this button and send control operations are configured on the Chat App Message Service platform, subsequent marketing messages will not be sent to the customer. This parameter is valid only for WhatsApp templates where Category is set to Marketing and Button Type is set to QUICK_REPLY.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>The navigation screen. This parameter is required when FlowAction is set to NAVIGATE.</p>
         * 
         * <strong>example:</strong>
         * <p>DETAILS</p>
         */
        @NameInMap("NavigateScreen")
        public String navigateScreen;

        /**
         * <p>Use the properties under SupportedApps.</p>
         * 
         * <strong>example:</strong>
         * <p>com.demo</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The phone number. This parameter is valid only when the button type is <strong>PHONE_NUMBER</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>+861368897****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Use the properties under SupportedApps.</p>
         * 
         * <strong>example:</strong>
         * <p>wi299382</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        /**
         * <p>The list of supported apps.</p>
         */
        @NameInMap("SupportedApps")
        public java.util.List<CreateChatappTemplateRequestComponentsButtonsSupportedApps> supportedApps;

        /**
         * <p>The display name of the button.</p>
         * 
         * <strong>example:</strong>
         * <p>Call Me</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>10800</p>
         */
        @NameInMap("TtlMinutes")
        public Long ttlMinutes;

        /**
         * <p>The button type. Valid values:</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: call button.</p>
         * </li>
         * <li><p><strong>URL</strong>: URL button.</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: quick reply button.</p>
         * </li>
         * <li><p><strong>COPY_CODE</strong>: copy verification code or coupon code button.</p>
         * </li>
         * <li><p><strong>ONE_TAP</strong>: autofill button for AUTHENTICATION templates.</p>
         * </li>
         * <li><p><strong>ZERO_TAP</strong>: autofill button for AUTHENTICATION templates.</p>
         * </li>
         * <li><p><strong>MPM</strong>: multi-product message.</p>
         * </li>
         * <li><p><strong>CATALOG</strong>: catalog.</p>
         * </li>
         * <li><p><strong>FLOW</strong>: open WhatsApp flow.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For WhatsApp templates where Category is set to AUTHENTICATION, only one button is allowed, and its type must be COPY_CODE or ONE_TAP. If the type is COPY_CODE, Text is required. If the type is ONE_TAP, Text (displayed when the target app is not installed on the device, representing the name of the copy verification code button), SignatureHash, PackageName, and AutofillText are required.</li>
         * <li>For Viber templates, only one button is allowed, and its type must be URL.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE_NUMBER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be accessed when the link button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type. Valid values:</p>
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

        public static CreateChatappTemplateRequestComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponentsButtons self = new CreateChatappTemplateRequestComponentsButtons();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateRequestComponentsButtons setAutofillText(String autofillText) {
            this.autofillText = autofillText;
            return this;
        }
        public String getAutofillText() {
            return this.autofillText;
        }

        public CreateChatappTemplateRequestComponentsButtons setCouponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }
        public String getCouponCode() {
            return this.couponCode;
        }

        public CreateChatappTemplateRequestComponentsButtons setFlowAction(String flowAction) {
            this.flowAction = flowAction;
            return this;
        }
        public String getFlowAction() {
            return this.flowAction;
        }

        public CreateChatappTemplateRequestComponentsButtons setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public CreateChatappTemplateRequestComponentsButtons setIsOptOut(Boolean isOptOut) {
            this.isOptOut = isOptOut;
            return this;
        }
        public Boolean getIsOptOut() {
            return this.isOptOut;
        }

        public CreateChatappTemplateRequestComponentsButtons setNavigateScreen(String navigateScreen) {
            this.navigateScreen = navigateScreen;
            return this;
        }
        public String getNavigateScreen() {
            return this.navigateScreen;
        }

        public CreateChatappTemplateRequestComponentsButtons setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public CreateChatappTemplateRequestComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreateChatappTemplateRequestComponentsButtons setSignatureHash(String signatureHash) {
            this.signatureHash = signatureHash;
            return this;
        }
        public String getSignatureHash() {
            return this.signatureHash;
        }

        public CreateChatappTemplateRequestComponentsButtons setSupportedApps(java.util.List<CreateChatappTemplateRequestComponentsButtonsSupportedApps> supportedApps) {
            this.supportedApps = supportedApps;
            return this;
        }
        public java.util.List<CreateChatappTemplateRequestComponentsButtonsSupportedApps> getSupportedApps() {
            return this.supportedApps;
        }

        public CreateChatappTemplateRequestComponentsButtons setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateChatappTemplateRequestComponentsButtons setTtlMinutes(Long ttlMinutes) {
            this.ttlMinutes = ttlMinutes;
            return this;
        }
        public Long getTtlMinutes() {
            return this.ttlMinutes;
        }

        public CreateChatappTemplateRequestComponentsButtons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateChatappTemplateRequestComponentsButtons setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateChatappTemplateRequestComponentsButtons setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

    }

    public static class CreateChatappTemplateRequestComponentsCardsCardComponentsButtons extends TeaModel {
        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>+86138007****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The button text.</p>
         * 
         * <strong>example:</strong>
         * <p>Call me</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The button type. Valid values:</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: call button.</p>
         * </li>
         * <li><p><strong>URL</strong>: URL button.</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: quick reply button.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE_NUMBER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be accessed when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com/xx">https://alibaba.com/xx</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type. Valid values: </p>
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

        public static CreateChatappTemplateRequestComponentsCardsCardComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponentsCardsCardComponentsButtons self = new CreateChatappTemplateRequestComponentsCardsCardComponentsButtons();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponentsButtons setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponentsButtons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponentsButtons setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponentsButtons setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

    }

    public static class CreateChatappTemplateRequestComponentsCardsCardComponents extends TeaModel {
        /**
         * <p>The list of buttons. This parameter is only applicable to the BUTTONS component. Each carousel card can have a maximum of two buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The media resource type. This parameter is valid when Type is set to HEADER. Valid values:</p>
         * <ul>
         * <li><p><strong>IMAGE</strong>: image. </p>
         * </li>
         * <li><p><strong>VIDEO</strong>: video.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The body content in the carousel card.</p>
         * 
         * <strong>example:</strong>
         * <p>Who is the very powerful team</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The component type. Valid values:</p>
         * <ul>
         * <li><p><strong>BODY</strong></p>
         * </li>
         * <li><p><strong>HEADER</strong></p>
         * </li>
         * <li><p><strong>BUTTONS</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p><a href="https://alibaba.com/img.png">https://alibaba.com/img.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateChatappTemplateRequestComponentsCardsCardComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponentsCardsCardComponents self = new CreateChatappTemplateRequestComponentsCardsCardComponents();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponents setButtons(java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons) {
            this.buttons = buttons;
            return this;
        }
        public java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponentsButtons> getButtons() {
            return this.buttons;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponents setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateChatappTemplateRequestComponentsCardsCardComponents setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateChatappTemplateRequestComponentsCards extends TeaModel {
        /**
         * <p>The list of controls in the carousel card.</p>
         */
        @NameInMap("CardComponents")
        public java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponents> cardComponents;

        public static CreateChatappTemplateRequestComponentsCards build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponentsCards self = new CreateChatappTemplateRequestComponentsCards();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateRequestComponentsCards setCardComponents(java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponents> cardComponents) {
            this.cardComponents = cardComponents;
            return this;
        }
        public java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponents> getCardComponents() {
            return this.cardComponents;
        }

    }

    public static class CreateChatappTemplateRequestComponents extends TeaModel {
        /**
         * <p>The security recommendation text displayed above the body to warn users not to share the verification code with others. This parameter is valid only for WhatsApp templates where Category is set to AUTHENTICATION and Component Type is set to BODY.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The list of buttons. This parameter is only applicable to the <strong>BUTTONS</strong> component.</p>
         * <blockquote>
         * <p>WhatsApp button limits:</p>
         * <ul>
         * <li>For MARKETING or UTILITY templates, a maximum of 10 buttons are allowed.</li>
         * <li>Only one PHONE_NUMBER button is allowed.</li>
         * <li>A maximum of two URL buttons are allowed.</li>
         * <li>QUICK_REPLY buttons cannot be mixed with PHONE_NUMBER or URL buttons in an unordered manner.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Viber button limits:</p>
         * <ul>
         * <li>Only the URL type is supported, and only one button is allowed.</li>
         * <li>When the HEADER is a VIDEO, the button type must be URL, but the URL address cannot be set.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a video</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The list of carousel template cards.</p>
         */
        @NameInMap("Cards")
        public java.util.List<CreateChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period of the verification code in minutes for WhatsApp AUTHENTICATION templates. This parameter is valid only for WhatsApp messages where Category is set to AUTHENTICATION and Component Type is set to FOOTER. This information is displayed in the footer.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The duration of the Viber video message in seconds. Valid values: 0 to 600.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Express delivery video</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type of the Viber file message.</p>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The media resource type. Valid values:</p>
         * <ul>
         * <li><p><strong>TEXT</strong>: text.</p>
         * </li>
         * <li><p><strong>IMAGE</strong>: image.</p>
         * </li>
         * <li><p><strong>DOCUMENT</strong>: document.</p>
         * </li>
         * <li><p><strong>VIDEO</strong>: video.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Specifies whether the coupon code has an expiration time. This parameter is used when Type is set to LIMITED_TIME_OFFER.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message to send.</p>
         * <blockquote>
         * <p>For WhatsApp templates, when Category is set to AUTHENTICATION, this property is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hello whatsapp</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail for Viber video messages.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.multiplymall.mobiapp.cloud/yunmall/B-LM-LMALL202207130001/20220730/d712a057-a6af-4513-bbe6-7ee57ea60983.png?x-oss-process=image/resize,w_100">https://cdn.multiplymall.mobiapp.cloud/yunmall/B-LM-LMALL202207130001/20220730/d712a057-a6af-4513-bbe6-7ee57ea60983.png?x-oss-process=image/resize,w_100</a></p>
         */
        @NameInMap("ThumbUrl")
        public String thumbUrl;

        /**
         * <p>The component type. Valid values:</p>
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
         * <li>For WhatsApp templates, the <strong>BODY</strong> component cannot exceed 1,024 characters in length. The <strong>HEADER</strong> and <strong>FOOTER</strong> components cannot exceed 60 characters in length.</li>
         * <li>For Viber templates, the <strong>FOOTER</strong>, <strong>CAROUSEL</strong>, and <strong>LIMITED_TIME_OFFER</strong> types are invalid.</li>
         * <li>In Viber templates, images, videos, and files are placed in the <strong>HEADER</strong> (the client displays the image below the text). Text is placed in the <strong>BODY</strong>.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BODY</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the media.</p>
         * <blockquote>
         * <p>For Viber templates, the recommended image size is 800 × 800 pixels.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://image.developer.aliyundoc.com">https://image.developer.aliyundoc.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateChatappTemplateRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponents self = new CreateChatappTemplateRequestComponents();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateRequestComponents setAddSecretRecommendation(Boolean addSecretRecommendation) {
            this.addSecretRecommendation = addSecretRecommendation;
            return this;
        }
        public Boolean getAddSecretRecommendation() {
            return this.addSecretRecommendation;
        }

        public CreateChatappTemplateRequestComponents setButtons(java.util.List<CreateChatappTemplateRequestComponentsButtons> buttons) {
            this.buttons = buttons;
            return this;
        }
        public java.util.List<CreateChatappTemplateRequestComponentsButtons> getButtons() {
            return this.buttons;
        }

        public CreateChatappTemplateRequestComponents setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public CreateChatappTemplateRequestComponents setCards(java.util.List<CreateChatappTemplateRequestComponentsCards> cards) {
            this.cards = cards;
            return this;
        }
        public java.util.List<CreateChatappTemplateRequestComponentsCards> getCards() {
            return this.cards;
        }

        public CreateChatappTemplateRequestComponents setCodeExpirationMinutes(Integer codeExpirationMinutes) {
            this.codeExpirationMinutes = codeExpirationMinutes;
            return this;
        }
        public Integer getCodeExpirationMinutes() {
            return this.codeExpirationMinutes;
        }

        public CreateChatappTemplateRequestComponents setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public CreateChatappTemplateRequestComponents setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public CreateChatappTemplateRequestComponents setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public CreateChatappTemplateRequestComponents setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateChatappTemplateRequestComponents setHasExpiration(Boolean hasExpiration) {
            this.hasExpiration = hasExpiration;
            return this;
        }
        public Boolean getHasExpiration() {
            return this.hasExpiration;
        }

        public CreateChatappTemplateRequestComponents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateChatappTemplateRequestComponents setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public CreateChatappTemplateRequestComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateChatappTemplateRequestComponents setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
