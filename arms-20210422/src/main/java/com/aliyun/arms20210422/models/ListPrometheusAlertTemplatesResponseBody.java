// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListPrometheusAlertTemplatesResponseBody extends TeaModel {
    @NameInMap("PrometheusAlertTemplates")
    public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplates> prometheusAlertTemplates;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("Name")
        public String name;

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
        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("Annotations")
        public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesAnnotations> annotations;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Labels")
        public java.util.List<ListPrometheusAlertTemplatesResponseBodyPrometheusAlertTemplatesLabels> labels;

        @NameInMap("Type")
        public String type;

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
