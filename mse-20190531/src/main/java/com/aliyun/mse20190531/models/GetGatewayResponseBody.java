// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayResponseBody extends TeaModel {
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
    public GetGatewayResponseBodyData data;

    public static GetGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayResponseBody self = new GetGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetGatewayResponseBody setData(GetGatewayResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayResponseBodyData getData() {
        return this.data;
    }

    public static class GetGatewayResponseBodyDataXtraceDetails extends TeaModel {
        @NameInMap("Sample")
        public Integer sample;

        @NameInMap("TraceOn")
        public Boolean traceOn;

        public static GetGatewayResponseBodyDataXtraceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataXtraceDetails self = new GetGatewayResponseBodyDataXtraceDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataXtraceDetails setSample(Integer sample) {
            this.sample = sample;
            return this;
        }
        public Integer getSample() {
            return this.sample;
        }

        public GetGatewayResponseBodyDataXtraceDetails setTraceOn(Boolean traceOn) {
            this.traceOn = traceOn;
            return this;
        }
        public Boolean getTraceOn() {
            return this.traceOn;
        }

    }

    public static class GetGatewayResponseBodyDataLogConfigDetails extends TeaModel {
        @NameInMap("LogEnabled")
        public Boolean logEnabled;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("LogStoreName")
        public String logStoreName;

        public static GetGatewayResponseBodyDataLogConfigDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyDataLogConfigDetails self = new GetGatewayResponseBodyDataLogConfigDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyDataLogConfigDetails setLogEnabled(Boolean logEnabled) {
            this.logEnabled = logEnabled;
            return this;
        }
        public Boolean getLogEnabled() {
            return this.logEnabled;
        }

        public GetGatewayResponseBodyDataLogConfigDetails setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetGatewayResponseBodyDataLogConfigDetails setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

    }

    public static class GetGatewayResponseBodyData extends TeaModel {
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

        @NameInMap("ArmsOn")
        public Boolean armsOn;

        @NameInMap("Vpc")
        public String vpc;

        @NameInMap("Vswitch")
        public String vswitch;

        @NameInMap("SecurityGroup")
        public String securityGroup;

        @NameInMap("Spec")
        public String spec;

        @NameInMap("Replica")
        public Integer replica;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("XtraceDetails")
        public GetGatewayResponseBodyDataXtraceDetails xtraceDetails;

        @NameInMap("Vswitch2")
        public String vswitch2;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("LogConfigDetails")
        public GetGatewayResponseBodyDataLogConfigDetails logConfigDetails;

        public static GetGatewayResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayResponseBodyData self = new GetGatewayResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetGatewayResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayResponseBodyData setGatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }
        public String getGatewayType() {
            return this.gatewayType;
        }

        public GetGatewayResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetGatewayResponseBodyData setPrimaryUser(String primaryUser) {
            this.primaryUser = primaryUser;
            return this;
        }
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        public GetGatewayResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetGatewayResponseBodyData setArmsOn(Boolean armsOn) {
            this.armsOn = armsOn;
            return this;
        }
        public Boolean getArmsOn() {
            return this.armsOn;
        }

        public GetGatewayResponseBodyData setVpc(String vpc) {
            this.vpc = vpc;
            return this;
        }
        public String getVpc() {
            return this.vpc;
        }

        public GetGatewayResponseBodyData setVswitch(String vswitch) {
            this.vswitch = vswitch;
            return this;
        }
        public String getVswitch() {
            return this.vswitch;
        }

        public GetGatewayResponseBodyData setSecurityGroup(String securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        public GetGatewayResponseBodyData setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

        public GetGatewayResponseBodyData setReplica(Integer replica) {
            this.replica = replica;
            return this;
        }
        public Integer getReplica() {
            return this.replica;
        }

        public GetGatewayResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayResponseBodyData setXtraceDetails(GetGatewayResponseBodyDataXtraceDetails xtraceDetails) {
            this.xtraceDetails = xtraceDetails;
            return this;
        }
        public GetGatewayResponseBodyDataXtraceDetails getXtraceDetails() {
            return this.xtraceDetails;
        }

        public GetGatewayResponseBodyData setVswitch2(String vswitch2) {
            this.vswitch2 = vswitch2;
            return this;
        }
        public String getVswitch2() {
            return this.vswitch2;
        }

        public GetGatewayResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetGatewayResponseBodyData setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetGatewayResponseBodyData setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetGatewayResponseBodyData setLogConfigDetails(GetGatewayResponseBodyDataLogConfigDetails logConfigDetails) {
            this.logConfigDetails = logConfigDetails;
            return this;
        }
        public GetGatewayResponseBodyDataLogConfigDetails getLogConfigDetails() {
            return this.logConfigDetails;
        }

    }

}
