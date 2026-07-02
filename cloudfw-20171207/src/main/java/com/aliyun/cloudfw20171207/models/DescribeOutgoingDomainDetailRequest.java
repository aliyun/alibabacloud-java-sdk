// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeOutgoingDomainDetailRequest extends TeaModel {
    /**
     * <p>The policy coverage status.</p>
     * 
     * <strong>example:</strong>
     * <p>FullCoverage</p>
     */
    @NameInMap("AclCoverage")
    public String aclCoverage;

    /**
     * <p>The page number.</p>
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
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The list of domain names.</p>
     */
    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1733450528</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>Specifies whether to query NAT private network outbound connections.</p>
     * 
     * <strong>example:</strong>
     * <p>NatPrivate</p>
     */
    @NameInMap("IPType")
    public String IPType;

    /**
     * <p>The language type.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the NAT gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>ngw-uf62zzi7000bca7zn****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
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
     * <p>The private IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.210.0.XXX</p>
     */
    @NameInMap("PrivateIP")
    public String privateIP;

    /**
     * <p>The public IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.96.181.XXX</p>
     */
    @NameInMap("PublicIP")
    public String publicIP;

    /**
     * <p>The field by which to sort the results.</p>
     * 
     * <strong>example:</strong>
     * <p>OutBytes</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>121.15.137.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1753617600</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The tag ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FirstFlow</p>
     */
    @NameInMap("TagId")
    public String tagId;

    public static DescribeOutgoingDomainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOutgoingDomainDetailRequest self = new DescribeOutgoingDomainDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOutgoingDomainDetailRequest setAclCoverage(String aclCoverage) {
        this.aclCoverage = aclCoverage;
        return this;
    }
    public String getAclCoverage() {
        return this.aclCoverage;
    }

    public DescribeOutgoingDomainDetailRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeOutgoingDomainDetailRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeOutgoingDomainDetailRequest setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    public DescribeOutgoingDomainDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOutgoingDomainDetailRequest setIPType(String IPType) {
        this.IPType = IPType;
        return this;
    }
    public String getIPType() {
        return this.IPType;
    }

    public DescribeOutgoingDomainDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeOutgoingDomainDetailRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeOutgoingDomainDetailRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeOutgoingDomainDetailRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeOutgoingDomainDetailRequest setPrivateIP(String privateIP) {
        this.privateIP = privateIP;
        return this;
    }
    public String getPrivateIP() {
        return this.privateIP;
    }

    public DescribeOutgoingDomainDetailRequest setPublicIP(String publicIP) {
        this.publicIP = publicIP;
        return this;
    }
    public String getPublicIP() {
        return this.publicIP;
    }

    public DescribeOutgoingDomainDetailRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeOutgoingDomainDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOutgoingDomainDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOutgoingDomainDetailRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

}
