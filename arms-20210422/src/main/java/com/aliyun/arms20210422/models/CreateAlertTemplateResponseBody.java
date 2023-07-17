// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class CreateAlertTemplateResponseBody extends TeaModel {
    @NameInMap("AlertTemplate")
    public CreateAlertTemplateResponseBodyAlertTemplate alertTemplate;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAlertTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertTemplateResponseBody self = new CreateAlertTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertTemplateResponseBody setAlertTemplate(CreateAlertTemplateResponseBodyAlertTemplate alertTemplate) {
        this.alertTemplate = alertTemplate;
        return this;
    }
    public CreateAlertTemplateResponseBodyAlertTemplate getAlertTemplate() {
        return this.alertTemplate;
    }

    public CreateAlertTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Value")
        public String value;

        public static CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions self = new CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions();
            return TeaModel.build(map, self);
        }

        public CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups extends TeaModel {
        @NameInMap("LabelMatchExpressions")
        public java.util.List<CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> labelMatchExpressions;

        public static CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups self = new CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups();
            return TeaModel.build(map, self);
        }

        public CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups setLabelMatchExpressions(java.util.List<CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> labelMatchExpressions) {
            this.labelMatchExpressions = labelMatchExpressions;
            return this;
        }
        public java.util.List<CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> getLabelMatchExpressions() {
            return this.labelMatchExpressions;
        }

    }

    public static class CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid extends TeaModel {
        @NameInMap("LabelMatchExpressionGroups")
        public java.util.List<CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups> labelMatchExpressionGroups;

        public static CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid self = new CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid();
            return TeaModel.build(map, self);
        }

        public CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid setLabelMatchExpressionGroups(java.util.List<CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups> labelMatchExpressionGroups) {
            this.labelMatchExpressionGroups = labelMatchExpressionGroups;
            return this;
        }
        public java.util.List<CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGridLabelMatchExpressionGroups> getLabelMatchExpressionGroups() {
            return this.labelMatchExpressionGroups;
        }

    }

    public static class CreateAlertTemplateResponseBodyAlertTemplate extends TeaModel {
        @NameInMap("AlertProvider")
        public String alertProvider;

        @NameInMap("Annotations")
        public java.util.Map<String, ?> annotations;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("LabelMatchExpressionGrid")
        public CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid labelMatchExpressionGrid;

        @NameInMap("Labels")
        public java.util.Map<String, ?> labels;

        @NameInMap("Message")
        public String message;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentId")
        public Integer parentId;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("TemplateProvider")
        public String templateProvider;

        @NameInMap("Type")
        public String type;

        @NameInMap("UserId")
        public String userId;

        public static CreateAlertTemplateResponseBodyAlertTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateAlertTemplateResponseBodyAlertTemplate self = new CreateAlertTemplateResponseBodyAlertTemplate();
            return TeaModel.build(map, self);
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setAlertProvider(String alertProvider) {
            this.alertProvider = alertProvider;
            return this;
        }
        public String getAlertProvider() {
            return this.alertProvider;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setAnnotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setLabelMatchExpressionGrid(CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid labelMatchExpressionGrid) {
            this.labelMatchExpressionGrid = labelMatchExpressionGrid;
            return this;
        }
        public CreateAlertTemplateResponseBodyAlertTemplateLabelMatchExpressionGrid getLabelMatchExpressionGrid() {
            return this.labelMatchExpressionGrid;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setLabels(java.util.Map<String, ?> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, ?> getLabels() {
            return this.labels;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setParentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }
        public Integer getParentId() {
            return this.parentId;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setTemplateProvider(String templateProvider) {
            this.templateProvider = templateProvider;
            return this;
        }
        public String getTemplateProvider() {
            return this.templateProvider;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateAlertTemplateResponseBodyAlertTemplate setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
