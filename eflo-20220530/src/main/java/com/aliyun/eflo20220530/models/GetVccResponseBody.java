// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Content")
    public GetVccResponseBodyContent content;

    /**
     * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID of the current request</p>
     * 
     * <strong>example:</strong>
     * <p>CAD09E47-B651-5206-B2DC-3AB78C8EB446</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVccResponseBody self = new GetVccResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVccResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetVccResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVccResponseBody setContent(GetVccResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public GetVccResponseBodyContent getContent() {
        return this.content;
    }

    public GetVccResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVccResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVccResponseBodyContentAliyunRouterInfo extends TeaModel {
        /**
         * <p>IPv4 address of Alibaba Cloud-side interconnection</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.248.30</p>
         */
        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        /**
         * <p>Masking</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.248</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <p>Express Connect circuit ID</p>
         * 
         * <strong>example:</strong>
         * <p>pc-0jlof4bphlsnxbdztkvad</p>
         */
        @NameInMap("PcId")
        public String pcId;

        /**
         * <p>Lingjun Side Interconnection IPv4 Address</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.248.28</p>
         */
        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        /**
         * <p>The ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-2ze4i85p6vb9nwcan5xt0</p>
         */
        @NameInMap("VbrId")
        public String vbrId;

        /**
         * <p>VLAN ID of the VBR</p>
         * 
         * <strong>example:</strong>
         * <p>1042</p>
         */
        @NameInMap("VlanId")
        public String vlanId;

        public static GetVccResponseBodyContentAliyunRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentAliyunRouterInfo self = new GetVccResponseBodyContentAliyunRouterInfo();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentAliyunRouterInfo setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public GetVccResponseBodyContentAliyunRouterInfo setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public GetVccResponseBodyContentAliyunRouterInfo setPcId(String pcId) {
            this.pcId = pcId;
            return this;
        }
        public String getPcId() {
            return this.pcId;
        }

        public GetVccResponseBodyContentAliyunRouterInfo setPeerGatewayIp(String peerGatewayIp) {
            this.peerGatewayIp = peerGatewayIp;
            return this;
        }
        public String getPeerGatewayIp() {
            return this.peerGatewayIp;
        }

        public GetVccResponseBodyContentAliyunRouterInfo setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

        public GetVccResponseBodyContentAliyunRouterInfo setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

    }

    public static class GetVccResponseBodyContentCisRouterInfoCcInfos extends TeaModel {
        /**
         * <p>Leased Line ID</p>
         * 
         * <strong>example:</strong>
         * <p>cc-73aeex5o</p>
         */
        @NameInMap("CcId")
        public String ccId;

        /**
         * <p>Lingjun Side Interconnection IPv4 Address</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.248.26</p>
         */
        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        /**
         * <p>Lingjun Side Interconnection IPv4 Address</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.248.30</p>
         */
        @NameInMap("RemoteGatewayIp")
        public String remoteGatewayIp;

        /**
         * <p>The state of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Established</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Subnet mask</p>
         * 
         * <strong>example:</strong>
         * <p>255.255.255.248</p>
         */
        @NameInMap("SubnetMask")
        public String subnetMask;

        /**
         * <p>Vlan ID of the leased line</p>
         * 
         * <strong>example:</strong>
         * <p>Ethernet1042</p>
         */
        @NameInMap("VlanId")
        public String vlanId;

        public static GetVccResponseBodyContentCisRouterInfoCcInfos build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentCisRouterInfoCcInfos self = new GetVccResponseBodyContentCisRouterInfoCcInfos();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentCisRouterInfoCcInfos setCcId(String ccId) {
            this.ccId = ccId;
            return this;
        }
        public String getCcId() {
            return this.ccId;
        }

        public GetVccResponseBodyContentCisRouterInfoCcInfos setLocalGatewayIp(String localGatewayIp) {
            this.localGatewayIp = localGatewayIp;
            return this;
        }
        public String getLocalGatewayIp() {
            return this.localGatewayIp;
        }

        public GetVccResponseBodyContentCisRouterInfoCcInfos setRemoteGatewayIp(String remoteGatewayIp) {
            this.remoteGatewayIp = remoteGatewayIp;
            return this;
        }
        public String getRemoteGatewayIp() {
            return this.remoteGatewayIp;
        }

        public GetVccResponseBodyContentCisRouterInfoCcInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVccResponseBodyContentCisRouterInfoCcInfos setSubnetMask(String subnetMask) {
            this.subnetMask = subnetMask;
            return this;
        }
        public String getSubnetMask() {
            return this.subnetMask;
        }

        public GetVccResponseBodyContentCisRouterInfoCcInfos setVlanId(String vlanId) {
            this.vlanId = vlanId;
            return this;
        }
        public String getVlanId() {
            return this.vlanId;
        }

    }

    public static class GetVccResponseBodyContentCisRouterInfo extends TeaModel {
        /**
         * <p>Leased Line Information List</p>
         */
        @NameInMap("CcInfos")
        public java.util.List<GetVccResponseBodyContentCisRouterInfoCcInfos> ccInfos;

        /**
         * <p>The ID of the on-cloud router instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccr-1ms84am0</p>
         */
        @NameInMap("CcrId")
        public String ccrId;

        public static GetVccResponseBodyContentCisRouterInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentCisRouterInfo self = new GetVccResponseBodyContentCisRouterInfo();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentCisRouterInfo setCcInfos(java.util.List<GetVccResponseBodyContentCisRouterInfoCcInfos> ccInfos) {
            this.ccInfos = ccInfos;
            return this;
        }
        public java.util.List<GetVccResponseBodyContentCisRouterInfoCcInfos> getCcInfos() {
            return this.ccInfos;
        }

        public GetVccResponseBodyContentCisRouterInfo setCcrId(String ccrId) {
            this.ccrId = ccrId;
            return this;
        }
        public String getCcrId() {
            return this.ccrId;
        }

    }

    public static class GetVccResponseBodyContentErInfos extends TeaModel {
        /**
         * <p>Connections</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Connections")
        public Long connections;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678379917000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Description</p>
         * 
         * <strong>example:</strong>
         * <p>this is test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Lingjun HUB ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-p68b0jwn</p>
         */
        @NameInMap("ErId")
        public String erId;

        /**
         * <p>Lingjun HUB Instance Name</p>
         * 
         * <strong>example:</strong>
         * <p>er-1</p>
         */
        @NameInMap("ErName")
        public String erName;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1678379917000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Primary Zone</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("MasterZoneId")
        public String masterZoneId;

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>test message</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Lingjun HUB Region Information</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>Number of routing policy</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RouteMaps")
        public Long routeMaps;

        /**
         * <p>The status of the intervention entry. Valid value:</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166277</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        public static GetVccResponseBodyContentErInfos build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentErInfos self = new GetVccResponseBodyContentErInfos();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentErInfos setConnections(Long connections) {
            this.connections = connections;
            return this;
        }
        public Long getConnections() {
            return this.connections;
        }

        public GetVccResponseBodyContentErInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVccResponseBodyContentErInfos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetVccResponseBodyContentErInfos setErId(String erId) {
            this.erId = erId;
            return this;
        }
        public String getErId() {
            return this.erId;
        }

        public GetVccResponseBodyContentErInfos setErName(String erName) {
            this.erName = erName;
            return this;
        }
        public String getErName() {
            return this.erName;
        }

        public GetVccResponseBodyContentErInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVccResponseBodyContentErInfos setMasterZoneId(String masterZoneId) {
            this.masterZoneId = masterZoneId;
            return this;
        }
        public String getMasterZoneId() {
            return this.masterZoneId;
        }

        public GetVccResponseBodyContentErInfos setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVccResponseBodyContentErInfos setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVccResponseBodyContentErInfos setRouteMaps(Long routeMaps) {
            this.routeMaps = routeMaps;
            return this;
        }
        public Long getRouteMaps() {
            return this.routeMaps;
        }

        public GetVccResponseBodyContentErInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVccResponseBodyContentErInfos setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

    public static class GetVccResponseBodyContentTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>You cannot specify an empty string as a tag key. It can be up to 64 characters in length and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * <p>You can specify at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-vcc</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The value of the tag that is added to the resource.</p>
         * <p>The tag value can be empty or a string of up to 128 characters. It cannot start with aliyun or acs:, and cannot contain http:// or https://.</p>
         * <p>Each key-value pair must be unique. You can specify values for at most 20 tag keys in each call.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-group-1</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetVccResponseBodyContentTags build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentTags self = new GetVccResponseBodyContentTags();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetVccResponseBodyContentTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class GetVccResponseBodyContentVbrInfosVbrBgpPeers extends TeaModel {
        /**
         * <p>BGP Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>bgpg-2ze2sit2vakrkapvy****</p>
         */
        @NameInMap("BgpGroupId")
        public String bgpGroupId;

        /**
         * <p>BGP peer ID</p>
         * 
         * <strong>example:</strong>
         * <p>bgp-uf6heugif9enu48rj****</p>
         */
        @NameInMap("BgpPeerId")
        public String bgpPeerId;

        /**
         * <p>Peer AS No.</p>
         * 
         * <strong>example:</strong>
         * <p>98765****</p>
         */
        @NameInMap("PeerAsn")
        public String peerAsn;

        /**
         * <p>BGP peer IP address</p>
         * 
         * <strong>example:</strong>
         * <p>169.254.****</p>
         */
        @NameInMap("PeerIpAddress")
        public String peerIpAddress;

        /**
         * <p>The status of the BGP peer. Valid values:</p>
         * <ul>
         * <li>Pending: pending</li>
         * <li>Available: The route is available.</li>
         * <li>Modifying: being modified</li>
         * <li>Deleting: The IPv4 gateway is being deleted.</li>
         * <li>Deleted</li>
         * <li>Not Available</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetVccResponseBodyContentVbrInfosVbrBgpPeers build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentVbrInfosVbrBgpPeers self = new GetVccResponseBodyContentVbrInfosVbrBgpPeers();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentVbrInfosVbrBgpPeers setBgpGroupId(String bgpGroupId) {
            this.bgpGroupId = bgpGroupId;
            return this;
        }
        public String getBgpGroupId() {
            return this.bgpGroupId;
        }

        public GetVccResponseBodyContentVbrInfosVbrBgpPeers setBgpPeerId(String bgpPeerId) {
            this.bgpPeerId = bgpPeerId;
            return this;
        }
        public String getBgpPeerId() {
            return this.bgpPeerId;
        }

        public GetVccResponseBodyContentVbrInfosVbrBgpPeers setPeerAsn(String peerAsn) {
            this.peerAsn = peerAsn;
            return this;
        }
        public String getPeerAsn() {
            return this.peerAsn;
        }

        public GetVccResponseBodyContentVbrInfosVbrBgpPeers setPeerIpAddress(String peerIpAddress) {
            this.peerIpAddress = peerIpAddress;
            return this;
        }
        public String getPeerIpAddress() {
            return this.peerIpAddress;
        }

        public GetVccResponseBodyContentVbrInfosVbrBgpPeers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetVccResponseBodyContentVbrInfos extends TeaModel {
        /**
         * <p>CEN ID</p>
         * 
         * <strong>example:</strong>
         * <p>cen-cx0qua8q6cm4z9****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1683250981000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1673578603000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The status of the VBR. Valid values:</p>
         * <ul>
         * <li>unconfirmed</li>
         * <li>active: The VPN gateway is in a normal state.</li>
         * <li>terminating: The connection is being terminated.</li>
         * <li>terminated: The connection is terminated.</li>
         * <li>recovering: The task is being recovered.</li>
         * <li>deleting: The GDN is being deleted.</li>
         * <li>Available: The service is available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>BGP neighbor information list</p>
         */
        @NameInMap("VbrBgpPeers")
        public java.util.List<GetVccResponseBodyContentVbrInfosVbrBgpPeers> vbrBgpPeers;

        /**
         * <p>The ID of the border router.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-wz96agu9h3d50z****</p>
         */
        @NameInMap("VbrId")
        public String vbrId;

        public static GetVccResponseBodyContentVbrInfos build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentVbrInfos self = new GetVccResponseBodyContentVbrInfos();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentVbrInfos setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public GetVccResponseBodyContentVbrInfos setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetVccResponseBodyContentVbrInfos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVccResponseBodyContentVbrInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVccResponseBodyContentVbrInfos setVbrBgpPeers(java.util.List<GetVccResponseBodyContentVbrInfosVbrBgpPeers> vbrBgpPeers) {
            this.vbrBgpPeers = vbrBgpPeers;
            return this;
        }
        public java.util.List<GetVccResponseBodyContentVbrInfosVbrBgpPeers> getVbrBgpPeers() {
            return this.vbrBgpPeers;
        }

        public GetVccResponseBodyContentVbrInfos setVbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }
        public String getVbrId() {
            return this.vbrId;
        }

    }

    public static class GetVccResponseBodyContentVpdBaseInfo extends TeaModel {
        /**
         * <p>Network address segment</p>
         * 
         * <strong>example:</strong>
         * <p>172.18.0.0/24</p>
         */
        @NameInMap("Cidr")
        public String cidr;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1678379917000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-ppdunxzc</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>Lingjun CIDR block instance name</p>
         * 
         * <strong>example:</strong>
         * <p>yzp-rg-test3</p>
         */
        @NameInMap("VpdName")
        public String vpdName;

        public static GetVccResponseBodyContentVpdBaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContentVpdBaseInfo self = new GetVccResponseBodyContentVpdBaseInfo();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContentVpdBaseInfo setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public GetVccResponseBodyContentVpdBaseInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVccResponseBodyContentVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetVccResponseBodyContentVpdBaseInfo setVpdName(String vpdName) {
            this.vpdName = vpdName;
            return this;
        }
        public String getVpdName() {
            return this.vpdName;
        }

    }

    public static class GetVccResponseBodyContent extends TeaModel {
        /**
         * <p>Express Connect circuit access point ID:</p>
         * <ul>
         * <li><strong>ap-cn-wulanchabu-jn-ts-A</strong>: Ulanqab-Jining-A</li>
         * <li><strong>ap-cn-heyuan-yc-ts-SA127</strong>: Heyuan-Yuancheng-A</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ap-cn-wulanchabu-jn-ts-A</p>
         */
        @NameInMap("AccessPointId")
        public String accessPointId;

        /**
         * <p>Alibaba Cloud route information list</p>
         */
        @NameInMap("AliyunRouterInfo")
        public java.util.List<GetVccResponseBodyContentAliyunRouterInfo> aliyunRouterInfo;

        /**
         * <p>Whether Lingjun HUB has been bound to a network instance</p>
         * <ul>
         * <li><strong>true</strong>: Bound</li>
         * <li><strong>false</strong>: unbound</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AttachErStatus")
        public Boolean attachErStatus;

        /**
         * <p>bandwidth</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The bandwidth of the port.</p>
         * 
         * <strong>example:</strong>
         * <p>1G</p>
         */
        @NameInMap("BandwidthStr")
        public String bandwidthStr;

        /**
         * <p>BGP AS number</p>
         * 
         * <strong>example:</strong>
         * <p>45644</p>
         */
        @NameInMap("BgpAsn")
        public String bgpAsn;

        /**
         * <p>BGP CIDR block</p>
         * 
         * <strong>example:</strong>
         * <p>10.4.0.0/24</p>
         */
        @NameInMap("BgpCidr")
        public String bgpCidr;

        /**
         * <p>The ID of the CEN instance; <a href="https://help.aliyun.com/document_detail/181681.html">What is the CEN?</a></p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/468215.htm">DescribeCens</a> to query the information of CEN instances under the current Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-m2iskbojlvda5w65fp</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>Account to which the CEN belongs</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166279</p>
         */
        @NameInMap("CenOwnerId")
        public String cenOwnerId;

        /**
         * <p>Lingjun Network Routing Information List</p>
         */
        @NameInMap("CisRouterInfo")
        public java.util.List<GetVccResponseBodyContentCisRouterInfo> cisRouterInfo;

        /**
         * <p>Commodity code</p>
         * 
         * <strong>example:</strong>
         * <p>bccluster_cloudconnectionpre_public_cn</p>
         */
        @NameInMap("CommodityCode")
        public String commodityCode;

        /**
         * <p>The connection mode. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>CENTR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CENTR</p>
         */
        @NameInMap("ConnectionType")
        public String connectionType;

        /**
         * <p>The time when the data address was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Current Node</p>
         * 
         * <strong>example:</strong>
         * <p>task-xxx-node-x</p>
         */
        @NameInMap("CurrentNode")
        public String currentNode;

        /**
         * <p>Cycle</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>List of bound Lingjun HUB information</p>
         */
        @NameInMap("ErInfos")
        public java.util.List<GetVccResponseBodyContentErInfos> erInfos;

        /**
         * <p>The time when the application expired.</p>
         * 
         * <strong>example:</strong>
         * <p>1678379917000</p>
         */
        @NameInMap("ExpirationDate")
        public String expirationDate;

        /**
         * <p>The time when the agent was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1648085472000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The billing method for network usage.</p>
         * <ul>
         * <li><strong>PayByTraffic</strong>: pay-by-traffic</li>
         * <li><strong>PayByBandwidth</strong>: pay-by-bandwidth</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayByBandwidth</p>
         */
        @NameInMap("InternetChargeType")
        public String internetChargeType;

        /**
         * <p>The connectivity provider of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>CO</strong>: other connectivity providers in the Chinese mainland</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CO</p>
         */
        @NameInMap("LineOperator")
        public String lineOperator;

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>You don\&quot;t have the permission of this operation, action=eflo:GetVcc, arn=acs:eflo:cn-heyuan:1263399219805497:vcc/vcc-cn-fhh3yxjwe01, resourceGroup=null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PrePay</p>
         */
        @NameInMap("PayType")
        public String payType;

        /**
         * <p>The port type of the Express Connect circuit. Valid values:</p>
         * <ul>
         * <li><strong>100GBase-LR</strong>: 100,000 megabytes of single-mode optical port (10 km)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100GBase-LR</p>
         */
        @NameInMap("PortType")
        public String portType;

        /**
         * <p>The billing cycle. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong>: Billed on a monthly basis</li>
         * <li><strong>Year</strong>: Billed on an annual basis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        @NameInMap("PricingCycle")
        public String pricingCycle;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of your Alibaba Cloud resource group.</p>
         * <p>For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/94475.htm">Resource groups</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2l4sq6l7unhi</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>Specification; value:</p>
         * <ul>
         * <li><strong>Large</strong>: Large</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Large</p>
         */
        @NameInMap("Spec")
        public String spec;

        /**
         * <p>The status of the cache reserve instance. Valid values:</p>
         * <ul>
         * <li><strong>Available</strong>: Normal.</li>
         * <li><strong>Not Available</strong>: Not available.</li>
         * <li><strong>Executing</strong>: The task is being executed.</li>
         * <li><strong>Deleting</strong>: The account is being deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag information.</p>
         * <p>You can specify up to 20 tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetVccResponseBodyContentTags> tags;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1620939556166279</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The ID of the vSwitch. <a href="https://help.aliyun.com/document_detail/100380.html">Virtual Private Cloud VSwitch</a>.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35748.html">DescribeVSwitches</a> operation to query created vSwitches.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6u8473r84e6n1n19he5</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>Information list of border routers</p>
         */
        @NameInMap("VbrInfos")
        public java.util.List<GetVccResponseBodyContentVbrInfos> vbrInfos;

        /**
         * <p>The ID of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-cqf2xh40101</p>
         */
        @NameInMap("VccId")
        public String vccId;

        /**
         * <p>The name of the Lingjun connection instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-heyuan-backup</p>
         */
        @NameInMap("VccName")
        public String vccName;

        /**
         * <p>Virtual Private Cloud IDs; <a href="https://help.aliyun.com/document_detail/34217.html">What is Virtual Private Cloud</a></p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/35739.html#demo-0">DescribeVpcs</a> operation to query the specified VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-j6ctp4n75306phv5tmpsm</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>Lingjun network segment information (applicable to the scene where the old version of Lingjun connection is directly bound to Lingjun network segment)</p>
         */
        @NameInMap("VpdBaseInfo")
        public GetVccResponseBodyContentVpdBaseInfo vpdBaseInfo;

        /**
         * <p>Lingjun CIDR block instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpd-d3isyds4</p>
         */
        @NameInMap("VpdId")
        public String vpdId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu-b</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static GetVccResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            GetVccResponseBodyContent self = new GetVccResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public GetVccResponseBodyContent setAccessPointId(String accessPointId) {
            this.accessPointId = accessPointId;
            return this;
        }
        public String getAccessPointId() {
            return this.accessPointId;
        }

        public GetVccResponseBodyContent setAliyunRouterInfo(java.util.List<GetVccResponseBodyContentAliyunRouterInfo> aliyunRouterInfo) {
            this.aliyunRouterInfo = aliyunRouterInfo;
            return this;
        }
        public java.util.List<GetVccResponseBodyContentAliyunRouterInfo> getAliyunRouterInfo() {
            return this.aliyunRouterInfo;
        }

        public GetVccResponseBodyContent setAttachErStatus(Boolean attachErStatus) {
            this.attachErStatus = attachErStatus;
            return this;
        }
        public Boolean getAttachErStatus() {
            return this.attachErStatus;
        }

        public GetVccResponseBodyContent setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetVccResponseBodyContent setBandwidthStr(String bandwidthStr) {
            this.bandwidthStr = bandwidthStr;
            return this;
        }
        public String getBandwidthStr() {
            return this.bandwidthStr;
        }

        public GetVccResponseBodyContent setBgpAsn(String bgpAsn) {
            this.bgpAsn = bgpAsn;
            return this;
        }
        public String getBgpAsn() {
            return this.bgpAsn;
        }

        public GetVccResponseBodyContent setBgpCidr(String bgpCidr) {
            this.bgpCidr = bgpCidr;
            return this;
        }
        public String getBgpCidr() {
            return this.bgpCidr;
        }

        public GetVccResponseBodyContent setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public GetVccResponseBodyContent setCenOwnerId(String cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public String getCenOwnerId() {
            return this.cenOwnerId;
        }

        public GetVccResponseBodyContent setCisRouterInfo(java.util.List<GetVccResponseBodyContentCisRouterInfo> cisRouterInfo) {
            this.cisRouterInfo = cisRouterInfo;
            return this;
        }
        public java.util.List<GetVccResponseBodyContentCisRouterInfo> getCisRouterInfo() {
            return this.cisRouterInfo;
        }

        public GetVccResponseBodyContent setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public GetVccResponseBodyContent setConnectionType(String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        public String getConnectionType() {
            return this.connectionType;
        }

        public GetVccResponseBodyContent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetVccResponseBodyContent setCurrentNode(String currentNode) {
            this.currentNode = currentNode;
            return this;
        }
        public String getCurrentNode() {
            return this.currentNode;
        }

        public GetVccResponseBodyContent setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetVccResponseBodyContent setErInfos(java.util.List<GetVccResponseBodyContentErInfos> erInfos) {
            this.erInfos = erInfos;
            return this;
        }
        public java.util.List<GetVccResponseBodyContentErInfos> getErInfos() {
            return this.erInfos;
        }

        public GetVccResponseBodyContent setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public GetVccResponseBodyContent setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetVccResponseBodyContent setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public GetVccResponseBodyContent setLineOperator(String lineOperator) {
            this.lineOperator = lineOperator;
            return this;
        }
        public String getLineOperator() {
            return this.lineOperator;
        }

        public GetVccResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVccResponseBodyContent setPayType(String payType) {
            this.payType = payType;
            return this;
        }
        public String getPayType() {
            return this.payType;
        }

        public GetVccResponseBodyContent setPortType(String portType) {
            this.portType = portType;
            return this;
        }
        public String getPortType() {
            return this.portType;
        }

        public GetVccResponseBodyContent setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public GetVccResponseBodyContent setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetVccResponseBodyContent setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetVccResponseBodyContent setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetVccResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetVccResponseBodyContent setTags(java.util.List<GetVccResponseBodyContentTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetVccResponseBodyContentTags> getTags() {
            return this.tags;
        }

        public GetVccResponseBodyContent setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public GetVccResponseBodyContent setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetVccResponseBodyContent setVbrInfos(java.util.List<GetVccResponseBodyContentVbrInfos> vbrInfos) {
            this.vbrInfos = vbrInfos;
            return this;
        }
        public java.util.List<GetVccResponseBodyContentVbrInfos> getVbrInfos() {
            return this.vbrInfos;
        }

        public GetVccResponseBodyContent setVccId(String vccId) {
            this.vccId = vccId;
            return this;
        }
        public String getVccId() {
            return this.vccId;
        }

        public GetVccResponseBodyContent setVccName(String vccName) {
            this.vccName = vccName;
            return this;
        }
        public String getVccName() {
            return this.vccName;
        }

        public GetVccResponseBodyContent setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetVccResponseBodyContent setVpdBaseInfo(GetVccResponseBodyContentVpdBaseInfo vpdBaseInfo) {
            this.vpdBaseInfo = vpdBaseInfo;
            return this;
        }
        public GetVccResponseBodyContentVpdBaseInfo getVpdBaseInfo() {
            return this.vpdBaseInfo;
        }

        public GetVccResponseBodyContent setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

        public GetVccResponseBodyContent setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
