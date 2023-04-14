// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetChatappTemplateDetailResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatappTemplateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappTemplateDetailResponseBody self = new GetChatappTemplateDetailResponseBody();
        return TeaModel.build(map, self);
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

    public static class GetChatappTemplateDetailResponseBodyDataComponentsButtons extends TeaModel {
        /**
         * <p>The phone number. This parameter is valid only if the return value of the Type parameter is **PHONE_NUMBER**.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The display name of the button.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The type of the button. Valid values:</p>
         * <br>
         * <p>*   **PHONE_NUMBER**: a phone number button</p>
         * <p>*   **URL**: a URL button</p>
         * <p>*   **QUICK_REPLY**: a quick reply button</p>
         * <br>
         * <p>> </p>
         * <br>
         * <p>*   If you have created a URL button or a phone number button, you cannot create a quick reply button.</p>
         * <br>
         * <p>*   You can add a combination of two URL buttons or a combination of a URL button and a phone number button to a message template.</p>
         * <br>
         * <p>*   You can add only one button to a Viber message template, and the button must be a URL button.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be accessed when users click the URL button.</p>
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

        public GetChatappTemplateDetailResponseBodyDataComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
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

    public static class GetChatappTemplateDetailResponseBodyDataComponents extends TeaModel {
        /**
         * <p>This parameter is applicable only to components of the **BUTTONS** type.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons;

        /**
         * <p>The description of the file.</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The duration of the video used in the Viber message template. Valid values: 0 to 600. Unit: seconds.</p>
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
         * <p>The format.</p>
         */
        @NameInMap("Format")
        public String format;

        @NameInMap("Latitude")
        public String latitude;

        @NameInMap("LocationAddress")
        public String locationAddress;

        @NameInMap("LocationName")
        public String locationName;

        @NameInMap("Longitude")
        public String longitude;

        /**
         * <p>The text of the message to be sent.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail URL of the video used in the Viber message template.</p>
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
         * <p>*   In a Viber message template, a media object, such as an image, a video, or a document, is placed in the **HEADER** component. If a Viber message contains text and an image, the image is placed under the text in the message received on a device.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the material.</p>
         */
        @NameInMap("Url")
        public String url;

        public static GetChatappTemplateDetailResponseBodyDataComponents build(java.util.Map<String, ?> map) throws Exception {
            GetChatappTemplateDetailResponseBodyDataComponents self = new GetChatappTemplateDetailResponseBodyDataComponents();
            return TeaModel.build(map, self);
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
         * <p>The category of the template when the return value of the TemplateType parameter is WHATSAPP. Valid values:</p>
         * <br>
         * <p>*   **TRANSACTIONAL**: a transactional template</p>
         * <p>*   **MARKETING**: a marketing template</p>
         * <p>*   **OTP**: a one-time password template</p>
         * <br>
         * <p>The category of the template when the return value of the TemplateType parameter is VIBER. Valid values:</p>
         * <br>
         * <p>*   **text**: a text message template</p>
         * <p>*   **image**: an image message template</p>
         * <p>*   **text_image_button**: a template that contains multiple media objects, including text, image, and button</p>
         * <p>*   **text_button**: a template that contains the text and button media objects</p>
         * <p>*   **document**: a template that contains a document attachment</p>
         * <p>*   **video**: a video message template</p>
         * <p>*   **text_video**: a template that contains the text and video media objects</p>
         * <p>*   **text_video_button**: a template that contains multiple media objects, including text, video, and button</p>
         * <p>*   **text_image**: a template that contains the text and image media objects</p>
         * <br>
         * <p>> When the category of a Viber message template is text_video_button, users cannot open a web page by clicking the button. Users can open only the video in the message. In this case, you do not need to specify the Url parameter for the URL button in the template.</p>
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
         * <p>The name of the message template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The code of the message template.</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The type of the message template.</p>
         * <br>
         * <p>*   **WHATSAPP**</p>
         * <p>*   **VIBER**</p>
         * <p>*   LINE: the LINE message template. This type of message template will be released later.</p>
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

        public GetChatappTemplateDetailResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
