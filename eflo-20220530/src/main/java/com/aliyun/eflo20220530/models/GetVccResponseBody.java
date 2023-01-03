// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class GetVccResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Content")
    public GetVccResponseBodyContent content;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static GetVccResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVccResponseBody self = new GetVccResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("PcId")
        public String pcId;

        @NameInMap("PeerGatewayIp")
        public String peerGatewayIp;

        @NameInMap("VbrId")
        public String vbrId;

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
        @NameInMap("CcId")
        public String ccId;

        @NameInMap("LocalGatewayIp")
        public String localGatewayIp;

        @NameInMap("RemoteGatewayIp")
        public String remoteGatewayIp;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubnetMask")
        public String subnetMask;

        // vlanid
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
        @NameInMap("CcInfos")
        public java.util.List<GetVccResponseBodyContentCisRouterInfoCcInfos> ccInfos;

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

    public static class GetVccResponseBodyContentVpdBaseInfo extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("VpdId")
        public String vpdId;

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

        public GetVccResponseBodyContentVpdBaseInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetVccResponseBodyContentVpdBaseInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetVccResponseBodyContentVpdBaseInfo setVpdId(String vpdId) {
            this.vpdId = vpdId;
            return this;
        }
        public String getVpdId() {
            return this.vpdId;
        }

    }

    public static class GetVccResponseBodyContent extends TeaModel {
        @NameInMap("AccessPointId")
        public String accessPointId;

        @NameInMap("AliyunRouterInfo")
        public java.util.List<GetVccResponseBodyContentAliyunRouterInfo> aliyunRouterInfo;

        @NameInMap("BandwidthStr")
        public String bandwidthStr;

        @NameInMap("BgpCidr")
        public String bgpCidr;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CisRouterInfo")
        public java.util.List<GetVccResponseBodyContentCisRouterInfo> cisRouterInfo;

        @NameInMap("CommodityCode")
        public String commodityCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CurrentNode")
        public String currentNode;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("LineOperator")
        public String lineOperator;

        @NameInMap("Message")
        public String message;

        @NameInMap("PayType")
        public String payType;

        @NameInMap("PortType")
        public String portType;

        @NameInMap("PricingCycle")
        public String pricingCycle;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public String status;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VccId")
        public String vccId;

        @NameInMap("VccName")
        public String vccName;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpdBaseInfo")
        public GetVccResponseBodyContentVpdBaseInfo vpdBaseInfo;

        @NameInMap("VpdId")
        public String vpdId;

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

        public GetVccResponseBodyContent setBandwidthStr(String bandwidthStr) {
            this.bandwidthStr = bandwidthStr;
            return this;
        }
        public String getBandwidthStr() {
            return this.bandwidthStr;
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

    }

}
