// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2ListRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The page number. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The name of the VPC firewall.</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <br>
     * <p>*   **opened**: The VPC firewall is enabled.</p>
     * <p>*   **closed**: The VPC firewall is disabled.</p>
     * <p>*   **notconfigured**: The VPC firewall is not created.</p>
     * <p>*   **configured**: The VPC firewall is created but is not enabled.</p>
     * <p>*   **creating**: The VPC firewall is being created.</p>
     * <p>*   **opening**: The VPC firewall is being enabled.</p>
     * <p>*   **deleting**: The VPC firewall is being deleted.</p>
     * <br>
     * <p>>  If you do not specify this parameter, VPC firewalls in all states are queried.</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID of the transit router.</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The routing mode of the VPC firewall. Valid values:</p>
     * <br>
     * <p>*   **managed**: automatic mode</p>
     * <p>*   **manual**: manual mode</p>
     * <br>
     * <p>>  If you do not specify this parameter, VPC firewalls in all routing modes are queried.</p>
     */
    @NameInMap("RouteMode")
    public String routeMode;

    /**
     * <p>The ID of the transit router.</p>
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
