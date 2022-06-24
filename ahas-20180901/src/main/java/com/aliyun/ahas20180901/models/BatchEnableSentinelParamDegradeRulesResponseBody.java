// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class BatchEnableSentinelParamDegradeRulesResponseBody extends TeaModel {
    // RestResponse<Integer>
    @NameInMap("Content")
    public BatchEnableSentinelParamDegradeRulesResponseBodyContent content;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    public static BatchEnableSentinelParamDegradeRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchEnableSentinelParamDegradeRulesResponseBody self = new BatchEnableSentinelParamDegradeRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchEnableSentinelParamDegradeRulesResponseBody setContent(BatchEnableSentinelParamDegradeRulesResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public BatchEnableSentinelParamDegradeRulesResponseBodyContent getContent() {
        return this.content;
    }

    public BatchEnableSentinelParamDegradeRulesResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public BatchEnableSentinelParamDegradeRulesResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public static class BatchEnableSentinelParamDegradeRulesResponseBodyContent extends TeaModel {
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

        public static BatchEnableSentinelParamDegradeRulesResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            BatchEnableSentinelParamDegradeRulesResponseBodyContent self = new BatchEnableSentinelParamDegradeRulesResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public BatchEnableSentinelParamDegradeRulesResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BatchEnableSentinelParamDegradeRulesResponseBodyContent setData(Integer data) {
            this.data = data;
            return this;
        }
        public Integer getData() {
            return this.data;
        }

        public BatchEnableSentinelParamDegradeRulesResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchEnableSentinelParamDegradeRulesResponseBodyContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public BatchEnableSentinelParamDegradeRulesResponseBodyContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
