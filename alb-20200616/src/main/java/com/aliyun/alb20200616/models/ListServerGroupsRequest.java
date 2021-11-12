// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListServerGroupsRequest extends TeaModel {
    // 查询数量
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 分页查询标识
    @NameInMap("NextToken")
    public String nextToken;

    // 资源组ID
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    // 服务器组Id列表
    @NameInMap("ServerGroupIds")
    public java.util.List<String> serverGroupIds;

    // 服务器组名称
    @NameInMap("ServerGroupNames")
    public java.util.List<String> serverGroupNames;

    // Tag列表
    @NameInMap("Tag")
    public java.util.List<ListServerGroupsRequestTag> tag;

    // VpcId
    @NameInMap("VpcId")
    public String vpcId;

    public static ListServerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServerGroupsRequest self = new ListServerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListServerGroupsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServerGroupsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServerGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public ListServerGroupsRequest setTag(java.util.List<ListServerGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServerGroupsRequestTag> getTag() {
        return this.tag;
    }

    public ListServerGroupsRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class ListServerGroupsRequestTag extends TeaModel {
        // 标签键
        @NameInMap("Key")
        public String key;

        // 标签值
        @NameInMap("Value")
        public String value;

        public static ListServerGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServerGroupsRequestTag self = new ListServerGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServerGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServerGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
