// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    /**
     * <p>The components of the message template.</p>
     */
    @NameInMap("Components")
    public java.util.List<ModifyChatappTemplateRequestComponents> components;

    /**
     * <p>The space ID of the user under the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WhatsApp Business account under the independent software vendor (ISV) account.</p>
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
     * <p>The code of the message template.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

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

    public ModifyChatappTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ModifyChatappTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public static class ModifyChatappTemplateRequestComponentsButtons extends TeaModel {
        /**
         * <p>The phone number.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The text of the message to be sent.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The type of the button.</p>
         * <br>
         * <p>*   **PHONE_NUMBER**: a phone number button</p>
         * <p>*   **URL**: a URL button</p>
         * <p>*   **QUICK_REPLY**: a quick reply button</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL to be visited after users click the button.</p>
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

        public static ModifyChatappTemplateRequestComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponentsButtons self = new ModifyChatappTemplateRequestComponentsButtons();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
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

    public static class ModifyChatappTemplateRequestComponents extends TeaModel {
        /**
         * <p>The buttons. This parameter is applicable only to components of the **BUTTONS** type.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtons> buttons;

        /**
         * <p>The description.</p>
         * <br>
         * <p>> When the Type parameter is set to **HEADER** and the Format parameter is set to **IMAGE, DOCUMENT, or VIDEO**, you can specify a description.</p>
         */
        @NameInMap("Caption")
        public String caption;

        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The name of the file.</p>
         * <br>
         * <p>> When the Type parameter is set to **HEADER** and the Format parameter is set to **DOCUMENT**, you can specify a name for the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

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
         * <p>The text of the message to be sent.</p>
         */
        @NameInMap("Text")
        public String text;

        @NameInMap("ThumbUrl")
        public String thumbUrl;

        /**
         * <p>The type of the component. Valid values:</p>
         * <br>
         * <p>*   **BODY**</p>
         * <p>*   **HEADER**</p>
         * <p>*   **FOOTER**</p>
         * <p>*   **BUTTONS**</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the material.</p>
         */
        @NameInMap("Url")
        public String url;

        public static ModifyChatappTemplateRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponents self = new ModifyChatappTemplateRequestComponents();
            return TeaModel.build(map, self);
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
