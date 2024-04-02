// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateKeywordLibRequest extends TeaModel {
    @NameInMap("BizTypes")
    public String bizTypes;

    @NameInMap("Category")
    public String category;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Language")
    public String language;

    @NameInMap("LibType")
    public String libType;

    @NameInMap("MatchMode")
    public String matchMode;

    @NameInMap("Name")
    public String name;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("ServiceModule")
    public String serviceModule;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKeywordLibRequest self = new CreateKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public CreateKeywordLibRequest setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
        return this;
    }
    public String getBizTypes() {
        return this.bizTypes;
    }

    public CreateKeywordLibRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateKeywordLibRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateKeywordLibRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateKeywordLibRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateKeywordLibRequest setLibType(String libType) {
        this.libType = libType;
        return this;
    }
    public String getLibType() {
        return this.libType;
    }

    public CreateKeywordLibRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public CreateKeywordLibRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateKeywordLibRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateKeywordLibRequest setServiceModule(String serviceModule) {
        this.serviceModule = serviceModule;
        return this;
    }
    public String getServiceModule() {
        return this.serviceModule;
    }

    public CreateKeywordLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
