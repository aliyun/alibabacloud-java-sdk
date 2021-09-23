// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListGatewayResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public ListGatewayResponseBodyData data;

    public static ListGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGatewayResponseBody self = new ListGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGatewayResponseBody setData(ListGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListGatewayResponseBodyData getData() {
        return this.data;
    }

    public static class ListGatewayResponseBodyDataResultSlb extends TeaModel {
        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbPort")
        public String slbPort;

        @NameInMap("SlbSpec")
        public String slbSpec;

        @NameInMap("Type")
        public String type;

        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        @NameInMap("SlbId")
        public String slbId;

        public static ListGatewayResponseBodyDataResultSlb build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultSlb self = new ListGatewayResponseBodyDataResultSlb();
            return TeaModel.build(map, self);
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

        public ListGatewayResponseBodyDataResultSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayResponseBodyDataResultSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public ListGatewayResponseBodyDataResultSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResultSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public ListGatewayResponseBodyDataResultSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

    }

    public static class ListGatewayResponseBodyDataResultInternetSlb extends TeaModel {
        @NameInMap("SlbIp")
        public String slbIp;

        @NameInMap("SlbPort")
        public String slbPort;

        @NameInMap("SlbSpec")
        public String slbSpec;

        @NameInMap("Type")
        public String type;

        @NameInMap("InternetNetworkFlow")
        public String internetNetworkFlow;

        @NameInMap("GatewaySlbStatus")
        public String gatewaySlbStatus;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("GatewaySlbMode")
        public String gatewaySlbMode;

        @NameInMap("SlbId")
        public String slbId;

        public static ListGatewayResponseBodyDataResultInternetSlb build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResultInternetSlb self = new ListGatewayResponseBodyDataResultInternetSlb();
            return TeaModel.build(map, self);
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

        public ListGatewayResponseBodyDataResultInternetSlb setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setInternetNetworkFlow(String internetNetworkFlow) {
            this.internetNetworkFlow = internetNetworkFlow;
            return this;
        }
        public String getInternetNetworkFlow() {
            return this.internetNetworkFlow;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setGatewaySlbStatus(String gatewaySlbStatus) {
            this.gatewaySlbStatus = gatewaySlbStatus;
            return this;
        }
        public String getGatewaySlbStatus() {
            return this.gatewaySlbStatus;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setGatewaySlbMode(String gatewaySlbMode) {
            this.gatewaySlbMode = gatewaySlbMode;
            return this;
        }
        public String getGatewaySlbMode() {
            return this.gatewaySlbMode;
        }

        public ListGatewayResponseBodyDataResultInternetSlb setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

    }

    public static class ListGatewayResponseBodyDataResult extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        @NameInMap("GatewayType")
        public String gatewayType;

        @NameInMap("Region")
        public String region;

        @NameInMap("PrimaryUser")
        public String primaryUser;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("AhasOn")
        public Boolean ahasOn;

        @NameInMap("ArmsOn")
        public Boolean armsOn;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Replica")
        public Integer replica;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("StatusDesc")
        public String statusDesc;

        @NameInMap("Slb")
        public java.util.List<ListGatewayResponseBodyDataResultSlb> slb;

        @NameInMap("InternetSlb")
        public java.util.List<ListGatewayResponseBodyDataResultInternetSlb> internetSlb;

        @NameInMap("Upgrade")
        public Boolean upgrade;

        @NameInMap("MustUpgrade")
        public Boolean mustUpgrade;

        @NameInMap("CurrentVersion")
        public String currentVersion;

        @NameInMap("LatestVersion")
        public String latestVersion;

        @NameInMap("Vswitch2")
        public String vswitch2;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("Tag")
        public String tag;

        public static ListGatewayResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyDataResult self = new ListGatewayResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyDataResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGatewayResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGatewayResponseBodyDataResult setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public ListGatewayResponseBodyDataResult setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public ListGatewayResponseBodyDataResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListGatewayResponseBodyDataResult setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public ListGatewayResponseBodyDataResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGatewayResponseBodyDataResult setAhasOn(Boolean ahasOn) {
            this.ahasOn = ahasOn;
            return this;
        }
        public Boolean getAhasOn() {
            return this.ahasOn;
        }

        public ListGatewayResponseBodyDataResult setArmsOn(Boolean armsOn) {
            this.armsOn = armsOn;
            return this;
        }
        public Boolean getArmsOn() {
            return this.armsOn;
        }

        public ListGatewayResponseBodyDataResult setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public ListGatewayResponseBodyDataResult setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
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

        public ListGatewayResponseBodyDataResult setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public ListGatewayResponseBodyDataResult setSlb(java.util.List<ListGatewayResponseBodyDataResultSlb> slb) {
            this.slb = slb;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultSlb> getSlb() {
            return this.slb;
        }

        public ListGatewayResponseBodyDataResult setInternetSlb(java.util.List<ListGatewayResponseBodyDataResultInternetSlb> internetSlb) {
            this.internetSlb = internetSlb;
            return this;
        }
        public java.util.List<ListGatewayResponseBodyDataResultInternetSlb> getInternetSlb() {
            return this.internetSlb;
        }

        public ListGatewayResponseBodyDataResult setUpgrade(Boolean upgrade) {
            this.upgrade = upgrade;
            return this;
        }
        public Boolean getUpgrade() {
            return this.upgrade;
        }

        public ListGatewayResponseBodyDataResult setMustUpgrade(Boolean mustUpgrade) {
            this.mustUpgrade = mustUpgrade;
            return this;
        }
        public Boolean getMustUpgrade() {
            return this.mustUpgrade;
        }

        public ListGatewayResponseBodyDataResult setCurrentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public String getCurrentVersion() {
            return this.currentVersion;
        }

        public ListGatewayResponseBodyDataResult setLatestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }
        public String getLatestVersion() {
            return this.latestVersion;
        }

        public ListGatewayResponseBodyDataResult setVswitch2(String vswitch2) {
            this.vswitch2 = vswitch2;
            return this;
        }
        public String getVswitch2() {
            return this.vswitch2;
        }

        public ListGatewayResponseBodyDataResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListGatewayResponseBodyDataResult setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListGatewayResponseBodyDataResult setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public ListGatewayResponseBodyDataResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class ListGatewayResponseBodyData extends TeaModel {
        @NameInMap("TotalSize")
        public Long totalSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListGatewayResponseBodyDataResult> result;

        public static ListGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGatewayResponseBodyData self = new ListGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGatewayResponseBodyData setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
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

    }

}
