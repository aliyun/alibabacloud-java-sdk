// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListRequest extends TeaModel {
    /**
     * <p>The page number to return.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The IP version of the asset. Valid values:</p>
     * <ul>
     * <li><p><strong>4</strong> (default): IPv4</p>
     * </li>
     * <li><p><strong>6</strong>: IPv6</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

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
     * <p>The UID of the member account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>Filters for assets discovered within a specific time window. Valid values:</p>
     * <ul>
     * <li><p><strong>discovered in 1 hour</strong>: The asset was added within the last hour.</p>
     * </li>
     * <li><p><strong>discovered in 1 day</strong>: The asset was added within the last day.</p>
     * </li>
     * <li><p><strong>discovered in 7 days</strong>: The asset was added within the last 7 days.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>discovered in 1 hour</p>
     */
    @NameInMap("NewResourceTag")
    public String newResourceTag;

    /**
     * <p>Specifies whether to query information about outbound traffic.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutStatistic")
    public String outStatistic;

    /**
     * <p>The number of assets to return per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of your Cloud Firewall instance.</p>
     * <blockquote>
     * <p>For more information about the regions that Cloud Firewall supports, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The asset type. Valid values:</p>
     * <ul>
     * <li><p><strong>BastionHostEgressIP</strong>: The egress IP address of a Bastionhost instance.</p>
     * </li>
     * <li><p><strong>BastionHostIngressIP</strong>: The ingress IP address of a Bastionhost instance.</p>
     * </li>
     * <li><p><strong>EcsEIP</strong>: The Elastic IP Address (EIP) of an ECS instance.</p>
     * </li>
     * <li><p><strong>EcsPublicIP</strong>: The public IP address of an ECS instance.</p>
     * </li>
     * <li><p><strong>EIP</strong>: An Elastic IP Address (EIP).</p>
     * </li>
     * <li><p><strong>EniEIP</strong>: The EIP of an elastic network interface (ENI).</p>
     * </li>
     * <li><p><strong>NatEIP</strong>: The EIP of a NAT Gateway instance.</p>
     * </li>
     * <li><p><strong>SlbEIP</strong>: The EIP of a Server Load Balancer (SLB) or Classic Load Balancer (CLB) instance.</p>
     * </li>
     * <li><p><strong>SlbPublicIP</strong>: The public IP address of a Server Load Balancer (SLB) or Classic Load Balancer (CLB) instance.</p>
     * </li>
     * <li><p><strong>NatPublicIP</strong>: The public IP address of a NAT Gateway instance.</p>
     * </li>
     * <li><p><strong>HAVIP</strong>: A High-availability Virtual IP (HAVIP).</p>
     * </li>
     * <li><p><strong>NlbEIP</strong>: The EIP of a Network Load Balancer (NLB) instance.</p>
     * </li>
     * <li><p><strong>ApiGatewayEIP</strong>: The public IP address of an API Gateway instance.</p>
     * </li>
     * <li><p><strong>AlbEIP</strong>: The EIP of an Application Load Balancer (ALB) instance.</p>
     * </li>
     * <li><p><strong>AiGatewayEIP</strong>: The public IP address of an AI Gateway instance.</p>
     * </li>
     * <li><p><strong>GaEIP</strong>: The EIP of a Global Accelerator (GA) instance.</p>
     * </li>
     * <li><p><strong>SwasEIP</strong>: The public IP address of a Simple Application Server instance.</p>
     * </li>
     * <li><p><strong>EcdEIP</strong>: The public IP address of a Wuying instance.</p>
     * </li>
     * <li><p><strong>BastionHostIP</strong>: The IP address of a Bastionhost instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EIP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The IP address or instance ID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>The status of the data leak detection feature.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("SensitiveStatus")
    public String sensitiveStatus;

    /**
     * <p>The status of the security group policy. Valid values:</p>
     * <ul>
     * <li><p><strong>pass</strong>: The security group policy is enforced.</p>
     * </li>
     * <li><p><strong>block</strong>: The security group policy is not enforced.</p>
     * </li>
     * <li><p><strong>unsupport</strong>: The asset does not support security group policies.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, assets are queried regardless of the security group policy status.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("SgStatus")
    public String sgStatus;

    /**
     * <p>The protection status of the asset. Valid values:</p>
     * <ul>
     * <li><p><strong>open</strong>: Protection is enabled.</p>
     * </li>
     * <li><p><strong>opening</strong>: Protection is being enabled.</p>
     * </li>
     * <li><p><strong>closed</strong>: Protection is disabled.</p>
     * </li>
     * <li><p><strong>closing</strong>: Protection is being disabled.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, assets are queried regardless of their protection status.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>eip</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The type of the user. Valid values:</p>
     * <ul>
     * <li><p><strong>buy</strong> (default): A user with a paid subscription.</p>
     * </li>
     * <li><p><strong>free</strong>: A user on the free tier.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>buy</p>
     */
    @NameInMap("UserType")
    public String userType;

    public static DescribeAssetListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetListRequest self = new DescribeAssetListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAssetListRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeAssetListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeAssetListRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribeAssetListRequest setNewResourceTag(String newResourceTag) {
        this.newResourceTag = newResourceTag;
        return this;
    }
    public String getNewResourceTag() {
        return this.newResourceTag;
    }

    public DescribeAssetListRequest setOutStatistic(String outStatistic) {
        this.outStatistic = outStatistic;
        return this;
    }
    public String getOutStatistic() {
        return this.outStatistic;
    }

    public DescribeAssetListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAssetListRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeAssetListRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeAssetListRequest setSearchItem(String searchItem) {
        this.searchItem = searchItem;
        return this;
    }
    public String getSearchItem() {
        return this.searchItem;
    }

    public DescribeAssetListRequest setSensitiveStatus(String sensitiveStatus) {
        this.sensitiveStatus = sensitiveStatus;
        return this;
    }
    public String getSensitiveStatus() {
        return this.sensitiveStatus;
    }

    public DescribeAssetListRequest setSgStatus(String sgStatus) {
        this.sgStatus = sgStatus;
        return this;
    }
    public String getSgStatus() {
        return this.sgStatus;
    }

    public DescribeAssetListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAssetListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeAssetListRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
