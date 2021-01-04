// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDomainBlackWhiteListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Black")
    public java.util.List<String> black;

    @NameInMap("White")
    public java.util.List<String> white;

    public static ModifyDomainBlackWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainBlackWhiteListRequest self = new ModifyDomainBlackWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDomainBlackWhiteListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyDomainBlackWhiteListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyDomainBlackWhiteListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyDomainBlackWhiteListRequest setBlack(java.util.List<String> black) {
        this.black = black;
        return this;
    }
    public java.util.List<String> getBlack() {
        return this.black;
    }

    public ModifyDomainBlackWhiteListRequest setWhite(java.util.List<String> white) {
        this.white = white;
        return this;
    }
    public java.util.List<String> getWhite() {
        return this.white;
    }

}
