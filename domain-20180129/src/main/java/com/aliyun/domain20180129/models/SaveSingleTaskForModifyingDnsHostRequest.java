// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDnsHostRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dns1</p>
     */
    @NameInMap("DnsName")
    public String dnsName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S123456789</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>218.xx.xx.236</p>
     */
    @NameInMap("Ip")
    public java.util.List<String> ip;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
