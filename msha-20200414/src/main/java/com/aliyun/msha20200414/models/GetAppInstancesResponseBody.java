// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetAppInstancesResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetAppInstancesResponseBodyData> data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("ip")
    public String ip;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("message")
    public String message;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("httpCode")
    public Integer httpCode;

    public static GetAppInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstancesResponseBody self = new GetAppInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppInstancesResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetAppInstancesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppInstancesResponseBody setData(java.util.List<GetAppInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAppInstancesResponseBodyData> getData() {
        return this.data;
    }

    public GetAppInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAppInstancesResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetAppInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetAppInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppInstancesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetAppInstancesResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetAppInstancesResponseBodyData extends TeaModel {
        // 宿主机IP
        @NameInMap("HostIp")
        public String hostIp;

        // VPC网络ID
        @NameInMap("VpcId")
        public String vpcId;

        // K8s私网IP
        @NameInMap("PrivateIp")
        public String privateIp;

        // 部署类型，取值 Docker/ECS
        @NameInMap("DeviceType")
        public String deviceType;

        // ECS实例ID
        @NameInMap("InstanceId")
        public String instanceId;

        // 单元标识
        @NameInMap("UnitFlag")
        public String unitFlag;

        // 最近一次心跳上报时间
        @NameInMap("LastHeartBeatTime")
        public Long lastHeartBeatTime;

        // 应用名称
        @NameInMap("AppName")
        public String appName;

        // MSHA-SDK/Agent版本号
        @NameInMap("Version")
        public String version;

        // 地域ID
        @NameInMap("Region")
        public Long region;

        // 可用区ID
        @NameInMap("Zone")
        public String zone;

        // 单元格标识
        @NameInMap("CellFlag")
        public String cellFlag;

        // 应用所对应的命名空间ID列表
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static GetAppInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppInstancesResponseBodyData self = new GetAppInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppInstancesResponseBodyData setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public GetAppInstancesResponseBodyData setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public GetAppInstancesResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public GetAppInstancesResponseBodyData setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public GetAppInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAppInstancesResponseBodyData setUnitFlag(String unitFlag) {
            this.unitFlag = unitFlag;
            return this;
        }
        public String getUnitFlag() {
            return this.unitFlag;
        }

        public GetAppInstancesResponseBodyData setLastHeartBeatTime(Long lastHeartBeatTime) {
            this.lastHeartBeatTime = lastHeartBeatTime;
            return this;
        }
        public Long getLastHeartBeatTime() {
            return this.lastHeartBeatTime;
        }

        public GetAppInstancesResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetAppInstancesResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetAppInstancesResponseBodyData setRegion(Long region) {
            this.region = region;
            return this;
        }
        public Long getRegion() {
            return this.region;
        }

        public GetAppInstancesResponseBodyData setZone(String zone) {
            this.zone = zone;
            return this;
        }
        public String getZone() {
            return this.zone;
        }

        public GetAppInstancesResponseBodyData setCellFlag(String cellFlag) {
            this.cellFlag = cellFlag;
            return this;
        }
        public String getCellFlag() {
            return this.cellFlag;
        }

        public GetAppInstancesResponseBodyData setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

}
