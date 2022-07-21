// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForModifyingDomainDnsRequest extends TeaModel {
    @NameInMap("AliyunDns")
    public Boolean aliyunDns;

    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    @NameInMap("DomainNameServer")
    public java.util.List<String> domainNameServer;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveBatchTaskForModifyingDomainDnsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForModifyingDomainDnsRequest self = new SaveBatchTaskForModifyingDomainDnsRequest();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForModifyingDomainDnsRequest setAliyunDns(Boolean aliyunDns) {
        this.aliyunDns = aliyunDns;
        return this;
    }
    public Boolean getAliyunDns() {
        return this.aliyunDns;
    }

    public SaveBatchTaskForModifyingDomainDnsRequest setDomainName(java.util.List<String> domainName) {
        this.domainName = domainName;
        return this;
    }
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    public SaveBatchTaskForModifyingDomainDnsRequest setDomainNameServer(java.util.List<String> domainNameServer) {
        this.domainNameServer = domainNameServer;
        return this;
    }
    public java.util.List<String> getDomainNameServer() {
        return this.domainNameServer;
    }

    public SaveBatchTaskForModifyingDomainDnsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveBatchTaskForModifyingDomainDnsRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
