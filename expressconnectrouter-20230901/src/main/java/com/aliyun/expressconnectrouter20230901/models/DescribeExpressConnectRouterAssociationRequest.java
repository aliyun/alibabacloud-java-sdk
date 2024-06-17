// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAssociationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ecr-assoc-9p2qxx5phpca2m****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("AssociationNodeType")
    public String associationNodeType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociationRegionId")
    public String associationRegionId;

    /**
     * <strong>example:</strong>
     * <p>cen-of3o1the3i4gwb****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>false</p>
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
     * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>tr-2ze4i71c6be454e2l****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1h37fchc6jmfyln****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeExpressConnectRouterAssociationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterAssociationRequest self = new DescribeExpressConnectRouterAssociationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterAssociationRequest setAssociationId(String associationId) {
        this.associationId = associationId;
        return this;
    }
    public String getAssociationId() {
        return this.associationId;
    }

    public DescribeExpressConnectRouterAssociationRequest setAssociationNodeType(String associationNodeType) {
        this.associationNodeType = associationNodeType;
        return this;
    }
    public String getAssociationNodeType() {
        return this.associationNodeType;
    }

    public DescribeExpressConnectRouterAssociationRequest setAssociationRegionId(String associationRegionId) {
        this.associationRegionId = associationRegionId;
        return this;
    }
    public String getAssociationRegionId() {
        return this.associationRegionId;
    }

    public DescribeExpressConnectRouterAssociationRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeExpressConnectRouterAssociationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeExpressConnectRouterAssociationRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DescribeExpressConnectRouterAssociationRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public DescribeExpressConnectRouterAssociationRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectRouterAssociationRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectRouterAssociationRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public DescribeExpressConnectRouterAssociationRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
