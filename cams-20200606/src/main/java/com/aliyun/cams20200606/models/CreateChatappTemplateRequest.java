// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateRequest extends TeaModel {
    /**
     * <p>Specifies whether to allow Facebook to automatically change the directory of the template. If you set this parameter to true, the review success rate of the template is improved. This parameter is valid only when TemplateType is set to WHATSAPP.</p>
     */
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>The category of the template if TemplateType is set to WHATSAPP. Valid values:</p>
     * <br>
     * <p>*   **UTILITY**: the transaction template</p>
     * <p>*   **MARKETING**: the marketing template</p>
     * <p>*   **AUTHENTICATION**: the authentication template</p>
     * <br>
     * <p>The category of the template if TemplateType is set to VIBER. Valid values:</p>
     * <br>
     * <p>*   **text**: the template that contains only text</p>
     * <p>*   **image**: the template that contains only images</p>
     * <p>*   **text_image_button**: the template that contains text, images, and buttons</p>
     * <p>*   **text_button**: the template that contains text and buttons</p>
     * <p>*   **document**: the template that contains only documents</p>
     * <p>*   **video**: the template that contains only videos</p>
     * <p>*   **text_video**: the template that contains text and videos</p>
     * <p>*   **text_video_button**: the template that contains text, videos, and buttons</p>
     * <p>*   **text_image**: the template that contains text and images</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The components of the message template.</p>
     * <br>
     * <p>>  If Category is set to AUTHENTICATION, the Type sub-parameter of the Components parameter cannot be set to HEADER. If the Type sub-parameter is set to BODY or FOOTER, the Text sub-parameter of the Components parameter must be empty.</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateChatappTemplateRequestComponents> components;

    /**
     * <p>The space ID of the user within the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
     * <br>
     * <p>> CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
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
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The language that is used in the message template. For more information, see [Language codes](~~463420~~).</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>Validity period of authentication template message sending in WhatsApp</p>
     * <br>
     * <p>> This attribute requires providing waba in advance to Alibaba operators to open the whitelist, otherwise it will result in template submission failure</p>
     */
    @NameInMap("MessageSendTtlSeconds")
    public Integer messageSendTtlSeconds;

    /**
     * <p>The name of the message template.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The type of the message template.</p>
     * <br>
     * <p>*   **WHATSAPP**</p>
     * <p>*   **VIBER**</p>
     * <p>*   LINE: the Line message template. This type of message template will be released later.</p>
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

    public static class CreateChatappTemplateRequestComponentsButtons extends TeaModel {
        /**
         * <p>The text of the one-tap autofill button. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        @NameInMap("CouponCode")
        public String couponCode;

        @NameInMap("FlowAction")
        public String flowAction;

        @NameInMap("FlowId")
        public String flowId;

        /**
         * <p>The unsubscribe button. This parameter is valid if Category is set to MARKETING and the Type sub-parameter of the Buttons parameter is set to QUICK_REPLY for a WhatsApp message template. After you configure message sending in the ChatApp Message Service console, marketing messages are not sent to customers if they click this button.</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        @NameInMap("NavigateScreen")
        public String navigateScreen;

        /**
         * <p>The app package name that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The phone number. This parameter is valid only if the Type sub-parameter of the Buttons parameter is set to **PHONE_NUMBER**.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The app signing key hash that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        /**
         * <p>The display name of the button.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The type of the button. Valid values:</p>
         * <br>
         * <p>*   **PHONE_NUMBER**: phone call button</p>
         * <p>*   **URL**: URL button</p>
         * <p>*   **QUICK_REPLY**: quick reply button</p>
         * <p>*   **COPY_CODE**: copy code button if Category is set to AUTHENTICATION</p>
         * <p>*   **ONE_TAP**: one-tap autofill button if Category is set to AUTHENTICATION</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   In a WhatsApp message template, a quick reply button cannot be used together with a phone call button or a URL button.</p>
         * <br>
         * <p>*   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a WhatsApp message template.</p>
         * <br>
         * <p>*   If Category is set to AUTHENTICATION for a WhatsApp message template, you can add only one button to the WhatsApp message template and you must set the Type sub-parameter of the Buttons parameter to COPY_CODE or ONE_TAP. If the Type sub-parameter of the Buttons parameter is set to COPY_CODE, the Text sub-parameter of the Buttons parameter is required. If the Type sub-parameter of the Buttons parameter is set to ONE_TAP, the Text, SignatureHash, PackageName, and AutofillText sub-parameters of the Buttons parameter are required. The value of Text is displayed if the desired app is not installed on the device. The value of Text indicates that you must manually copy the verification code.</p>
         * <br>
         * <p>*   You can add only one button to a Viber message template, and you must set the Type sub-parameter of the Buttons parameter to URL.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to which you are redirected when you click the URL button.</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The type of the URL. Valid values:</p>
         * <br>
         * <p>*   **static**</p>
         * <p>*   **dynamic**</p>
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
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("Text")
        public String text;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

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

        @NameInMap("Format")
        public String format;

        @NameInMap("Text")
        public String text;

        @NameInMap("Type")
        public String type;

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
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>The buttons. Specify this parameter only if you set the Type sub-parameter of the Components parameter to **BUTTONS**.</p>
         * <br>
         * <p>>  The following section describes the limits on the number of buttons in a WhatsApp message.</p>
         * <br>
         * <p>*   A marketing or utility WhatsApp message template supports up to 10 buttons.</p>
         * <br>
         * <p>*   A WhatsApp message template can contain only one phone call button.</p>
         * <br>
         * <p>*   A WhatsApp message template can contain up to two URL buttons.</p>
         * <br>
         * <p>*   In a WhatsApp message template, the quick reply button cannot be used together with the phone call button or the URL button.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description of the document.</p>
         */
        @NameInMap("Caption")
        public String caption;

        @NameInMap("Cards")
        public java.util.List<CreateChatappTemplateRequestComponentsCards> cards;

        /**
         * <p>The validity period of the verification code in the WhatsApp authentication template. Unit: minutes. This parameter is valid only when Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to FOOTER in a WhatsApp message template. The validity period of the verification code is displayed in the footer.</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The length of the video in the Viber message template. Unit: seconds. Valid values: 0 to 600.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the document.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the document attached in the Viber message template.</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The type of the media resources that are included in the message. Valid values:</p>
         * <br>
         * <p>*   **TEXT**</p>
         * <p>*   **IMAGE**</p>
         * <p>*   **DOCUMENT**</p>
         * <p>*   **VIDEO**</p>
         */
        @NameInMap("Format")
        public String format;

        @NameInMap("HasExpiration")
        public Boolean hasExpiration;

        /**
         * <p>The text of the message that you want to send.</p>
         * <br>
         * <p>>  If Category is set to AUTHENTICATION, the Text sub-parameter of the Components parameter is empty.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail URL of the video in the Viber message template.</p>
         */
        @NameInMap("ThumbUrl")
        public String thumbUrl;

        /**
         * <p>The type of the component. Valid values:</p>
         * <br>
         * <p>*   **BODY**</p>
         * <p>*   **HEADER**</p>
         * <p>*   **FOOTER**</p>
         * <p>*   **BUTTONS**</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   In WhatsApp message templates, a **BODY** component cannot exceed 1,024 characters in length, and a **HEADER** or **FOOTER** component cannot exceed 60 characters in length.</p>
         * <br>
         * <p>*   **FOOTER** components are not supported in Viber message templates.</p>
         * <br>
         * <p>*   In Viber message templates, media resources such as images, videos, and documents are placed in the **HEADER** component. If a Viber message contains both text and an image, the image is placed below the text in the message received on a device.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the media resource.</p>
         * <br>
         * <p>>  We recommend that you use 800 × 800 images in Viber message templates.</p>
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
