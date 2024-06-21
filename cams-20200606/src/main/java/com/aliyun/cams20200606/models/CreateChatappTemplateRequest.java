// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow Facebook to automatically change the directory of the template. If you set this parameter to true, the review success rate of the template is improved. This parameter is valid only when TemplateType is set to WHATSAPP.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>The category of the template if TemplateType is set to WHATSAPP. Valid values:</p>
     * <ul>
     * <li><strong>UTILITY</strong>: the transaction template</li>
     * <li><strong>MARKETING</strong>: the marketing template</li>
     * <li><strong>AUTHENTICATION</strong>: the authentication template</li>
     * </ul>
     * <p>The category of the template if TemplateType is set to VIBER. Valid values:</p>
     * <ul>
     * <li><strong>text</strong>: the template that contains only text</li>
     * <li><strong>image</strong>: the template that contains only images</li>
     * <li><strong>text_image_button</strong>: the template that contains text, images, and buttons</li>
     * <li><strong>text_button</strong>: the template that contains text and buttons</li>
     * <li><strong>document</strong>: the template that contains only documents</li>
     * <li><strong>video</strong>: the template that contains only videos</li>
     * <li><strong>text_video</strong>: the template that contains text and videos</li>
     * <li><strong>text_video_button</strong>: the template that contains text, videos, and buttons</li>
     * <li><strong>text_image</strong>: the template that contains text and images</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The code of the message template.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The components of the message template.</p>
     * <blockquote>
     * <p> If Category is set to AUTHENTICATION, the Type sub-parameter of the Components parameter cannot be set to HEADER. If the Type sub-parameter is set to BODY or FOOTER, the Text sub-parameter of the Components parameter must be empty.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateChatappTemplateRequestComponents> components;

    /**
     * <p>The space ID of the user within the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
     * <blockquote>
     * <p>CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>65921621816****</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The examples of variables that are used when you create the message template.</p>
     */
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    /**
     * <p>The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     * 
     * <strong>example:</strong>
     * <p>skdi3kksloslikdkkdk</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Validity period of authentication template message sending in WhatsApp</p>
     * <blockquote>
     * <p>This attribute requires providing waba in advance to Alibaba operators to open the whitelist, otherwise it will result in template submission failure</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>120</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>The name of the message template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hello_whatsapp</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the message template.</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * <li><strong>VIBER</strong></li>
     * <li>LINE: the Line message template. This type of message template will be released later.</li>
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
         * <strong>example:</strong>
         * <p>com.aliyun.pack.***</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <strong>example:</strong>
         * <p>kdikie9398k</p>
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
         * <p>The text of the one-tap autofill button. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
         * 
         * <strong>example:</strong>
         * <p>Autofill</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        /**
         * <strong>example:</strong>
         * <p>120293</p>
         */
        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <strong>example:</strong>
         * <p>NAVIGATE</p>
         */
        @NameInMap("FlowAction")
        public String flowAction;

        /**
         * <strong>example:</strong>
         * <p>28383872***</p>
         */
        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The unsubscribe button. This parameter is valid if Category is set to MARKETING and the Type sub-parameter of the Buttons parameter is set to QUICK_REPLY for a WhatsApp message template. After you configure message sending in the ChatApp Message Service console, marketing messages are not sent to customers if they click this button.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <strong>example:</strong>
         * <p>SIGN_UP</p>
         */
        @NameInMap("NavigateScreen")
        public String navigateScreen;

        /**
         * <p>The app package name that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
         * 
         * <strong>example:</strong>
         * <p>com.demo</p>
         */
        @NameInMap("PackageName")
        @Deprecated
        public String packageName;

        /**
         * <p>The phone number. This parameter is valid only if the Type sub-parameter of the Buttons parameter is set to <strong>PHONE_NUMBER</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>+861368897****</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The app signing key hash that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
         * 
         * <strong>example:</strong>
         * <p>wi299382</p>
         */
        @NameInMap("SignatureHash")
        @Deprecated
        public String signatureHash;

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
         * <p>The type of the button. Valid values:</p>
         * <ul>
         * <li><strong>PHONE_NUMBER</strong>: phone call button</li>
         * <li><strong>URL</strong>: URL button</li>
         * <li><strong>QUICK_REPLY</strong>: quick reply button</li>
         * <li><strong>COPY_CODE</strong>: copy code button if Category is set to AUTHENTICATION</li>
         * <li><strong>ONE_TAP</strong>: one-tap autofill button if Category is set to AUTHENTICATION</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>In a WhatsApp message template, a quick reply button cannot be used together with a phone call button or a URL button.</p>
         * </li>
         * <li><p>You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a WhatsApp message template.</p>
         * </li>
         * <li><p>If Category is set to AUTHENTICATION for a WhatsApp message template, you can add only one button to the WhatsApp message template and you must set the Type sub-parameter of the Buttons parameter to COPY_CODE or ONE_TAP. If the Type sub-parameter of the Buttons parameter is set to COPY_CODE, the Text sub-parameter of the Buttons parameter is required. If the Type sub-parameter of the Buttons parameter is set to ONE_TAP, the Text, SignatureHash, PackageName, and AutofillText sub-parameters of the Buttons parameter are required. The value of Text is displayed if the desired app is not installed on the device. The value of Text indicates that you must manually copy the verification code.</p>
         * </li>
         * <li><p>You can add only one button to a Viber message template, and you must set the Type sub-parameter of the Buttons parameter to URL.</p>
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
         * <strong>example:</strong>
         * <p>+8613800</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <strong>example:</strong>
         * <p>Call me</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PHONE_NUMBER</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="https://alibaba.com/xx">https://alibaba.com/xx</a></p>
         */
        @NameInMap("Url")
        public String url;

        /**
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
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsCardsCardComponentsButtons> buttons;

        /**
         * <strong>example:</strong>
         * <p>IMAGE</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>Who is the very powerful team</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BODY</p>
         */
        @NameInMap("Type")
        public String type;

        /**
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
         * <p>The note indicating that customers cannot share verification codes with others. The note is displayed in the message body. This parameter is valid only if Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to BODY for a WhatsApp message template.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The buttons. Specify this parameter only if you set the Type sub-parameter of the Components parameter to <strong>BUTTONS</strong>.</p>
         * <blockquote>
         * <p> The following section describes the limits on the number of buttons in a WhatsApp message.</p>
         * </blockquote>
         * <ul>
         * <li><p>A marketing or utility WhatsApp message template supports up to 10 buttons.</p>
         * </li>
         * <li><p>A WhatsApp message template can contain only one phone call button.</p>
         * </li>
         * <li><p>A WhatsApp message template can contain up to two URL buttons.</p>
         * </li>
         * <li><p>In a WhatsApp message template, the quick reply button cannot be used together with the phone call button or the URL button.</p>
         * </li>
         * </ul>
         */
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a video</p>
         */
        @NameInMap("Caption")
        public String caption;

        @NameInMap("Cards")
        public java.util.List<CreateChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period of the verification code in the WhatsApp authentication template. Unit: minutes. This parameter is valid only when Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to FOOTER in a WhatsApp message template. The validity period of the verification code is displayed in the footer.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The length of the video in the Viber message template. Unit: seconds. Valid values: 0 to 600.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>video name</p>
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
         * <p>The type of the media resources that are included in the message. Valid values:</p>
         * <ul>
         * <li><strong>TEXT</strong></li>
         * <li><strong>IMAGE</strong></li>
         * <li><strong>DOCUMENT</strong></li>
         * <li><strong>VIDEO</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message that you want to send.</p>
         * <blockquote>
         * <p> If Category is set to AUTHENTICATION, the Text sub-parameter of the Components parameter is empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hello whatsapp</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail URL of the video in the Viber message template.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cdn.multiplymall.mobiapp.cloud/yunmall/B-LM-LMALL202207130001/20220730/d712a057-a6af-4513-bbe6-7ee57ea60983.png?x-oss-process=image/resize,w_100">https://cdn.multiplymall.mobiapp.cloud/yunmall/B-LM-LMALL202207130001/20220730/d712a057-a6af-4513-bbe6-7ee57ea60983.png?x-oss-process=image/resize,w_100</a></p>
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
         * <li><p>In WhatsApp message templates, a <strong>BODY</strong> component cannot exceed 1,024 characters in length, and a <strong>HEADER</strong> or <strong>FOOTER</strong> component cannot exceed 60 characters in length.</p>
         * </li>
         * <li><p><strong>FOOTER</strong> components are not supported in Viber message templates.</p>
         * </li>
         * <li><p>In Viber message templates, media resources such as images, videos, and documents are placed in the <strong>HEADER</strong> component. If a Viber message contains both text and an image, the image is placed below the text in the message received on a device.</p>
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
         * <p>The URL of the media resource.</p>
         * <blockquote>
         * <p> We recommend that you use 800 × 800 images in Viber message templates.</p>
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
