// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateRequest extends TeaModel {
    /**
     * <p>Indicates whether to allow Facebook to automatically change the category of the template. This can increase the approval rate of the template. This parameter is valid only when TemplateType is set to WHATSAPP.</p>
     * <blockquote>
     * <p>Notice: This property is deprecated. WhatsApp no longer supports this property.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowCategoryChange")
    @Deprecated
    public Boolean allowCategoryChange;

    /**
     * <p>WhatsApp template categories:</p>
     * <ul>
     * <li><p><strong>UTILITY</strong>: Transactional.</p>
     * </li>
     * <li><p><strong>MARKETING</strong>: Marketing.</p>
     * </li>
     * <li><p><strong>AUTHENTICATION</strong>: Authentication.</p>
     * </li>
     * </ul>
     * <p>Viber template categories:</p>
     * <ul>
     * <li><p><strong>UTILITY</strong>: Transactional.</p>
     * </li>
     * <li><p><strong>MARKETING</strong>: Marketing.</p>
     * </li>
     * <li><p><strong>AUTHENTICATION</strong>: Authentication.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <blockquote>
     * <p>When Category is set to AUTHENTICATION, the Components array cannot contain a component of the HEADER type. If the component type is BODY or FOOTER, the Text parameter must be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateChatappTemplateRequestComponents> components;

    /**
     * <p>The Space ID of the ISV sub-customer or the instance ID of the direct customer.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
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
     * <p>An example of how to create a template.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_whatsapp</p>
     */
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    /**
     * <p>The ISV verification code, used to verify whether the RAM user is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The template language. For more information about language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The time-to-live (TTL) of the template message in WhatsApp.</p>
     * <ul>
     * <li><p>For AUTHENTICATION templates, the value ranges from 30 to 900.</p>
     * </li>
     * <li><p>For UTILITY templates, the value ranges from 30 to 43200.</p>
     * </li>
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
     * <p>The template type.</p>
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

    @Deprecated
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

    public CreateChatappTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class CreateChatappTemplateRequestComponentsButtonsSupportedApps extends TeaModel {
        /**
         * <p>This parameter is required for WhatsApp templates when Category is set to AUTHENTICATION and the button type is ONE_TAP or ZERO_TAP. It specifies the package name of the app that WhatsApp will launch.</p>
         * 
         * <strong>example:</strong>
         * <p>com.kuaidian.waimaistaff</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>This parameter is required for WhatsApp templates when Category is set to AUTHENTICATION and the button type is ONE_TAP or ZERO_TAP. It specifies the signature hash of the app that WhatsApp will launch.</p>
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
         * <p>This parameter is required for WhatsApp templates when Category is set to AUTHENTICATION and the button type is ONE_TAP or ZERO_TAP. It specifies the button text for the WhatsApp autofill action.</p>
         * 
         * <strong>example:</strong>
         * <p>Autofill</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        /**
         * <p>The value of the coupon code. It supports only letters and digits. You can pass a variable such as $(couponCode) and then pass the actual coupon code when sending the message.</p>
         * 
         * <strong>example:</strong>
         * <p>120293</p>
         */
        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <p>The flow data event type. Valid values:</p>
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
         * <p>The flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>479884093605****</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>This parameter is valid for WhatsApp templates when Category is set to Marketing and the button type is QUICK_REPLY. It indicates that the button is a marketing opt-out button. If a customer clicks this button and you have configured sending control operations in ChatApp, subsequent marketing messages will not be sent to the customer.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>The screen to navigate to. This parameter is required when FlowAction is set to NAVIGATE.</p>
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
        @Deprecated
        public String signatureHash;

        /**
         * <p>The list of supported apps.</p>
         */
        @NameInMap("SupportedApps")
        public java.util.List<CreateChatappTemplateRequestComponentsButtonsSupportedApps> supportedApps;

        /**
         * <p>The name displayed on the button.</p>
         * 
         * <strong>example:</strong>
         * <p>Call Me</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The button type.</p>
         * <ul>
         * <li><p><strong>PHONE_NUMBER</strong>: A call button.</p>
         * </li>
         * <li><p><strong>URL</strong>: A URL button.</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: A quick reply button.</p>
         * </li>
         * <li><p><strong>COPY_CODE</strong>: A button to copy a verification code or coupon code.</p>
         * </li>
         * <li><p><strong>ONE_TAP</strong>: An autofill button for AUTHENTICATION templates.</p>
         * </li>
         * <li><p><strong>ZERO_TAP</strong>: An autofill button for AUTHENTICATION templates.</p>
         * </li>
         * <li><p><strong>MPM</strong>: A multi-product message.</p>
         * </li>
         * <li><p><strong>CATALOG</strong>: A catalog.</p>
         * </li>
         * <li><p><strong>FLOW</strong>: Opens a WhatsApp flow.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>For WhatsApp templates, if Category is set to AUTHENTICATION, only one button is allowed. The button type must be COPY_CODE or ONE_TAP. If you set the button type to COPY_CODE, the Text parameter is required. If you set the button type to ONE_TAP, the Text (the name of the copy code button displayed on the client if the destination app is not installed), SignatureHash, PackageName, and AutofillText parameters are required.</p>
         * </li>
         * <li><p>For Viber templates, only one button is allowed, and it must be of the URL type.</p>
         * </li>
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
         * <p>The URL that is visited when the URL button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type.</p>
         * <ul>
         * <li><p><strong>static</strong>: Static</p>
         * </li>
         * <li><p><strong>dynamic</strong>: Dynamic</p>
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

        @Deprecated
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

        @Deprecated
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
         * <li><p><strong>PHONE_NUMBER</strong>: A call button.</p>
         * </li>
         * <li><p><strong>URL</strong>: A URL button.</p>
         * </li>
         * <li><p><strong>QUICK_REPLY</strong>: A quick reply button.</p>
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
         * <p>The URL that is visited when the button is clicked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com/xx">https://alibaba.com/xx</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The URL type.</p>
         * <ul>
         * <li><p><strong>static</strong>: Static</p>
         * </li>
         * <li><p><strong>dynamic</strong>: Dynamic</p>
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
         * <p>The list of buttons. This parameter applies only to the BUTTONS component. Each card in a carousel can have a maximum of two buttons.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons;

        /**
         * <p>The type of the media resource. This parameter is valid when Type is set to HEADER.</p>
         * <ul>
         * <li><p><strong>IMAGE</strong>: image</p>
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
         * <p>The content of the BODY component in the carousel card.</p>
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
         * <p>The path of the media resource.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is valid for WhatsApp templates when Category is set to AUTHENTICATION and the component type is Body. It indicates that a security recommendation is displayed above the body, advising the user not to share the verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The list of buttons. This parameter applies only to the <strong>BUTTONS</strong> component.</p>
         * <blockquote>
         * <p>Number of buttons for WhatsApp</p>
         * <ul>
         * <li><p>For MARKETING or UTILITY templates, you can add up to 10 buttons.</p>
         * </li>
         * <li><p>You can add only one button of the PHONE_NUMBER type.</p>
         * </li>
         * <li><p>You can add up to two buttons of the URL type.</p>
         * </li>
         * <li><p>Buttons of the QUICK_REPLY type cannot be mixed with buttons of the PHONE_NUMBER or URL type.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Number of buttons for Viber</p>
         * <ul>
         * <li><p>Only one button of the URL type is allowed.</p>
         * </li>
         * <li><p>If the HEADER component contains a video, the button type is URL, but you cannot set a URL.</p>
         * </li>
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
         * <p>The list of cards for a carousel template.</p>
         */
        @NameInMap("Cards")
        public java.util.List<CreateChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period of the verification code for a WhatsApp AUTHENTICATION template, in minutes. This parameter is valid only for WhatsApp messages when Category is set to AUTHENTICATION and the component type is Footer. This information is displayed in the footer.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The duration of the video in a Viber video message, in seconds. The value ranges from 0 to 600.</p>
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
         * <p>The file type of a Viber file message.</p>
         * 
         * <strong>example:</strong>
         * <p>docx</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The type of the media resource.</p>
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
         * <p>Indicates whether the coupon code has an expiration time. This parameter is used when type is set to LIMITED_TIME_OFFER.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message to send.</p>
         * <blockquote>
         * <p>For WhatsApp templates, if Category is set to AUTHENTICATION, this parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hello whatsapp</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail of a Viber message that contains a video.</p>
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
         * <li><p>For WhatsApp templates, the BODY component can contain up to 1,024 characters. The HEADER and FOOTER components can contain up to 60 characters.</p>
         * </li>
         * <li><p>For Viber templates, the FOOTER, CAROUSEL, and LIMITED_TIME_OFFER types are invalid.</p>
         * </li>
         * <li><p>For Viber templates, images, videos, and files are placed in the HEADER component. The client displays the image below the text. The text is placed in the BODY component.</p>
         * </li>
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
         * <p>The path of the media resource.</p>
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
