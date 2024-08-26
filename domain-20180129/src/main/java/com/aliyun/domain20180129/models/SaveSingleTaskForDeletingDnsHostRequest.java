// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDeletingDnsHostRequest extends TeaModel {
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
     * <p>S2019270W570xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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

    public static SaveSingleTaskForDeletingDnsHostRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDeletingDnsHostRequest self = new SaveSingleTaskForDeletingDnsHostRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDeletingDnsHostRequest setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
    public String getDnsName() {
        return this.dnsName;
    }

    public SaveSingleTaskForDeletingDnsHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveSingleTaskForDeletingDnsHostRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForDeletingDnsHostRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
