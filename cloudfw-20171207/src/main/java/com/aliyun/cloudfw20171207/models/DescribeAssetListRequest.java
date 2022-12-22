// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAssetListRequest extends TeaModel {
    // The number of the page to return.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The IP version of the asset that is protected by Cloud Firewall. Valid values:
    // 
    // *   **4**: IPv4 (default)
    // *   **6**: IPv6
    @NameInMap("IpVersion")
    public String ipVersion;

    // The language of the content within the response. Valid values:
    // 
    // *   **zh**: Chinese (default)
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The UID of the member that is added in Cloud Firewall.
    @NameInMap("MemberUid")
    public Long memberUid;

    // The number of entries to return on each page.
    @NameInMap("PageSize")
    public String pageSize;

    // The ID of the region in which Cloud Firewall is supported.
    // 
    // >  For more information about the regions in which Cloud Firewall is supported, see [Supported regions](~~195657~~).
    @NameInMap("RegionNo")
    public String regionNo;

    // The type of the asset. Valid values:
    // 
    // *   **BastionHostEgressIP**: the egress IP address of a bastion host
    // *   **BastionHostIngressIP**: the ingress IP address of a bastion host
    // *   **EcsEIP**: the elastic IP address (EIP) of an Elastic Compute Service (ECS) instance
    // *   **EcsPublicIP**: the public IP address of an ECS instance
    // *   **EIP**: the EIP
    // *   **EniEIP**: the EIP of an elastic network interface (ENI)
    // *   **NatEIP**: the EIP of a Network Address Translation (NAT) gateway
    // *   **SlbEIP**: the EIP of a Server Load Balancer (SLB) instance
    // *   **SlbPublicIP**: the public IP address of an SLB instance
    // *   **NatPublicIP**: the public IP address of a NAT gateway
    // *   **HAVIP**: the high-availability virtual IP address (HAVIP)
    @NameInMap("ResourceType")
    public String resourceType;

    // The instance ID or the IP address of the asset.
    @NameInMap("SearchItem")
    public String searchItem;

    // The status of the security group policy. Valid values:
    // 
    // *   **pass**: delivered
    // 
    // *   **block**: undelivered
    // 
    // *   **unsupport**: unsupported
    // 
    // > If you do not specify this parameter, the assets on which security group policies in all states take effect are queried.
    @NameInMap("SgStatus")
    public String sgStatus;

    // The status of the firewall. Valid values:
    // 
    // *   **open**: The firewall is enabled.
    // *   **opening**: The firewall is being enabled.
    // *   **closed**: The firewall is disabled.
    // *   **closing**: The firewall is being disabled.
    // 
    // >  If you do not specify this parameter, the assets that are configured for firewalls in all states are queried.
    @NameInMap("Status")
    public String status;

    // This parameter is deprecated.
    @NameInMap("Type")
    public String type;

    // The edition of Cloud Firewall. Valid values:
    // 
    // *   **buy**: a paid edition (default)
    // *   **free**: a free edition
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
