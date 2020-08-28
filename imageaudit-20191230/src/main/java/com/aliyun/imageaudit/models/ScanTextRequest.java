// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageaudit.models;

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

    public static class ScanTextRequestTasks extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        public String content;

        public static ScanTextRequestTasks build(java.util.Map<String, ?> map) throws Exception {
            ScanTextRequestTasks self = new ScanTextRequestTasks();
            return TeaModel.build(map, self);
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

    }

}
