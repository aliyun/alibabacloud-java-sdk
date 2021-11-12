// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListAclsRequest extends TeaModel {
    // 访问控制策略Id
    @NameInMap("AclIds")
    public java.util.List<String> aclIds;

    // 访问控制策略名称
    @NameInMap("AclNames")
    public java.util.List<String> aclNames;

    // 查询数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // 资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListAclsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAclsRequest self = new ListAclsRequest();
        return TeaModel.build(map, self);
    }

    public ListAclsRequest setAclIds(java.util.List<String> aclIds) {
        this.aclIds = aclIds;
        return this;
    }
    public java.util.List<String> getAclIds() {
        return this.aclIds;
    }

    public ListAclsRequest setAclNames(java.util.List<String> aclNames) {
        this.aclNames = aclNames;
        return this;
    }
    public java.util.List<String> getAclNames() {
        return this.aclNames;
    }

    public ListAclsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAclsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAclsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
