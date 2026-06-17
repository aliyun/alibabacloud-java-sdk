// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDomainRelationListRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The list of domain names.</p>
     */
    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    /**
     * <p>The destination IP address to query.</p>
     * 
     * <strong>example:</strong>
     * <p>34.136.111.XXX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The ID of the destination VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp10w5nb30r4jzfyc****</p>
     */
    @NameInMap("DstVpcId")
    public String dstVpcId;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656750960</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The order in which to sort the queried entries. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The field by which to sort the queried entries. Valid values:</p>
     * <p>Default value: TotalBytes.</p>
     * <p>Valid values:</p>
     * <p>TotalBytes: Order by total traffic.</p>
     * <p>SessionCount: Order by session count.</p>
     * 
     * <strong>example:</strong>
     * <p>TotalBytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address to query.</p>
     * 
     * <strong>example:</strong>
     * <p>47.92.x.x</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The ID of the source VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4nlt09olhpazpoeg****</p>
     */
    @NameInMap("SrcVpcId")
    public String srcVpcId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1656664560</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeVpcFirewallDomainRelationListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDomainRelationListRequest self = new DescribeVpcFirewallDomainRelationListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDomainRelationListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVpcFirewallDomainRelationListRequest setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    public DescribeVpcFirewallDomainRelationListRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeVpcFirewallDomainRelationListRequest setDstVpcId(String dstVpcId) {
        this.dstVpcId = dstVpcId;
        return this;
    }
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    public DescribeVpcFirewallDomainRelationListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeVpcFirewallDomainRelationListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVpcFirewallDomainRelationListRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeVpcFirewallDomainRelationListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeVpcFirewallDomainRelationListRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeVpcFirewallDomainRelationListRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeVpcFirewallDomainRelationListRequest setSrcVpcId(String srcVpcId) {
        this.srcVpcId = srcVpcId;
        return this;
    }
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    public DescribeVpcFirewallDomainRelationListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
