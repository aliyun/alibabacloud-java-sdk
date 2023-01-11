// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit20191230.models;

import com.aliyun.tea.*;

public class ScanTextRequest extends TeaModel {
    /**
     * <p>1</p>
     */
    @NameInMap("Labels")
    public java.util.List<ScanTextRequestLabels> labels;

    /**
     * <p>1</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ScanTextRequestTasks> tasks;

    public static ScanTextRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanTextRequest self = new ScanTextRequest();
        return TeaModel.build(map, self);
    }

    public ScanTextRequest setLabels(java.util.List<ScanTextRequestLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<ScanTextRequestLabels> getLabels() {
        return this.labels;
    }

    public ScanTextRequest setTasks(java.util.List<ScanTextRequestTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ScanTextRequestTasks> getTasks() {
        return this.tasks;
    }

    public static class ScanTextRequestLabels extends TeaModel {
        @NameInMap("Label")
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

    public static class ScanTextRequestTasks extends TeaModel {
        @NameInMap("Content")
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

}
