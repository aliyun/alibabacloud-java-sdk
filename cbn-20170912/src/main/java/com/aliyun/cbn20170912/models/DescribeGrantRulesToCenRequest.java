// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-nye53d7p3hzyu4****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the network instance to query.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-rj9gt5nll27onu7****</p>
     */
    @NameInMap("ChildInstanceId")
    public String childInstanceId;

    /**
     * <p>The ID of the Alibaba Cloud account that owns the network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1250123456123456</p>
     */
    @NameInMap("ChildInstanceOwnerId")
    public Long childInstanceOwnerId;

    /**
     * <p>Specifies whether IPv6 is enabled.</p>
     * <ol>
     * <li><p>This parameter applies only when <strong>ProductType</strong> is set to <strong>VPC</strong>.</p>
     * </li>
     * <li><p>Set to <strong>true</strong> to return only VPCs with IPv6 enabled, or <strong>false</strong> to return only those with IPv6 disabled. If you omit this parameter, the response is not filtered by the IPv6 status.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnabledIpv6")
    public Boolean enabledIpv6;

    /**
     * <ul>
     * <li><p>If you omit this parameter, all entries are returned. The <strong>MaxResults</strong> value in the response then indicates the total number of entries.</p>
     * </li>
     * <li><p>If you set this parameter, the response is paginated. The <strong>MaxResults</strong> value specifies the number of entries to return on each page. Valid values: <strong>1</strong> to <strong>100</strong>. The <strong>MaxResults</strong> value in the response indicates the number of entries on the current page. Setting <strong>MaxResults</strong> to <strong>20</strong> is recommended.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <p>The token used to retrieve the next page of results.</p>
     * <ul>
     * <li><p>Omit this parameter for the first request.</p>
     * </li>
     * <li><p>Set this parameter to the <strong>NextToken</strong> value from the previous response to retrieve the next page of results.</p>
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
     * <li><p><strong>VPC</strong>: a virtual private cloud (VPC).</p>
     * </li>
     * <li><p><strong>VBR</strong>: a virtual border router (VBR).</p>
     * </li>
     * <li><p><strong>CCN</strong>: a Cloud Connect Network (CCN) instance.</p>
     * </li>
     * <li><p><strong>VPN</strong>: an IPsec-VPN connection.</p>
     * </li>
     * <li><p><strong>ECR</strong>: an Express Connect router.</p>
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
     * <p>The ID of the region where the network instance is located.</p>
     * <p>You can call the <a href="t2264556.xdita#"></a>operation to query region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DescribeGrantRulesToCenRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenRequest self = new DescribeGrantRulesToCenRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToCenRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeGrantRulesToCenRequest setChildInstanceId(String childInstanceId) {
        this.childInstanceId = childInstanceId;
        return this;
    }
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    public DescribeGrantRulesToCenRequest setChildInstanceOwnerId(Long childInstanceOwnerId) {
        this.childInstanceOwnerId = childInstanceOwnerId;
        return this;
    }
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    public DescribeGrantRulesToCenRequest setEnabledIpv6(Boolean enabledIpv6) {
        this.enabledIpv6 = enabledIpv6;
        return this;
    }
    public Boolean getEnabledIpv6() {
        return this.enabledIpv6;
    }

    public DescribeGrantRulesToCenRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public DescribeGrantRulesToCenRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeGrantRulesToCenRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeGrantRulesToCenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeGrantRulesToCenRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeGrantRulesToCenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGrantRulesToCenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeGrantRulesToCenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
