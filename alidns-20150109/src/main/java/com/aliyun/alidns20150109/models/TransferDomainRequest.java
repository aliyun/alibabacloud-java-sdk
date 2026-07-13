// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class TransferDomainRequest extends TeaModel {
    /**
     * <p>The domain names to transfer. Separate multiple domain names with commas. Only domain names registered with Alibaba Cloud are supported. &lt;props=&quot;china&quot;&gt;To get your domain names, call <a href="https://help.aliyun.com/en/dns/api-alidns-2015-01-09-describedomains?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomains</a>.
     * &lt;props=&quot;intl&quot;&gt;To get your domain names, call <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.net</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The remarks for the transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>test domain transfer</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The ID of the target user account. The specified domain names and their DNS records are transferred to this account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12*******</p>
     */
    @NameInMap("TargetUserId")
    public Long targetUserId;

    public static TransferDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferDomainRequest self = new TransferDomainRequest();
        return TeaModel.build(map, self);
    }

    public TransferDomainRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public TransferDomainRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public TransferDomainRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public TransferDomainRequest setTargetUserId(Long targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public Long getTargetUserId() {
        return this.targetUserId;
    }

}
