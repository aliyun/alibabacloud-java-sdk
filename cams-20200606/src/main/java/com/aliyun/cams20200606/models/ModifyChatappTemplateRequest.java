// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateRequest extends TeaModel {
    /**
     * <p>The template category for Viber templates. This parameter is invalid for WhatsApp templates.</p>
     * 
     * <strong>example:</strong>
     * <p>MARKETING</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Specifies whether to pause sending the template when its category is changed from Utility to Marketing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CategoryChangePaused")
    public Boolean categoryChangePaused;

    /**
     * <p>The list of message template components.</p>
     * <blockquote>
     * <p>When Category is AUTHENTICATION, Components cannot contain nodes with Type set to HEADER. When Type is BODY or FOOTER, if Text is empty, the content is automatically generated.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public java.util.List<ModifyChatappTemplateRequestComponents> components;

    /**
     * <p>The Space ID of the ISV sub-customer or the instance ID of the direct customer.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-did***</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WABA ID of the ISV customer. This parameter is deprecated. Use CustSpaceId instead.</p>
     * 
     * <strong>example:</strong>
     * <p>939***</p>
     */
    @NameInMap("CustWabaId")
    public String custWabaId;

    /**
     * <p>The variables in a key-value structure.</p>
     */
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    /**
     * <p>The ISV verification code, which is used to verify whether the RAM user is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>9393***</p>
     */
    @NameInMap("IsvCode")
    @Deprecated
    public String isvCode;

    /**
     * <p>The language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The validity period for sending WhatsApp authentication template messages.</p>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>productSetId</p>
     * 
     * <strong>example:</strong>
     * <p>939***</p>
     */
    @NameInMap("ProductSetId")
    public String productSetId;

    /**
     * <p>The message template code.</p>
     * 
     * <strong>example:</strong>
     * <p>93938**</p>
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
     * <p>The templatetype to modify. Valid values: WHATSAPP and VIBER. Default value: WHATSAPP.</p>
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

    @Deprecated
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

    public ModifyChatappTemplateRequest setProductSetId(String productSetId) {
        this.productSetId = productSetId;
        return this;
    }
    public String getProductSetId() {
        return this.productSetId;
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
         * <p>The package name of the application invoked by WhatsApp. This parameter is valid for WhatsApp templates where Category is Authentication and Button Type is ONE_TAP or ZERO_TAP.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.pack.***</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The signature hash value of the application invoked by WhatsApp. This parameter is valid for WhatsApp templates where Category is Authentication and Button Type is ONE_TAP or ZERO_TAP.</p>
         * 
         * <strong>example:</strong>
         * <p>kdikie9398k</p>
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
         * <p>The button text for the WhatsApp autofill operation. This parameter is required for WhatsApp templates where Category is Authentication and Button Type is ONE_TAP.</p>
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
         * <p>23838jdjdj</p>
         */
        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <p>The flow data event type. Valid values: NAVIGATE and DATA_EXCHANGE.</p>
         * 
         * <strong>example:</strong>
         * <p>NAVIGATE</p>
         */
        @NameInMap("FlowAction")
        public String flowAction;

        /**
         * <p>Flow id</p>
         * 
         * <strong>example:</strong>
         * <p>293882</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>Specifies whether the button is a marketing opt-out button. If a customer clicks this button and send control operations are configured on the Chat App Message Service platform, subsequent marketing messages are not sent to the customer. This parameter is valid only for WhatsApp templates where Category is Marketing and Button Type is QUICK_REPLY.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>The navigation screen. This parameter is required when FlowAction is NAVIGATE.</p>
         * 
         * <strong>example:</strong>
         * <p>SIGN_UP</p>
         */
        @NameInMap("NavigateScreen")
        public String navigateScreen;

        /**
         * <p>The package name of the application invoked by WhatsApp. This parameter is valid for WhatsApp templates where Category is Authentication and Button Type is ONE_TAP or ZERO_TAP.</p>
         * 
         * <strong>example:</strong>
         * <p>com.aliyun.pack.***</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>8613800**</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The signature hash value of the application invoked by WhatsApp. This parameter is valid for WhatsApp templates where Category is Authentication and Button Type is ONE_TAP or ZERO_TAP.</p>
         * 
         * <strong>example:</strong>
         * <p>kdikie9398k</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        /**
         * <p>The applications supported by the ONE_TAP or ZERO_TAP verification code.</p>
         */
        @NameInMap("SupportedApps")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtonsSupportedApps> supportedApps;

        /**
         * <p>The text of the message to be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>CTA</p>
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
         * <p>The button type. Valid values: PHONE_NUMBER, URL, and QUICK_REPLY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be accessed when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type. Valid values: static and dynamic.</p>
         * 
         * <strong>example:</strong>
         * <p>static</p>
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

        public ModifyChatappTemplateRequestComponentsButtons setTtlMinutes(Long ttlMinutes) {
            this.ttlMinutes = ttlMinutes;
            return this;
        }
        public Long getTtlMinutes() {
            return this.ttlMinutes;
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
         * <p>8613800**</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The button text.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The button type of the carousel template. Valid values: URL, PHONE_NUMBER, and QUICK_REQLY.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>URL</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be accessed when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/image.png">https://aliyun.com/image.png</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type. Valid values: static and dynamic.</p>
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
         * <p>The buttons in the carousel card. The button type, name, and order must be consistent across all cards. Each card can have a maximum of two buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The header type in the carousel template. Only IMAGE and VIDEO are supported. The header must be consistent across all cards. Valid values: IMGAGE and VIDEO.</p>
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
         * <p>body</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The component type. Valid values: BODY, HEADER, and BUTTONS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the image or video in the header.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/image.png">https://aliyun.com/image.png</a></p>
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
         * <p>The list of components in the carousel card.</p>
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
         * <p>The prompt displayed above the body that advises users not to share the verification code with others. This parameter is valid only for WhatsApp templates where Category is Authentication and Component Type is Body.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The list of buttons. This parameter applies only to <strong>BUTTONS</strong> components.</p>
         * <blockquote>
         * <p>WhatsApp button limits</p>
         * <ul>
         * <li>For MARKETING or UTILITY templates, a maximum of 10 buttons are allowed.</li>
         * <li>Only one PHONE_NUMBER button is allowed.</li>
         * <li>A maximum of two URL buttons are allowed.</li>
         * <li>QUICK_REPLY buttons must not be mixed with PHONE_NUMBER or URL buttons.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description. You can add a description when Type is Header and Format is IMGAGE, DOCUMENT, or VIDEO.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The list of carousel template cards.</p>
         */
        @NameInMap("Cards")
        public java.util.List<ModifyChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period of the verification code in minutes for WhatsApp authentication templates. This parameter is valid only for WhatsApp messages where Category is Authentication and Component Type is Footer. This information is displayed in the footer.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The duration of the Viber video message. Valid values: 0 to 600.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The file name. You can specify a file name when Type is Header and Format is DOCUMENT.</p>
         * 
         * <strong>example:</strong>
         * <p>txt.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file type of the Viber file message.</p>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The format. Valid values:</p>
         * <ul>
         * <li>TEXT: Text.</li>
         * <li>IMGAGE: Image.</li>
         * <li>DOCUMENT: Document.</li>
         * <li>VIDEO: Video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>body</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Specifies whether the LTO template has an expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message to be sent.</p>
         * 
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail URL for a Viber video message.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.png">https://img.png</a></p>
         */
        @NameInMap("ThumbUrl")
        public String thumbUrl;

        /**
         * <p>The component type. Valid values: BODY, HEADER, FOOTER, and BUTTONS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HEADER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The media URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.png">https://img.png</a></p>
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
