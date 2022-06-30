// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebRulesRequest extends TeaModel {
    @NameInMap("Cname")
    public String cname;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryDomainPattern")
    public String queryDomainPattern;

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
