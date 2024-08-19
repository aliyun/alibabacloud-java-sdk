// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2ListRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-rig0t5zi96crkl****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-f1799baa9e254651****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The name of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
     * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
     * <li><strong>notconfigured</strong>: The VPC firewall is not created.</li>
     * <li><strong>configured</strong>: The VPC firewall is created but is not enabled.</li>
     * <li><strong>creating</strong>: The VPC firewall is being created.</li>
     * <li><strong>opening</strong>: The VPC firewall is being enabled.</li>
     * <li><strong>deleting</strong>: The VPC firewall is being deleted.</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, VPC firewalls in all states are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>opened</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The routing mode of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>managed</strong>: automatic mode</li>
     * <li><strong>manual</strong>: manual mode</li>
     * </ul>
     * <blockquote>
     * <p> If you do not specify this parameter, VPC firewalls in all routing modes are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>managed</p>
     */
    @NameInMap("RouteMode")
    public String routeMode;

    /**
     * <p>The ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-uf6egtvyaedvt20xl****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static DescribeTrFirewallsV2ListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2ListRequest self = new DescribeTrFirewallsV2ListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2ListRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeTrFirewallsV2ListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTrFirewallsV2ListRequest setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallsV2ListRequest setFirewallName(String firewallName) {
        this.firewallName = firewallName;
        return this;
    }
    public String getFirewallName() {
        return this.firewallName;
    }

    public DescribeTrFirewallsV2ListRequest setFirewallSwitchStatus(String firewallSwitchStatus) {
        this.firewallSwitchStatus = firewallSwitchStatus;
        return this;
    }
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    public DescribeTrFirewallsV2ListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTrFirewallsV2ListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeTrFirewallsV2ListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeTrFirewallsV2ListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeTrFirewallsV2ListRequest setRouteMode(String routeMode) {
        this.routeMode = routeMode;
        return this;
    }
    public String getRouteMode() {
        return this.routeMode;
    }

    public DescribeTrFirewallsV2ListRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
