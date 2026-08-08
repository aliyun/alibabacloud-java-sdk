// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class UpdateCrossAccountsResponseBody extends TeaModel {
    @NameInMap("Data")
    public UpdateCrossAccountsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>8724BC18-904D-5A0D-BFF4-F0554F0037E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCrossAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCrossAccountsResponseBody self = new UpdateCrossAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCrossAccountsResponseBody setData(UpdateCrossAccountsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateCrossAccountsResponseBodyData getData() {
        return this.data;
    }

    public UpdateCrossAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateCrossAccountsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>t-0000e4w0u1v592zdf6s7</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static UpdateCrossAccountsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateCrossAccountsResponseBodyData self = new UpdateCrossAccountsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateCrossAccountsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
