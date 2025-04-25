// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkBaiLianParameters extends TeaModel {
    @NameInMap("After")
    public SinkBaiLianParametersAfter after;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("Before")
    public SinkBaiLianParametersBefore before;

    @NameInMap("Context")
    public Object context;

    @NameInMap("Extend")
    public Object extend;

    @NameInMap("Offset")
    public SinkBaiLianParametersOffset offset;

    @NameInMap("Op")
    public SinkBaiLianParametersOp op;

    @NameInMap("Partition")
    public SinkBaiLianParametersPartition partition;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
