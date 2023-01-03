// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertTemplatesResponseBody extends TeaModel {
    // The struct returned.
    @NameInMap("PrometheusAlertTemplates")
    public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates> prometheusAlertTemplates;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static ListPrometheusAlertTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusAlertTemplatesResponseBody self = new ListPrometheusAlertTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrometheusAlertTemplatesResponseBody setPrometheusAlertTemplates(java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates> prometheusAlertTemplates) {
        this.prometheusAlertTemplates = prometheusAlertTemplates;
        return this;
    }
    public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates> getPrometheusAlertTemplates() {
        return this.prometheusAlertTemplates;
    }

    public ListPrometheusAlertTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations extends TeaModel {
        // The name of the annotation.
        @NameInMap("Name")
        public String name;

        // The value of the annotation.
        @NameInMap("Value")
        public String value;

        public static ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations self = new ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels extends TeaModel {
        // The name of the tag.
        @NameInMap("Name")
        public String name;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels self = new ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates extends TeaModel {
        // The name of the alert rule.
        @NameInMap("AlertName")
        public String alertName;

        // The annotations of the alert rule.
        @NameInMap("Annotations")
        public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations> annotations;

        // The message of the alert notification. Tags can be referenced in the {{$labels.xxx}} format.
        @NameInMap("Description")
        public String description;

        // The duration of the alert. Valid values: 1 to 1440. Unit: minutes.
        @NameInMap("Duration")
        public String duration;

        // The expression of the alert rule.
        @NameInMap("Expression")
        public String expression;

        // The tags of the alert rule.
        @NameInMap("Labels")
        public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels> labels;

        // The type of the alert rule.
        @NameInMap("Type")
        public String type;

        // The version of the alert rule.
        @NameInMap("Version")
        public String version;

        public static ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates self = new ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates();
            return TeaModel.build(map, self);
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setAnnotations(java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations> getAnnotations() {
            return this.annotations;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setLabels(java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels> getLabels() {
            return this.labels;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
