// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateKeywordLibRequest extends TeaModel {
    @NameInMap("BizTypes")
    public String bizTypes;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("Id")
    public Integer id;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MatchMode")
    public String matchMode;

    @NameInMap("Name")
    public String name;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static UpdateKeywordLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKeywordLibRequest self = new UpdateKeywordLibRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKeywordLibRequest setBizTypes(String bizTypes) {
        this.bizTypes = bizTypes;
        return this;
    }
    public String getBizTypes() {
        return this.bizTypes;
    }

    public UpdateKeywordLibRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public UpdateKeywordLibRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public UpdateKeywordLibRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateKeywordLibRequest setMatchMode(String matchMode) {
        this.matchMode = matchMode;
        return this;
    }
    public String getMatchMode() {
        return this.matchMode;
    }

    public UpdateKeywordLibRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKeywordLibRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
