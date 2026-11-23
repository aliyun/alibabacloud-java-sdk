// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRouteEntriesRequest extends TeaModel {
    /**
     * <p>The AS path traversed by the route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>[64993,64512]</p>
     */
    @NameInMap("AsPath")
    public String asPath;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the parameter value from your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The community value carried by the BGP route entry.</p>
     * 
     * <strong>example:</strong>
     * <p>9001:9263</p>
     */
    @NameInMap("Community")
    public String community;

    /**
     * <p>The destination CIDR block of the route entry to query.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.4.0/24</p>
     */
    @NameInMap("DestinationCidrBlock")
    public String destinationCidrBlock;

    /**
     * <p>Specifies whether it is a dry run for this request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: sends a check request and does not modify EPS resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The maximum number of entries to return. Valid values: 1 to 2147483647. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>For the first query or when no subsequent query is required, leave this parameter empty.</li>
     * <li>If a subsequent query is required, set the value to the NextToken value returned from the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The next hop instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-hp3u4u5f03tfuljis****</p>
     */
    @NameInMap("NexthopInstanceId")
    public String nexthopInstanceId;

    /**
     * <p>The region where the Express Connect Router (ECR) instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("QueryRegionId")
    public String queryRegionId;

    @NameInMap("Version")
    public String version;

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

    public DescribeExpressConnectRouterRouteEntriesRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
