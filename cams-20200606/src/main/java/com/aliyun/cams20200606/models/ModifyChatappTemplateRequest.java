// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateRequest extends TeaModel {
    // The list of components of the message template.
    @NameInMap("Components")
    public java.util.List<ModifyChatappTemplateRequestComponents> components;

    // Isv customer space id
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    // The ID of the WhatApp Business account of the ISV customer.
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    // The examples of variables that are used when you create the message template.
    @NameInMap("Example")
    public java.util.Map<String, String> example;

    // ISV verification code, which is used to verify whether the sub-account is authorized by ISV.
    @NameInMap("IsvCode")
    public String isvCode;

    // The language.
    @NameInMap("Language")
    public String language;

    // The code of the message template.
    @NameInMap("TemplateCode")
    public String templateCode;

    public static ModifyChatappTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyChatappTemplateRequest self = new ModifyChatappTemplateRequest();
        return TeaModel.build(map, self);
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

    public static class ModifyChatappTemplateRequestComponentsButtons extends TeaModel {
        // The phone number.
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        // The text of the message to be sent.
        @NameInMap("Text")
        public String text;

        // The type of the button.
        // 
        // *   **PHONE_NUMBER**: the phone call button
        // *   **URL**: the URL button
        // *   **QUICK_REPLY**: the quick reply button
        @NameInMap("Type")
        public String type;

        // The URL to be visited after clicking the button.
        @NameInMap("Url")
        public String url;

        // The type of the URL. Valid values:
        // 
        // *   **static**: the static URL
        // *   **dynamic**: the dynamic URL
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
        // The list of buttons, which applies only to the **BUTTONS** component.
        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtons> buttons;

        // The description.
        // 
        // >  When the Type parameter is set to **HEADER** and the Format parameter is set to **IMAGE/DOCUMENT/VIDEO**, you can specify the description.
        @NameInMap("Caption")
        public String caption;

        // The name of the file.
        // 
        // > : When the Type parameter is set to **HEADER** and the Format parameter is set to **DOCUMENT**, you can specify a name of the file.
        @NameInMap("FileName")
        public String fileName;

        // The type of the media resource.
        // 
        // *   **TEXT**: text
        // *   **IMAGE**: image
        // *   **DOCUMENT**: document
        // *   **VIDEO**: video
        @NameInMap("Format")
        public String format;

        // The text of the message to be sent.
        @NameInMap("Text")
        public String text;

        // The type of the component.
        // 
        // *   **BODY**
        // *   **HEADER**
        // *   **FOOTER**
        // *   **BUTTONS**
        @NameInMap("Type")
        public String type;

        // The URL of the material.
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

        public ModifyChatappTemplateRequestComponents setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
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
