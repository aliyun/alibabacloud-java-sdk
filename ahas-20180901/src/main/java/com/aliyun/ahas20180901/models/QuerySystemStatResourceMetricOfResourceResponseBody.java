// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QuerySystemStatResourceMetricOfResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QuerySystemStatResourceMetricOfResourceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QuerySystemStatResourceMetricOfResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemStatResourceMetricOfResourceResponseBody self = new QuerySystemStatResourceMetricOfResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySystemStatResourceMetricOfResourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySystemStatResourceMetricOfResourceResponseBody setData(QuerySystemStatResourceMetricOfResourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QuerySystemStatResourceMetricOfResourceResponseBodyData getData() {
        return this.data;
    }

    public QuerySystemStatResourceMetricOfResourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySystemStatResourceMetricOfResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySystemStatResourceMetricOfResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints extends TeaModel {
        @NameInMap("Group")
        public String group;

        @NameInMap("Hostname")
        public String hostname;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("ProcessConfigurationId")
        public String processConfigurationId;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("Time")
        public Long time;

        @NameInMap("Val")
        public Float val;

        @NameInMap("VpcId")
        public String vpcId;

        public static QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints build(java.util.Map<String, ?> map) throws Exception {
            QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints self = new QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints();
            return TeaModel.build(map, self);
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setHostname(String hostname) {
            this.hostname = hostname;
            return this;
        }
        public String getHostname() {
            return this.hostname;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setProcessConfigurationId(String processConfigurationId) {
            this.processConfigurationId = processConfigurationId;
            return this;
        }
        public String getProcessConfigurationId() {
            return this.processConfigurationId;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setVal(Float val) {
            this.val = val;
            return this;
        }
        public Float getVal() {
            return this.val;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class QuerySystemStatResourceMetricOfResourceResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Group")
        public String group;

        @NameInMap("Metrics")
        public java.util.List<String> metrics;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Resource")
        public String resource;

        @NameInMap("StatusMacPoints")
        public java.util.List<QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints> statusMacPoints;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("ValAvg")
        public Float valAvg;

        @NameInMap("ValMax")
        public Float valMax;

        @NameInMap("ValMin")
        public Float valMin;

        @NameInMap("ValP75")
        public Float valP75;

        @NameInMap("ValP95")
        public Float valP95;

        @NameInMap("ValP99")
        public Float valP99;

        @NameInMap("ValStd")
        public Float valStd;

        public static QuerySystemStatResourceMetricOfResourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QuerySystemStatResourceMetricOfResourceResponseBodyData self = new QuerySystemStatResourceMetricOfResourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setMetrics(java.util.List<String> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<String> getMetrics() {
            return this.metrics;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setStatusMacPoints(java.util.List<QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints> statusMacPoints) {
            this.statusMacPoints = statusMacPoints;
            return this;
        }
        public java.util.List<QuerySystemStatResourceMetricOfResourceResponseBodyDataStatusMacPoints> getStatusMacPoints() {
            return this.statusMacPoints;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setValAvg(Float valAvg) {
            this.valAvg = valAvg;
            return this;
        }
        public Float getValAvg() {
            return this.valAvg;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setValMax(Float valMax) {
            this.valMax = valMax;
            return this;
        }
        public Float getValMax() {
            return this.valMax;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setValMin(Float valMin) {
            this.valMin = valMin;
            return this;
        }
        public Float getValMin() {
            return this.valMin;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setValP75(Float valP75) {
            this.valP75 = valP75;
            return this;
        }
        public Float getValP75() {
            return this.valP75;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setValP95(Float valP95) {
            this.valP95 = valP95;
            return this;
        }
        public Float getValP95() {
            return this.valP95;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setValP99(Float valP99) {
            this.valP99 = valP99;
            return this;
        }
        public Float getValP99() {
            return this.valP99;
        }

        public QuerySystemStatResourceMetricOfResourceResponseBodyData setValStd(Float valStd) {
            this.valStd = valStd;
            return this;
        }
        public Float getValStd() {
            return this.valStd;
        }

    }

}
