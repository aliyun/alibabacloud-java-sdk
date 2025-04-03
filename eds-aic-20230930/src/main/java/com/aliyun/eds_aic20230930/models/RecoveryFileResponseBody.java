// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoveryFileResponseBody extends TeaModel {
    /**
     * <p>The number of restored instances.</p>
     * 
     * <strong>example:</strong>
     * <p>97</p>
     */
    @NameInMap("Count")
    public Long count;

    /**
     * <p>The backup file that is restored.</p>
     * 
     * <strong>example:</strong>
     * <p>6AD56E39-430B-5401-AB4A-7B086454****</p>
     */
    @NameInMap("Data")
    public java.util.List<RecoveryFileResponseBodyData> data;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6AD56E39-430B-5401-AB4A-7B086454****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the batch task.</p>
     * 
     * <strong>example:</strong>
     * <p>t-5prhfo7wv1gjx****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static RecoveryFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoveryFileResponseBody self = new RecoveryFileResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoveryFileResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public RecoveryFileResponseBody setData(java.util.List<RecoveryFileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RecoveryFileResponseBodyData> getData() {
        return this.data;
    }

    public RecoveryFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecoveryFileResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class RecoveryFileResponseBodyData extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>acp-34pqe4r0kd9kn****</p>
         */
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-5prhfo7wv1gjx****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static RecoveryFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecoveryFileResponseBodyData self = new RecoveryFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecoveryFileResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public RecoveryFileResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
