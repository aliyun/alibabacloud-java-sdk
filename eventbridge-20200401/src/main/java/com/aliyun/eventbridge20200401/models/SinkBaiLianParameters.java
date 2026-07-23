// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkBaiLianParameters extends TeaModel {
    /**
     * <p>The post-processing logic that runs after the main operation completes.</p>
     */
    @NameInMap("After")
    public SinkBaiLianParametersAfter after;

    /**
     * <p>The type of the Model Studio application to invoke.</p>
     */
    @NameInMap("ApplicationType")
    public String applicationType;

    /**
     * <p>The pre-processing logic to apply to an event before it is sent to the target.</p>
     */
    @NameInMap("Before")
    public SinkBaiLianParametersBefore before;

    /**
     * <p>Context information for the application. The value must be a JSON object.</p>
     */
    @NameInMap("Context")
    public Object context;

    /**
     * <p>Additional key-value pairs to pass to the target. The value must be a valid JSON object.</p>
     */
    @NameInMap("Extend")
    public Object extend;

    /**
     * <p>The offset for reading events from a stream or queue, used for stateful processing.</p>
     */
    @NameInMap("Offset")
    public SinkBaiLianParametersOffset offset;

    /**
     * <p>The operation that the Model Studio application will perform.</p>
     */
    @NameInMap("Op")
    public SinkBaiLianParametersOp op;

    /**
     * <p>The partition key for the event. This key routes events to a specific partition in the target service, ensuring ordered processing.</p>
     */
    @NameInMap("Partition")
    public SinkBaiLianParametersPartition partition;

    /**
     * <p>The unique ID of the Model Studio workspace.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SinkBaiLianParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkBaiLianParameters self = new SinkBaiLianParameters();
        return TeaModel.build(map, self);
    }

    public SinkBaiLianParameters setAfter(SinkBaiLianParametersAfter after) {
        this.after = after;
        return this;
    }
    public SinkBaiLianParametersAfter getAfter() {
        return this.after;
    }

    public SinkBaiLianParameters setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public SinkBaiLianParameters setBefore(SinkBaiLianParametersBefore before) {
        this.before = before;
        return this;
    }
    public SinkBaiLianParametersBefore getBefore() {
        return this.before;
    }

    public SinkBaiLianParameters setContext(Object context) {
        this.context = context;
        return this;
    }
    public Object getContext() {
        return this.context;
    }

    public SinkBaiLianParameters setExtend(Object extend) {
        this.extend = extend;
        return this;
    }
    public Object getExtend() {
        return this.extend;
    }

    public SinkBaiLianParameters setOffset(SinkBaiLianParametersOffset offset) {
        this.offset = offset;
        return this;
    }
    public SinkBaiLianParametersOffset getOffset() {
        return this.offset;
    }

    public SinkBaiLianParameters setOp(SinkBaiLianParametersOp op) {
        this.op = op;
        return this;
    }
    public SinkBaiLianParametersOp getOp() {
        return this.op;
    }

    public SinkBaiLianParameters setPartition(SinkBaiLianParametersPartition partition) {
        this.partition = partition;
        return this;
    }
    public SinkBaiLianParametersPartition getPartition() {
        return this.partition;
    }

    public SinkBaiLianParameters setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SinkBaiLianParametersAfter extends TeaModel {
        /**
         * <p>The method for generating the value. The <code>JSONPATH</code> option extracts data from the event payload. Valid values: <code>CONSTANT</code>, <code>JSONPATH</code>, and <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string for formatting the value. This parameter is used only when <code>Form</code> is set to <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The source content for the value, as specified by the <code>Form</code> parameter. For example, if <code>Form</code> is <code>JSONPATH</code>, this value must be a JSONPath expression.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkBaiLianParametersAfter build(java.util.Map<String, ?> map) throws Exception {
            SinkBaiLianParametersAfter self = new SinkBaiLianParametersAfter();
            return TeaModel.build(map, self);
        }

        public SinkBaiLianParametersAfter setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkBaiLianParametersAfter setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkBaiLianParametersAfter setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkBaiLianParametersBefore extends TeaModel {
        /**
         * <p>The method for generating the value. The <code>JSONPATH</code> option extracts data from the event payload. Valid values: <code>CONSTANT</code>, <code>JSONPATH</code>, and <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string for formatting the value. This parameter is used only when <code>Form</code> is set to <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The source content for the value, as specified by the <code>Form</code> parameter. For example, if <code>Form</code> is <code>JSONPATH</code>, this value must be a JSONPath expression.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkBaiLianParametersBefore build(java.util.Map<String, ?> map) throws Exception {
            SinkBaiLianParametersBefore self = new SinkBaiLianParametersBefore();
            return TeaModel.build(map, self);
        }

        public SinkBaiLianParametersBefore setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkBaiLianParametersBefore setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkBaiLianParametersBefore setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkBaiLianParametersOffset extends TeaModel {
        /**
         * <p>The method for generating the value. The <code>JSONPATH</code> option extracts data from the event payload. Valid values: <code>CONSTANT</code>, <code>JSONPATH</code>, and <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string for formatting the value. This parameter is used only when <code>Form</code> is set to <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The source content for the value, as specified by the <code>Form</code> parameter. For example, if <code>Form</code> is <code>JSONPATH</code>, this value must be a JSONPath expression.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkBaiLianParametersOffset build(java.util.Map<String, ?> map) throws Exception {
            SinkBaiLianParametersOffset self = new SinkBaiLianParametersOffset();
            return TeaModel.build(map, self);
        }

        public SinkBaiLianParametersOffset setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkBaiLianParametersOffset setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkBaiLianParametersOffset setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkBaiLianParametersOp extends TeaModel {
        /**
         * <p>The method for generating the value. The <code>JSONPATH</code> option extracts data from the event payload. Valid values: <code>CONSTANT</code>, <code>JSONPATH</code>, and <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string for formatting the value. This parameter is used only when <code>Form</code> is set to <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The source content for the value, as specified by the <code>Form</code> parameter. For example, if <code>Form</code> is <code>JSONPATH</code>, this value must be a JSONPath expression.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkBaiLianParametersOp build(java.util.Map<String, ?> map) throws Exception {
            SinkBaiLianParametersOp self = new SinkBaiLianParametersOp();
            return TeaModel.build(map, self);
        }

        public SinkBaiLianParametersOp setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkBaiLianParametersOp setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkBaiLianParametersOp setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkBaiLianParametersPartition extends TeaModel {
        /**
         * <p>The method for generating the value. The <code>JSONPATH</code> option extracts data from the event payload. Valid values: <code>CONSTANT</code>, <code>JSONPATH</code>, and <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string for formatting the value. This parameter is used only when <code>Form</code> is set to <code>TEMPLATE</code>.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The source content for the value, as specified by the <code>Form</code> parameter. For example, if <code>Form</code> is <code>JSONPATH</code>, this value must be a JSONPath expression.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkBaiLianParametersPartition build(java.util.Map<String, ?> map) throws Exception {
            SinkBaiLianParametersPartition self = new SinkBaiLianParametersPartition();
            return TeaModel.build(map, self);
        }

        public SinkBaiLianParametersPartition setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkBaiLianParametersPartition setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkBaiLianParametersPartition setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
