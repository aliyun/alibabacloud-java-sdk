// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeInstanceGrantedToExpressConnectRouterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceOwnerId")
    public Long instanceOwnerId;

    @NameInMap("InstanceRegionId")
    public String instanceRegionId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TagModels")
    public java.util.List<DescribeInstanceGrantedToExpressConnectRouterRequestTagModels> tagModels;

    public static DescribeInstanceGrantedToExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceGrantedToExpressConnectRouterRequest self = new DescribeInstanceGrantedToExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setInstanceOwnerId(Long instanceOwnerId) {
        this.instanceOwnerId = instanceOwnerId;
        return this;
    }
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setInstanceRegionId(String instanceRegionId) {
        this.instanceRegionId = instanceRegionId;
        return this;
    }
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstanceGrantedToExpressConnectRouterRequest setTagModels(java.util.List<DescribeInstanceGrantedToExpressConnectRouterRequestTagModels> tagModels) {
        this.tagModels = tagModels;
        return this;
    }
    public java.util.List<DescribeInstanceGrantedToExpressConnectRouterRequestTagModels> getTagModels() {
        return this.tagModels;
    }

    public static class DescribeInstanceGrantedToExpressConnectRouterRequestTagModels extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeInstanceGrantedToExpressConnectRouterRequestTagModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGrantedToExpressConnectRouterRequestTagModels self = new DescribeInstanceGrantedToExpressConnectRouterRequestTagModels();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGrantedToExpressConnectRouterRequestTagModels setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeInstanceGrantedToExpressConnectRouterRequestTagModels setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
