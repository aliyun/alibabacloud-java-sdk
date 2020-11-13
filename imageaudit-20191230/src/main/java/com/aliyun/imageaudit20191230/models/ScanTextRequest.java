// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanTextRequest extends TeaModel {
    @NameInMap("Tasks")
    @Validation(required = true)
    public java.util.List<ScanTextRequestTasks> tasks;

    @NameInMap("Labels")
    @Validation(required = true)
    public java.util.List<ScanTextRequestLabels> labels;

    public static ScanTextRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanTextRequest self = new ScanTextRequest();
        return TeaModel.build(map, self);
    }

    public ScanTextRequest setTasks(java.util.List<ScanTextRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ScanTextRequestTasks> getTasks() {
        return this.tasks;
    }

    public ScanTextRequest setLabels(java.util.List<ScanTextRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ScanTextRequestLabels> getLabels() {
        return this.labels;
    }

    public static class ScanTextRequestTasks extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static ScanTextRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            ScanTextRequestTasks self = new ScanTextRequestTasks();
            return TeaModel.build(map, self);
        }

        public ScanTextRequestTasks setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

    public static class ScanTextRequestLabels extends TeaModel {
        @NameInMap("Label")
        @Validation(required = true)
        public String label;

        public static ScanTextRequestLabels build(java.util.Map<String, ?> map) throws Exception {
            ScanTextRequestLabels self = new ScanTextRequestLabels();
            return TeaModel.build(map, self);
        }

        public ScanTextRequestLabels setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

}
