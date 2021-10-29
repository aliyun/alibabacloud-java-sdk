// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstancesResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsInstancesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstancesResponseBody self = new DescribeDrdsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstancesResponseBody setData(DescribeDrdsInstancesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstancesResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId extends TeaModel {
        @NameInMap("instId")
        public java.util.List<String> instId;

        public static DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId self = new DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId setInstId(java.util.List<String> instId) {
            this.instId = instId;
            return this;
        }
        public java.util.List<String> getInstId() {
            return this.instId;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyDataInstanceVipsVip extends TeaModel {
        @NameInMap("IP")
        public String IP;

        @NameInMap("Port")
        public String port;

        @NameInMap("Type")
        public String type;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VswitchId")
        public String vswitchId;

        public static DescribeDrdsInstancesResponseBodyDataInstanceVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyDataInstanceVipsVip self = new DescribeDrdsInstancesResponseBodyDataInstanceVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyDataInstanceVipsVip setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeDrdsInstancesResponseBodyDataInstanceVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstancesResponseBodyDataInstanceVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstancesResponseBodyDataInstanceVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstancesResponseBodyDataInstanceVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyDataInstanceVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<DescribeDrdsInstancesResponseBodyDataInstanceVipsVip> vip;

        public static DescribeDrdsInstancesResponseBodyDataInstanceVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyDataInstanceVips self = new DescribeDrdsInstancesResponseBodyDataInstanceVips();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyDataInstanceVips setVip(java.util.List<DescribeDrdsInstancesResponseBodyDataInstanceVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<DescribeDrdsInstancesResponseBodyDataInstanceVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyDataInstance extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        @NameInMap("InstRole")
        public String instRole;

        @NameInMap("MasterInstId")
        public String masterInstId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SlaveInstId")
        public DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId slaveInstId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Long version;

        @NameInMap("Vips")
        public DescribeDrdsInstancesResponseBodyDataInstanceVips vips;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDrdsInstancesResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyDataInstance self = new DescribeDrdsInstancesResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setInstRole(String instRole) {
            this.instRole = instRole;
            return this;
        }
        public String getInstRole() {
            return this.instRole;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setMasterInstId(String masterInstId) {
            this.masterInstId = masterInstId;
            return this;
        }
        public String getMasterInstId() {
            return this.masterInstId;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setSlaveInstId(DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId slaveInstId) {
            this.slaveInstId = slaveInstId;
            return this;
        }
        public DescribeDrdsInstancesResponseBodyDataInstanceSlaveInstId getSlaveInstId() {
            return this.slaveInstId;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setVips(DescribeDrdsInstancesResponseBodyDataInstanceVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstancesResponseBodyDataInstanceVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstancesResponseBodyDataInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDrdsInstancesResponseBodyData extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeDrdsInstancesResponseBodyDataInstance> instance;

        public static DescribeDrdsInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstancesResponseBodyData self = new DescribeDrdsInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstancesResponseBodyData setInstance(java.util.List<DescribeDrdsInstancesResponseBodyDataInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDrdsInstancesResponseBodyDataInstance> getInstance() {
            return this.instance;
        }

    }

}
