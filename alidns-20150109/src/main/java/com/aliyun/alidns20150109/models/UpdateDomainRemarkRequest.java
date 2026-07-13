// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateDomainRemarkRequest extends TeaModel {
    /**
     * <p>An existing domain name in Alibaba Cloud DNS.&lt;props=&quot;china&quot;&gt;For more information, see <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomains </a>.
     * &lt;props=&quot;intl&quot;&gt;For more information, see <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomains?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomains </a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese</p>
     * </li>
     * <li><p>en: English</p>
     * </li>
     * </ul>
     * <p>Default: en</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The remarks for the domain name.</p>
     * <p>The remarks can be up to 50 characters in length. They can contain digits, letters, Chinese characters, and the following special characters: _, -, ,, and .</p>
     * 
     * <strong>example:</strong>
     * <p>这是我在阿里云解析的第一个域名</p>
     */
    @NameInMap("Remark")
    public String remark;

    public static UpdateDomainRemarkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDomainRemarkRequest self = new UpdateDomainRemarkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDomainRemarkRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDomainRemarkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDomainRemarkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
