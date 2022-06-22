// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelClusterV2AliyunAgwUpdateFlowRuleRequest extends TeaModel {
    @NameInMap("ApiGroupId")
    public String apiGroupId;

    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiThreshold")
    public Float apiThreshold;

    @NameInMap("Description")
    public String description;

    @NameInMap("EnvId")
    public String envId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Interval")
    public Integer interval;

    @NameInMap("IntervalUnit")
    public Integer intervalUnit;

    @NameInMap("Lang")
    public String lang;

    public static SentinelClusterV2AliyunAgwUpdateFlowRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelClusterV2AliyunAgwUpdateFlowRuleRequest self = new SentinelClusterV2AliyunAgwUpdateFlowRuleRequest();
        return TeaModel.build(map, self);
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setApiGroupId(String apiGroupId) {
        this.apiGroupId = apiGroupId;
        return this;
    }
    public String getApiGroupId() {
        return this.apiGroupId;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setApiThreshold(Float apiThreshold) {
        this.apiThreshold = apiThreshold;
        return this;
    }
    public Float getApiThreshold() {
        return this.apiThreshold;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setIntervalUnit(Integer intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }
    public Integer getIntervalUnit() {
        return this.intervalUnit;
    }

    public SentinelClusterV2AliyunAgwUpdateFlowRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
