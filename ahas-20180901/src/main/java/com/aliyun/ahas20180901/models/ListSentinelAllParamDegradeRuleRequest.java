// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListSentinelAllParamDegradeRuleRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Model")
    public Long model;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Tags")
    public String tags;

    public static ListSentinelAllParamDegradeRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSentinelAllParamDegradeRuleRequest self = new ListSentinelAllParamDegradeRuleRequest();
        return TeaModel.build(map, self);
    }

    public ListSentinelAllParamDegradeRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListSentinelAllParamDegradeRuleRequest setModel(Long model) {
        this.model = model;
        return this;
    }
    public Long getModel() {
        return this.model;
    }

    public ListSentinelAllParamDegradeRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListSentinelAllParamDegradeRuleRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
