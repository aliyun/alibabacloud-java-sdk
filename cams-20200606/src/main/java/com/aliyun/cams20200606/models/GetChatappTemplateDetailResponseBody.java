// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>*   Example: OK. This value indicates that the request is successful.</p>
     * <p>*   Other codes indicate that the request fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetChatappTemplateDetailResponseBodyData data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
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
         * <p>事件类型</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>意图编码</p>
         */
        @NameInMap("IntentCode")
        public String intentCode;

        /**
         * <p>下一个模板语言</p>
         */
        @NameInMap("NextLanguageCode")
        public String nextLanguageCode;

        /**
         * <p>下一个模板编码</p>
         */
        @NameInMap("NextTemplateCode")
        public String nextTemplateCode;

        /**
         * <p>下一个模板名称</p>
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

    public static class GetChatappTemplateDetailResponseBodyDataComponentsButtons extends TeaModel {
        /**
         * <p>Whatsapp模板，Category为Authentication，并且Button Type为ONE_TAP时必填，Whatsap Autofill操作的按钮文本</p>
         */
        @NameInMap("AutofillText")
        public String autofillText;

        @NameInMap("CouponCode")
        public String couponCode;

        /**
         * <p>扩展字段</p>
         */
        @NameInMap("ExtendAttrs")
        public GetChatappTemplateDetailResponseBodyDataComponentsButtonsExtendAttrs extendAttrs;

        /**
         * <p>Whatsapp模板，在Category为Marketing,并且Button type为QUICK_REPLY时有效，表示按钮为营销退订按钮，客户如果点击了此按钮，并且在chatapp平台上配置了发送控制操作，则后续Marketing消息则不会发送到客户</p>
         */
        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        /**
         * <p>Whatsapp模板，Category为Authentication，并且Button Type为ONE_TAP时必填，表示Whatsapp调起应用的包名</p>
         */
        @NameInMap("PackageName")
        public String packageName;

        /**
         * <p>The phone number. This parameter is valid only if the returned value of the Type parameter is **PHONE_NUMBER**.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Whatsapp模板，Category为Authentication，并且Button Type为ONE_TAP时必填，表示Whatsapp调起应用的签名Hash值</p>
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
         * <p>*   **PHONE_NUMBER**: a phone call button</p>
         * <p>*   **URL**: a URL button</p>
         * <p>*   **QUICK_REPLY**: a quick reply button</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   A quick reply button cannot coexist with a phone call button or a URL button in a message template.</p>
         * <br>
         * <p>*   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.</p>
         * <br>
         * <p>*   You can add only one button to a Viber message template, and the button must be a URL button.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be accessed when you click the URL button.</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The type of the URL. Valid values:</p>
         * <br>
         * <p>*   **static**: a static URL</p>
         * <p>*   **dynamic**: a dynamic URL</p>
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

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setIsOptOut(Boolean isOptOut) {
            this.isOptOut = isOptOut;
            return this;
        }
        public Boolean getIsOptOut() {
            return this.isOptOut;
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
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCardsCardComponentsButtons> buttons;

        @NameInMap("Format")
        public String format;

        @NameInMap("Text")
        public String text;

        @NameInMap("Type")
        public String type;

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
         * <p>Whatsapp类型模板，Category为Authentication，并且Component Type为Body时有效，表示在Body上面显示不要将验证码信息提供给其它人的提示信息</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        /**
         * <p>This parameter applies only to components of the **BUTTONS** type. This parameter is passed in by converting its original JSON structure into a string.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons;

        /**
         * <p>The description of the file.</p>
         */
        @NameInMap("Caption")
        public String caption;

        @NameInMap("Cards")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsCards> cards;

        /**
         * <p>Whatsapp Authentication模板验证码有效期（分钟），只在Whatsapp类型消息，Category为Authentication并且Component Type为Footer时有效（此信息显示在Footer位置）</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        /**
         * <p>The length of the video in the Viber message template. Valid values: 0 to 600. Unit: seconds.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the file attached in the Viber message template.</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The type of the media resources that are included in the message.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>位置纬度属性</p>
         */
        @NameInMap("Latitude")
        public String latitude;

        /**
         * <p>位置地址</p>
         */
        @NameInMap("LocationAddress")
        public String locationAddress;

        /**
         * <p>位置名称</p>
         */
        @NameInMap("LocationName")
        public String locationName;

        /**
         * <p>位置经度属性</p>
         */
        @NameInMap("Longitude")
        public String longitude;

        @NameInMap("OfferExpirationTimeMs")
        public String offerExpirationTimeMs;

        /**
         * <p>The text of the message that you want to send.</p>
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
         * <p>*   The following limits apply to components in WhatsApp message templates: A component of the **BODY** type cannot exceed 1,024 characters. A component of the **HEADER** or **FOOTER** type cannot exceed 60 characters in length.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   **FOOTER** components are not supported in Viber message templates.</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   In a Viber message template, a media resource, such as an image, a video, or a file, is placed in the **HEADER** component. If a Viber message contains text and an image, the image is placed under the text in the message received on a device.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the material.</p>
         */
        @NameInMap("Url")
        public String url;

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
         * <br>
         * <p>*   **pass**: The message template is approved.</p>
         * <p>*   **fail**: The message template is rejected.</p>
         * <p>*   **auditing**: The message template is being reviewed.</p>
         * <p>*   **unaudit**: The review is suspended.</p>
         */
        @NameInMap("AuditStatus")
        public String auditStatus;

        /**
         * <p>The category of the template when the returned value of TemplateType is WHATSAPP. Valid values:</p>
         * <br>
         * <p>*   **UTILITY**: a transactional template</p>
         * <p>*   **MARKETING**: a marketing template</p>
         * <p>*   **AUTHENTICATION**: an identity authentication template</p>
         * <br>
         * <p>The category of the template when the returned value of the TemplateType parameter is VIBER. Valid values:</p>
         * <br>
         * <p>*   **text**: a template that contains only text</p>
         * <p>*   **image**: a template that contains only images</p>
         * <p>*   **text_image_button**: a template that contains text, images, and buttons</p>
         * <p>*   **text_button**: a template that contains text and buttons</p>
         * <p>*   **document**: a template that contains only files</p>
         * <p>*   **video**: a template that contains only videos</p>
         * <p>*   **text_video**: a template that contains text and videos</p>
         * <p>*   **text_video_button**: a template that contains text, videos, and buttons</p>
         * <p>*   **text_image**: a template that contains text and images</p>
         * <br>
         * <p>> If Category is set to text_video_button, users cannot open a web page by clicking the button. Users can open only the video in the message. In this case, you do not need to specify the Url parameter for the URL button in the template.</p>
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
         * <p>The language that is used in the message template. For more information, see [Language codes](~~463420~~).</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>Whatsapp中Authentication类型模板发送消息时的消息有效期</p>
         */
        @NameInMap("MessageSendTtlSeconds")
        public Integer messageSendTtlSeconds;

        /**
         * <p>The name of the message template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>模板质量</p>
         */
        @NameInMap("QualityScore")
        public String qualityScore;

        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The code of the message template.</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The type of the message template. Valid values:</p>
         * <br>
         * <p>*   **WHATSAPP**</p>
         * <p>*   **VIBER**</p>
         * <p>*   LINE (developing)</p>
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
