// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class PrecheckResourceCountResponseBody extends TeaModel {
    @NameInMap("Data")
    public PrecheckResourceCountResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>86DEBAC9-AB6A-59AB-9E5C-A540E579ECC9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PrecheckResourceCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PrecheckResourceCountResponseBody self = new PrecheckResourceCountResponseBody();
        return TeaModel.build(map, self);
    }

    public PrecheckResourceCountResponseBody setData(PrecheckResourceCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PrecheckResourceCountResponseBodyData getData() {
        return this.data;
    }

    public PrecheckResourceCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class PrecheckResourceCountResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>t-bp1ewftyzmeg3bl4dtd2</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static PrecheckResourceCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PrecheckResourceCountResponseBodyData self = new PrecheckResourceCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PrecheckResourceCountResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
