// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteSentinelParamDegradeRuleResponseBody extends TeaModel {
    // RestResponse<Long>
    @NameInMap("Content")
    public DeleteSentinelParamDegradeRuleResponseBodyContent content;

    @NameInMap("First")
    public Boolean first;

    @NameInMap("Last")
    public Boolean last;

    public static DeleteSentinelParamDegradeRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSentinelParamDegradeRuleResponseBody self = new DeleteSentinelParamDegradeRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSentinelParamDegradeRuleResponseBody setContent(DeleteSentinelParamDegradeRuleResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DeleteSentinelParamDegradeRuleResponseBodyContent getContent() {
        return this.content;
    }

    public DeleteSentinelParamDegradeRuleResponseBody setFirst(Boolean first) {
        this.first = first;
        return this;
    }
    public Boolean getFirst() {
        return this.first;
    }

    public DeleteSentinelParamDegradeRuleResponseBody setLast(Boolean last) {
        this.last = last;
        return this;
    }
    public Boolean getLast() {
        return this.last;
    }

    public static class DeleteSentinelParamDegradeRuleResponseBodyContent extends TeaModel {
        // 请求响应码，200 为success
        @NameInMap("Code")
        public String code;

        // 返回的数据对象
        @NameInMap("Data")
        public Long data;

        // 返回的错误信息
        @NameInMap("Message")
        public String message;

        // 请求ID
        @NameInMap("RequestId")
        public String requestId;

        // 是否成功标识
        @NameInMap("Success")
        public Boolean success;

        public static DeleteSentinelParamDegradeRuleResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DeleteSentinelParamDegradeRuleResponseBodyContent self = new DeleteSentinelParamDegradeRuleResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DeleteSentinelParamDegradeRuleResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteSentinelParamDegradeRuleResponseBodyContent setData(Long data) {
            this.data = data;
            return this;
        }
        public Long getData() {
            return this.data;
        }

        public DeleteSentinelParamDegradeRuleResponseBodyContent setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DeleteSentinelParamDegradeRuleResponseBodyContent setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DeleteSentinelParamDegradeRuleResponseBodyContent setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
