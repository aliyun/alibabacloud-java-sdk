// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeInstanceDomainsRequest extends TeaModel {
    @NameInMap("DomainKeywords")
    public String domainKeywords;

    /**
     * <p>The instance ID.&lt;props=&quot;china&quot;&gt; You can call <a href="https://help.aliyun.com/zh/dns/api-alidns-2015-01-09-describedomaininfo?spm=a2c4g.11186623.help-menu-search-29697.d_0">DescribeDomainInfo</a> to obtain the ID.
     * &lt;props=&quot;intl&quot;&gt;You can call <a href="https://www.alibabacloud.com/help/zh/dns/api-alidns-2015-01-09-describedomaininfo?spm=a2c63.p38356.help-menu-search-29697.d_0">DescribeDomainInfo</a> to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dns-cn-9lb38ldq9**</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

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
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The page number. The value starts from 1. Default: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static DescribeInstanceDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDomainsRequest self = new DescribeInstanceDomainsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDomainsRequest setDomainKeywords(String domainKeywords) {
        this.domainKeywords = domainKeywords;
        return this;
    }
    public String getDomainKeywords() {
        return this.domainKeywords;
    }

    public DescribeInstanceDomainsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceDomainsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceDomainsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceDomainsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
