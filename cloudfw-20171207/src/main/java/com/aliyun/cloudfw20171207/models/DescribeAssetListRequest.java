// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListRequest extends TeaModel {
    /**
     * <p>The page number of the current page in a paginated query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The IP version of the assets protected by Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>4</strong> (default): IPv4.</li>
     * <li><strong>6</strong>: IPv6.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language type of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the Cloud Firewall member account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The time when the asset was discovered. Valid values:</p>
     * <ul>
     * <li><strong>discovered in 1 hour</strong>: The asset was discovered within 1 hour.</li>
     * <li><strong>discovered in 1 day</strong>: The asset was discovered within 1 day.</li>
     * <li><strong>discovered in 7 days</strong>: The asset was discovered within 7 days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>discovered in 1 hour</p>
     */
    @NameInMap("NewResourceTag")
    public String newResourceTag;

    /**
     * <p>Specifies whether to query outbound traffic information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutStatistic")
    public String outStatistic;

    /**
     * <p>The number of Cloud Firewall-protected assets to display on each page in a paginated query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the Cloud Firewall.</p>
     * <blockquote>
     * <p>For more information about regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
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
     * <li><strong>BastionHostEgressIP</strong>: Bastion host egress IP.</li>
     * <li><strong>BastionHostIngressIP</strong>: Bastion host ingress IP.</li>
     * <li><strong>EcsEIP</strong>: ECS EIP.</li>
     * <li><strong>EcsPublicIP</strong>: ECS public IP.</li>
     * <li><strong>EIP</strong>: Elastic IP address.</li>
     * <li><strong>EniEIP</strong>: Elastic network interface EIP.</li>
     * <li><strong>NatEIP</strong>: NAT EIP.</li>
     * <li><strong>SlbEIP</strong>: SLB EIP (CLB EIP).</li>
     * <li><strong>SlbPublicIP</strong>: SLB public IP (CLB public IP).</li>
     * <li><strong>NatPublicIP</strong>: NAT public IP.</li>
     * <li><strong>HAVIP</strong>: High-availability virtual IP.</li>
     * <li><strong>NlbEIP</strong>: NLB EIP.</li>
     * <li><strong>ApiGatewayEIP</strong>: API Gateway public IP.</li>
     * <li><strong>AlbEIP</strong>: ALB EIP.</li>
     * <li><strong>AiGatewayEIP</strong>: AI Gateway public IP.</li>
     * <li><strong>GaEIP</strong>: GA EIP.</li>
     * <li><strong>SwasEIP</strong>: Simple Application Server public IP.</li>
     * <li><strong>EcdEIP</strong>: Elastic Desktop Service public IP.</li>
     * <li><strong>BastionHostIP</strong>: Bastion host IP.</li>
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
     * <p>The status of data leakage detection.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("SensitiveStatus")
    public String sensitiveStatus;

    /**
     * <p>The security group policy status. Valid values:</p>
     * <ul>
     * <li><strong>pass</strong>: Delivered.</li>
     * <li><strong>block</strong>: Not delivered.</li>
     * <li><strong>unsupport</strong>: Not supported.<blockquote>
     * <p>If this parameter is not set, all security group policy statuses are queried.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("SgStatus")
    public String sgStatus;

    /**
     * <p>The Cloud Firewall status. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: Protected.</li>
     * <li><strong>opening</strong>: Protection enabling.</li>
     * <li><strong>closed</strong>: Not protected.</li>
     * <li><strong>closing</strong>: Protection disabling.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not set, all firewall statuses are queried.</p>
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
    @Deprecated
    public String type;

    /**
     * <p>The user type. Valid values:</p>
     * <ul>
     * <li><strong>buy</strong> (default): Paid user.</li>
     * <li><strong>free</strong>: Free user.</li>
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

    @Deprecated
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
