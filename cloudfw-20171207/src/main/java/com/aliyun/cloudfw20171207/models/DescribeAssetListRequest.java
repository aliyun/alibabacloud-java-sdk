// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The IP version of the asset that is protected by Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>4</strong>: IPv4 (default)</li>
     * <li><strong>6</strong>: IPv6</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

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

    /**
     * <p>The UID of the member that is added to Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The time when the asset was added. Valid values:</p>
     * <ul>
     * <li><strong>discovered in 1 hour</strong>: within one hour.</li>
     * <li><strong>discovered in 1 day</strong>: within one day.</li>
     * <li><strong>discovered in 7 days</strong>: within seven days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>discovered in 1 hour</p>
     */
    @NameInMap("NewResourceTag")
    public String newResourceTag;

    /**
     * <p>Whether to query external traffic information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutStatistic")
    public String outStatistic;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of your Cloud Firewall.</p>
     * <blockquote>
     * <p>For more information about the regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <ul>
     * <li><strong>BastionHostEgressIP</strong>: the egress IP address of a bastion host</li>
     * <li><strong>BastionHostIngressIP</strong>: the ingress IP address of a bastion host</li>
     * <li><strong>EcsEIP</strong>: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</li>
     * <li><strong>EcsPublicIP</strong>: the public IP address of an ECS instance</li>
     * <li><strong>EIP</strong>: the EIP</li>
     * <li><strong>EniEIP</strong>: the EIP of an elastic network interface (ENI)</li>
     * <li><strong>NatEIP</strong>: the EIP of a NAT gateway</li>
     * <li><strong>SlbEIP</strong>: the EIP of a Server Load Balancer (SLB) instance or a Classic Load Balancer (CLB) instance</li>
     * <li><strong>SlbPublicIP</strong>: the public IP address of an SLB instance or a CLB instance</li>
     * <li><strong>NatPublicIP</strong>: the public IP address of a NAT gateway</li>
     * <li><strong>HAVIP</strong>: the high-availability virtual IP address (HAVIP)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EIP</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The instance ID or IP address of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>Data leakage detection activation status.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("SensitiveStatus")
    public String sensitiveStatus;

    /**
     * <p>The status of the security group policy. Valid values:</p>
     * <ul>
     * <li><strong>pass</strong>: delivered</li>
     * <li><strong>block</strong>: undelivered</li>
     * <li><strong>unsupport</strong>: unsupported</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the assets on which security group policies in all states take effect are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pass</p>
     */
    @NameInMap("SgStatus")
    public String sgStatus;

    /**
     * <p>The status of the firewall. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: The firewall is enabled.</li>
     * <li><strong>opening</strong>: The firewall is being enabled.</li>
     * <li><strong>closed</strong>: The firewall is disabled.</li>
     * <li><strong>closing</strong>: The firewall is being disabled.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the assets that are configured for firewalls in all states are queried.</p>
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
     * <p>The edition of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>buy</strong>: a paid edition (default)</li>
     * <li><strong>free</strong>: Free Edition</li>
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
