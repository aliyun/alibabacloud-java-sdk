// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRouteEntriesRequest extends TeaModel {
    @NameInMap("AsPath")
    public String asPath;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Community")
    public String community;

    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("NexthopInstanceId")
    public String nexthopInstanceId;

    @NameInMap("QueryRegionId")
    public String queryRegionId;

    public static DescribeExpressConnectRouterRouteEntriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterRouteEntriesRequest self = new DescribeExpressConnectRouterRouteEntriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setAsPath(String asPath) {
        this.asPath = asPath;
        return this;
    }
    public String getAsPath() {
        return this.asPath;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setCommunity(String community) {
        this.community = community;
        return this;
    }
    public String getCommunity() {
        return this.community;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setNexthopInstanceId(String nexthopInstanceId) {
        this.nexthopInstanceId = nexthopInstanceId;
        return this;
    }
    public String getNexthopInstanceId() {
        return this.nexthopInstanceId;
    }

    public DescribeExpressConnectRouterRouteEntriesRequest setQueryRegionId(String queryRegionId) {
        this.queryRegionId = queryRegionId;
        return this;
    }
    public String getQueryRegionId() {
        return this.queryRegionId;
    }

}
