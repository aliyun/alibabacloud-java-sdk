// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallTrafficAssetListRequest extends TeaModel {
    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>www.****.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The end time. This value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656750960</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>47.92.x.x</p>
     */
    @NameInMap("IP")
    public String IP;

    /**
     * <p>Specifies whether to collect only the traffic that accesses AI services. This parameter is required. Set this parameter to &quot;true&quot;. Otherwise, a parameter error is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsAITraffic")
    public String isAITraffic;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The sort field. Valid values:</p>
     * <ul>
     * <li>TotalBytes: sorts by total traffic.</li>
     * <li>SessionCount: sorts by session count.</li>
     * </ul>
     * <p>Default value: TotalBytes.</p>
     * 
     * <strong>example:</strong>
     * <p>SessionCount</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The sort order. Valid values: asc, desc.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The start time. This value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The ID of the VPC where the asset resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-m5ewlqkuf7orclr1****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static DescribeVpcFirewallTrafficAssetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallTrafficAssetListRequest self = new DescribeVpcFirewallTrafficAssetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallTrafficAssetListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setIsAITraffic(String isAITraffic) {
        this.isAITraffic = isAITraffic;
        return this;
    }
    public String getIsAITraffic() {
        return this.isAITraffic;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeVpcFirewallTrafficAssetListRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
