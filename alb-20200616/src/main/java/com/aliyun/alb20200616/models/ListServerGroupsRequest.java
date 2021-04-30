// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsRequest extends TeaModel {
    // 服务器组Id列表
    @NameInMap("ServerGroupIds")
    public java.util.List<String> serverGroupIds;

    // 服务器组名称
    @NameInMap("ServerGroupNames")
    public java.util.List<String> serverGroupNames;

    // 资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // 查询数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // VpcId
    @NameInMap("VpcId")
    public String vpcId;

    public static ListServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsRequest self = new ListServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsRequest setServerGroupIds(java.util.List<String> serverGroupIds) {
        this.serverGroupIds = serverGroupIds;
        return this;
    }
    public java.util.List<String> getServerGroupIds() {
        return this.serverGroupIds;
    }

    public ListServerGroupsRequest setServerGroupNames(java.util.List<String> serverGroupNames) {
        this.serverGroupNames = serverGroupNames;
        return this;
    }
    public java.util.List<String> getServerGroupNames() {
        return this.serverGroupNames;
    }

    public ListServerGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListServerGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
