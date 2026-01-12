// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoverAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Long count;

    @NameInMap("Data")
    public java.util.List<RecoverAppResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>6C8439B9-7DBF-57F4-92AE-55A9B9D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>t-1ljew7on6ay0j****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RecoverAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoverAppResponseBody self = new RecoverAppResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoverAppResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public RecoverAppResponseBody setData(java.util.List<RecoverAppResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RecoverAppResponseBodyData> getData() {
        return this.data;
    }

    public RecoverAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecoverAppResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class RecoverAppResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <strong>example:</strong>
         * <p>t-22ex666a653gq****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static RecoverAppResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecoverAppResponseBodyData self = new RecoverAppResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecoverAppResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public RecoverAppResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
