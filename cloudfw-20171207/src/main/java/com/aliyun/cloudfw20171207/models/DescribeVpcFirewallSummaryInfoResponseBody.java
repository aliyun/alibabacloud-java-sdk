// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallSummaryInfoResponseBody extends TeaModel {
    /**
     * <p>The remaining quota for VPC firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("AvailableVpcFirewallQuota")
    public Integer availableVpcFirewallQuota;

    /**
     * <p>The number of VPCs connected using Cloud Enterprise Network (CEN) and Express Connect.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("CenExpressConnectVpcCount")
    public Integer cenExpressConnectVpcCount;

    /**
     * <p>The number of CEN VPCs.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CenFirewallVpcCount")
    public Integer cenFirewallVpcCount;

    /**
     * <p>The number of VPCs on the CEN transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("CenTrVpcCount")
    public Integer cenTrVpcCount;

    /**
     * <p>The number of configured CEN firewalls that are disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ClosedCenFirewallCount")
    public Integer closedCenFirewallCount;

    /**
     * <p>The number of configured Express Connect firewalls that are disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ClosedExpressConnectFirewallCount")
    public Integer closedExpressConnectFirewallCount;

    /**
     * <p>The number of configured VPC firewalls that are disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ClosedVpcFirewallCount")
    public Integer closedVpcFirewallCount;

    /**
     * <p>The number of configured CEN firewall instances of the Basic Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ConfiguredCenFirewallCount")
    public Integer configuredCenFirewallCount;

    /**
     * <p>The number of regions where CEN firewalls are configured.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ConfiguredCenFirewallRegionCount")
    public Integer configuredCenFirewallRegionCount;

    /**
     * <p>The number of VPCs for which CEN firewalls are configured.</p>
     * 
     * <strong>example:</strong>
     * <p>18</p>
     */
    @NameInMap("ConfiguredCenFirewallVpcCount")
    public Integer configuredCenFirewallVpcCount;

    /**
     * <p>The number of configured CEN transit router firewall instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ConfiguredCenTrFirewallCount")
    public Integer configuredCenTrFirewallCount;

    /**
     * <p>The number of configured Express Connect circuits.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ConfiguredExpressConnectFirewallCount")
    public Integer configuredExpressConnectFirewallCount;

    /**
     * <p>The number of VPCs for which Express Connect firewalls are configured.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ConfiguredExpressConnectVpcCount")
    public Integer configuredExpressConnectVpcCount;

    /**
     * <p>The number of configured VPC firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ConfiguredVpcFirewallCount")
    public Integer configuredVpcFirewallCount;

    /**
     * <p>The number of VPCs for which VPC firewalls are configured.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ConfiguredVpcFirewallVpcCount")
    public Integer configuredVpcFirewallVpcCount;

    /**
     * <p>The number of Express Connect VPCs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ExpressConnectVpcCount")
    public Integer expressConnectVpcCount;

    /**
     * <p>The number of CEN firewalls that are not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NotConfiguredCenFirewallCount")
    public Integer notConfiguredCenFirewallCount;

    /**
     * <p>The number of CEN transit router firewall instances that are not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("NotConfiguredCenTrFirewallCount")
    public Integer notConfiguredCenTrFirewallCount;

    /**
     * <p>The number of Express Connect firewalls that are not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("NotConfiguredExpressConnectFirewallCount")
    public Integer notConfiguredExpressConnectFirewallCount;

    /**
     * <p>The number of VPC firewalls that are not configured.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("NotConfiguredVpcFirewallCount")
    public Integer notConfiguredVpcFirewallCount;

    /**
     * <p>The number of VPCs that are connected using CEN and Express Connect and have the firewall enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("OpenedCenExpressConnectVpcCount")
    public Integer openedCenExpressConnectVpcCount;

    /**
     * <p>The number of enabled CEN firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("OpenedCenFirewallCount")
    public Integer openedCenFirewallCount;

    /**
     * <p>The number of VPCs protected by CEN firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OpenedCenFirewallVpcCount")
    public Integer openedCenFirewallVpcCount;

    /**
     * <p>The number of VPCs protected by the CEN transit router firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("OpenedCenTrFirewallVpcCount")
    public Integer openedCenTrFirewallVpcCount;

    /**
     * <p>The number of enabled CEN Express Connect Routers (ECRs).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OpenedEcrCount")
    public Integer openedEcrCount;

    /**
     * <p>The number of enabled Express Connect firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("OpenedExpressConnectFirewallCount")
    public Integer openedExpressConnectFirewallCount;

    /**
     * <p>The number of VPCs protected by Express Connect firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("OpenedExpressConnectVpcCount")
    public Integer openedExpressConnectVpcCount;

    /**
     * <p>The number of inter-region connections protected by the CEN transit router firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("OpenedPeerTrCount")
    public Integer openedPeerTrCount;

    /**
     * <p>The number of Virtual Border Routers (VBRs) protected by the CEN transit router firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OpenedVbrCount")
    public Integer openedVbrCount;

    /**
     * <p>The number of protected VPCs.</p>
     * 
     * <strong>example:</strong>
     * <p>17</p>
     */
    @NameInMap("OpenedVpcCount")
    public Integer openedVpcCount;

    /**
     * <p>The number of enabled VPC firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("OpenedVpcFirewallCount")
    public Integer openedVpcFirewallCount;

    /**
     * <p>The number of VPN gateways protected by the CEN transit router firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("OpenedVpnCount")
    public Integer openedVpnCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8AABEF64-7ABF-52CB-BA6C-0598E3DB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of ECRs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalEcrCount")
    public Integer totalEcrCount;

    /**
     * <p>The number of inter-region connections on the CEN transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalPeerTrCount")
    public Integer totalPeerTrCount;

    /**
     * <p>The number of VBRs on the CEN transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalVbrCount")
    public Integer totalVbrCount;

    /**
     * <p>The number of interconnected VPCs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalVpcCount")
    public Integer totalVpcCount;

    /**
     * <p>The total quota for VPC firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalVpcFirewallQuota")
    public Integer totalVpcFirewallQuota;

    /**
     * <p>The number of VPN gateways on the CEN transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalVpnCount")
    public Integer totalVpnCount;

    public static DescribeVpcFirewallSummaryInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallSummaryInfoResponseBody self = new DescribeVpcFirewallSummaryInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setAvailableVpcFirewallQuota(Integer availableVpcFirewallQuota) {
        this.availableVpcFirewallQuota = availableVpcFirewallQuota;
        return this;
    }
    public Integer getAvailableVpcFirewallQuota() {
        return this.availableVpcFirewallQuota;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setCenExpressConnectVpcCount(Integer cenExpressConnectVpcCount) {
        this.cenExpressConnectVpcCount = cenExpressConnectVpcCount;
        return this;
    }
    public Integer getCenExpressConnectVpcCount() {
        return this.cenExpressConnectVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setCenFirewallVpcCount(Integer cenFirewallVpcCount) {
        this.cenFirewallVpcCount = cenFirewallVpcCount;
        return this;
    }
    public Integer getCenFirewallVpcCount() {
        return this.cenFirewallVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setCenTrVpcCount(Integer cenTrVpcCount) {
        this.cenTrVpcCount = cenTrVpcCount;
        return this;
    }
    public Integer getCenTrVpcCount() {
        return this.cenTrVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setClosedCenFirewallCount(Integer closedCenFirewallCount) {
        this.closedCenFirewallCount = closedCenFirewallCount;
        return this;
    }
    public Integer getClosedCenFirewallCount() {
        return this.closedCenFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setClosedExpressConnectFirewallCount(Integer closedExpressConnectFirewallCount) {
        this.closedExpressConnectFirewallCount = closedExpressConnectFirewallCount;
        return this;
    }
    public Integer getClosedExpressConnectFirewallCount() {
        return this.closedExpressConnectFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setClosedVpcFirewallCount(Integer closedVpcFirewallCount) {
        this.closedVpcFirewallCount = closedVpcFirewallCount;
        return this;
    }
    public Integer getClosedVpcFirewallCount() {
        return this.closedVpcFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredCenFirewallCount(Integer configuredCenFirewallCount) {
        this.configuredCenFirewallCount = configuredCenFirewallCount;
        return this;
    }
    public Integer getConfiguredCenFirewallCount() {
        return this.configuredCenFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredCenFirewallRegionCount(Integer configuredCenFirewallRegionCount) {
        this.configuredCenFirewallRegionCount = configuredCenFirewallRegionCount;
        return this;
    }
    public Integer getConfiguredCenFirewallRegionCount() {
        return this.configuredCenFirewallRegionCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredCenFirewallVpcCount(Integer configuredCenFirewallVpcCount) {
        this.configuredCenFirewallVpcCount = configuredCenFirewallVpcCount;
        return this;
    }
    public Integer getConfiguredCenFirewallVpcCount() {
        return this.configuredCenFirewallVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredCenTrFirewallCount(Integer configuredCenTrFirewallCount) {
        this.configuredCenTrFirewallCount = configuredCenTrFirewallCount;
        return this;
    }
    public Integer getConfiguredCenTrFirewallCount() {
        return this.configuredCenTrFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredExpressConnectFirewallCount(Integer configuredExpressConnectFirewallCount) {
        this.configuredExpressConnectFirewallCount = configuredExpressConnectFirewallCount;
        return this;
    }
    public Integer getConfiguredExpressConnectFirewallCount() {
        return this.configuredExpressConnectFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredExpressConnectVpcCount(Integer configuredExpressConnectVpcCount) {
        this.configuredExpressConnectVpcCount = configuredExpressConnectVpcCount;
        return this;
    }
    public Integer getConfiguredExpressConnectVpcCount() {
        return this.configuredExpressConnectVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredVpcFirewallCount(Integer configuredVpcFirewallCount) {
        this.configuredVpcFirewallCount = configuredVpcFirewallCount;
        return this;
    }
    public Integer getConfiguredVpcFirewallCount() {
        return this.configuredVpcFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setConfiguredVpcFirewallVpcCount(Integer configuredVpcFirewallVpcCount) {
        this.configuredVpcFirewallVpcCount = configuredVpcFirewallVpcCount;
        return this;
    }
    public Integer getConfiguredVpcFirewallVpcCount() {
        return this.configuredVpcFirewallVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setExpressConnectVpcCount(Integer expressConnectVpcCount) {
        this.expressConnectVpcCount = expressConnectVpcCount;
        return this;
    }
    public Integer getExpressConnectVpcCount() {
        return this.expressConnectVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setNotConfiguredCenFirewallCount(Integer notConfiguredCenFirewallCount) {
        this.notConfiguredCenFirewallCount = notConfiguredCenFirewallCount;
        return this;
    }
    public Integer getNotConfiguredCenFirewallCount() {
        return this.notConfiguredCenFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setNotConfiguredCenTrFirewallCount(Integer notConfiguredCenTrFirewallCount) {
        this.notConfiguredCenTrFirewallCount = notConfiguredCenTrFirewallCount;
        return this;
    }
    public Integer getNotConfiguredCenTrFirewallCount() {
        return this.notConfiguredCenTrFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setNotConfiguredExpressConnectFirewallCount(Integer notConfiguredExpressConnectFirewallCount) {
        this.notConfiguredExpressConnectFirewallCount = notConfiguredExpressConnectFirewallCount;
        return this;
    }
    public Integer getNotConfiguredExpressConnectFirewallCount() {
        return this.notConfiguredExpressConnectFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setNotConfiguredVpcFirewallCount(Integer notConfiguredVpcFirewallCount) {
        this.notConfiguredVpcFirewallCount = notConfiguredVpcFirewallCount;
        return this;
    }
    public Integer getNotConfiguredVpcFirewallCount() {
        return this.notConfiguredVpcFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedCenExpressConnectVpcCount(Integer openedCenExpressConnectVpcCount) {
        this.openedCenExpressConnectVpcCount = openedCenExpressConnectVpcCount;
        return this;
    }
    public Integer getOpenedCenExpressConnectVpcCount() {
        return this.openedCenExpressConnectVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedCenFirewallCount(Integer openedCenFirewallCount) {
        this.openedCenFirewallCount = openedCenFirewallCount;
        return this;
    }
    public Integer getOpenedCenFirewallCount() {
        return this.openedCenFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedCenFirewallVpcCount(Integer openedCenFirewallVpcCount) {
        this.openedCenFirewallVpcCount = openedCenFirewallVpcCount;
        return this;
    }
    public Integer getOpenedCenFirewallVpcCount() {
        return this.openedCenFirewallVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedCenTrFirewallVpcCount(Integer openedCenTrFirewallVpcCount) {
        this.openedCenTrFirewallVpcCount = openedCenTrFirewallVpcCount;
        return this;
    }
    public Integer getOpenedCenTrFirewallVpcCount() {
        return this.openedCenTrFirewallVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedEcrCount(Integer openedEcrCount) {
        this.openedEcrCount = openedEcrCount;
        return this;
    }
    public Integer getOpenedEcrCount() {
        return this.openedEcrCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedExpressConnectFirewallCount(Integer openedExpressConnectFirewallCount) {
        this.openedExpressConnectFirewallCount = openedExpressConnectFirewallCount;
        return this;
    }
    public Integer getOpenedExpressConnectFirewallCount() {
        return this.openedExpressConnectFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedExpressConnectVpcCount(Integer openedExpressConnectVpcCount) {
        this.openedExpressConnectVpcCount = openedExpressConnectVpcCount;
        return this;
    }
    public Integer getOpenedExpressConnectVpcCount() {
        return this.openedExpressConnectVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedPeerTrCount(Integer openedPeerTrCount) {
        this.openedPeerTrCount = openedPeerTrCount;
        return this;
    }
    public Integer getOpenedPeerTrCount() {
        return this.openedPeerTrCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedVbrCount(Integer openedVbrCount) {
        this.openedVbrCount = openedVbrCount;
        return this;
    }
    public Integer getOpenedVbrCount() {
        return this.openedVbrCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedVpcCount(Integer openedVpcCount) {
        this.openedVpcCount = openedVpcCount;
        return this;
    }
    public Integer getOpenedVpcCount() {
        return this.openedVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedVpcFirewallCount(Integer openedVpcFirewallCount) {
        this.openedVpcFirewallCount = openedVpcFirewallCount;
        return this;
    }
    public Integer getOpenedVpcFirewallCount() {
        return this.openedVpcFirewallCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setOpenedVpnCount(Integer openedVpnCount) {
        this.openedVpnCount = openedVpnCount;
        return this;
    }
    public Integer getOpenedVpnCount() {
        return this.openedVpnCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setTotalEcrCount(Integer totalEcrCount) {
        this.totalEcrCount = totalEcrCount;
        return this;
    }
    public Integer getTotalEcrCount() {
        return this.totalEcrCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setTotalPeerTrCount(Integer totalPeerTrCount) {
        this.totalPeerTrCount = totalPeerTrCount;
        return this;
    }
    public Integer getTotalPeerTrCount() {
        return this.totalPeerTrCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setTotalVbrCount(Integer totalVbrCount) {
        this.totalVbrCount = totalVbrCount;
        return this;
    }
    public Integer getTotalVbrCount() {
        return this.totalVbrCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setTotalVpcCount(Integer totalVpcCount) {
        this.totalVpcCount = totalVpcCount;
        return this;
    }
    public Integer getTotalVpcCount() {
        return this.totalVpcCount;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setTotalVpcFirewallQuota(Integer totalVpcFirewallQuota) {
        this.totalVpcFirewallQuota = totalVpcFirewallQuota;
        return this;
    }
    public Integer getTotalVpcFirewallQuota() {
        return this.totalVpcFirewallQuota;
    }

    public DescribeVpcFirewallSummaryInfoResponseBody setTotalVpnCount(Integer totalVpnCount) {
        this.totalVpnCount = totalVpnCount;
        return this;
    }
    public Integer getTotalVpnCount() {
        return this.totalVpnCount;
    }

}
