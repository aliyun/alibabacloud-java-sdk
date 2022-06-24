// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchDisableSentinelParamDegradeRulesResponseBody extends TeaModel {
    // RestResponse<Integer>
    @NameInMap("Content")
    public BatchDisableSentinelParamDegradeRulesResponseBodyContent content;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    public static BatchDisableSentinelParamDegradeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDisableSentinelParamDegradeRulesResponseBody self = new BatchDisableSentinelParamDegradeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDisableSentinelParamDegradeRulesResponseBody setContent(BatchDisableSentinelParamDegradeRulesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public BatchDisableSentinelParamDegradeRulesResponseBodyContent getContent() {
        return this.content;
    }

    public BatchDisableSentinelParamDegradeRulesResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public BatchDisableSentinelParamDegradeRulesResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public static class BatchDisableSentinelParamDegradeRulesResponseBodyContent extends TeaModel {
        // 请求响应码，200 为success
        @NameInMap("Code")
        public String code;

        // 返回的数据对象
        @NameInMap("Data")
        public Integer data;

        // 返回的错误信息
        @NameInMap("Message")
        public String message;

        // 请求ID
        @NameInMap("RequestId")
        public String requestId;

        // 是否成功标识
        @NameInMap("Success")
        public Boolean success;

        public static BatchDisableSentinelParamDegradeRulesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            BatchDisableSentinelParamDegradeRulesResponseBodyContent self = new BatchDisableSentinelParamDegradeRulesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public BatchDisableSentinelParamDegradeRulesResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchDisableSentinelParamDegradeRulesResponseBodyContent setData(Integer data) {
            this.data = data;
            return this;
        }
        public Integer getData() {
            return this.data;
        }

        public BatchDisableSentinelParamDegradeRulesResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchDisableSentinelParamDegradeRulesResponseBodyContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public BatchDisableSentinelParamDegradeRulesResponseBodyContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
