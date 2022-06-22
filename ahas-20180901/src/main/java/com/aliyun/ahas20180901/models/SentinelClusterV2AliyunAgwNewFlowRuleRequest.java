// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwNewFlowRuleRequest extends TeaModel {
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

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IntervalUnit")
    public Integer intervalUnit;

    @NameInMap("Lang")
    public String lang;

    public static SentinelClusterV2AliyunAgwNewFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwNewFlowRuleRequest self = new SentinelClusterV2AliyunAgwNewFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setApiThreshold(Float apiThreshold) {
        this.apiThreshold = apiThreshold;
        return this;
    }
    public Float getApiThreshold() {
        return this.apiThreshold;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setIntervalUnit(Integer intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }
    public Integer getIntervalUnit() {
        return this.intervalUnit;
    }

    public SentinelClusterV2AliyunAgwNewFlowRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
