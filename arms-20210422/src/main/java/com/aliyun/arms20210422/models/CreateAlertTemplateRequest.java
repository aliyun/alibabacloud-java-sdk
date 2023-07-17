// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateAlertTemplateRequest extends TeaModel {
    @NameInMap("Annotations")
    public String annotations;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("MatchExpressions")
    public String matchExpressions;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Rule")
    public String rule;

    @NameInMap("TemplateProvider")
    public String templateProvider;

    @NameInMap("Type")
    public String type;

    public static CreateAlertTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertTemplateRequest self = new CreateAlertTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertTemplateRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public CreateAlertTemplateRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public CreateAlertTemplateRequest setMatchExpressions(String matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public String getMatchExpressions() {
        return this.matchExpressions;
    }

    public CreateAlertTemplateRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAlertTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertTemplateRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateAlertTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAlertTemplateRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public CreateAlertTemplateRequest setTemplateProvider(String templateProvider) {
        this.templateProvider = templateProvider;
        return this;
    }
    public String getTemplateProvider() {
        return this.templateProvider;
    }

    public CreateAlertTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
