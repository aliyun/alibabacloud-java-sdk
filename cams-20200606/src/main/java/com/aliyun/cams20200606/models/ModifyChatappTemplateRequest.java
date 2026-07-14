// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateRequest extends TeaModel {
    /**
     * <p>The templatetype cannot be modified.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Specifies whether to pause sending when a Utility template is changed to Marketing type.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("CategoryChangePaused")
    public Boolean categoryChangePaused;

    /**
     * <p>The list of message template components.</p>
     * <blockquote>
     * <p>When Category is set to AUTHENTICATION, Components cannot contain a node with Type set to HEADER. When Type is set to BODY or FOOTER and the Text content is empty, the content is automatically generated.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public java.util.List<ModifyChatappTemplateRequestComponents> components;

    /**
     * <p>The SpaceId of the ISV sub-customer or the instance ID of a direct customer.</p>
     * 
     * <strong>example:</strong>
     * <p>28251486512358****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ISV customer WabaId.</p>
     * <blockquote>
     * <p>Deprecated parameter. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The examples for creating the template.</p>
     */
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    /**
     * <p>The ISV verification code used to verify whether the RAM user is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>ksiekdki39ksks93939</p>
     */
    @NameInMap("IsvCode")
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
     * <li>AUTHENTICATION: valid values are 30 to 900. </li>
     * <li>UTILITY: valid values are 30 to 43200.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>The message template code.</p>
     * 
     * <strong>example:</strong>
     * <p>8472929283883</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The template name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The templatetype.</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static ModifyChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplateRequest self = new ModifyChatappTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ModifyChatappTemplateRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyChatappTemplateRequest setCategoryChangePaused(Boolean categoryChangePaused) {
        this.categoryChangePaused = categoryChangePaused;
        return this;
    }
    public Boolean getCategoryChangePaused() {
        return this.categoryChangePaused;
    }

    public ModifyChatappTemplateRequest setComponents(java.util.List<ModifyChatappTemplateRequestComponents> components) {
        this.components = components;
        return this;
    }
    public java.util.List<ModifyChatappTemplateRequestComponents> getComponents() {
        return this.components;
    }

    public ModifyChatappTemplateRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    @Deprecated
    public ModifyChatappTemplateRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public ModifyChatappTemplateRequest setExample(java.util.Map<String, String> example) {
        this.example = example;
        return this;
    }
    public java.util.Map<String, String> getExample() {
        return this.example;
    }

    public ModifyChatappTemplateRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public ModifyChatappTemplateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ModifyChatappTemplateRequest setMessageSendTtlSeconds(Integer messageSendTtlSeconds) {
        this.messageSendTtlSeconds = messageSendTtlSeconds;
        return this;
    }
    public Integer getMessageSendTtlSeconds() {
        return this.messageSendTtlSeconds;
    }

    public ModifyChatappTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ModifyChatappTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public ModifyChatappTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class ModifyChatappTemplateRequestComponentsButtonsSupportedApps extends TeaModel {
        /**
         * <p>Required when the WhatsApp template Category is AUTHENTICATION and Button Type is ONE_TAP or ZERO_TAP. The package name for WhatsApp to launch the application.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.myapplication</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>Required when the WhatsApp template Category is AUTHENTICATION and Button Type is ONE_TAP or ZERO_TAP. The signature hash value for WhatsApp to launch the application.</p>
         * 
         * <strong>example:</strong>
         * <p>fk39kd93ks9</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        public static ModifyChatappTemplateRequestComponentsButtonsSupportedApps build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponentsButtonsSupportedApps self = new ModifyChatappTemplateRequestComponentsButtonsSupportedApps();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponentsButtonsSupportedApps setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ModifyChatappTemplateRequestComponentsButtonsSupportedApps setSignatureHash(String signatureHash) {
            this.signatureHash = signatureHash;
            return this;
        }
        public String getSignatureHash() {
            return this.signatureHash;
        }

    }

    public static class ModifyChatappTemplateRequestComponentsButtons extends TeaModel {
        /**
         * <p>Required when the WhatsApp template Category is AUTHENTICATION and Button Type is ONE_TAP or ZERO_TAP. The button text for the WhatsApp autofill operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Autofill</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        /**
         * <p>The coupon code value. Only letters and numbers are supported. You can pass in a variable such as $(couponCode) and provide the actual coupon code when sending the message.</p>
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
         * <p>Flow ID。</p>
         * 
         * <strong>example:</strong>
         * <p>664597077870605</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>Valid when the WhatsApp template Category is Marketing and Button type is QUICK_REPLY. Indicates the button is a marketing opt-out button. If the customer clicks this button and the send control operation is configured in ChatApp, subsequent Marketing messages will not be sent to the customer.</p>
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
         * <p>Use the properties under SupportedApps instead.</p>
         * 
         * <strong>example:</strong>
         * <p>com.demo</p>
         */
        @NameInMap("PackageName")
        @Deprecated
        public String packageName;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>+861388888****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Use the properties under SupportedApps instead.</p>
         * 
         * <strong>example:</strong>
         * <p>29dkeke</p>
         */
        @NameInMap("SignatureHash")
        @Deprecated
        public String signatureHash;

        /**
         * <p>The list of supported applications.</p>
         */
        @NameInMap("SupportedApps")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtonsSupportedApps> supportedApps;

        /**
         * <p>The button text.</p>
         * 
         * <strong>example:</strong>
         * <p>phone-button-text</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The button type.</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: phone call button</p>
         * </li>
         * <li><p><strong>URL</strong>: web button</p>
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
         * <li><p><strong>FLOW</strong>: open a WhatsApp flow</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For WhatsApp templates with Category set to AUTHENTICATION, only one button is allowed, and the type can only be COPY_CODE or ONE_TAP. When the type is COPY_CODE, Text is required. When the type is ONE_TAP, Text (displayed when the target application is not installed on the device, indicating the name of the copy verification code button) is required, and SignatureHash, PackageName, and AutofillText are required.</li>
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
         * <p>The URL to visit when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.website.com/">https://www.website.com/</a>***</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type.</p>
         * <ul>
         * <li><p><strong>static</strong>: static</p>
         * </li>
         * <li><p><strong>dynamic</strong>: dynamic</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dynamic</p>
         */
        @NameInMap("UrlType")
        public String urlType;

        public static ModifyChatappTemplateRequestComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponentsButtons self = new ModifyChatappTemplateRequestComponentsButtons();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponentsButtons setAutofillText(String autofillText) {
            this.autofillText = autofillText;
            return this;
        }
        public String getAutofillText() {
            return this.autofillText;
        }

        public ModifyChatappTemplateRequestComponentsButtons setCouponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }
        public String getCouponCode() {
            return this.couponCode;
        }

        public ModifyChatappTemplateRequestComponentsButtons setFlowAction(String flowAction) {
            this.flowAction = flowAction;
            return this;
        }
        public String getFlowAction() {
            return this.flowAction;
        }

        public ModifyChatappTemplateRequestComponentsButtons setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }
        public String getFlowId() {
            return this.flowId;
        }

        public ModifyChatappTemplateRequestComponentsButtons setIsOptOut(Boolean isOptOut) {
            this.isOptOut = isOptOut;
            return this;
        }
        public Boolean getIsOptOut() {
            return this.isOptOut;
        }

        public ModifyChatappTemplateRequestComponentsButtons setNavigateScreen(String navigateScreen) {
            this.navigateScreen = navigateScreen;
            return this;
        }
        public String getNavigateScreen() {
            return this.navigateScreen;
        }

        @Deprecated
        public ModifyChatappTemplateRequestComponentsButtons setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ModifyChatappTemplateRequestComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        @Deprecated
        public ModifyChatappTemplateRequestComponentsButtons setSignatureHash(String signatureHash) {
            this.signatureHash = signatureHash;
            return this;
        }
        public String getSignatureHash() {
            return this.signatureHash;
        }

        public ModifyChatappTemplateRequestComponentsButtons setSupportedApps(java.util.List<ModifyChatappTemplateRequestComponentsButtonsSupportedApps> supportedApps) {
            this.supportedApps = supportedApps;
            return this;
        }
        public java.util.List<ModifyChatappTemplateRequestComponentsButtonsSupportedApps> getSupportedApps() {
            return this.supportedApps;
        }

        public ModifyChatappTemplateRequestComponentsButtons setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ModifyChatappTemplateRequestComponentsButtons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyChatappTemplateRequestComponentsButtons setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyChatappTemplateRequestComponentsButtons setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

    }

    public static class ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons extends TeaModel {
        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>+861368893****</p>
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
         * <p>The button type.</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: phone call button</p>
         * </li>
         * <li><p><strong>URL</strong>: web button</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: quick reply button</p>
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
         * <p>The URL to visit when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com/xx">https://alibaba.com/xx</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type.</p>
         * <ul>
         * <li><p><strong>static</strong>: static</p>
         * </li>
         * <li><p><strong>dynamic</strong>: dynamic</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("UrlType")
        public String urlType;

        public static ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons self = new ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons setUrlType(String urlType) {
            this.urlType = urlType;
            return this;
        }
        public String getUrlType() {
            return this.urlType;
        }

    }

    public static class ModifyChatappTemplateRequestComponentsCardsCardComponents extends TeaModel {
        /**
         * <p>The button list. This parameter applies only to the BUTTONS component. Each Carousel card can have a maximum of two buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The media resource type. Valid when Type is set to HEADER.</p>
         * <ul>
         * <li><p><strong>IMAGE</strong>: image </p>
         * </li>
         * <li><p><strong>VIDEO</strong>: video</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The BODY content in the Carousel card.</p>
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
         * <p>The material path.</p>
         */
        @NameInMap("Url")
        public String url;

        public static ModifyChatappTemplateRequestComponentsCardsCardComponents build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponentsCardsCardComponents self = new ModifyChatappTemplateRequestComponentsCardsCardComponents();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponents setButtons(java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons) {
            this.buttons = buttons;
            return this;
        }
        public java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons> getButtons() {
            return this.buttons;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponents setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyChatappTemplateRequestComponentsCardsCardComponents setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ModifyChatappTemplateRequestComponentsCards extends TeaModel {
        /**
         * <p>The list of components in the Carousel card.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("CardComponents")
        public java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponents> cardComponents;

        public static ModifyChatappTemplateRequestComponentsCards build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponentsCards self = new ModifyChatappTemplateRequestComponentsCards();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponentsCards setCardComponents(java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponents> cardComponents) {
            this.cardComponents = cardComponents;
            return this;
        }
        public java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponents> getCardComponents() {
            return this.cardComponents;
        }

    }

    public static class ModifyChatappTemplateRequestComponents extends TeaModel {
        /**
         * <p>Valid for WhatsApp templates when Category is AUTHENTICATION and Component Type is Body. Displays a message in the Body section advising not to share the verification code with others.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The button list. This parameter applies only to the <strong>BUTTONS</strong> component.</p>
         * <blockquote>
         * <p>WhatsApp button limits:</p>
         * <ul>
         * <li>For WhatsApp templates with Category set to MARKETING or UTILITY, a maximum of 10 buttons are allowed.</li>
         * <li>Only one PHONE_NUMBER button is allowed.</li>
         * <li>A maximum of two URL buttons are allowed.</li>
         * <li>QUICK_REPLY buttons cannot be mixed in random order with PHONE_NUMBER or URL buttons.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description.</p>
         * <blockquote>
         * <p>A description can be added when Type is set to <strong>HEADER</strong> and Format is set to <strong>IMAGE/DOCUMENT/VIDEO</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This is a video</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The list of Carousel template cards.</p>
         */
        @NameInMap("Cards")
        public java.util.List<ModifyChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period (in minutes) of the verification code in WhatsApp AUTHENTICATION templates. Valid only for WhatsApp messages when Category is AUTHENTICATION and Component Type is Footer. This information is displayed in the Footer section.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>Invalid field.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The file name.</p>
         * <blockquote>
         * <p>A file name can be specified when Type is set to <strong>HEADER</strong> and Format is set to <strong>DOCUMENT</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Invalid field.</p>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The media resource type.</p>
         * <ul>
         * <li><p><strong>TEXT</strong>: text </p>
         * </li>
         * <li><p><strong>IMAGE</strong>: image </p>
         * </li>
         * <li><p><strong>DOCUMENT</strong>: document </p>
         * </li>
         * <li><p><strong>VIDEO</strong>: video</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Specifies whether the coupon code has an expiration time. Used when type is set to LIMITED_TIME_OFFER.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message to be sent.</p>
         * <blockquote>
         * <p>When Category is set to AUTHENTICATION, this property value is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hello chatapp</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Invalid field.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.multiplymall.mobiapp.cloud/cloudcode/yc-165407506207478-165511576113195/20220905/ec5b9737-1507-4208-bb27-8da3958da961.jpg?x-oss-process=image/resize,w_100">https://cdn.multiplymall.mobiapp.cloud/cloudcode/yc-165407506207478-165511576113195/20220905/ec5b9737-1507-4208-bb27-8da3958da961.jpg?x-oss-process=image/resize,w_100</a></p>
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
         * <p>The material path.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.****.com/png_preview/00/10/24/1GygxVK3F4.jpg">https://img.****.com/png_preview/00/10/24/1GygxVK3F4.jpg</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static ModifyChatappTemplateRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponents self = new ModifyChatappTemplateRequestComponents();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponents setAddSecretRecommendation(Boolean addSecretRecommendation) {
            this.addSecretRecommendation = addSecretRecommendation;
            return this;
        }
        public Boolean getAddSecretRecommendation() {
            return this.addSecretRecommendation;
        }

        public ModifyChatappTemplateRequestComponents setButtons(java.util.List<ModifyChatappTemplateRequestComponentsButtons> buttons) {
            this.buttons = buttons;
            return this;
        }
        public java.util.List<ModifyChatappTemplateRequestComponentsButtons> getButtons() {
            return this.buttons;
        }

        public ModifyChatappTemplateRequestComponents setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public ModifyChatappTemplateRequestComponents setCards(java.util.List<ModifyChatappTemplateRequestComponentsCards> cards) {
            this.cards = cards;
            return this;
        }
        public java.util.List<ModifyChatappTemplateRequestComponentsCards> getCards() {
            return this.cards;
        }

        public ModifyChatappTemplateRequestComponents setCodeExpirationMinutes(Integer codeExpirationMinutes) {
            this.codeExpirationMinutes = codeExpirationMinutes;
            return this;
        }
        public Integer getCodeExpirationMinutes() {
            return this.codeExpirationMinutes;
        }

        public ModifyChatappTemplateRequestComponents setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ModifyChatappTemplateRequestComponents setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ModifyChatappTemplateRequestComponents setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ModifyChatappTemplateRequestComponents setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ModifyChatappTemplateRequestComponents setHasExpiration(Boolean hasExpiration) {
            this.hasExpiration = hasExpiration;
            return this;
        }
        public Boolean getHasExpiration() {
            return this.hasExpiration;
        }

        public ModifyChatappTemplateRequestComponents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ModifyChatappTemplateRequestComponents setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
            return this;
        }
        public String getThumbUrl() {
            return this.thumbUrl;
        }

        public ModifyChatappTemplateRequestComponents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ModifyChatappTemplateRequestComponents setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
