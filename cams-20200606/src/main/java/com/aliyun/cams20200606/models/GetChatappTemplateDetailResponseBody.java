// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponseBody extends TeaModel {
    // The HTTP status code returned.
    // 
    // *   A code of OK indicates that the call is successful.
    // *   Other codes indicate that the call fails. For more information, see [Error codes](~~196974~~).
    @NameInMap("Code")
    public String code;

    // The data returned.
    @NameInMap("Data")
    public GetChatappTemplateDetailResponseBodyData data;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
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
        // **
        // 
        // **Note**
        // 
        // *   A quick reply button cannot coexist with a phone call button or a URL button in a message template.
        // 
        // *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.
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
        // This parameter applies only to components of the **BUTTONS** type. This parameter is passed in by converting its original JSON structure into a string.
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons;

        // The description of the file.
        @NameInMap("Caption")
        public String caption;

        // The name of the file.
        @NameInMap("FileName")
        public String fileName;

        // The format.
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
        // **
        // 
        // **Note** A component of the **BODY** type cannot exceed 1,024 characters in length. A component of the **HEADER** or **FOOTER** type cannot exceed 60 characters in length.
        @NameInMap("Type")
        public String type;

        // The URL of the material.
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

        public GetChatappTemplateDetailResponseBodyDataComponents setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetChatappTemplateDetailResponseBodyDataComponents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
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
        // The review status of the message template. Valid values:
        // 
        // *   **pass**: The message template is approved.
        // *   **fail**: The message template is rejected.
        // *   **auditing**: The message template is being reviewed.
        // *   **unaudit**: The review is suspended.
        @NameInMap("AuditStatus")
        public String auditStatus;

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
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponents> components;

        // The examples of variables.
        @NameInMap("Example")
        public java.util.Map<String, String> example;

        // The language that is used in the message template.
        @NameInMap("Language")
        public String language;

        // The name of the message template.
        @NameInMap("Name")
        public String name;

        // The code of the message template.
        @NameInMap("TemplateCode")
        public String templateCode;

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

    }

}
