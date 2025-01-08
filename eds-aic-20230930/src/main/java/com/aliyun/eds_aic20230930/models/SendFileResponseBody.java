// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SendFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("Data")
    public java.util.List<SendFileResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static SendFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendFileResponseBody self = new SendFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SendFileResponseBody setData(java.util.List<SendFileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SendFileResponseBodyData> getData() {
        return this.data;
    }

    public SendFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SendFileResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class SendFileResponseBodyData extends TeaModel {
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        @NameInMap("TaskId")
        public String taskId;

        public static SendFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SendFileResponseBodyData self = new SendFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SendFileResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public SendFileResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
