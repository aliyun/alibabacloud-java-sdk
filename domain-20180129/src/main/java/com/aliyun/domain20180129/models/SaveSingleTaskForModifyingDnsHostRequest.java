// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForModifyingDnsHostRequest extends TeaModel {
    /**
     * <p>DNS name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dns1</p>
     */
    @NameInMap("DnsName")
    public String dnsName;

    /**
     * <p>Domain instance ID, which can be obtained by invoking the QueryDomainList API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S123456789</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>List of IP addresses.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>218.xx.xx.236</p>
     */
    @NameInMap("Ip")
    public java.util.List<String> ip;

    /**
     * <p>Language for error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address.</p>
     * 
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
