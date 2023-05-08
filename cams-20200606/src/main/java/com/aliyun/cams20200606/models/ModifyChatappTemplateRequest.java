// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ModifyChatappTemplateRequest extends TeaModel {
    @NameInMap("Category")
    public String category;

    @NameInMap("Components")
    public java.util.List<ModifyChatappTemplateRequestComponents> components;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    @NameInMap("Example")
    public java.util.Map<String, String> example;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Language")
    public String language;

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
        @NameInMap("AutofillText")
        public String autofillText;

        @NameInMap("IsOptOut")
        public Boolean isOptOut;

        @NameInMap("PackageName")
        public String packageName;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

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

        public static ModifyChatappTemplateRequestComponentsButtons build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponentsButtons self = new ModifyChatappTemplateRequestComponentsButtons();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponentsButtons setAutofillText(String autofillText) {
            this.autofillText = autofillText;
            return this;
        }
        public String getAutofillText() {
            return this.autofillText;
        }

        public ModifyChatappTemplateRequestComponentsButtons setIsOptOut(Boolean isOptOut) {
            this.isOptOut = isOptOut;
            return this;
        }
        public Boolean getIsOptOut() {
            return this.isOptOut;
        }

        public ModifyChatappTemplateRequestComponentsButtons setPackageName(String packageName) {
            this.packageName = packageName;
            return this;
        }
        public String getPackageName() {
            return this.packageName;
        }

        public ModifyChatappTemplateRequestComponentsButtons setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public ModifyChatappTemplateRequestComponentsButtons setSignatureHash(String signatureHash) {
            this.signatureHash = signatureHash;
            return this;
        }
        public String getSignatureHash() {
            return this.signatureHash;
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
        @NameInMap("AddSecretRecommendation")
        public Boolean addSecretRecommendation;

        @NameInMap("Buttons")
        public java.util.List<ModifyChatappTemplateRequestComponentsButtons> buttons;

        @NameInMap("Caption")
        public String caption;

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

        @NameInMap("Text")
        public String text;

        @NameInMap("ThumbUrl")
        public String thumbUrl;

        @NameInMap("Type")
        public String type;

        @NameInMap("Url")
        public String url;

        public static ModifyChatappTemplateRequestComponents build(java.util.Map<String, ?> map) throws Exception {
            ModifyChatappTemplateRequestComponents self = new ModifyChatappTemplateRequestComponents();
            return TeaModel.build(map, self);
        }

        public ModifyChatappTemplateRequestComponents setAddSecretRecommendation(Boolean addSecretRecommendation) {
            this.addSecretRecommendation = addSecretRecommendation;
            return this;
        }
        public Boolean getAddSecretRecommendation() {
            return this.addSecretRecommendation;
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

        public ModifyChatappTemplateRequestComponents setCodeExpirationMinutes(Integer codeExpirationMinutes) {
            this.codeExpirationMinutes = codeExpirationMinutes;
            return this;
        }
        public Integer getCodeExpirationMinutes() {
            return this.codeExpirationMinutes;
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
