// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class QueryCorpDetailInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public QueryCorpDetailInfoResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static QueryCorpDetailInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpDetailInfoResponseBody self = new QueryCorpDetailInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCorpDetailInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCorpDetailInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCorpDetailInfoResponseBody setModule(QueryCorpDetailInfoResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public QueryCorpDetailInfoResponseBodyModule getModule() {
        return this.module;
    }

    public QueryCorpDetailInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCorpDetailInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCorpDetailInfoResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class QueryCorpDetailInfoResponseBodyModule extends TeaModel {
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("corp_name")
        public String corpName;

        @NameInMap("open_agent_id")
        public String openAgentId;

        @NameInMap("super_admin_name")
        public String superAdminName;

        @NameInMap("super_admin_phone")
        public String superAdminPhone;

        @NameInMap("user_id")
        public String userId;

        public static QueryCorpDetailInfoResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            QueryCorpDetailInfoResponseBodyModule self = new QueryCorpDetailInfoResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public QueryCorpDetailInfoResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public QueryCorpDetailInfoResponseBodyModule setCorpName(String corpName) {
            this.corpName = corpName;
            return this;
        }
        public String getCorpName() {
            return this.corpName;
        }

        public QueryCorpDetailInfoResponseBodyModule setOpenAgentId(String openAgentId) {
            this.openAgentId = openAgentId;
            return this;
        }
        public String getOpenAgentId() {
            return this.openAgentId;
        }

        public QueryCorpDetailInfoResponseBodyModule setSuperAdminName(String superAdminName) {
            this.superAdminName = superAdminName;
            return this;
        }
        public String getSuperAdminName() {
            return this.superAdminName;
        }

        public QueryCorpDetailInfoResponseBodyModule setSuperAdminPhone(String superAdminPhone) {
            this.superAdminPhone = superAdminPhone;
            return this;
        }
        public String getSuperAdminPhone() {
            return this.superAdminPhone;
        }

        public QueryCorpDetailInfoResponseBodyModule setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
