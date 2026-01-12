// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoverAndroidInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    @NameInMap("Data")
    public java.util.List<RecoverAndroidInstanceResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-1ljew7on6ay0j****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RecoverAndroidInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverAndroidInstanceResponseBody self = new RecoverAndroidInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverAndroidInstanceResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public RecoverAndroidInstanceResponseBody setData(java.util.List<RecoverAndroidInstanceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RecoverAndroidInstanceResponseBodyData> getData() {
        return this.data;
    }

    public RecoverAndroidInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecoverAndroidInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class RecoverAndroidInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <strong>example:</strong>
         * <p>t-bp67acfmxazb4p****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static RecoverAndroidInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecoverAndroidInstanceResponseBodyData self = new RecoverAndroidInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecoverAndroidInstanceResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public RecoverAndroidInstanceResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
