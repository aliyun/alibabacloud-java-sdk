// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class SubmitDocExtractionTaskResponseBody extends TeaModel {
    /**
     * <p>Returned data</p>
     */
    @NameInMap("data")
    public SubmitDocExtractionTaskResponseBodyData data;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static SubmitDocExtractionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocExtractionTaskResponseBody self = new SubmitDocExtractionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitDocExtractionTaskResponseBody setData(SubmitDocExtractionTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitDocExtractionTaskResponseBodyData getData() {
        return this.data;
    }

    public SubmitDocExtractionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitDocExtractionTaskResponseBodyData extends TeaModel {
        /**
         * <p>Task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>864773ec-d35b-4c36-8871-52d07fbe806d</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static SubmitDocExtractionTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocExtractionTaskResponseBodyData self = new SubmitDocExtractionTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitDocExtractionTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
