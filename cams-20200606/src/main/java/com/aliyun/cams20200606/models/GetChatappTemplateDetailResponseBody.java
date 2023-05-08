// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappTemplateDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetChatappTemplateDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

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

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Whatsapp模板，Category为Authentication，并且Button Type为ONE_TAP时必填，表示Whatsapp调起应用的签名Hash值</p>
         */
        @NameInMap("SignatureHash")
        public String signatureHash;

        @NameInMap("Text")
        public String text;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

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

    public static class GetChatappTemplateDetailResponseBodyDataComponents extends TeaModel {
        /**
         * <p>Whatsapp类型模板，Category为Authentication，并且Component Type为Body时有效，表示在Body上面显示不要将验证码信息提供给其它人的提示信息</p>
         */
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        @NameInMap("Buttons")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponentsButtons> buttons;

        @NameInMap("Caption")
        public String caption;

        /**
         * <p>Whatsapp Authentication模板验证码有效期（分钟），只在Whatsapp类型消息，Category为Authentication并且Component Type为Footer时有效（此信息显示在Footer位置）</p>
         */
        @NameInMap("CodeExpirationMinutes")
        public Integer codeExpirationMinutes;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("FileType")
        public String fileType;

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

        @NameInMap("Text")
        public String text;

        @NameInMap("ThumbUrl")
        public String thumbUrl;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

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
        @NameInMap("AuditStatus")
        public String auditStatus;

        @NameInMap("Category")
        public String category;

        @NameInMap("Components")
        public java.util.List<GetChatappTemplateDetailResponseBodyDataComponents> components;

        @NameInMap("Example")
        public java.util.Map<String, String> example;

        @NameInMap("Language")
        public String language;

        @NameInMap("Name")
        public String name;

        @NameInMap("TemplateCode")
        public String templateCode;

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
