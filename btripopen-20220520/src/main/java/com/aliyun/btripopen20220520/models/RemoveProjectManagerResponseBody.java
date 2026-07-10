// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class RemoveProjectManagerResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public RemoveProjectManagerResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static RemoveProjectManagerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveProjectManagerResponseBody self = new RemoveProjectManagerResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveProjectManagerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemoveProjectManagerResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RemoveProjectManagerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemoveProjectManagerResponseBody setModule(RemoveProjectManagerResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public RemoveProjectManagerResponseBodyModule getModule() {
        return this.module;
    }

    public RemoveProjectManagerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveProjectManagerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RemoveProjectManagerResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class RemoveProjectManagerResponseBodyModule extends TeaModel {
        @NameInMap("add_num")
        public Integer addNum;

        @NameInMap("remove_num")
        public Integer removeNum;

        @NameInMap("rule_code")
        public Long ruleCode;

        public static RemoveProjectManagerResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            RemoveProjectManagerResponseBodyModule self = new RemoveProjectManagerResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public RemoveProjectManagerResponseBodyModule setAddNum(Integer addNum) {
            this.addNum = addNum;
            return this;
        }
        public Integer getAddNum() {
            return this.addNum;
        }

        public RemoveProjectManagerResponseBodyModule setRemoveNum(Integer removeNum) {
            this.removeNum = removeNum;
            return this;
        }
        public Integer getRemoveNum() {
            return this.removeNum;
        }

        public RemoveProjectManagerResponseBodyModule setRuleCode(Long ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public Long getRuleCode() {
            return this.ruleCode;
        }

    }

}
