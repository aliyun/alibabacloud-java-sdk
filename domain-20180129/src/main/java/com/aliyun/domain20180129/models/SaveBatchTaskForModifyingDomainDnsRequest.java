// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForModifyingDomainDnsRequest extends TeaModel {
    /**
     * <p>Specifies whether to use Alibaba Cloud DNS servers. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Yes.</p>
     * </li>
     * <li><p><strong>false</strong>: No.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AliyunDns")
    public Boolean aliyunDns;

    /**
     * <p>The domain names.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public java.util.List<String> domainName;

    /**
     * <p>The new DNS servers. This parameter is required if <strong>AliyunDns</strong> is set to <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1.test.com</p>
     */
    @NameInMap("DomainNameServer")
    public java.util.List<String> domainNameServer;

    /**
     * <p>The language of API error messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The user IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
