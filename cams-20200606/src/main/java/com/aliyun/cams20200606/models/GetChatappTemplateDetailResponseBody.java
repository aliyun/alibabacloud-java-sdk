// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A code of OK indicates that the call is successful.</p>
     * <p>*   Other codes indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
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
         * <p>The mobile phone number. This parameter is valid only if the Type parameter is set to **PHONE_NUMBER**.</p>
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
         * <p>*   **PHONE_NUMBER**: a phone call button</p>
         * <p>*   **URL**: a URL button</p>
         * <p>*   **QUICK_REPLY**: a quick reply button</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Note**</p>
         * <br>
         * <p>*   A quick reply button cannot coexist with a phone call button or a URL button in a message template.</p>
         * <br>
         * <p>*   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.</p>
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
         * <p>This parameter applies only to components of the **BUTTONS** type. This parameter is passed in by converting its original JSON structure into a string.</p>
         */
        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons;

        /**
         * <p>The description of the file.</p>
         */
        @NameInMap("Caption")
        public String caption;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The format.</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The text of the message to be sent.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The type of the component. Valid values:</p>
         * <br>
         * <p>*   **BODY**</p>
         * <p>*   **HEADER**</p>
         * <p>*   **FOOTER**</p>
         * <p>*   **BUTTONS**</p>
         * <br>
         * <p>**</p>
         * <br>
         * <p>**Note** A component of the **BODY** type cannot exceed 1,024 characters in length. A component of the **HEADER** or **FOOTER** type cannot exceed 60 characters in length.</p>
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
         * <p>The category of the message template. Valid values:</p>
         * <br>
         * <p>*   **ACCOUNT_UPDATE**: account update</p>
         * <p>*   **PAYMENT_UPDATE**: payment update</p>
         * <p>*   **PERSONAL_FINANCE\_UPDATE**: personal finance update</p>
         * <p>*   **SHIPPING_UPDATE**: traffic update</p>
         * <p>*   **RESERVATION_UPDATE**: reservation update</p>
         * <p>*   **ISSUE_RESOLUTION**: issue resolution</p>
         * <p>*   **APPOINTMENT_UPDATE**: appointment update</p>
         * <p>*   **TRANSPORTATION_UPDATE**: logistics information update</p>
         * <p>*   **TICKET_UPDATE**: ticket update</p>
         * <p>*   **ALERT_UPDATE**: alert update</p>
         * <p>*   **AUTO_REPLY**: auto reply</p>
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
         * <p>The language that is used in the message template.</p>
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
