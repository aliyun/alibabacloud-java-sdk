// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class ListAlertTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AlertTemplates")
    public java.util.List<ListAlertTemplatesResponseBodyAlertTemplates> alertTemplates;

    public static ListAlertTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlertTemplatesResponseBody self = new ListAlertTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlertTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlertTemplatesResponseBody setAlertTemplates(java.util.List<ListAlertTemplatesResponseBodyAlertTemplates> alertTemplates) {
        this.alertTemplates = alertTemplates;
        return this;
    }
    public java.util.List<ListAlertTemplatesResponseBodyAlertTemplates> getAlertTemplates() {
        return this.alertTemplates;
    }

    public static class ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Operator")
        public String operator;

        public static ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions build(java.util.Map<String, ?> map) throws Exception {
            ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions self = new ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions();
            return TeaModel.build(map, self);
        }

        public ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups extends TeaModel {
        @NameInMap("LabelMatchExpressions")
        public java.util.List<ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> labelMatchExpressions;

        public static ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups build(java.util.Map<String, ?> map) throws Exception {
            ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups self = new ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups();
            return TeaModel.build(map, self);
        }

        public ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups setLabelMatchExpressions(java.util.List<ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> labelMatchExpressions) {
            this.labelMatchExpressions = labelMatchExpressions;
            return this;
        }
        public java.util.List<ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroupsLabelMatchExpressions> getLabelMatchExpressions() {
            return this.labelMatchExpressions;
        }

    }

    public static class ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid extends TeaModel {
        @NameInMap("LabelMatchExpressionGroups")
        public java.util.List<ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups> labelMatchExpressionGroups;

        public static ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid build(java.util.Map<String, ?> map) throws Exception {
            ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid self = new ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid();
            return TeaModel.build(map, self);
        }

        public ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid setLabelMatchExpressionGroups(java.util.List<ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups> labelMatchExpressionGroups) {
            this.labelMatchExpressionGroups = labelMatchExpressionGroups;
            return this;
        }
        public java.util.List<ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGridLabelMatchExpressionGroups> getLabelMatchExpressionGroups() {
            return this.labelMatchExpressionGroups;
        }

    }

    public static class ListAlertTemplatesResponseBodyAlertTemplates extends TeaModel {
        @NameInMap("AlertProvider")
        public String alertProvider;

        @NameInMap("Type")
        public String type;

        @NameInMap("Status")
        public Boolean status;

        @NameInMap("Labels")
        public java.util.Map<String, ?> labels;

        @NameInMap("Annotations")
        public java.util.Map<String, ?> annotations;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("Message")
        public String message;

        @NameInMap("TemplateProvider")
        public String templateProvider;

        @NameInMap("ParentId")
        public Integer parentId;

        @NameInMap("Rule")
        public String rule;

        @NameInMap("Public")
        public Boolean _public;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("LabelMatchExpressionGrid")
        public ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid labelMatchExpressionGrid;

        public static ListAlertTemplatesResponseBodyAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListAlertTemplatesResponseBodyAlertTemplates self = new ListAlertTemplatesResponseBodyAlertTemplates();
            return TeaModel.build(map, self);
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setAlertProvider(String alertProvider) {
            this.alertProvider = alertProvider;
            return this;
        }
        public String getAlertProvider() {
            return this.alertProvider;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setLabels(java.util.Map<String, ?> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, ?> getLabels() {
            return this.labels;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setAnnotations(java.util.Map<String, ?> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, ?> getAnnotations() {
            return this.annotations;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setTemplateProvider(String templateProvider) {
            this.templateProvider = templateProvider;
            return this;
        }
        public String getTemplateProvider() {
            return this.templateProvider;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setParentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }
        public Integer getParentId() {
            return this.parentId;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates set_public(Boolean _public) {
            this._public = _public;
            return this;
        }
        public Boolean get_public() {
            return this._public;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListAlertTemplatesResponseBodyAlertTemplates setLabelMatchExpressionGrid(ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid labelMatchExpressionGrid) {
            this.labelMatchExpressionGrid = labelMatchExpressionGrid;
            return this;
        }
        public ListAlertTemplatesResponseBodyAlertTemplatesLabelMatchExpressionGrid getLabelMatchExpressionGrid() {
            return this.labelMatchExpressionGrid;
        }

    }

}
