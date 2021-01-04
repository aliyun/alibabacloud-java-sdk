// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyCcCustomStatusRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Enable")
    public Boolean enable;

    public static ModifyCcCustomStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCcCustomStatusRequest self = new ModifyCcCustomStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCcCustomStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyCcCustomStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyCcCustomStatusRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyCcCustomStatusRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

}
