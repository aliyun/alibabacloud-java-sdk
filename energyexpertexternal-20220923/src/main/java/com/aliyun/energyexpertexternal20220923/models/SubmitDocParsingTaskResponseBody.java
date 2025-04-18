// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocParsingTaskResponseBody extends TeaModel {
    /**
     * <p>Return result.</p>
     */
    @NameInMap("data")
    public SubmitDocParsingTaskResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SubmitDocParsingTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocParsingTaskResponseBody self = new SubmitDocParsingTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocParsingTaskResponseBody setData(SubmitDocParsingTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocParsingTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocParsingTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDocParsingTaskResponseBodyData extends TeaModel {
        /**
         * <p>TaskID</p>
         * 
         * <strong>example:</strong>
         * <p>ae9d07be-1a11-4d30-be75-cc962b98279c</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitDocParsingTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocParsingTaskResponseBodyData self = new SubmitDocParsingTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocParsingTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
