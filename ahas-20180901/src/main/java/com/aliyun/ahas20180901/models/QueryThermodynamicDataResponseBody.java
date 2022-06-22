// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryThermodynamicDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryThermodynamicDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryThermodynamicDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryThermodynamicDataResponseBody self = new QueryThermodynamicDataResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryThermodynamicDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryThermodynamicDataResponseBody setData(java.util.List<QueryThermodynamicDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryThermodynamicDataResponseBodyData> getData() {
        return this.data;
    }

    public QueryThermodynamicDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryThermodynamicDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryThermodynamicDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryThermodynamicDataResponseBodyDataInnerMetric extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("count")
        public Integer count;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("passedQps")
        public Float passedQps;

        @NameInMap("resource")
        public String resource;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("successQps")
        public Float successQps;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("userId")
        public String userId;

        public static QueryThermodynamicDataResponseBodyDataInnerMetric build(java.util.Map<String, ?> map) throws Exception {
            QueryThermodynamicDataResponseBodyDataInnerMetric self = new QueryThermodynamicDataResponseBodyDataInnerMetric();
            return TeaModel.build(map, self);
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setSuccessQps(Float successQps) {
            this.successQps = successQps;
            return this;
        }
        public Float getSuccessQps() {
            return this.successQps;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryThermodynamicDataResponseBodyDataInnerMetric setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryThermodynamicDataResponseBodyData extends TeaModel {
        @NameInMap("appName")
        public String appName;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("innerMetric")
        public QueryThermodynamicDataResponseBodyDataInnerMetric innerMetric;

        @NameInMap("namespace")
        public String namespace;

        @NameInMap("parentIp")
        public String parentIp;

        @NameInMap("pid")
        public Integer pid;

        @NameInMap("privateIp")
        public String privateIp;

        @NameInMap("processConfigurationId")
        public String processConfigurationId;

        @NameInMap("resource")
        public String resource;

        public static QueryThermodynamicDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryThermodynamicDataResponseBodyData self = new QueryThermodynamicDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryThermodynamicDataResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryThermodynamicDataResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public QueryThermodynamicDataResponseBodyData setInnerMetric(QueryThermodynamicDataResponseBodyDataInnerMetric innerMetric) {
            this.innerMetric = innerMetric;
            return this;
        }
        public QueryThermodynamicDataResponseBodyDataInnerMetric getInnerMetric() {
            return this.innerMetric;
        }

        public QueryThermodynamicDataResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QueryThermodynamicDataResponseBodyData setParentIp(String parentIp) {
            this.parentIp = parentIp;
            return this;
        }
        public String getParentIp() {
            return this.parentIp;
        }

        public QueryThermodynamicDataResponseBodyData setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QueryThermodynamicDataResponseBodyData setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public QueryThermodynamicDataResponseBodyData setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public QueryThermodynamicDataResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

    }

}
