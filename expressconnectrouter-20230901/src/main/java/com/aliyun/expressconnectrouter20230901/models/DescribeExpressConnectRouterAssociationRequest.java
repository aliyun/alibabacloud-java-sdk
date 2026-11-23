// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAssociationRequest extends TeaModel {
    /**
     * <p>The ID used to associate the Express Connect Router (ECR) with a VPC or TR.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-assoc-9p2qxx5phpca2m****</p>
     */
    @NameInMap("AssociationId")
    public String associationId;

    /**
     * <p>The type of the associated resource. Valid values:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: VPC.</p>
     * </li>
     * <li><p><strong>TR</strong>: transit router.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("AssociationNodeType")
    public String associationNodeType;

    /**
     * <p>The region where the VPC or TR resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssociationRegionId")
    public String associationRegionId;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-of3o1the3i4gwb****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate the value from your client. Make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether this is a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request and does not modify service resources.</li>
     * <li><strong>false</strong> (default): sends a normal request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <blockquote>
     * <p>You can call the CreateExpressConnectRouter API operation to create an ECR instance and obtain the EcrId.</p>
     * </blockquote>
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
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If this is the first query or no next query is required, leave this parameter empty.</li>
     * <li>If a next query is required, set the value to the NextToken value returned from the previous API call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of tags.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeExpressConnectRouterAssociationRequestTag> tag;

    /**
     * <p>The ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-2ze4i71c6be454e2l****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    @NameInMap("Version")
    public String version;

    /**
     * <p>The ID of the VPC-connected instance.</p>
     * 
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

    public DescribeExpressConnectRouterAssociationRequest setTag(java.util.List<DescribeExpressConnectRouterAssociationRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterAssociationRequestTag> getTag() {
        return this.tag;
    }

    public DescribeExpressConnectRouterAssociationRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public DescribeExpressConnectRouterAssociationRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public DescribeExpressConnectRouterAssociationRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class DescribeExpressConnectRouterAssociationRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. The tag key cannot be an empty string. It can be up to 128 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource. The tag value can be an empty string. It can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeExpressConnectRouterAssociationRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterAssociationRequestTag self = new DescribeExpressConnectRouterAssociationRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterAssociationRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressConnectRouterAssociationRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
