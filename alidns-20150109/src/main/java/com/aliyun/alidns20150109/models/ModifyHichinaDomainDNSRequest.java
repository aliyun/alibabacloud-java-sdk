// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ModifyHichinaDomainDNSRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static ModifyHichinaDomainDNSRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHichinaDomainDNSRequest self = new ModifyHichinaDomainDNSRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHichinaDomainDNSRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyHichinaDomainDNSRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyHichinaDomainDNSRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
