// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineIdsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListPipelineIdsResponseBodyResult> result;

    public static ListPipelineIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineIdsResponseBody self = new ListPipelineIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelineIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineIdsResponseBody setResult(java.util.List<ListPipelineIdsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListPipelineIdsResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListPipelineIdsResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("available")
        public Boolean available;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>testKibanaManagement</p>
         */
        @NameInMap("pipelineId")
        public String pipelineId;

        public static ListPipelineIdsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineIdsResponseBodyResult self = new ListPipelineIdsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPipelineIdsResponseBodyResult setAvailable(Boolean available) {
            this.available = available;
            return this;
        }
        public Boolean getAvailable() {
            return this.available;
        }

        public ListPipelineIdsResponseBodyResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListPipelineIdsResponseBodyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListPipelineIdsResponseBodyResult setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

    }

}
