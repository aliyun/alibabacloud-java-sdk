// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TagModels")
    public java.util.List<DescribeExpressConnectRouterRequestTagModels> tagModels;

    public static DescribeExpressConnectRouterRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterRequest self = new DescribeExpressConnectRouterRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectRouterRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeExpressConnectRouterRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DescribeExpressConnectRouterRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectRouterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeExpressConnectRouterRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectRouterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeExpressConnectRouterRequest setTagModels(java.util.List<DescribeExpressConnectRouterRequestTagModels> tagModels) {
        this.tagModels = tagModels;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterRequestTagModels> getTagModels() {
        return this.tagModels;
    }

    public static class DescribeExpressConnectRouterRequestTagModels extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeExpressConnectRouterRequestTagModels build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterRequestTagModels self = new DescribeExpressConnectRouterRequestTagModels();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterRequestTagModels setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeExpressConnectRouterRequestTagModels setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
