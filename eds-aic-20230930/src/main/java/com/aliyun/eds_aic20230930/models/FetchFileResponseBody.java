// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class FetchFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("Data")
    public java.util.List<FetchFileResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    public static FetchFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchFileResponseBody self = new FetchFileResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchFileResponseBody setData(java.util.List<FetchFileResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<FetchFileResponseBodyData> getData() {
        return this.data;
    }

    public FetchFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchFileResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class FetchFileResponseBodyData extends TeaModel {
        @NameInMap("AndroidInstanceId")
        public String androidInstanceId;

        @NameInMap("TaskId")
        public String taskId;

        public static FetchFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchFileResponseBodyData self = new FetchFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchFileResponseBodyData setAndroidInstanceId(String androidInstanceId) {
            this.androidInstanceId = androidInstanceId;
            return this;
        }
        public String getAndroidInstanceId() {
            return this.androidInstanceId;
        }

        public FetchFileResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
