// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookRequest extends TeaModel {
    /**
     * <p>The ACK cluster connector ID. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><a href="~~DescribeAckClusterConnectors~~">DescribeAckClusterConnectors</a>: Lists ACK cluster connectors.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ac-7c1bad6c3cc84c33baab1</p>
     */
    @NameInMap("AckClusterConnectorId")
    public String ackClusterConnectorId;

    /**
     * <p>The list of ACK cluster pod labels.</p>
     * <blockquote>
     * <p>A maximum of 10 labels are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckLabels")
    public java.util.List<AddAddressBookRequestAckLabels> ackLabels;

    /**
     * <p>The list of ACK cluster pod namespaces.</p>
     * <blockquote>
     * <p>A maximum of 10 namespaces are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckNamespaces")
    public java.util.List<String> ackNamespaces;

    /**
     * <p>The addresses in the address book. Separate multiple addresses with commas (,). Use a space to separate an address from its description within a single address element.</p>
     * <blockquote>
     * <p>This parameter is required when GroupType is set to <code>ip</code>, <code>port</code>, or <code>domain</code>.</p>
     * </blockquote>
     * <ul>
     * <li><p>When GroupType is set to <code>ip</code>, enter IP addresses in the address list. Example: 192.0.XX.XX/32 Development CIDR block,10.0.0.X/24,192.0.XX.XX/24 Test CIDR block.</p>
     * </li>
     * <li><p>When GroupType is set to <code>port</code>, enter ports or port ranges in the address list. Example: 80 HTTP port,100/200,3306 Database port.</p>
     * </li>
     * <li><p>When GroupType is set to <code>domain</code>, enter domain names in the address list. Example: example.com Test domain name,aliyundoc.com,<a href="http://www.aliyun.com">www.aliyun.com</a> Alibaba Cloud official website.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX/32 ,192.0.XX.XX/24</p>
     */
    @NameInMap("AddressList")
    public String addressList;

    /**
     * <p>The list of member accounts for the asset address book.</p>
     */
    @NameInMap("AssetMemberUids")
    public java.util.List<Long> assetMemberUids;

    /**
     * <p>The list of regions and resource types for the asset address book.</p>
     */
    @NameInMap("AssetRegionResourceTypes")
    public java.util.List<AddAddressBookRequestAssetRegionResourceTypes> assetRegionResourceTypes;

    /**
     * <p>Indicates whether to automatically add the public IP addresses of Elastic Compute Service (ECS) instances that match the specified tags to the address book.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoAddTagEcs")
    public String autoAddTagEcs;

    /**
     * <p>The description of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sz-001</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sz-001</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The type of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    /**
     * <p>The language type of the address book description.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    @Deprecated
    public String sourceIp;

    /**
     * <p>The ECS tag list.</p>
     */
    @NameInMap("TagList")
    public java.util.List<AddAddressBookRequestTagList> tagList;

    /**
     * <p>The logical relationship among multiple ECS tags to match.</p>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("TagRelation")
    public String tagRelation;

    public static AddAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAddressBookRequest self = new AddAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public AddAddressBookRequest setAckClusterConnectorId(String ackClusterConnectorId) {
        this.ackClusterConnectorId = ackClusterConnectorId;
        return this;
    }
    public String getAckClusterConnectorId() {
        return this.ackClusterConnectorId;
    }

    public AddAddressBookRequest setAckLabels(java.util.List<AddAddressBookRequestAckLabels> ackLabels) {
        this.ackLabels = ackLabels;
        return this;
    }
    public java.util.List<AddAddressBookRequestAckLabels> getAckLabels() {
        return this.ackLabels;
    }

    public AddAddressBookRequest setAckNamespaces(java.util.List<String> ackNamespaces) {
        this.ackNamespaces = ackNamespaces;
        return this;
    }
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    public AddAddressBookRequest setAddressList(String addressList) {
        this.addressList = addressList;
        return this;
    }
    public String getAddressList() {
        return this.addressList;
    }

    public AddAddressBookRequest setAssetMemberUids(java.util.List<Long> assetMemberUids) {
        this.assetMemberUids = assetMemberUids;
        return this;
    }
    public java.util.List<Long> getAssetMemberUids() {
        return this.assetMemberUids;
    }

    public AddAddressBookRequest setAssetRegionResourceTypes(java.util.List<AddAddressBookRequestAssetRegionResourceTypes> assetRegionResourceTypes) {
        this.assetRegionResourceTypes = assetRegionResourceTypes;
        return this;
    }
    public java.util.List<AddAddressBookRequestAssetRegionResourceTypes> getAssetRegionResourceTypes() {
        return this.assetRegionResourceTypes;
    }

    public AddAddressBookRequest setAutoAddTagEcs(String autoAddTagEcs) {
        this.autoAddTagEcs = autoAddTagEcs;
        return this;
    }
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    public AddAddressBookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddAddressBookRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddAddressBookRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public AddAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    @Deprecated
    public AddAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public AddAddressBookRequest setTagList(java.util.List<AddAddressBookRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<AddAddressBookRequestTagList> getTagList() {
        return this.tagList;
    }

    public AddAddressBookRequest setTagRelation(String tagRelation) {
        this.tagRelation = tagRelation;
        return this;
    }
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static class AddAddressBookRequestAckLabels extends TeaModel {
        /**
         * <p>The key of the ACK cluster pod label.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the ACK cluster pod label.</p>
         * 
         * <strong>example:</strong>
         * <p>storage-operator</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddAddressBookRequestAckLabels build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestAckLabels self = new AddAddressBookRequestAckLabels();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddAddressBookRequestAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 extends TeaModel {
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

        public static AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 self = new AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setAiGatewayEIP(Boolean aiGatewayEIP) {
            this.aiGatewayEIP = aiGatewayEIP;
            return this;
        }
        public Boolean getAiGatewayEIP() {
            return this.aiGatewayEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setAlbEIP(Boolean albEIP) {
            this.albEIP = albEIP;
            return this;
        }
        public Boolean getAlbEIP() {
            return this.albEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setApiGatewayEIP(Boolean apiGatewayEIP) {
            this.apiGatewayEIP = apiGatewayEIP;
            return this;
        }
        public Boolean getApiGatewayEIP() {
            return this.apiGatewayEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setBastionHostEgressIP(Boolean bastionHostEgressIP) {
            this.bastionHostEgressIP = bastionHostEgressIP;
            return this;
        }
        public Boolean getBastionHostEgressIP() {
            return this.bastionHostEgressIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setBastionHostIP(Boolean bastionHostIP) {
            this.bastionHostIP = bastionHostIP;
            return this;
        }
        public Boolean getBastionHostIP() {
            return this.bastionHostIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setBastionHostIngressIP(Boolean bastionHostIngressIP) {
            this.bastionHostIngressIP = bastionHostIngressIP;
            return this;
        }
        public Boolean getBastionHostIngressIP() {
            return this.bastionHostIngressIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEIP(Boolean EIP) {
            this.EIP = EIP;
            return this;
        }
        public Boolean getEIP() {
            return this.EIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEcsEIP(Boolean ecsEIP) {
            this.ecsEIP = ecsEIP;
            return this;
        }
        public Boolean getEcsEIP() {
            return this.ecsEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEcsPublicIP(Boolean ecsPublicIP) {
            this.ecsPublicIP = ecsPublicIP;
            return this;
        }
        public Boolean getEcsPublicIP() {
            return this.ecsPublicIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEniEIP(Boolean eniEIP) {
            this.eniEIP = eniEIP;
            return this;
        }
        public Boolean getEniEIP() {
            return this.eniEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setGaEIP(Boolean gaEIP) {
            this.gaEIP = gaEIP;
            return this;
        }
        public Boolean getGaEIP() {
            return this.gaEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setHAVIP(Boolean HAVIP) {
            this.HAVIP = HAVIP;
            return this;
        }
        public Boolean getHAVIP() {
            return this.HAVIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setNatEIP(Boolean natEIP) {
            this.natEIP = natEIP;
            return this;
        }
        public Boolean getNatEIP() {
            return this.natEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setNatPublicIP(Boolean natPublicIP) {
            this.natPublicIP = natPublicIP;
            return this;
        }
        public Boolean getNatPublicIP() {
            return this.natPublicIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setNlbEIP(Boolean nlbEIP) {
            this.nlbEIP = nlbEIP;
            return this;
        }
        public Boolean getNlbEIP() {
            return this.nlbEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setSlbEIP(Boolean slbEIP) {
            this.slbEIP = slbEIP;
            return this;
        }
        public Boolean getSlbEIP() {
            return this.slbEIP;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setSlbPublicIP(Boolean slbPublicIP) {
            this.slbPublicIP = slbPublicIP;
            return this;
        }
        public Boolean getSlbPublicIP() {
            return this.slbPublicIP;
        }

    }

    public static class AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 extends TeaModel {
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

        public static AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 self = new AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setAiGatewayEIPv6(Boolean aiGatewayEIPv6) {
            this.aiGatewayEIPv6 = aiGatewayEIPv6;
            return this;
        }
        public Boolean getAiGatewayEIPv6() {
            return this.aiGatewayEIPv6;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setAlbIPv6(Boolean albIPv6) {
            this.albIPv6 = albIPv6;
            return this;
        }
        public Boolean getAlbIPv6() {
            return this.albIPv6;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setApiGatewayEIPv6(Boolean apiGatewayEIPv6) {
            this.apiGatewayEIPv6 = apiGatewayEIPv6;
            return this;
        }
        public Boolean getApiGatewayEIPv6() {
            return this.apiGatewayEIPv6;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setEcsIPv6(Boolean ecsIPv6) {
            this.ecsIPv6 = ecsIPv6;
            return this;
        }
        public Boolean getEcsIPv6() {
            return this.ecsIPv6;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setEniEIPv6(Boolean eniEIPv6) {
            this.eniEIPv6 = eniEIPv6;
            return this;
        }
        public Boolean getEniEIPv6() {
            return this.eniEIPv6;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setGaEIPv6(Boolean gaEIPv6) {
            this.gaEIPv6 = gaEIPv6;
            return this;
        }
        public Boolean getGaEIPv6() {
            return this.gaEIPv6;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setNlbIPv6(Boolean nlbIPv6) {
            this.nlbIPv6 = nlbIPv6;
            return this;
        }
        public Boolean getNlbIPv6() {
            return this.nlbIPv6;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setSlbIPv6(Boolean slbIPv6) {
            this.slbIPv6 = slbIPv6;
            return this;
        }
        public Boolean getSlbIPv6() {
            return this.slbIPv6;
        }

    }

    public static class AddAddressBookRequestAssetRegionResourceTypesResourceType extends TeaModel {
        /**
         * <p>The IPv4 asset type.</p>
         */
        @NameInMap("Ipv4")
        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 ipv4;

        /**
         * <p>The IPv6 asset type.</p>
         */
        @NameInMap("Ipv6")
        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 ipv6;

        public static AddAddressBookRequestAssetRegionResourceTypesResourceType build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestAssetRegionResourceTypesResourceType self = new AddAddressBookRequestAssetRegionResourceTypesResourceType();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceType setIpv4(AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 getIpv4() {
            return this.ipv4;
        }

        public AddAddressBookRequestAssetRegionResourceTypesResourceType setIpv6(AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public AddAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 getIpv6() {
            return this.ipv6;
        }

    }

    public static class AddAddressBookRequestAssetRegionResourceTypes extends TeaModel {
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
        public AddAddressBookRequestAssetRegionResourceTypesResourceType resourceType;

        public static AddAddressBookRequestAssetRegionResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestAssetRegionResourceTypes self = new AddAddressBookRequestAssetRegionResourceTypes();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestAssetRegionResourceTypes setAssetRegionId(String assetRegionId) {
            this.assetRegionId = assetRegionId;
            return this;
        }
        public String getAssetRegionId() {
            return this.assetRegionId;
        }

        public AddAddressBookRequestAssetRegionResourceTypes setResourceType(AddAddressBookRequestAssetRegionResourceTypesResourceType resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public AddAddressBookRequestAssetRegionResourceTypesResourceType getResourceType() {
            return this.resourceType;
        }

    }

    public static class AddAddressBookRequestTagList extends TeaModel {
        /**
         * <p>The key of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>TXY</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the ECS tag.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static AddAddressBookRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            AddAddressBookRequestTagList self = new AddAddressBookRequestTagList();
            return TeaModel.build(map, self);
        }

        public AddAddressBookRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public AddAddressBookRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
