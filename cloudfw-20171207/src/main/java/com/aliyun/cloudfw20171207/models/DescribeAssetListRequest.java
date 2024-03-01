// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListRequest extends TeaModel {
    /**
     * <p>The page number. Valid values: 1 to 50.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The IP version of the asset that is protected by Cloud Firewall. Valid values:</p>
     * <br>
     * <p>*   **4**: IPv4 (default)</p>
     * <p>*   **6**: IPv6</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member that is added to Cloud Firewall.</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <p>The time when the asset was added. Valid values:</p>
     * <br>
     * <p>*   **discovered in 1 hour**: within one hour.</p>
     * <p>*   **discovered in 1 day**: within one day.</p>
     * <p>*   **discovered in 7 days**: within seven days.</p>
     */
    @NameInMap("NewResourceTag")
    public String newResourceTag;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of your Cloud Firewall.</p>
     * <br>
     * <p>> For more information about the regions, see [Supported regions](~~195657~~).</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <br>
     * <p>*   **BastionHostEgressIP**: the egress IP address of a bastion host</p>
     * <p>*   **BastionHostIngressIP**: the ingress IP address of a bastion host</p>
     * <p>*   **EcsEIP**: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance</p>
     * <p>*   **EcsPublicIP**: the public IP address of an ECS instance</p>
     * <p>*   **EIP**: the EIP</p>
     * <p>*   **EniEIP**: the EIP of an elastic network interface (ENI)</p>
     * <p>*   **NatEIP**: the EIP of a NAT gateway</p>
     * <p>*   **SlbEIP**: the EIP of a Server Load Balancer (SLB) instance or a Classic Load Balancer (CLB) instance</p>
     * <p>*   **SlbPublicIP**: the public IP address of an SLB instance or a CLB instance</p>
     * <p>*   **NatPublicIP**: the public IP address of a NAT gateway</p>
     * <p>*   **HAVIP**: the high-availability virtual IP address (HAVIP)</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The instance ID or IP address of the asset.</p>
     */
    @NameInMap("SearchItem")
    public String searchItem;

    /**
     * <p>The status of the security group policy. Valid values:</p>
     * <br>
     * <p>*   **pass**: delivered</p>
     * <p>*   **block**: undelivered</p>
     * <p>*   **unsupport**: unsupported</p>
     * <br>
     * <p>> If you do not specify this parameter, the assets on which security group policies in all states take effect are queried.</p>
     */
    @NameInMap("SgStatus")
    public String sgStatus;

    /**
     * <p>The status of the firewall. Valid values:</p>
     * <br>
     * <p>*   **open**: The firewall is enabled.</p>
     * <p>*   **opening**: The firewall is being enabled.</p>
     * <p>*   **closed**: The firewall is disabled.</p>
     * <p>*   **closing**: The firewall is being disabled.</p>
     * <br>
     * <p>> If you do not specify this parameter, the assets that are configured for firewalls in all states are queried.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The edition of Cloud Firewall. Valid values:</p>
     * <br>
     * <p>*   **buy**: a paid edition (default)</p>
     * <p>*   **free**: Free Edition</p>
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
