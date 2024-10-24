// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesRequest extends TeaModel {
    /**
     * <p>The CNAME address to query.</p>
     * 
     * <strong>example:</strong>
     * <p>kzmk7b8tt351****.aliyunddos1014****</p>
     */
    @NameInMap("Cname")
    public String cname;

    /**
     * <p>The domain name of the website to query.</p>
     * <blockquote>
     * <p>The domain must have been configured with website business forwarding rules. You can call <a href="~~DescribeDomains~~">DescribeDomains</a> to query all domains that have been configured with website business forwarding rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The list of DDoS protection instance IDs to query.</p>
     * 
     * <strong>example:</strong>
     * <p>ddoscoo-cn-mp91j1ao****</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query matching pattern. Values:</p>
     * <ul>
     * <li><strong>fuzzy</strong> (default): Indicates fuzzy query.</li>
     * <li><strong>exact</strong>: Indicates exact query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exact</p>
     */
    @NameInMap("QueryDomainPattern")
    public String queryDomainPattern;

    /**
     * <p>The resource group ID of the DDoS protection instance in the resource management service.</p>
     * <p>Not setting this parameter indicates the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm2pz25js****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static DescribeWebRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebRulesRequest self = new DescribeWebRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWebRulesRequest setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public DescribeWebRulesRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeWebRulesRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeWebRulesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeWebRulesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWebRulesRequest setQueryDomainPattern(String queryDomainPattern) {
        this.queryDomainPattern = queryDomainPattern;
        return this;
    }
    public String getQueryDomainPattern() {
        return this.queryDomainPattern;
    }

    public DescribeWebRulesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
