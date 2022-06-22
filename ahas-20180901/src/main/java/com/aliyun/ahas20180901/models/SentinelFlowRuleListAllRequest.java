// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelFlowRuleListAllRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Grade")
    public Integer grade;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Tags")
    public String tags;

    public static SentinelFlowRuleListAllRequest build(java.util.Map<String, ?> map) throws Exception {
        SentinelFlowRuleListAllRequest self = new SentinelFlowRuleListAllRequest();
        return TeaModel.build(map, self);
    }

    public SentinelFlowRuleListAllRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public SentinelFlowRuleListAllRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SentinelFlowRuleListAllRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SentinelFlowRuleListAllRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public SentinelFlowRuleListAllRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public SentinelFlowRuleListAllRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
