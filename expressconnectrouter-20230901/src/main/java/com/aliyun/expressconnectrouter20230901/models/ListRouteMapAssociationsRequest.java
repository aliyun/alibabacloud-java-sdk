// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class ListRouteMapAssociationsRequest extends TeaModel {
    /**
     * <p>The ID of the route map association.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-routemap-assoc-qdoeneegffq4yv****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the value from your client and make sure that the value is unique across different requests. The client token supports only ASCII characters.</p>
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
     * <p>Specifies whether this is a dry run on the request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the request but does not modify EPS resources.</p>
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
     * <p>The maximum number of entries to return. Valid values: 1 to 2147483647. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to start the next query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no next query is to be sent, this parameter is not required.</li>
     * <li>If a next query is to be sent, set the value to the <strong>NextToken</strong> value returned by the last API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>e0a2dbeb69a8beeeb8194e92b702df3fd3e7bfe6ce7bfc16e0b5e8707e68181f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the route map in the Cloud Enterprise Network (CEN).</p>
     * 
     * <strong>example:</strong>
     * <p>rm-6m58b17417tg5a****</p>
     */
    @NameInMap("RouteMapId")
    public String routeMapId;

    @NameInMap("Version")
    public String version;

    public static ListRouteMapAssociationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRouteMapAssociationsRequest self = new ListRouteMapAssociationsRequest();
        return TeaModel.build(map, self);
    }

    public ListRouteMapAssociationsRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public ListRouteMapAssociationsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListRouteMapAssociationsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ListRouteMapAssociationsRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public ListRouteMapAssociationsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRouteMapAssociationsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRouteMapAssociationsRequest setRouteMapId(String routeMapId) {
        this.routeMapId = routeMapId;
        return this;
    }
    public String getRouteMapId() {
        return this.routeMapId;
    }

    public ListRouteMapAssociationsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
