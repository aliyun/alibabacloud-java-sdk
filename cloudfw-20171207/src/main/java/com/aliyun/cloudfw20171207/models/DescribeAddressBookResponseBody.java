// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAddressBookResponseBody extends TeaModel {
    /**
     * <p>The list of address books.</p>
     */
    @NameInMap("Acls")
    public java.util.List<DescribeAddressBookResponseBodyAcls> acls;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of address books on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B36F150A-1E27-43AA-B72C-D2AC712F09DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of address books.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeAddressBookResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddressBookResponseBody self = new DescribeAddressBookResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAddressBookResponseBody setAcls(java.util.List<DescribeAddressBookResponseBodyAcls> acls) {
        this.acls = acls;
        return this;
    }
    public java.util.List<DescribeAddressBookResponseBodyAcls> getAcls() {
        return this.acls;
    }

    public DescribeAddressBookResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribeAddressBookResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAddressBookResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAddressBookResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAddressBookResponseBodyAclsAckLabels extends TeaModel {
        /**
         * <p>The key of the pod label in the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the pod label in the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>storage-operator</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeAddressBookResponseBodyAclsAckLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAckLabels self = new DescribeAddressBookResponseBodyAclsAckLabels();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeAddressBookResponseBodyAclsAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsAddresses extends TeaModel {
        /**
         * <p>The address information of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1/32</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The description of the individual address.</p>
         * 
         * <strong>example:</strong>
         * <p>Single Address Description</p>
         */
        @NameInMap("Note")
        public String note;

        public static DescribeAddressBookResponseBodyAclsAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAddresses self = new DescribeAddressBookResponseBodyAclsAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAddresses setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeAddressBookResponseBodyAclsAddresses setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 extends TeaModel {
        /**
         * <p>The asset type: AIGatewayEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AiGatewayEIP")
        public Boolean aiGatewayEIP;

        /**
         * <p>The asset type: AlbEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AlbEIP")
        public Boolean albEIP;

        /**
         * <p>The asset type: ApigEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ApiGatewayEIP")
        public Boolean apiGatewayEIP;

        /**
         * <p>The asset type: BastionHostEgressIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BastionHostEgressIP")
        public Boolean bastionHostEgressIP;

        /**
         * <p>The asset type: BastionHostIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BastionHostIP")
        public Boolean bastionHostIP;

        /**
         * <p>The asset type: BastionHostIngressIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("BastionHostIngressIP")
        public Boolean bastionHostIngressIP;

        /**
         * <p>The asset type: EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EIP")
        public Boolean EIP;

        /**
         * <p>The asset type: EcsEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EcsEIP")
        public Boolean ecsEIP;

        /**
         * <p>The asset type: EcsPublicIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EcsPublicIP")
        public Boolean ecsPublicIP;

        /**
         * <p>The asset type: EniEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EniEIP")
        public Boolean eniEIP;

        /**
         * <p>The asset type: GaEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GaEIP")
        public Boolean gaEIP;

        /**
         * <p>The asset type: HAVIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HAVIP")
        public Boolean HAVIP;

        /**
         * <p>The asset type: NatEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NatEIP")
        public Boolean natEIP;

        /**
         * <p>The asset type: NatPublicIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NatPublicIP")
        public Boolean natPublicIP;

        /**
         * <p>The asset type: NlbEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NlbEIP")
        public Boolean nlbEIP;

        /**
         * <p>The asset type: SlbEIP.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SlbEIP")
        public Boolean slbEIP;

        /**
         * <p>The asset type: SlbPublicIP.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SlbPublicIP")
        public Boolean slbPublicIP;

        public static DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 self = new DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setAiGatewayEIP(Boolean aiGatewayEIP) {
            this.aiGatewayEIP = aiGatewayEIP;
            return this;
        }
        public Boolean getAiGatewayEIP() {
            return this.aiGatewayEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setAlbEIP(Boolean albEIP) {
            this.albEIP = albEIP;
            return this;
        }
        public Boolean getAlbEIP() {
            return this.albEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setApiGatewayEIP(Boolean apiGatewayEIP) {
            this.apiGatewayEIP = apiGatewayEIP;
            return this;
        }
        public Boolean getApiGatewayEIP() {
            return this.apiGatewayEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setBastionHostEgressIP(Boolean bastionHostEgressIP) {
            this.bastionHostEgressIP = bastionHostEgressIP;
            return this;
        }
        public Boolean getBastionHostEgressIP() {
            return this.bastionHostEgressIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setBastionHostIP(Boolean bastionHostIP) {
            this.bastionHostIP = bastionHostIP;
            return this;
        }
        public Boolean getBastionHostIP() {
            return this.bastionHostIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setBastionHostIngressIP(Boolean bastionHostIngressIP) {
            this.bastionHostIngressIP = bastionHostIngressIP;
            return this;
        }
        public Boolean getBastionHostIngressIP() {
            return this.bastionHostIngressIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setEIP(Boolean EIP) {
            this.EIP = EIP;
            return this;
        }
        public Boolean getEIP() {
            return this.EIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setEcsEIP(Boolean ecsEIP) {
            this.ecsEIP = ecsEIP;
            return this;
        }
        public Boolean getEcsEIP() {
            return this.ecsEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setEcsPublicIP(Boolean ecsPublicIP) {
            this.ecsPublicIP = ecsPublicIP;
            return this;
        }
        public Boolean getEcsPublicIP() {
            return this.ecsPublicIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setEniEIP(Boolean eniEIP) {
            this.eniEIP = eniEIP;
            return this;
        }
        public Boolean getEniEIP() {
            return this.eniEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setGaEIP(Boolean gaEIP) {
            this.gaEIP = gaEIP;
            return this;
        }
        public Boolean getGaEIP() {
            return this.gaEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setHAVIP(Boolean HAVIP) {
            this.HAVIP = HAVIP;
            return this;
        }
        public Boolean getHAVIP() {
            return this.HAVIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setNatEIP(Boolean natEIP) {
            this.natEIP = natEIP;
            return this;
        }
        public Boolean getNatEIP() {
            return this.natEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setNatPublicIP(Boolean natPublicIP) {
            this.natPublicIP = natPublicIP;
            return this;
        }
        public Boolean getNatPublicIP() {
            return this.natPublicIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setNlbEIP(Boolean nlbEIP) {
            this.nlbEIP = nlbEIP;
            return this;
        }
        public Boolean getNlbEIP() {
            return this.nlbEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setSlbEIP(Boolean slbEIP) {
            this.slbEIP = slbEIP;
            return this;
        }
        public Boolean getSlbEIP() {
            return this.slbEIP;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 setSlbPublicIP(Boolean slbPublicIP) {
            this.slbPublicIP = slbPublicIP;
            return this;
        }
        public Boolean getSlbPublicIP() {
            return this.slbPublicIP;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 extends TeaModel {
        /**
         * <p>The asset type: AIGatewayEIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AiGatewayEIPv6")
        public Boolean aiGatewayEIPv6;

        /**
         * <p>The asset type: AlbIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("AlbIPv6")
        public Boolean albIPv6;

        /**
         * <p>The asset type: ApigEIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ApiGatewayEIPv6")
        public Boolean apiGatewayEIPv6;

        /**
         * <p>The asset type: EcsIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EcsIPv6")
        public Boolean ecsIPv6;

        /**
         * <p>The asset type: EniEIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EniEIPv6")
        public Boolean eniEIPv6;

        /**
         * <p>The asset type: GaEIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GaEIPv6")
        public Boolean gaEIPv6;

        /**
         * <p>The asset type: NlbIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NlbIPv6")
        public Boolean nlbIPv6;

        /**
         * <p>The asset type: SlbIPv6.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SlbIPv6")
        public Boolean slbIPv6;

        public static DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 self = new DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setAiGatewayEIPv6(Boolean aiGatewayEIPv6) {
            this.aiGatewayEIPv6 = aiGatewayEIPv6;
            return this;
        }
        public Boolean getAiGatewayEIPv6() {
            return this.aiGatewayEIPv6;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setAlbIPv6(Boolean albIPv6) {
            this.albIPv6 = albIPv6;
            return this;
        }
        public Boolean getAlbIPv6() {
            return this.albIPv6;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setApiGatewayEIPv6(Boolean apiGatewayEIPv6) {
            this.apiGatewayEIPv6 = apiGatewayEIPv6;
            return this;
        }
        public Boolean getApiGatewayEIPv6() {
            return this.apiGatewayEIPv6;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setEcsIPv6(Boolean ecsIPv6) {
            this.ecsIPv6 = ecsIPv6;
            return this;
        }
        public Boolean getEcsIPv6() {
            return this.ecsIPv6;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setEniEIPv6(Boolean eniEIPv6) {
            this.eniEIPv6 = eniEIPv6;
            return this;
        }
        public Boolean getEniEIPv6() {
            return this.eniEIPv6;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setGaEIPv6(Boolean gaEIPv6) {
            this.gaEIPv6 = gaEIPv6;
            return this;
        }
        public Boolean getGaEIPv6() {
            return this.gaEIPv6;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setNlbIPv6(Boolean nlbIPv6) {
            this.nlbIPv6 = nlbIPv6;
            return this;
        }
        public Boolean getNlbIPv6() {
            return this.nlbIPv6;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 setSlbIPv6(Boolean slbIPv6) {
            this.slbIPv6 = slbIPv6;
            return this;
        }
        public Boolean getSlbIPv6() {
            return this.slbIPv6;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType extends TeaModel {
        /**
         * <p>The IPv4 asset type.</p>
         */
        @NameInMap("Ipv4")
        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 ipv4;

        /**
         * <p>The IPv6 asset type.</p>
         */
        @NameInMap("Ipv6")
        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 ipv6;

        public static DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType self = new DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType setIpv4(DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv4 getIpv4() {
            return this.ipv4;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType setIpv6(DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceTypeIpv6 getIpv6() {
            return this.ipv6;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes extends TeaModel {
        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("AssetRegionId")
        public String assetRegionId;

        /**
         * <p>The asset type.</p>
         */
        @NameInMap("ResourceType")
        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType resourceType;

        public static DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes self = new DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes setAssetRegionId(String assetRegionId) {
            this.assetRegionId = assetRegionId;
            return this;
        }
        public String getAssetRegionId() {
            return this.assetRegionId;
        }

        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes setResourceType(DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public DescribeAddressBookResponseBodyAclsAssetRegionResourceTypesResourceType getResourceType() {
            return this.resourceType;
        }

    }

    public static class DescribeAddressBookResponseBodyAclsTagList extends TeaModel {
        /**
         * <p>The key of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>company</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL VALUE</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeAddressBookResponseBodyAclsTagList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAclsTagList self = new DescribeAddressBookResponseBodyAclsTagList();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAclsTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeAddressBookResponseBodyAclsTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeAddressBookResponseBodyAcls extends TeaModel {
        /**
         * <p>The ID of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>ac-7c1bad6c3cc84c33baab</p>
         */
        @NameInMap("AckClusterConnectorId")
        public String ackClusterConnectorId;

        /**
         * <p>The name of the ACK cluster connector.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-cluster-connector-name</p>
         */
        @NameInMap("AckClusterConnectorName")
        public String ackClusterConnectorName;

        /**
         * <p>The list of pod labels in the ACK cluster.</p>
         */
        @NameInMap("AckLabels")
        public java.util.List<DescribeAddressBookResponseBodyAclsAckLabels> ackLabels;

        /**
         * <p>The list of pod namespaces in the ACK cluster.</p>
         */
        @NameInMap("AckNamespaces")
        public java.util.List<String> ackNamespaces;

        /**
         * <p>The address list of the address book.</p>
         */
        @NameInMap("AddressList")
        public java.util.List<String> addressList;

        /**
         * <p>The number of addresses in the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AddressListCount")
        public Integer addressListCount;

        /**
         * <p>The address list of the address book that includes descriptions for individual addresses.</p>
         */
        @NameInMap("Addresses")
        public java.util.List<DescribeAddressBookResponseBodyAclsAddresses> addresses;

        /**
         * <p>The list of member accounts for the asset address book.</p>
         */
        @NameInMap("AssetMemberUids")
        public java.util.List<Long> assetMemberUids;

        /**
         * <p>The list of regions and resource types for the asset address book.</p>
         */
        @NameInMap("AssetRegionResourceTypes")
        public java.util.List<DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes> assetRegionResourceTypes;

        /**
         * <p>Indicates whether the public IP addresses of ECS instances that match new tags are automatically added to the address book. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The public IP addresses are not automatically added.</li>
         * <li><strong>1</strong>: The public IP addresses are automatically added.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoAddTagEcs")
        public Integer autoAddTagEcs;

        /**
         * <p>The description of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>DEMO</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>demo_address_book</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>ip</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>The unique ID of the address book.</p>
         * 
         * <strong>example:</strong>
         * <p>f04ac7ce-628b-4cb7-be61-310222b7****</p>
         */
        @NameInMap("GroupUuid")
        public String groupUuid;

        /**
         * <p>The number of times the address book is referenced.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ReferenceCount")
        public Integer referenceCount;

        /**
         * <p>The region of the ACK cluster connector to which the address book belongs when GroupType is an ACK address book.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The list of ECS tags.</p>
         */
        @NameInMap("TagList")
        public java.util.List<DescribeAddressBookResponseBodyAclsTagList> tagList;

        /**
         * <p>The relationship between multiple ECS tags. Valid values:</p>
         * <ul>
         * <li><strong>or</strong>: The relationship between multiple tags is OR. The public IP address of an ECS instance that matches any tag is added to the address book.</li>
         * <li><strong>and</strong>: The relationship between multiple tags is AND. The public IP address of an ECS instance that matches all tags is added to the address book.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("TagRelation")
        public String tagRelation;

        public static DescribeAddressBookResponseBodyAcls build(java.util.Map<String, ?> map) throws Exception {
            DescribeAddressBookResponseBodyAcls self = new DescribeAddressBookResponseBodyAcls();
            return TeaModel.build(map, self);
        }

        public DescribeAddressBookResponseBodyAcls setAckClusterConnectorId(String ackClusterConnectorId) {
            this.ackClusterConnectorId = ackClusterConnectorId;
            return this;
        }
        public String getAckClusterConnectorId() {
            return this.ackClusterConnectorId;
        }

        public DescribeAddressBookResponseBodyAcls setAckClusterConnectorName(String ackClusterConnectorName) {
            this.ackClusterConnectorName = ackClusterConnectorName;
            return this;
        }
        public String getAckClusterConnectorName() {
            return this.ackClusterConnectorName;
        }

        public DescribeAddressBookResponseBodyAcls setAckLabels(java.util.List<DescribeAddressBookResponseBodyAclsAckLabels> ackLabels) {
            this.ackLabels = ackLabels;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsAckLabels> getAckLabels() {
            return this.ackLabels;
        }

        public DescribeAddressBookResponseBodyAcls setAckNamespaces(java.util.List<String> ackNamespaces) {
            this.ackNamespaces = ackNamespaces;
            return this;
        }
        public java.util.List<String> getAckNamespaces() {
            return this.ackNamespaces;
        }

        public DescribeAddressBookResponseBodyAcls setAddressList(java.util.List<String> addressList) {
            this.addressList = addressList;
            return this;
        }
        public java.util.List<String> getAddressList() {
            return this.addressList;
        }

        public DescribeAddressBookResponseBodyAcls setAddressListCount(Integer addressListCount) {
            this.addressListCount = addressListCount;
            return this;
        }
        public Integer getAddressListCount() {
            return this.addressListCount;
        }

        public DescribeAddressBookResponseBodyAcls setAddresses(java.util.List<DescribeAddressBookResponseBodyAclsAddresses> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsAddresses> getAddresses() {
            return this.addresses;
        }

        public DescribeAddressBookResponseBodyAcls setAssetMemberUids(java.util.List<Long> assetMemberUids) {
            this.assetMemberUids = assetMemberUids;
            return this;
        }
        public java.util.List<Long> getAssetMemberUids() {
            return this.assetMemberUids;
        }

        public DescribeAddressBookResponseBodyAcls setAssetRegionResourceTypes(java.util.List<DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes> assetRegionResourceTypes) {
            this.assetRegionResourceTypes = assetRegionResourceTypes;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsAssetRegionResourceTypes> getAssetRegionResourceTypes() {
            return this.assetRegionResourceTypes;
        }

        public DescribeAddressBookResponseBodyAcls setAutoAddTagEcs(Integer autoAddTagEcs) {
            this.autoAddTagEcs = autoAddTagEcs;
            return this;
        }
        public Integer getAutoAddTagEcs() {
            return this.autoAddTagEcs;
        }

        public DescribeAddressBookResponseBodyAcls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAddressBookResponseBodyAcls setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAddressBookResponseBodyAcls setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public DescribeAddressBookResponseBodyAcls setGroupUuid(String groupUuid) {
            this.groupUuid = groupUuid;
            return this;
        }
        public String getGroupUuid() {
            return this.groupUuid;
        }

        public DescribeAddressBookResponseBodyAcls setReferenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            return this;
        }
        public Integer getReferenceCount() {
            return this.referenceCount;
        }

        public DescribeAddressBookResponseBodyAcls setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeAddressBookResponseBodyAcls setTagList(java.util.List<DescribeAddressBookResponseBodyAclsTagList> tagList) {
            this.tagList = tagList;
            return this;
        }
        public java.util.List<DescribeAddressBookResponseBodyAclsTagList> getTagList() {
            return this.tagList;
        }

        public DescribeAddressBookResponseBodyAcls setTagRelation(String tagRelation) {
            this.tagRelation = tagRelation;
            return this;
        }
        public String getTagRelation() {
            return this.tagRelation;
        }

    }

}
