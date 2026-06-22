// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateRequest extends TeaModel {
    /**
     * <p>The templatetype is immutable.</p>
     * 
     * <strong>example:</strong>
     * <p>text</p>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("CategoryChangePaused")
    public Boolean categoryChangePaused;

    /**
     * <p>A list of message template components.</p>
     * <blockquote>
     * <p>When Category is AUTHENTICATION, Components cannot contain a node with Type set to HEADER. If Type is BODY or FOOTER, the Text content is empty and is automatically generated.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public java.util.List<ModifyChatappTemplateRequestComponents> components;

    /**
     * <p>The Space ID of the ISV sub-customer, or the instance ID of a direct customer.</p>
     * 
     * <strong>example:</strong>
     * <p>28251486512358****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business Account (WABA) ID of the independent software vendor (ISV) customer.</p>
     * <blockquote>
     * <p>This parameter is deprecated. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The template example.</p>
     */
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    /**
     * <p>The ISV verification code. This code is used to verify that the RAM user is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>ksiekdki39ksks93939</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The template language. For a list of language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The time-to-live (TTL) of the template message in seconds.</p>
     * <ul>
     * <li><p>For AUTHENTICATION templates, the value ranges from 30 to 900.</p>
     * </li>
     * <li><p>For UTILITY templates, the value ranges from 30 to 43,200.</p>
     * </li>
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
     * <p>The template type.</p>
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
         * <p>Required for WhatsApp templates when Category is AUTHENTICATION and Button Type is ONE_TAP or ZERO_TAP. This is the package name of the application launched by WhatsApp.</p>
         * 
         * <strong>example:</strong>
         * <p>com.example.myapplication</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>Required for WhatsApp templates when Category is AUTHENTICATION and Button Type is ONE_TAP or ZERO_TAP. This is the signature hash of the application launched by WhatsApp.</p>
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
         * <p>Required for WhatsApp templates when Category is AUTHENTICATION and Button Type is ONE_TAP or ZERO_TAP. This is the button text for the WhatsApp Autofill action.</p>
         * 
         * <strong>example:</strong>
         * <p>Autofill</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        /**
         * <p>The coupon code. It supports only letters and numbers. You can pass a variable, such as \<code>$(couponCode)\\</code>, and provide the actual coupon code at the time of sending.</p>
         * 
         * <strong>example:</strong>
         * <p>120293</p>
         */
        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <p>The Flow data event type. Valid values:</p>
         * <ul>
         * <li><p>DATA_EXCHANGE: Data exchange.</p>
         * </li>
         * <li><p>NAVIGATE: Navigation.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NAVIGATE</p>
         */
        @NameInMap("FlowAction")
        public String flowAction;

        /**
         * <p>The Flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>664597077870605</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>For WhatsApp templates, this is valid when Category is Marketing and Button type is QUICK_REPLY. It indicates that the button is a marketing opt-out button. If a customer clicks this button and a sending control action is configured in ChatApp, subsequent marketing messages are not sent to the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>The screen to navigate to. This is required when FlowAction is NAVIGATE.</p>
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
         * <p>Use the properties under SupportedApps.</p>
         * 
         * <strong>example:</strong>
         * <p>29dkeke</p>
         */
        @NameInMap("SignatureHash")
        @Deprecated
        public String signatureHash;

        /**
         * <p>A list of supported apps.</p>
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
         * <li><p><strong>PHONE_NUMBER</strong>: Call button</p>
         * </li>
         * <li><p><strong>URL</strong>: URL button</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: Quick reply button</p>
         * </li>
         * <li><p><strong>COPY_CODE</strong>: Copy verification code or coupon code</p>
         * </li>
         * <li><p><strong>ONE_TAP</strong>: Backfill button for AUTHENTICATION templates</p>
         * </li>
         * <li><p><strong>ZERO_TAP</strong>: Backfill button for AUTHENTICATION templates</p>
         * </li>
         * <li><p><strong>MPM</strong>: Multi-product message</p>
         * </li>
         * <li><p><strong>CATALOG</strong>: Catalog</p>
         * </li>
         * <li><p><strong>FLOW</strong>: Open WhatsApp flow</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For WhatsApp templates where Category is AUTHENTICATION, only one button is allowed, and its type must be COPY_CODE or ONE_TAP. If the type is COPY_CODE, Text is required. If the type is ONE_TAP, the Text (the name of the copy code button, displayed when the target application is not installed), SignatureHash, PackageName, and AutofillText properties are required.</li>
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
         * <li><p><strong>static</strong></p>
         * </li>
         * <li><p><strong>dynamic</strong></p>
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
         * <li><p><strong>PHONE_NUMBER</strong>: Call button</p>
         * </li>
         * <li><p><strong>URL</strong>: URL button</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: Quick reply button</p>
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
         * <li><p><strong>static</strong></p>
         * </li>
         * <li><p><strong>dynamic</strong></p>
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
         * <p>A list of buttons. This applies only to the BUTTONS component. Each Carousel card can have a maximum of two buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The media resource type. This is valid when Type is HEADER.</p>
         * <ul>
         * <li><p><strong>IMAGE</strong></p>
         * </li>
         * <li><p><strong>VIDEO</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The content of the BODY in the Carousel card.</p>
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
         * <p>The URL of the media asset.</p>
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
         * <p>A list of controls in the Carousel card.</p>
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
         * <p>For WhatsApp templates, this is valid when Category is AUTHENTICATION and Component Type is Body. It indicates that a message is displayed above the body, advising users not to share the verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>A list of buttons. This applies only to the <code>BUTTONS</code> component.</p>
         * <blockquote>
         * <p>Number of buttons for WhatsApp:</p>
         * <ul>
         * <li><p>For MARKETING or UTILITY templates, WhatsApp allows a maximum of 10 buttons.</p>
         * </li>
         * <li><p>Only one button of the PHONE_NUMBER type is allowed.</p>
         * </li>
         * <li><p>A maximum of two buttons of the URL type are allowed.</p>
         * </li>
         * <li><p>QUICK_REPLY buttons cannot be mixed with PHONE_NUMBER or URL buttons.</p>
         * </li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description.</p>
         * <blockquote>
         * <p>You can add a description when Type is HEADER and Format is IMAGE, <code>DOCUMENT</code>, or <code>VIDEO</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This is a video</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>A list of cards for the Carousel template.</p>
         */
        @NameInMap("Cards")
        public java.util.List<ModifyChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period of the verification code for a WhatsApp AUTHENTICATION template, in minutes. This is valid only for WhatsApp messages when Category is AUTHENTICATION and Component Type is Footer. This information is displayed in the footer.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>This field is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The file name.</p>
         * <blockquote>
         * <p>Specify the file name when Type is HEADER and <code>Format</code> is <code>DOCUMENT</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>video</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>This field is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The media resource type.</p>
         * <ul>
         * <li><p><strong>TEXT</strong>: Text</p>
         * </li>
         * <li><p><strong>IMAGE</strong>: Image</p>
         * </li>
         * <li><p><strong>DOCUMENT</strong>: Document</p>
         * </li>
         * <li><p><strong>VIDEO</strong>: Video</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Indicates whether the coupon code has an expiration time. Used when type is LIMITED_TIME_OFFER.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message.</p>
         * <blockquote>
         * <p>If Category is AUTHENTICATION, this property is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hello chatapp</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>This field is invalid.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.multiplymall.mobiapp.cloud/cloudcode/yc-165407506207478-165511576113195/20220905/ec5b9737-1507-4208-bb27-8da3958da961.jpg?x-oss-process=image/resize,w_100">https://cdn.multiplymall.mobiapp.cloud/cloudcode/yc-165407506207478-165511576113195/20220905/ec5b9737-1507-4208-bb27-8da3958da961.jpg?x-oss-process=image/resize,w_100</a></p>
         */
        @NameInMap("ThumbUrl")
        public String thumbUrl;

        /**
         * <p>The component type:</p>
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
         * <li>For WhatsApp templates, the <code>BODY</code> component cannot exceed 1,024 characters. The <code>HEADER</code> and <code>FOOTER</code> components cannot exceed 60 characters.</li>
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
         * <p>The URL of the media asset.</p>
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
