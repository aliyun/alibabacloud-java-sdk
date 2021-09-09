// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListPipelineIdsResponseBody extends TeaModel {
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
        @NameInMap("pipelineId")
        public String pipelineId;

        @NameInMap("available")
        public Boolean available;

        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static ListPipelineIdsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineIdsResponseBodyResult self = new ListPipelineIdsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPipelineIdsResponseBodyResult setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
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

    }

}
