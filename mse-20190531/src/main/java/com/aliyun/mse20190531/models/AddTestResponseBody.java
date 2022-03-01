// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddTestResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public AddTestResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTestResponseBody self = new AddTestResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTestResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public AddTestResponseBody setData(AddTestResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddTestResponseBodyData getData() {
        return this.data;
    }

    public AddTestResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddTestResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddTestResponseBodyDataResultInternetSlb extends TeaModel {
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        @NameInMap("InternetNetworkFlow")
        public String internetNetworkFlow;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbPort")
        public String slbPort;

        @NameInMap("SlbSpec")
        public String slbSpec;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("Type")
        public String type;

        public static AddTestResponseBodyDataResultInternetSlb build(java.util.Map<String, ?> map) throws Exception {
            AddTestResponseBodyDataResultInternetSlb self = new AddTestResponseBodyDataResultInternetSlb();
            return TeaModel.build(map, self);
        }

        public AddTestResponseBodyDataResultInternetSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public AddTestResponseBodyDataResultInternetSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public AddTestResponseBodyDataResultInternetSlb setInternetNetworkFlow(String internetNetworkFlow) {
            this.internetNetworkFlow = internetNetworkFlow;
            return this;
        }
        public String getInternetNetworkFlow() {
            return this.internetNetworkFlow;
        }

        public AddTestResponseBodyDataResultInternetSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public AddTestResponseBodyDataResultInternetSlb setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public AddTestResponseBodyDataResultInternetSlb setSlbPort(String slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public String getSlbPort() {
            return this.slbPort;
        }

        public AddTestResponseBodyDataResultInternetSlb setSlbSpec(String slbSpec) {
            this.slbSpec = slbSpec;
            return this;
        }
        public String getSlbSpec() {
            return this.slbSpec;
        }

        public AddTestResponseBodyDataResultInternetSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public AddTestResponseBodyDataResultInternetSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddTestResponseBodyDataResultSlb extends TeaModel {
        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        @NameInMap("SlbId")
        public String slbId;

        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbPort")
        public String slbPort;

        @NameInMap("SlbSpec")
        public String slbSpec;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("Type")
        public String type;

        public static AddTestResponseBodyDataResultSlb build(java.util.Map<String, ?> map) throws Exception {
            AddTestResponseBodyDataResultSlb self = new AddTestResponseBodyDataResultSlb();
            return TeaModel.build(map, self);
        }

        public AddTestResponseBodyDataResultSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public AddTestResponseBodyDataResultSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public AddTestResponseBodyDataResultSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public AddTestResponseBodyDataResultSlb setSlbIp(String slbIp) {
            this.slbIp = slbIp;
            return this;
        }
        public String getSlbIp() {
            return this.slbIp;
        }

        public AddTestResponseBodyDataResultSlb setSlbPort(String slbPort) {
            this.slbPort = slbPort;
            return this;
        }
        public String getSlbPort() {
            return this.slbPort;
        }

        public AddTestResponseBodyDataResultSlb setSlbSpec(String slbSpec) {
            this.slbSpec = slbSpec;
            return this;
        }
        public String getSlbSpec() {
            return this.slbSpec;
        }

        public AddTestResponseBodyDataResultSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public AddTestResponseBodyDataResultSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddTestResponseBodyDataResult extends TeaModel {
        @NameInMap("AhasOn")
        public Boolean ahasOn;

        @NameInMap("ArmsOn")
        public Boolean armsOn;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("GatewayType")
        public String gatewayType;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InternetSlb")
        public java.util.List<AddTestResponseBodyDataResultInternetSlb> internetSlb;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("MustUpgrade")
        public Boolean mustUpgrade;

        @NameInMap("Name")
        public String name;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("Region")
        public String region;

        @NameInMap("Replica")
        public Integer replica;

        @NameInMap("Slb")
        public java.util.List<AddTestResponseBodyDataResultSlb> slb;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Upgrade")
        public Boolean upgrade;

        @NameInMap("Vswitch2")
        public String vswitch2;

        public static AddTestResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            AddTestResponseBodyDataResult self = new AddTestResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public AddTestResponseBodyDataResult setAhasOn(Boolean ahasOn) {
            this.ahasOn = ahasOn;
            return this;
        }
        public Boolean getAhasOn() {
            return this.ahasOn;
        }

        public AddTestResponseBodyDataResult setArmsOn(Boolean armsOn) {
            this.armsOn = armsOn;
            return this;
        }
        public Boolean getArmsOn() {
            return this.armsOn;
        }

        public AddTestResponseBodyDataResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public AddTestResponseBodyDataResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public AddTestResponseBodyDataResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public AddTestResponseBodyDataResult setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public AddTestResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public AddTestResponseBodyDataResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AddTestResponseBodyDataResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public AddTestResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public AddTestResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AddTestResponseBodyDataResult setInternetSlb(java.util.List<AddTestResponseBodyDataResultInternetSlb> internetSlb) {
            this.internetSlb = internetSlb;
            return this;
        }
        public java.util.List<AddTestResponseBodyDataResultInternetSlb> getInternetSlb() {
            return this.internetSlb;
        }

        public AddTestResponseBodyDataResult setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public AddTestResponseBodyDataResult setMustUpgrade(Boolean mustUpgrade) {
            this.mustUpgrade = mustUpgrade;
            return this;
        }
        public Boolean getMustUpgrade() {
            return this.mustUpgrade;
        }

        public AddTestResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AddTestResponseBodyDataResult setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public AddTestResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AddTestResponseBodyDataResult setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public AddTestResponseBodyDataResult setSlb(java.util.List<AddTestResponseBodyDataResultSlb> slb) {
            this.slb = slb;
            return this;
        }
        public java.util.List<AddTestResponseBodyDataResultSlb> getSlb() {
            return this.slb;
        }

        public AddTestResponseBodyDataResult setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public AddTestResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public AddTestResponseBodyDataResult setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public AddTestResponseBodyDataResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public AddTestResponseBodyDataResult setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public AddTestResponseBodyDataResult setVswitch2(String vswitch2) {
            this.vswitch2 = vswitch2;
            return this;
        }
        public String getVswitch2() {
            return this.vswitch2;
        }

    }

    public static class AddTestResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<AddTestResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Long totalSize;

        public static AddTestResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddTestResponseBodyData self = new AddTestResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddTestResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public AddTestResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public AddTestResponseBodyData setResult(java.util.List<AddTestResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<AddTestResponseBodyDataResult> getResult() {
            return this.result;
        }

        public AddTestResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
