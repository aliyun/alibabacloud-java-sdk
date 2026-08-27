// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow Facebook to automatically change the template category (to improve the template approval rate). This property is valid only when TemplateType is set to WHATSAPP.</p>
     * <blockquote>
     * <p>Notice: This property has been deprecated. WhatsApp no longer supports this property.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>WhatsApp template category. Valid values:</p>
     * <ul>
     * <li><p><strong>UTILITY</strong>: transaction-related.</p>
     * </li>
     * <li><p><strong>MARKETING</strong>: marketing.</p>
     * </li>
     * <li><p><strong>AUTHENTICATION</strong>: identity verification.</p>
     * </li>
     * </ul>
     * <p>Viber template category. Valid values:</p>
     * <ul>
     * <li><p><strong>UTILITY</strong>: transaction-related.</p>
     * </li>
     * <li><p><strong>MARKETING</strong>: marketing.</p>
     * </li>
     * <li><p><strong>AUTHENTICATION</strong>: identity verification.</p>
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
     * <p>Specifies whether to pause template sending when a Utility template is changed to Marketing type. This property is valid only for WhatsApp templates.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CategoryChangePaused")
    public Boolean categoryChangePaused;

    /**
     * <p>The list of message template components.</p>
     * <blockquote>
     * <p>When Category=AUTHENTICATION, Components cannot contain nodes with Type=HEADER. When Type=BODY or FOOTER, the Text content must be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateChatappTemplateRequestComponents> components;

    /**
     * <p>The SpaceId of the ISV sub-customer or the direct customer instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
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
     * <p>The example for creating the template.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_whatsapp</p>
     */
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    /**
     * <p>The ISV verification code, used to verify whether the sub-account is authorized by the ISV.</p>
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
     * <p>The time-to-live (TTL) for template messages in WhatsApp.</p>
     * <ul>
     * <li>AUTHENTICATION: valid values range from 30 to 900. </li>
     * <li>UTILITY: valid values range from 30 to 43200.</li>
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
     * <p>The templatetype. Valid values:</p>
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
         * <p>Required for WhatsApp templates when Category is AUTHENTICATION and Button Type is ONE_TAP/ZERO_TAP. The package name of the application invoked by WhatsApp.</p>
         * 
         * <strong>example:</strong>
         * <p>com.kuaidian.waimaistaff</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>Required for WhatsApp templates when Category is AUTHENTICATION and Button Type is ONE_TAP/ZERO_TAP. The signature hash value for the application invoked by WhatsApp.</p>
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
         * <p>Required for WhatsApp templates when Category is AUTHENTICATION and Button Type is ONE_TAP/ZERO_TAP. The button text for the WhatsApp Autofill operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Autofill</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        /**
         * <p>The coupon code value. Only letters and numbers are supported. You can pass in a variable such as $(couponCode) and provide the actual coupon code when sending.</p>
         * 
         * <strong>example:</strong>
         * <p>120293</p>
         */
        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <p>The Flow data event type. Valid values:</p>
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
         * <p>479884093605****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>Valid for WhatsApp templates when Category is Marketing and Button type is QUICK_REPLY. Indicates the button is a marketing opt-out button. If the customer clicks this button and send control is configured on ChatApp, subsequent Marketing messages will not be sent to the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>The navigate screen. Required when FlowAction=NAVIGATE.</p>
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
        public String packageName;

        /**
         * <p>The phone number. Valid only when the button type is <strong>PHONE_NUMBER</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>+861368897****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Use the properties under SupportedApps instead.</p>
         * 
         * <strong>example:</strong>
         * <p>wi299382</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        /**
         * <p>The list of supported applications.</p>
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
         * <p>The button type.</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: dial phone button</p>
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
         * <li><p><strong>FLOW</strong>: open WhatsApp flow</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For WhatsApp templates with Category AUTHENTICATION, only one button is allowed, and the type can only be COPY_CODE/ONE_TAP. When COPY_CODE is selected, Text is required. When ONE_TAP is selected, Text (displayed when the target application is not installed on the device, representing the copy verification code button name), SignatureHash, PackageName, and AutofillText are required.</li>
         * <li>Viber templates allow only one Button, and it must be URL type.</li>
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
         * <p>The URL to visit when the link button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
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
         * <p>The button type.</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: dial phone button</p>
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
         * <p>The URL that is accessed when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com/xx">https://alibaba.com/xx</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type. </p>
         * <ul>
         * <li><p><strong>static</strong>: Static.</p>
         * </li>
         * <li><p><strong>dynamic</strong>: Dynamic.</p>
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
         * <p>The button list. Applicable only to BUTTONS components. Each Carousel card can have a maximum of two buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The media resource type. Valid when Type = HEADER.</p>
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
         * <p>The list of components in the Carousel card.</p>
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
         * <p>Valid for WhatsApp templates when Category is AUTHENTICATION and Component Type is Body. Displays a prompt above the Body advising not to share the verification code with others.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The button list. Applicable only to <strong>BUTTONS</strong> components.</p>
         * <blockquote>
         * <p>WhatsApp button quantity rules:</p>
         * <ul>
         * <li>For WhatsApp templates with Category MARKETING/UTILITY, a maximum of 10 buttons are allowed.</li>
         * <li>Only 1 PHONE_NUMBER button is allowed.</li>
         * <li>A maximum of 2 URL buttons are allowed.</li>
         * <li>QUICK_REPLY buttons cannot appear in mixed order with PHONE_NUMBER/URL buttons.</li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Viber button quantity rules:</p>
         * <ul>
         * <li>Only URL type is supported, and only one button is allowed.</li>
         * <li>When the HEADER contains a VIDEO, the button type is URL, but you cannot set a URL address.</li>
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
         * <p>The Carousel template card list.</p>
         */
        @NameInMap("Cards")
        public java.util.List<CreateChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period (in minutes) of the verification code for WhatsApp AUTHENTICATION templates. Valid only for WhatsApp messages when Category is AUTHENTICATION and Component Type is Footer (displayed in the Footer position).</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The duration (in seconds) of Viber video messages. Valid values: 0 to 600.</p>
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
         * <p>The file type for Viber file messages.</p>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The media resource type.</p>
         * <ul>
         * <li><p><strong>TEXT</strong>: text</p>
         * </li>
         * <li><p><strong>IMAGE</strong>: image</p>
         * </li>
         * <li><p><strong>DOCUMENT</strong>: document</p>
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
         * <p>Specifies whether the coupon code has an expiration time. This parameter is used when type = LIMITED_TIME_OFFER.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message to be sent.</p>
         * <blockquote>
         * <p>For WHATSAPP type, this property value is empty when Category=AUTHENTICATION.</p>
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
         * <li>For WhatsApp templates, the <strong>BODY</strong> component cannot exceed 1024 characters. The <strong>HEADER</strong> and <strong>FOOTER</strong> components cannot exceed 60 characters.</li>
         * <li>For Viber templates, the <strong>FOOTER</strong>, <strong>CAROUSEL</strong>, and <strong>LIMITED_TIME_OFFER</strong> types are invalid.</li>
         * <li>For Viber templates, images, videos, and files are placed in the <strong>HEADER</strong> (the device displays images below the text). Text is placed in the <strong>BODY</strong>.</li>
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
         * <p>The media resource path.</p>
         * <blockquote>
         * <p>For Viber type, the recommended image size is 800 px × 800 px.</p>
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
