// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayResponseBody extends TeaModel {
    // The return value.
    @NameInMap("Code")
    public Integer code;

    // The returned data.
    @NameInMap("Data")
    public ListGatewayResponseBodyData data;

    // The HTTP status code.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The returned message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static ListGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayResponseBody self = new ListGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayResponseBody setData(ListGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayResponseBodyData getData() {
        return this.data;
    }

    public ListGatewayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGatewayResponseBodyDataResultInitConfig extends TeaModel {
        // Indicates whether Web Application Firewall (WAF) is enabled.
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        // Indicates whether WAF is supported.
        @NameInMap("SupportWaf")
        public Boolean supportWaf;

        public static ListGatewayResponseBodyDataResultInitConfig build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultInitConfig self = new ListGatewayResponseBodyDataResultInitConfig();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultInitConfig setEnableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        public ListGatewayResponseBodyDataResultInitConfig setSupportWaf(Boolean supportWaf) {
            this.supportWaf = supportWaf;
            return this;
        }
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

    }

    public static class ListGatewayResponseBodyDataResultInternetSlb extends TeaModel {
        // The mode of the SLB instance.
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        // The status of the SLB instance.
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        // The traffic of the gateway.
        @NameInMap("InternetNetworkFlow")
        public String internetNetworkFlow;

        // SLB ID.
        @NameInMap("SlbId")
        public String slbId;

        // SLB IP.
        @NameInMap("SlbIp")
        public String slbIp;

        // The port number of the SLB instance.
        @NameInMap("SlbPort")
        public String slbPort;

        // The specifications of the SLB instance.
        @NameInMap("SlbSpec")
        public String slbSpec;

        // The description of the status.
        @NameInMap("StatusDesc")
        public String statusDesc;

        // The type.
        @NameInMap("Type")
        public String type;

        public static ListGatewayResponseBodyDataResultInternetSlb build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultInternetSlb self = new ListGatewayResponseBodyDataResultInternetSlb();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultInternetSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setInternetNetworkFlow(String internetNetworkFlow) {
            this.internetNetworkFlow = internetNetworkFlow;
            return this;
        }
        public String getInternetNetworkFlow() {
            return this.internetNetworkFlow;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbPort(String slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public String getSlbPort() {
            return this.slbPort;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbSpec(String slbSpec) {
            this.slbSpec = slbSpec;
            return this;
        }
        public String getSlbSpec() {
            return this.slbSpec;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayResponseBodyDataResultSlb extends TeaModel {
        // The mode of the SLB instance.
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        // The status of the SLB instance.
        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        // SLB ID.
        @NameInMap("SlbId")
        public String slbId;

        // SLB IP.
        @NameInMap("SlbIp")
        public String slbIp;

        // The port number of the SLB instance.
        @NameInMap("SlbPort")
        public String slbPort;

        // The specifications of the SLB instance.
        @NameInMap("SlbSpec")
        public String slbSpec;

        // The description of the status.
        @NameInMap("StatusDesc")
        public String statusDesc;

        // The type.
        @NameInMap("Type")
        public String type;

        public static ListGatewayResponseBodyDataResultSlb build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultSlb self = new ListGatewayResponseBodyDataResultSlb();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResultSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public ListGatewayResponseBodyDataResultSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbPort(String slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public String getSlbPort() {
            return this.slbPort;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbSpec(String slbSpec) {
            this.slbSpec = slbSpec;
            return this;
        }
        public String getSlbSpec() {
            return this.slbSpec;
        }

        public ListGatewayResponseBodyDataResultSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResultSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListGatewayResponseBodyDataResult extends TeaModel {
        // Indicates whether Application High Availability Service (AHAS) is enabled.
        @NameInMap("AhasOn")
        public Boolean ahasOn;

        // The version of the application.
        @NameInMap("AppVersion")
        public String appVersion;

        // Indicates whether Application Real-Time Monitoring Service (ARMS) is enabled.
        @NameInMap("ArmsOn")
        public Boolean armsOn;

        // The billing method.
        @NameInMap("ChargeType")
        public String chargeType;

        // The current version of the gateway.
        @NameInMap("CurrentVersion")
        public String currentVersion;

        // The time when the subscription gateway expires.
        @NameInMap("EndDate")
        public String endDate;

        // The type of the gateway.
        @NameInMap("GatewayType")
        public String gatewayType;

        // The unique ID of the gateway.
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GatewayVersion")
        public String gatewayVersion;

        // The creation time.
        @NameInMap("GmtCreate")
        public String gmtCreate;

        // The modification time.
        @NameInMap("GmtModified")
        public String gmtModified;

        // The ID of the gateway.
        @NameInMap("Id")
        public Long id;

        // The configurations.
        @NameInMap("InitConfig")
        public ListGatewayResponseBodyDataResultInitConfig initConfig;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The details of the Internet-facing SLB instances.
        @NameInMap("InternetSlb")
        public java.util.List<ListGatewayResponseBodyDataResultInternetSlb> internetSlb;

        // The latest version of the gateway.
        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("MseTag")
        public String mseTag;

        // Indicates whether the gateway can be forcefully updated.
        @NameInMap("MustUpgrade")
        public Boolean mustUpgrade;

        // The name of the gateway.
        @NameInMap("Name")
        public String name;

        // The information about the user.
        @NameInMap("PrimaryUser")
        public String primaryUser;

        // The ID of the region.
        @NameInMap("Region")
        public String region;

        // The number of replicas.
        @NameInMap("Replica")
        public Integer replica;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("RollBack")
        public Boolean rollBack;

        // The details of the Server Load Balancer (SLB) instances.
        @NameInMap("Slb")
        public java.util.List<ListGatewayResponseBodyDataResultSlb> slb;

        // The specifications of the gateway.
        @NameInMap("Spec")
        public String spec;

        // The gateway status.
        // 
        // *   0: The gateway is being created.
        // *   1: The gateway fails to be created.
        // *   2: The gateway is running.
        // *   3: The gateway is changing.
        // *   4: The gateway is scaling down.
        // *   6: The gateway is scaling up.
        // *   8: The gateway is being deleted.
        // *   9: The gateway is suspended and to be released.
        // *   10: The gateway is restarting.
        // *   11: The gateway is being rebuilt.
        // *   12: The gateway is updating.
        // *   13: The gateway fails to be updated.
        @NameInMap("Status")
        public Integer status;

        // The description of the status.
        @NameInMap("StatusDesc")
        public String statusDesc;

        // Indicates whether WebAssembly (Wasm) is supported.
        @NameInMap("SupportWasm")
        public Boolean supportWasm;

        // The tag.
        @NameInMap("Tag")
        public String tag;

        // Indicates whether the gateway can be updated.
        @NameInMap("Upgrade")
        public Boolean upgrade;

        // The ID of the secondary vSwitch.
        @NameInMap("Vswitch2")
        public String vswitch2;

        public static ListGatewayResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResult self = new ListGatewayResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResult setAhasOn(Boolean ahasOn) {
            this.ahasOn = ahasOn;
            return this;
        }
        public Boolean getAhasOn() {
            return this.ahasOn;
        }

        public ListGatewayResponseBodyDataResult setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public ListGatewayResponseBodyDataResult setArmsOn(Boolean armsOn) {
            this.armsOn = armsOn;
            return this;
        }
        public Boolean getArmsOn() {
            return this.armsOn;
        }

        public ListGatewayResponseBodyDataResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListGatewayResponseBodyDataResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ListGatewayResponseBodyDataResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListGatewayResponseBodyDataResult setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListGatewayResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayResponseBodyDataResult setGatewayVersion(String gatewayVersion) {
            this.gatewayVersion = gatewayVersion;
            return this;
        }
        public String getGatewayVersion() {
            return this.gatewayVersion;
        }

        public ListGatewayResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListGatewayResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListGatewayResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayResponseBodyDataResult setInitConfig(ListGatewayResponseBodyDataResultInitConfig initConfig) {
            this.initConfig = initConfig;
            return this;
        }
        public ListGatewayResponseBodyDataResultInitConfig getInitConfig() {
            return this.initConfig;
        }

        public ListGatewayResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGatewayResponseBodyDataResult setInternetSlb(java.util.List<ListGatewayResponseBodyDataResultInternetSlb> internetSlb) {
            this.internetSlb = internetSlb;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultInternetSlb> getInternetSlb() {
            return this.internetSlb;
        }

        public ListGatewayResponseBodyDataResult setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListGatewayResponseBodyDataResult setMseTag(String mseTag) {
            this.mseTag = mseTag;
            return this;
        }
        public String getMseTag() {
            return this.mseTag;
        }

        public ListGatewayResponseBodyDataResult setMustUpgrade(Boolean mustUpgrade) {
            this.mustUpgrade = mustUpgrade;
            return this;
        }
        public Boolean getMustUpgrade() {
            return this.mustUpgrade;
        }

        public ListGatewayResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayResponseBodyDataResult setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListGatewayResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListGatewayResponseBodyDataResult setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public ListGatewayResponseBodyDataResult setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListGatewayResponseBodyDataResult setRollBack(Boolean rollBack) {
            this.rollBack = rollBack;
            return this;
        }
        public Boolean getRollBack() {
            return this.rollBack;
        }

        public ListGatewayResponseBodyDataResult setSlb(java.util.List<ListGatewayResponseBodyDataResultSlb> slb) {
            this.slb = slb;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultSlb> getSlb() {
            return this.slb;
        }

        public ListGatewayResponseBodyDataResult setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListGatewayResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGatewayResponseBodyDataResult setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResult setSupportWasm(Boolean supportWasm) {
            this.supportWasm = supportWasm;
            return this;
        }
        public Boolean getSupportWasm() {
            return this.supportWasm;
        }

        public ListGatewayResponseBodyDataResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListGatewayResponseBodyDataResult setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public ListGatewayResponseBodyDataResult setVswitch2(String vswitch2) {
            this.vswitch2 = vswitch2;
            return this;
        }
        public String getVswitch2() {
            return this.vswitch2;
        }

    }

    public static class ListGatewayResponseBodyData extends TeaModel {
        // The page number of the returned page.
        @NameInMap("PageNumber")
        public Integer pageNumber;

        // The number of entries returned per page.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The returned data.
        @NameInMap("Result")
        public java.util.List<ListGatewayResponseBodyDataResult> result;

        // The total number of entries returned.
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyData self = new ListGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGatewayResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGatewayResponseBodyData setResult(java.util.List<ListGatewayResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListGatewayResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
