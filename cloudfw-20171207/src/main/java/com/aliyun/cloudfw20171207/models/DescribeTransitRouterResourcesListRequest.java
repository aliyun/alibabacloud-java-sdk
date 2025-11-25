// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterResourcesListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cen-djz1i6p8shzioz****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <strong>example:</strong>
     * <p>vfw-tr-741de4c8956341****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <strong>example:</strong>
     * <p>TR</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>tr-2zefgvkcl2qcexbb7****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <strong>example:</strong>
     * <p>vpc-wz9lllsbftdm0svpj****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeTransitRouterResourcesListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterResourcesListRequest self = new DescribeTransitRouterResourcesListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterResourcesListRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeTransitRouterResourcesListRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTransitRouterResourcesListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTransitRouterResourcesListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeTransitRouterResourcesListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeTransitRouterResourcesListRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public DescribeTransitRouterResourcesListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
