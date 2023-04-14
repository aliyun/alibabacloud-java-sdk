// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CreateSubCorpResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CreateSubCorpResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static CreateSubCorpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCorpResponseBody self = new CreateSubCorpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubCorpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSubCorpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSubCorpResponseBody setModule(CreateSubCorpResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CreateSubCorpResponseBodyModule getModule() {
        return this.module;
    }

    public CreateSubCorpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSubCorpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateSubCorpResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CreateSubCorpResponseBodyModule extends TeaModel {
        @NameInMap("sub_corp_id")
        public String subCorpId;

        public static CreateSubCorpResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CreateSubCorpResponseBodyModule self = new CreateSubCorpResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CreateSubCorpResponseBodyModule setSubCorpId(String subCorpId) {
            this.subCorpId = subCorpId;
            return this;
        }
        public String getSubCorpId() {
            return this.subCorpId;
        }

    }

}
