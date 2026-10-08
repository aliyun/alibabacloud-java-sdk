// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForCreatingDnsHostRequest extends TeaModel {
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
     * <p>Domain instance ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>S1234567890</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>List of IP addresses. You can specify up to 13 IP addresses. When specifying multiple IP addresses, pass them as a <strong>list</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>218.xx.xx.236</p>
     */
    @NameInMap("Ip")
    public java.util.List<String> ip;

    /**
     * <p>Language of the error message returned by the API. Valid values:  </p>
     * <ul>
     * <li><strong>zh</strong>: Chinese  </li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>User IP address, which can be set to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static SaveSingleTaskForCreatingDnsHostRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForCreatingDnsHostRequest self = new SaveSingleTaskForCreatingDnsHostRequest();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForCreatingDnsHostRequest setDnsName(String dnsName) {
        this.dnsName = dnsName;
        return this;
    }
    public String getDnsName() {
        return this.dnsName;
    }

    public SaveSingleTaskForCreatingDnsHostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveSingleTaskForCreatingDnsHostRequest setIp(java.util.List<String> ip) {
        this.ip = ip;
        return this;
    }
    public java.util.List<String> getIp() {
        return this.ip;
    }

    public SaveSingleTaskForCreatingDnsHostRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SaveSingleTaskForCreatingDnsHostRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
