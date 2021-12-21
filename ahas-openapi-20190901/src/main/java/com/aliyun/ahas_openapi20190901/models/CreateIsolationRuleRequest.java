// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class CreateIsolationRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Enable")
    public Boolean enable;

    @NameInMap("LimitOrigin")
    public String limitOrigin;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RefResource")
    public String refResource;

    @NameInMap("RelationStrategy")
    public Integer relationStrategy;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("Threshold")
    public Float threshold;

    public static CreateIsolationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIsolationRuleRequest self = new CreateIsolationRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateIsolationRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public CreateIsolationRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateIsolationRuleRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateIsolationRuleRequest setLimitOrigin(String limitOrigin) {
        this.limitOrigin = limitOrigin;
        return this;
    }
    public String getLimitOrigin() {
        return this.limitOrigin;
    }

    public CreateIsolationRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateIsolationRuleRequest setRefResource(String refResource) {
        this.refResource = refResource;
        return this;
    }
    public String getRefResource() {
        return this.refResource;
    }

    public CreateIsolationRuleRequest setRelationStrategy(Integer relationStrategy) {
        this.relationStrategy = relationStrategy;
        return this;
    }
    public Integer getRelationStrategy() {
        return this.relationStrategy;
    }

    public CreateIsolationRuleRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateIsolationRuleRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
