// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryGroupCorpListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A3F8DCAB-8301-5770-BD9F-71B0BF9E1A6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<QueryGroupCorpListResponseBodyModule> module;

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
    @NameInMap("trace_id")
    public String traceId;

    public static QueryGroupCorpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryGroupCorpListResponseBody self = new QueryGroupCorpListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryGroupCorpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryGroupCorpListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryGroupCorpListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryGroupCorpListResponseBody setModule(java.util.List<QueryGroupCorpListResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<QueryGroupCorpListResponseBodyModule> getModule() {
        return this.module;
    }

    public QueryGroupCorpListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryGroupCorpListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryGroupCorpListResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>corp1</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        public static QueryGroupCorpListResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryGroupCorpListResponseBodyModule self = new QueryGroupCorpListResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryGroupCorpListResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public QueryGroupCorpListResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

    }

}
