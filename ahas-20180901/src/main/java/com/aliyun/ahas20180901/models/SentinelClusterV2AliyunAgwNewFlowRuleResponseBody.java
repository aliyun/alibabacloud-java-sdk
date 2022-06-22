// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwNewFlowRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelClusterV2AliyunAgwNewFlowRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwNewFlowRuleResponseBody self = new SentinelClusterV2AliyunAgwNewFlowRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBody setData(SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData getData() {
        return this.data;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData extends TeaModel {
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

        public static SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData self = new SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setApiGroupId(String apiGroupId) {
            this.apiGroupId = apiGroupId;
            return this;
        }
        public String getApiGroupId() {
            return this.apiGroupId;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setApiThreshold(Float apiThreshold) {
            this.apiThreshold = apiThreshold;
            return this;
        }
        public Float getApiThreshold() {
            return this.apiThreshold;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setIntervalUnit(Integer intervalUnit) {
            this.intervalUnit = intervalUnit;
            return this;
        }
        public Integer getIntervalUnit() {
            return this.intervalUnit;
        }

        public SentinelClusterV2AliyunAgwNewFlowRuleResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
