// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreateChatappTemplateRequest extends TeaModel {
    // The category of the message template. Valid values:
    // 
    // *   **ACCOUNT_UPDATE**: account update
    // *   **PAYMENT_UPDATE**: payment update
    // *   **PERSONAL_FINANCE\_UPDATE**: personal finance update
    // *   **SHIPPING_UPDATE**: traffic update
    // *   **RESERVATION_UPDATE**: reservation update
    // *   **ISSUE_RESOLUTION**: issue resolution
    // *   **APPOINTMENT_UPDATE**: appointment update
    // *   **TRANSPORTATION_UPDATE**: logistics information update
    // *   **TICKET_UPDATE**: ticket update
    // *   **ALERT_UPDATE**: alert update
    // *   **AUTO_REPLY**: auto reply
    @NameInMap("Category")
    public String category;

    // The components of the message template.
    @NameInMap("Components")
    public java.util.List<CreateChatappTemplateRequestComponents> components;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    // The unique identifier of the WhatsApp account that you register.
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    // The examples of variables that are used when you create the message template.
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    // Assigned by ISV for RAM user authentication and authorization.
    @NameInMap("IsvCode")
    public String isvCode;

    // The language that is used in the message template.
    @NameInMap("Language")
    public String language;

    // The name of the message template.
    @NameInMap("Name")
    public String name;

    // The type of the message template. Valid values:
    // 
    // *   **WHATSAPP**
    // *   VIBER (under development)
    // *   LINE (under development)
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatappTemplateRequest self = new CreateChatappTemplateRequest();
        return TeaModel.build(map, self);
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
        // The mobile phone number. This parameter is valid only if the Type parameter is set to **PHONE_NUMBER**.
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        // The display name of the button.
        @NameInMap("Text")
        public String text;

        // The type of the button. Valid values:
        // 
        // *   **PHONE_NUMBER**: a phone call button
        // *   **URL**: a URL button
        // *   **QUICK_REPLY**: a quick reply button
        // 
        // > *   A quick reply button cannot coexist with a phone call button or a URL button in a message template.
        // > *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.
        @NameInMap("Type")
        public String type;

        // The URL to be accessed when you click the URL button.
        @NameInMap("Url")
        public String url;

        // The type of the URL. Valid values:
        // 
        // *   **static**: a static URL
        // *   **dynamic**: a dynamic URL
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
        // This parameter applies only to components of the **BUTTONS** type.
        @NameInMap("Buttons")
        public java.util.List<CreateChatappTemplateRequestComponentsButtons> buttons;

        // The description of the file.
        @NameInMap("Caption")
        public String caption;

        // The name of the file.
        @NameInMap("FileName")
        public String fileName;

        // The format of the message.
        // 
        // *   **TEXT**: text
        // *   **IMGAGE**: image
        // *   **DOCUMENT**: document
        // *   **VIDEO**: video
        @NameInMap("Format")
        public String format;

        // The text of the message to be sent.
        @NameInMap("Text")
        public String text;

        // The type of the component. Valid values:
        // 
        // *   **BODY**
        // *   **HEADER**
        // *   **FOOTER**
        // *   **BUTTONS**
        // 
        // > A component of the **BODY** type cannot exceed 1,024 characters in length. A component of the **HEADER** or **FOOTER** type cannot exceed 60 characters in length.
        @NameInMap("Type")
        public String type;

        // The URL of the material.
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

        public CreateChatappTemplateRequestComponents setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
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
