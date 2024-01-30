// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDnsHostRequest extends TeaModel {
    @NameInMap("DnsName")
    public String dnsName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Ip")
    public java.util.List<String> ip;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForModifyingDnsHostRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForModifyingDnsHostRequest self = new SaveSingleTaskForModifyingDnsHostRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForModifyingDnsHostRequest setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
    public String getDnsName() {
        return this.dnsName;
    }

    public SaveSingleTaskForModifyingDnsHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveSingleTaskForModifyingDnsHostRequest setIp(java.util.List<String> ip) {
        this.ip = ip;
        return this;
    }
    public java.util.List<String> getIp() {
        return this.ip;
    }

    public SaveSingleTaskForModifyingDnsHostRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForModifyingDnsHostRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
