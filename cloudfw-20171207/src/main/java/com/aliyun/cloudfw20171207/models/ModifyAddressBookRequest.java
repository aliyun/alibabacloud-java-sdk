// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyAddressBookRequest extends TeaModel {
    /**
     * <p>The list of labels for ACK cluster pods.</p>
     * <blockquote>
     * <p>A maximum of 10 labels are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckLabels")
    public java.util.List<ModifyAddressBookRequestAckLabels> ackLabels;

    /**
     * <p>The list of namespaces for ACK cluster pods.</p>
     * <blockquote>
     * <p>A maximum of 10 namespaces are supported.</p>
     * </blockquote>
     */
    @NameInMap("AckNamespaces")
    public java.util.List<String> ackNamespaces;

    /**
     * <p>The addresses in the address book. Separate multiple addresses with commas (,). Use a space to separate an address from its description. This parameter is required when GroupType is set to <strong>ip</strong>, <strong>port</strong>, or <strong>domain</strong>.</p>
     * <ul>
     * <li><p>When GroupType is set to <strong>ip</strong>, specify IP addresses. Example: 1.2.XX.XX/32 Development CIDR block,10.0.0.X/24,1.2.XX.XX/24 Test CIDR block.</p>
     * </li>
     * <li><p>When GroupType is set to <strong>port</strong>, specify ports or port ranges. Example: 80/80 HTTP port,100/200,3306 Database port.</p>
     * </li>
     * <li><p>When GroupType is set to <strong>domain</strong>, specify domain names. Example: demo1.aliyun.com Test domain name,demo2.aliyun.com,<a href="http://www.aliyun.com">www.aliyun.com</a> Alibaba Cloud official website.</p>
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
    public java.util.List<ModifyAddressBookRequestAssetRegionResourceTypes> assetRegionResourceTypes;

    /**
     * <p>Specifies whether the public IP addresses of Elastic Compute Service (ECS) instances that match new labels is automatically added to the address book.</p>
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
     * <p>bj-001</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the address book.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bj-001</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The unique ID of the address book.</p>
     * <blockquote>
     * <p>You can obtain the value by calling the <a href="~~DescribeAddressBook~~">DescribeAddressBook</a> operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0657ab9d-fe8b-4174-b2a6-6baf358e****</p>
     */
    @NameInMap("GroupUuid")
    public String groupUuid;

    /**
     * <p>The language type. Valid values:</p>
     * <ul>
     * <li><strong>en</strong>: English.</li>
     * <li><strong>zh</strong>: Chinese (default).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The modification mode.</p>
     * <blockquote>
     * <p>When GroupType is set to <strong>ip</strong>, <strong>ipv6</strong>, <strong>port</strong>, or <strong>domain</strong>, the default value is <strong>Cover</strong> if this parameter is not specified.
     * Notice: When GroupType is set to <strong>tag</strong>, this parameter must be left empty.</notice></p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyMode")
    public String modifyMode;

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
    public java.util.List<ModifyAddressBookRequestTagList> tagList;

    /**
     * <p>The logical relationship among multiple ECS tags. Valid values:</p>
     * <ul>
     * <li><strong>or</strong>: The public IP address of an ECS instance is added to the address book if the instance matches any of the specified tags.</li>
     * <li><strong>and</strong>: The public IP address of an ECS instance is added to the address book only if the instance matches all of the specified tags.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>and</p>
     */
    @NameInMap("TagRelation")
    public String tagRelation;

    public static ModifyAddressBookRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAddressBookRequest self = new ModifyAddressBookRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAddressBookRequest setAckLabels(java.util.List<ModifyAddressBookRequestAckLabels> ackLabels) {
        this.ackLabels = ackLabels;
        return this;
    }
    public java.util.List<ModifyAddressBookRequestAckLabels> getAckLabels() {
        return this.ackLabels;
    }

    public ModifyAddressBookRequest setAckNamespaces(java.util.List<String> ackNamespaces) {
        this.ackNamespaces = ackNamespaces;
        return this;
    }
    public java.util.List<String> getAckNamespaces() {
        return this.ackNamespaces;
    }

    public ModifyAddressBookRequest setAddressList(String addressList) {
        this.addressList = addressList;
        return this;
    }
    public String getAddressList() {
        return this.addressList;
    }

    public ModifyAddressBookRequest setAssetMemberUids(java.util.List<Long> assetMemberUids) {
        this.assetMemberUids = assetMemberUids;
        return this;
    }
    public java.util.List<Long> getAssetMemberUids() {
        return this.assetMemberUids;
    }

    public ModifyAddressBookRequest setAssetRegionResourceTypes(java.util.List<ModifyAddressBookRequestAssetRegionResourceTypes> assetRegionResourceTypes) {
        this.assetRegionResourceTypes = assetRegionResourceTypes;
        return this;
    }
    public java.util.List<ModifyAddressBookRequestAssetRegionResourceTypes> getAssetRegionResourceTypes() {
        return this.assetRegionResourceTypes;
    }

    public ModifyAddressBookRequest setAutoAddTagEcs(String autoAddTagEcs) {
        this.autoAddTagEcs = autoAddTagEcs;
        return this;
    }
    public String getAutoAddTagEcs() {
        return this.autoAddTagEcs;
    }

    public ModifyAddressBookRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAddressBookRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyAddressBookRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public ModifyAddressBookRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyAddressBookRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

    @Deprecated
    public ModifyAddressBookRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyAddressBookRequest setTagList(java.util.List<ModifyAddressBookRequestTagList> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<ModifyAddressBookRequestTagList> getTagList() {
        return this.tagList;
    }

    public ModifyAddressBookRequest setTagRelation(String tagRelation) {
        this.tagRelation = tagRelation;
        return this;
    }
    public String getTagRelation() {
        return this.tagRelation;
    }

    public static class ModifyAddressBookRequestAckLabels extends TeaModel {
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

        public static ModifyAddressBookRequestAckLabels build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestAckLabels self = new ModifyAddressBookRequestAckLabels();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestAckLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ModifyAddressBookRequestAckLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 extends TeaModel {
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

        public static ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 self = new ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setAiGatewayEIP(Boolean aiGatewayEIP) {
            this.aiGatewayEIP = aiGatewayEIP;
            return this;
        }
        public Boolean getAiGatewayEIP() {
            return this.aiGatewayEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setAlbEIP(Boolean albEIP) {
            this.albEIP = albEIP;
            return this;
        }
        public Boolean getAlbEIP() {
            return this.albEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setApiGatewayEIP(Boolean apiGatewayEIP) {
            this.apiGatewayEIP = apiGatewayEIP;
            return this;
        }
        public Boolean getApiGatewayEIP() {
            return this.apiGatewayEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setBastionHostEgressIP(Boolean bastionHostEgressIP) {
            this.bastionHostEgressIP = bastionHostEgressIP;
            return this;
        }
        public Boolean getBastionHostEgressIP() {
            return this.bastionHostEgressIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setBastionHostIP(Boolean bastionHostIP) {
            this.bastionHostIP = bastionHostIP;
            return this;
        }
        public Boolean getBastionHostIP() {
            return this.bastionHostIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setBastionHostIngressIP(Boolean bastionHostIngressIP) {
            this.bastionHostIngressIP = bastionHostIngressIP;
            return this;
        }
        public Boolean getBastionHostIngressIP() {
            return this.bastionHostIngressIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEIP(Boolean EIP) {
            this.EIP = EIP;
            return this;
        }
        public Boolean getEIP() {
            return this.EIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEcsEIP(Boolean ecsEIP) {
            this.ecsEIP = ecsEIP;
            return this;
        }
        public Boolean getEcsEIP() {
            return this.ecsEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEcsPublicIP(Boolean ecsPublicIP) {
            this.ecsPublicIP = ecsPublicIP;
            return this;
        }
        public Boolean getEcsPublicIP() {
            return this.ecsPublicIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setEniEIP(Boolean eniEIP) {
            this.eniEIP = eniEIP;
            return this;
        }
        public Boolean getEniEIP() {
            return this.eniEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setGaEIP(Boolean gaEIP) {
            this.gaEIP = gaEIP;
            return this;
        }
        public Boolean getGaEIP() {
            return this.gaEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setHAVIP(Boolean HAVIP) {
            this.HAVIP = HAVIP;
            return this;
        }
        public Boolean getHAVIP() {
            return this.HAVIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setNatEIP(Boolean natEIP) {
            this.natEIP = natEIP;
            return this;
        }
        public Boolean getNatEIP() {
            return this.natEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setNatPublicIP(Boolean natPublicIP) {
            this.natPublicIP = natPublicIP;
            return this;
        }
        public Boolean getNatPublicIP() {
            return this.natPublicIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setNlbEIP(Boolean nlbEIP) {
            this.nlbEIP = nlbEIP;
            return this;
        }
        public Boolean getNlbEIP() {
            return this.nlbEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setSlbEIP(Boolean slbEIP) {
            this.slbEIP = slbEIP;
            return this;
        }
        public Boolean getSlbEIP() {
            return this.slbEIP;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 setSlbPublicIP(Boolean slbPublicIP) {
            this.slbPublicIP = slbPublicIP;
            return this;
        }
        public Boolean getSlbPublicIP() {
            return this.slbPublicIP;
        }

    }

    public static class ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 extends TeaModel {
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

        public static ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 self = new ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setAiGatewayEIPv6(Boolean aiGatewayEIPv6) {
            this.aiGatewayEIPv6 = aiGatewayEIPv6;
            return this;
        }
        public Boolean getAiGatewayEIPv6() {
            return this.aiGatewayEIPv6;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setAlbIPv6(Boolean albIPv6) {
            this.albIPv6 = albIPv6;
            return this;
        }
        public Boolean getAlbIPv6() {
            return this.albIPv6;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setApiGatewayEIPv6(Boolean apiGatewayEIPv6) {
            this.apiGatewayEIPv6 = apiGatewayEIPv6;
            return this;
        }
        public Boolean getApiGatewayEIPv6() {
            return this.apiGatewayEIPv6;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setEcsIPv6(Boolean ecsIPv6) {
            this.ecsIPv6 = ecsIPv6;
            return this;
        }
        public Boolean getEcsIPv6() {
            return this.ecsIPv6;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setEniEIPv6(Boolean eniEIPv6) {
            this.eniEIPv6 = eniEIPv6;
            return this;
        }
        public Boolean getEniEIPv6() {
            return this.eniEIPv6;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setGaEIPv6(Boolean gaEIPv6) {
            this.gaEIPv6 = gaEIPv6;
            return this;
        }
        public Boolean getGaEIPv6() {
            return this.gaEIPv6;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setNlbIPv6(Boolean nlbIPv6) {
            this.nlbIPv6 = nlbIPv6;
            return this;
        }
        public Boolean getNlbIPv6() {
            return this.nlbIPv6;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 setSlbIPv6(Boolean slbIPv6) {
            this.slbIPv6 = slbIPv6;
            return this;
        }
        public Boolean getSlbIPv6() {
            return this.slbIPv6;
        }

    }

    public static class ModifyAddressBookRequestAssetRegionResourceTypesResourceType extends TeaModel {
        /**
         * <p>The IPv4 asset type.</p>
         */
        @NameInMap("Ipv4")
        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 ipv4;

        /**
         * <p>The IPv6 asset type.</p>
         */
        @NameInMap("Ipv6")
        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 ipv6;

        public static ModifyAddressBookRequestAssetRegionResourceTypesResourceType build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestAssetRegionResourceTypesResourceType self = new ModifyAddressBookRequestAssetRegionResourceTypesResourceType();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceType setIpv4(ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 ipv4) {
            this.ipv4 = ipv4;
            return this;
        }
        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv4 getIpv4() {
            return this.ipv4;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypesResourceType setIpv6(ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 ipv6) {
            this.ipv6 = ipv6;
            return this;
        }
        public ModifyAddressBookRequestAssetRegionResourceTypesResourceTypeIpv6 getIpv6() {
            return this.ipv6;
        }

    }

    public static class ModifyAddressBookRequestAssetRegionResourceTypes extends TeaModel {
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
        public ModifyAddressBookRequestAssetRegionResourceTypesResourceType resourceType;

        public static ModifyAddressBookRequestAssetRegionResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestAssetRegionResourceTypes self = new ModifyAddressBookRequestAssetRegionResourceTypes();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestAssetRegionResourceTypes setAssetRegionId(String assetRegionId) {
            this.assetRegionId = assetRegionId;
            return this;
        }
        public String getAssetRegionId() {
            return this.assetRegionId;
        }

        public ModifyAddressBookRequestAssetRegionResourceTypes setResourceType(ModifyAddressBookRequestAssetRegionResourceTypesResourceType resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public ModifyAddressBookRequestAssetRegionResourceTypesResourceType getResourceType() {
            return this.resourceType;
        }

    }

    public static class ModifyAddressBookRequestTagList extends TeaModel {
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

        public static ModifyAddressBookRequestTagList build(java.util.Map<String, ?> map) throws Exception {
            ModifyAddressBookRequestTagList self = new ModifyAddressBookRequestTagList();
            return TeaModel.build(map, self);
        }

        public ModifyAddressBookRequestTagList setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ModifyAddressBookRequestTagList setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
