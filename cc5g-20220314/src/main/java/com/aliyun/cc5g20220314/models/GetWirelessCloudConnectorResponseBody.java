// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class GetWirelessCloudConnectorResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Business</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>20000</p>
     */
    @NameInMap("CardCount")
    public String cardCount;

    /**
     * <strong>example:</strong>
     * <p>2022-3-15 22:20:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>dp-xxxx</p>
     */
    @NameInMap("DataPackageId")
    public String dataPackageId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("DataPackageType")
    public String dataPackageType;

    /**
     * <strong>example:</strong>
     * <p>cc5g-test</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("Features")
    public java.util.List<String> features;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("NetLinks")
    public java.util.List<GetWirelessCloudConnectorResponseBodyNetLinks> netLinks;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>1651FBB6-4FBF-49FF-A9F5-DF5D696C7EC6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>CC5GCCIoT</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <strong>example:</strong>
     * <p>Available</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("UseCase")
    public String useCase;

    /**
     * <strong>example:</strong>
     * <p>cc5gg-****</p>
     */
    @NameInMap("WirelessCloudConnectorGroupId")
    public String wirelessCloudConnectorGroupId;

    /**
     * <strong>example:</strong>
     * <p>cc5g-xxxx</p>
     */
    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static GetWirelessCloudConnectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWirelessCloudConnectorResponseBody self = new GetWirelessCloudConnectorResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWirelessCloudConnectorResponseBody setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetWirelessCloudConnectorResponseBody setCardCount(String cardCount) {
        this.cardCount = cardCount;
        return this;
    }
    public String getCardCount() {
        return this.cardCount;
    }

    public GetWirelessCloudConnectorResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetWirelessCloudConnectorResponseBody setDataPackageId(String dataPackageId) {
        this.dataPackageId = dataPackageId;
        return this;
    }
    public String getDataPackageId() {
        return this.dataPackageId;
    }

    public GetWirelessCloudConnectorResponseBody setDataPackageType(String dataPackageType) {
        this.dataPackageType = dataPackageType;
        return this;
    }
    public String getDataPackageType() {
        return this.dataPackageType;
    }

    public GetWirelessCloudConnectorResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetWirelessCloudConnectorResponseBody setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public GetWirelessCloudConnectorResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetWirelessCloudConnectorResponseBody setNetLinks(java.util.List<GetWirelessCloudConnectorResponseBodyNetLinks> netLinks) {
        this.netLinks = netLinks;
        return this;
    }
    public java.util.List<GetWirelessCloudConnectorResponseBodyNetLinks> getNetLinks() {
        return this.netLinks;
    }

    public GetWirelessCloudConnectorResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetWirelessCloudConnectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWirelessCloudConnectorResponseBody setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetWirelessCloudConnectorResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetWirelessCloudConnectorResponseBody setUseCase(String useCase) {
        this.useCase = useCase;
        return this;
    }
    public String getUseCase() {
        return this.useCase;
    }

    public GetWirelessCloudConnectorResponseBody setWirelessCloudConnectorGroupId(String wirelessCloudConnectorGroupId) {
        this.wirelessCloudConnectorGroupId = wirelessCloudConnectorGroupId;
        return this;
    }
    public String getWirelessCloudConnectorGroupId() {
        return this.wirelessCloudConnectorGroupId;
    }

    public GetWirelessCloudConnectorResponseBody setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

    public static class GetWirelessCloudConnectorResponseBodyNetLinks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bjaliyun01s.5gbj.bjiot</p>
         */
        @NameInMap("APN")
        public String APN;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>11111111111</p>
         */
        @NameInMap("GrantAliUid")
        public String grantAliUid;

        /**
         * <strong>example:</strong>
         * <p>Telecom</p>
         */
        @NameInMap("ISP")
        public String ISP;

        /**
         * <p>代表创建时间的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>代表资源名称的资源属性字段</p>
         * 
         * <strong>example:</strong>
         * <p>cciot-xxxx</p>
         */
        @NameInMap("NetLinkId")
        public String netLinkId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>Attached</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("Type")
        public String type;

        @NameInMap("VSwitchs")
        public java.util.List<String> vSwitchs;

        /**
         * <strong>example:</strong>
         * <p>vpc-xxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static GetWirelessCloudConnectorResponseBodyNetLinks build(java.util.Map<String, ?> map) throws Exception {
            GetWirelessCloudConnectorResponseBodyNetLinks self = new GetWirelessCloudConnectorResponseBodyNetLinks();
            return TeaModel.build(map, self);
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setAPN(String APN) {
            this.APN = APN;
            return this;
        }
        public String getAPN() {
            return this.APN;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setGrantAliUid(String grantAliUid) {
            this.grantAliUid = grantAliUid;
            return this;
        }
        public String getGrantAliUid() {
            return this.grantAliUid;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setISP(String ISP) {
            this.ISP = ISP;
            return this;
        }
        public String getISP() {
            return this.ISP;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setNetLinkId(String netLinkId) {
            this.netLinkId = netLinkId;
            return this;
        }
        public String getNetLinkId() {
            return this.netLinkId;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setVSwitchs(java.util.List<String> vSwitchs) {
            this.vSwitchs = vSwitchs;
            return this;
        }
        public java.util.List<String> getVSwitchs() {
            return this.vSwitchs;
        }

        public GetWirelessCloudConnectorResponseBodyNetLinks setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
