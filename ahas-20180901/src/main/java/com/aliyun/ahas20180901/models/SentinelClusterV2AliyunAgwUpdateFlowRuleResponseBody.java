// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody self = new SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody setData(SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData extends TeaModel {
        @NameInMap("ApiGroupId")
        public String apiGroupId;

        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiThreshold")
        public Float apiThreshold;

        @NameInMap("Description")
        public String description;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Interval")
        public Integer interval;

        @NameInMap("IntervalUnit")
        public Integer intervalUnit;

        @NameInMap("UserId")
        public String userId;

        public static SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData self = new SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setApiThreshold(Float apiThreshold) {
            this.apiThreshold = apiThreshold;
            return this;
        }
        public Float getApiThreshold() {
            return this.apiThreshold;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setIntervalUnit(Integer intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public Integer getIntervalUnit() {
            return this.intervalUnit;
        }

        public SentinelClusterV2AliyunAgwUpdateFlowRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
