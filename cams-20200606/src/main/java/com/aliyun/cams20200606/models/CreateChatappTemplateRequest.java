// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateRequest extends TeaModel {
    @NameInMap("AllowCategoryChange")
    public Boolean allowCategoryChange;

    /**
     * <p>The category of the template when the TemplateType parameter is set to WHATSAPP. Valid values:</p>
     * <br>
     * <p>*   **TRANSACTIONAL**: a transactional template</p>
     * <p>*   **MARKETING**: a marketing template</p>
     * <p>*   **OTP**: a one-time password template</p>
     * <br>
     * <p>The category of the template when the TemplateType parameter is set to VIBER. Valid values:</p>
     * <br>
     * <p>*   **text**: a text message template</p>
     * <p>*   **image**: an image message template</p>
     * <p>*   **text_image_button**: a template that contains multiple media objects, including text, image, and button</p>
     * <p>*   **text_button**: a template that contains the text and button media objects</p>
     * <p>*   **document**: a document message template</p>
     * <p>*   **video**: a video message template</p>
     * <p>*   **text_video**: a template that contains the text and video media objects</p>
     * <p>*   **text_video_button**: a template that contains multiple media objects, including text, video, and button</p>
     * <p>*   **text_image**: a template that contains the text and image media objects</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The list of components of the message template.</p>
     */
    @NameInMap("Components")
    public java.util.List<CreateChatappTemplateRequestComponents> components;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WhatsApp account that you register.</p>
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
     * <p>The ISV verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

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
     * <p>The type of the message template.</p>
     * <br>
     * <p>*   **WHATSAPP**</p>
     * <p>*   **VIBER**</p>
     * <p>*   LINE: the LINE message template. The LINE message template is under development.</p>
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
         * <p>The phone number. This parameter is valid only if the Type parameter is set to **PHONE_NUMBER**.</p>
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
         * <p>*   When the TemplateType parameter is set to WHATSAPP, if you have created a website link or a phone number link, you cannot create an quick reply button.</p>
         * <br>
         * <p>*   When the TemplateType parameter is set to WHATSAPP, you can add a combination of two URL buttons or a combination of a URL button and a phone number button to a message template.</p>
         * <br>
         * <p>*   When the TemplateType parameter is set to VIBER, you can add only one button and the button must be of the URL type.</p>
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

        public static CreateChatappTemplateRequestComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponentsButtons self = new CreateChatappTemplateRequestComponentsButtons();
            return TeaModel.build(map, self);
        }

        public CreateChatappTemplateRequestComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
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

    public static class CreateChatappTemplateRequestComponents extends TeaModel {
        /**
         * <p>The list of buttons, which applies only to the **BUTTONS** component.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description of the file.</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The duration of the video message when the TemplateType parameter is set to VIBER. Valid values: 0 to 600. Unit: seconds.</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The type of the file when the TemplateType parameter is set to VIBER.</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The type of the media resources that are included in the message.</p>
         * <br>
         * <p>*   **TEXT**: text</p>
         * <p>*   **IMAGE**: image</p>
         * <p>*   **DOCUMENT**: document</p>
         * <p>*   **VIDEO**: video</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The text of the message that is sent.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The thumbnail URL of the video message when the TemplateType parameter is set to VIBER.</p>
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
         * <p>> When the TemplateType parameter is set to WHATSAPP, the component of the **BODY** type cannot exceed 1,024 characters in length. The component of the **HEADER** or **FOOTER** type cannot exceed 60 characters in length.</p>
         * <br>
         * <p>> When the TemplateType parameter is set to VIBER, the **FOOTER** parameter is invalid.</p>
         * <br>
         * <p>> When the TemplateType parameter is set to VIBER, media objects including image, video, and text are placed in the **HEADER** component. A device displays that the image is placed below the text.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the material.</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateChatappTemplateRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            CreateChatappTemplateRequestComponents self = new CreateChatappTemplateRequestComponents();
            return TeaModel.build(map, self);
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
