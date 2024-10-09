// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateResourcesResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateResourcesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>5B2F09BF-CEBD-5A7E-AC01-E7F86169A5E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourcesResponseBody self = new UpdateResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateResourcesResponseBody setData(UpdateResourcesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateResourcesResponseBodyData getData() {
        return this.data;
    }

    public UpdateResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateResourcesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>t-bp1ewftyzmeg3bl4dtd2</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateResourcesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateResourcesResponseBodyData self = new UpdateResourcesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateResourcesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
