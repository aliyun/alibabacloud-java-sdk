// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRouteEntriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[64993,64512]</p>
     */
    @NameInMap("AsPath")
    public String asPath;

    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>9001:9263</p>
     */
    @NameInMap("Community")
    public String community;

    /**
     * <strong>example:</strong>
     * <p>172.20.47.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>br-hp3u4u5f03tfuljis****</p>
     */
    @NameInMap("NexthopInstanceId")
    public String nexthopInstanceId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
