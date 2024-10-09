// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class CheckRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckRulesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>700683DE-0154-56D4-8D76-3B7A2C2C7DF9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckRulesResponseBody self = new CheckRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckRulesResponseBody setData(CheckRulesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckRulesResponseBodyData getData() {
        return this.data;
    }

    public CheckRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckRulesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>t-0000e4w0u1v592zdf6s7</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CheckRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckRulesResponseBodyData self = new CheckRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckRulesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
