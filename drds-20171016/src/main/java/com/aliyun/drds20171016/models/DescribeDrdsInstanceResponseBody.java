// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeDrdsInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDrdsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceResponseBody self = new DescribeDrdsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceResponseBody setData(DescribeDrdsInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDrdsInstanceResponseBodyData getData() {
        return this.data;
    }

    public DescribeDrdsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDrdsInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDrdsInstanceResponseBodyDataVipsVip extends TeaModel {
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

        public static DescribeDrdsInstanceResponseBodyDataVipsVip build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyDataVipsVip self = new DescribeDrdsInstanceResponseBodyDataVipsVip();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeDrdsInstanceResponseBodyDataVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class DescribeDrdsInstanceResponseBodyDataVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<DescribeDrdsInstanceResponseBodyDataVipsVip> vip;

        public static DescribeDrdsInstanceResponseBodyDataVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyDataVips self = new DescribeDrdsInstanceResponseBodyDataVips();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyDataVips setVip(java.util.List<DescribeDrdsInstanceResponseBodyDataVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<DescribeDrdsInstanceResponseBodyDataVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class DescribeDrdsInstanceResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DrdsInstanceId")
        public String drdsInstanceId;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Long version;

        @NameInMap("Vips")
        public DescribeDrdsInstanceResponseBodyDataVips vips;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDrdsInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDrdsInstanceResponseBodyData self = new DescribeDrdsInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDrdsInstanceResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDrdsInstanceResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDrdsInstanceResponseBodyData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public DescribeDrdsInstanceResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDrdsInstanceResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public DescribeDrdsInstanceResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDrdsInstanceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDrdsInstanceResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public DescribeDrdsInstanceResponseBodyData setVips(DescribeDrdsInstanceResponseBodyDataVips vips) {
            this.vips = vips;
            return this;
        }
        public DescribeDrdsInstanceResponseBodyDataVips getVips() {
            return this.vips;
        }

        public DescribeDrdsInstanceResponseBodyData setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public DescribeDrdsInstanceResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
