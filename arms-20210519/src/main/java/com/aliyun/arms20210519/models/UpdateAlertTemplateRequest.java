// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class UpdateAlertTemplateRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("MatchExpressions")
    public String matchExpressions;

    @NameInMap("Type")
    public String type;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Annotations")
    public String annotations;

    @NameInMap("Rule")
    public String rule;

    @NameInMap("Message")
    public String message;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Status")
    public Boolean status;

    public static UpdateAlertTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertTemplateRequest self = new UpdateAlertTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlertTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAlertTemplateRequest setMatchExpressions(String matchExpressions) {
        this.matchExpressions = matchExpressions;
        return this;
    }
    public String getMatchExpressions() {
        return this.matchExpressions;
    }

    public UpdateAlertTemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateAlertTemplateRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public UpdateAlertTemplateRequest setAnnotations(String annotations) {
        this.annotations = annotations;
        return this;
    }
    public String getAnnotations() {
        return this.annotations;
    }

    public UpdateAlertTemplateRequest setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public UpdateAlertTemplateRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAlertTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAlertTemplateRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
