// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CreateSubCorpResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CreateSubCorpResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>btrip123</p>
         */
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
