// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<ListInstancesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListInstancesResponseBody setData(java.util.List<ListInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListInstancesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstancesResponseBodyData extends TeaModel {
        @NameInMap("AppClusterId")
        public String appClusterId;

        @NameInMap("AppVersion")
        public String appVersion;

        @NameInMap("DbPassword")
        public String dbPassword;

        @NameInMap("DbUrl")
        public String dbUrl;

        @NameInMap("DbUserName")
        public String dbUserName;

        @NameInMap("EndDate")
        public Long endDate;

        @NameInMap("EnvironmentId")
        public Long environmentId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageVersion")
        public String imageVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("IsCreatedRedis")
        public Boolean isCreatedRedis;

        @NameInMap("IsCreatedSlb")
        public Boolean isCreatedSlb;

        @NameInMap("K8sResourceId")
        public Long k8sResourceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameServer")
        public String nameServer;

        @NameInMap("NameServerPublic")
        public String nameServerPublic;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("PodCidr")
        public String podCidr;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("Region")
        public String region;

        @NameInMap("Replica")
        public Long replica;

        @NameInMap("SeataServerUniqueId")
        public String seataServerUniqueId;

        @NameInMap("SecurityGroup")
        public String securityGroup;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("StartDate")
        public String startDate;

        @NameInMap("Status")
        public Long status;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("StoreMode")
        public String storeMode;

        @NameInMap("Vpc")
        public String vpc;

        @NameInMap("Vswitch")
        public String vswitch;

        @NameInMap("ZoneId")
        public String zoneId;

        public static ListInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyData self = new ListInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyData setAppClusterId(String appClusterId) {
            this.appClusterId = appClusterId;
            return this;
        }
        public String getAppClusterId() {
            return this.appClusterId;
        }

        public ListInstancesResponseBodyData setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListInstancesResponseBodyData setDbPassword(String dbPassword) {
            this.dbPassword = dbPassword;
            return this;
        }
        public String getDbPassword() {
            return this.dbPassword;
        }

        public ListInstancesResponseBodyData setDbUrl(String dbUrl) {
            this.dbUrl = dbUrl;
            return this;
        }
        public String getDbUrl() {
            return this.dbUrl;
        }

        public ListInstancesResponseBodyData setDbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            return this;
        }
        public String getDbUserName() {
            return this.dbUserName;
        }

        public ListInstancesResponseBodyData setEndDate(Long endDate) {
            this.endDate = endDate;
            return this;
        }
        public Long getEndDate() {
            return this.endDate;
        }

        public ListInstancesResponseBodyData setEnvironmentId(Long environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Long getEnvironmentId() {
            return this.environmentId;
        }

        public ListInstancesResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListInstancesResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListInstancesResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListInstancesResponseBodyData setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public ListInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyData setIsCreatedRedis(Boolean isCreatedRedis) {
            this.isCreatedRedis = isCreatedRedis;
            return this;
        }
        public Boolean getIsCreatedRedis() {
            return this.isCreatedRedis;
        }

        public ListInstancesResponseBodyData setIsCreatedSlb(Boolean isCreatedSlb) {
            this.isCreatedSlb = isCreatedSlb;
            return this;
        }
        public Boolean getIsCreatedSlb() {
            return this.isCreatedSlb;
        }

        public ListInstancesResponseBodyData setK8sResourceId(Long k8sResourceId) {
            this.k8sResourceId = k8sResourceId;
            return this;
        }
        public Long getK8sResourceId() {
            return this.k8sResourceId;
        }

        public ListInstancesResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstancesResponseBodyData setNameServer(String nameServer) {
            this.nameServer = nameServer;
            return this;
        }
        public String getNameServer() {
            return this.nameServer;
        }

        public ListInstancesResponseBodyData setNameServerPublic(String nameServerPublic) {
            this.nameServerPublic = nameServerPublic;
            return this;
        }
        public String getNameServerPublic() {
            return this.nameServerPublic;
        }

        public ListInstancesResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public ListInstancesResponseBodyData setPodCidr(String podCidr) {
            this.podCidr = podCidr;
            return this;
        }
        public String getPodCidr() {
            return this.podCidr;
        }

        public ListInstancesResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListInstancesResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListInstancesResponseBodyData setReplica(Long replica) {
            this.replica = replica;
            return this;
        }
        public Long getReplica() {
            return this.replica;
        }

        public ListInstancesResponseBodyData setSeataServerUniqueId(String seataServerUniqueId) {
            this.seataServerUniqueId = seataServerUniqueId;
            return this;
        }
        public String getSeataServerUniqueId() {
            return this.seataServerUniqueId;
        }

        public ListInstancesResponseBodyData setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public ListInstancesResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListInstancesResponseBodyData setStartDate(String startDate) {
            this.startDate = startDate;
            return this;
        }
        public String getStartDate() {
            return this.startDate;
        }

        public ListInstancesResponseBodyData setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyData setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListInstancesResponseBodyData setStoreMode(String storeMode) {
            this.storeMode = storeMode;
            return this;
        }
        public String getStoreMode() {
            return this.storeMode;
        }

        public ListInstancesResponseBodyData setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public ListInstancesResponseBodyData setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

        public ListInstancesResponseBodyData setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
