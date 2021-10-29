// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class QueryInstanceInfoByConnResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryInstanceInfoByConnResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryInstanceInfoByConnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceInfoByConnResponseBody self = new QueryInstanceInfoByConnResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceInfoByConnResponseBody setData(QueryInstanceInfoByConnResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryInstanceInfoByConnResponseBodyData getData() {
        return this.data;
    }

    public QueryInstanceInfoByConnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceInfoByConnResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryInstanceInfoByConnResponseBodyDataVipsVip extends TeaModel {
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

        public static QueryInstanceInfoByConnResponseBodyDataVipsVip build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceInfoByConnResponseBodyDataVipsVip self = new QueryInstanceInfoByConnResponseBodyDataVipsVip();
            return TeaModel.build(map, self);
        }

        public QueryInstanceInfoByConnResponseBodyDataVipsVip setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public QueryInstanceInfoByConnResponseBodyDataVipsVip setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public QueryInstanceInfoByConnResponseBodyDataVipsVip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryInstanceInfoByConnResponseBodyDataVipsVip setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public QueryInstanceInfoByConnResponseBodyDataVipsVip setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class QueryInstanceInfoByConnResponseBodyDataVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<QueryInstanceInfoByConnResponseBodyDataVipsVip> vip;

        public static QueryInstanceInfoByConnResponseBodyDataVips build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceInfoByConnResponseBodyDataVips self = new QueryInstanceInfoByConnResponseBodyDataVips();
            return TeaModel.build(map, self);
        }

        public QueryInstanceInfoByConnResponseBodyDataVips setVip(java.util.List<QueryInstanceInfoByConnResponseBodyDataVipsVip> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<QueryInstanceInfoByConnResponseBodyDataVipsVip> getVip() {
            return this.vip;
        }

    }

    public static class QueryInstanceInfoByConnResponseBodyData extends TeaModel {
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

        @NameInMap("SpecTypeId")
        public String specTypeId;

        @NameInMap("SpecTypeName")
        public String specTypeName;

        @NameInMap("Specification")
        public String specification;

        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("Version")
        public Long version;

        @NameInMap("Vips")
        public QueryInstanceInfoByConnResponseBodyDataVips vips;

        @NameInMap("VpcCloudInstanceId")
        public String vpcCloudInstanceId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static QueryInstanceInfoByConnResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryInstanceInfoByConnResponseBodyData self = new QueryInstanceInfoByConnResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryInstanceInfoByConnResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryInstanceInfoByConnResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryInstanceInfoByConnResponseBodyData setDrdsInstanceId(String drdsInstanceId) {
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }
        public String getDrdsInstanceId() {
            return this.drdsInstanceId;
        }

        public QueryInstanceInfoByConnResponseBodyData setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public QueryInstanceInfoByConnResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public QueryInstanceInfoByConnResponseBodyData setSpecTypeId(String specTypeId) {
            this.specTypeId = specTypeId;
            return this;
        }
        public String getSpecTypeId() {
            return this.specTypeId;
        }

        public QueryInstanceInfoByConnResponseBodyData setSpecTypeName(String specTypeName) {
            this.specTypeName = specTypeName;
            return this;
        }
        public String getSpecTypeName() {
            return this.specTypeName;
        }

        public QueryInstanceInfoByConnResponseBodyData setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public QueryInstanceInfoByConnResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryInstanceInfoByConnResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryInstanceInfoByConnResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

        public QueryInstanceInfoByConnResponseBodyData setVips(QueryInstanceInfoByConnResponseBodyDataVips vips) {
            this.vips = vips;
            return this;
        }
        public QueryInstanceInfoByConnResponseBodyDataVips getVips() {
            return this.vips;
        }

        public QueryInstanceInfoByConnResponseBodyData setVpcCloudInstanceId(String vpcCloudInstanceId) {
            this.vpcCloudInstanceId = vpcCloudInstanceId;
            return this;
        }
        public String getVpcCloudInstanceId() {
            return this.vpcCloudInstanceId;
        }

        public QueryInstanceInfoByConnResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
