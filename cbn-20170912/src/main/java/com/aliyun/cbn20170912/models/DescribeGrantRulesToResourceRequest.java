// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToResourceRequest extends TeaModel {
    /**
     * <ul>
     * <li><p>If you omit this parameter, all entries are returned in a single response. In this case, the <strong>MaxResults</strong> field in the response indicates the total number of entries.</p>
     * </li>
     * <li><p>If you specify the <strong>MaxResults</strong> parameter, the query is paginated. <strong>MaxResults</strong> sets the number of entries per page. The value must be an integer from <strong>1</strong> to <strong>100</strong>. The <strong>MaxResults</strong> value in the response indicates the number of entries on the current page. The recommended value for this parameter is <strong>20</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token used to retrieve the next page of results. Valid values:</p>
     * <ul>
     * <li><p>Omit this parameter for the first request.</p>
     * </li>
     * <li><p>For subsequent requests, set this parameter to the <strong>NextToken</strong> value from the previous response.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><p><strong>VPC</strong>: a Virtual Private Cloud (VPC) instance.</p>
     * </li>
     * <li><p><strong>ExpressConnect</strong>: a Virtual Border Router (VBR) instance.</p>
     * </li>
     * <li><p><strong>VPN</strong>: an IPsec connection.</p>
     * </li>
     * <li><p><strong>ECR</strong>: an ExpressConnect Router (ECR) instance.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID of the network instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the network instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-p0wfut1iqauelpdpb****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeGrantRulesToResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToResourceRequest self = new DescribeGrantRulesToResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToResourceRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeGrantRulesToResourceRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGrantRulesToResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeGrantRulesToResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGrantRulesToResourceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeGrantRulesToResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGrantRulesToResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DescribeGrantRulesToResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeGrantRulesToResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
