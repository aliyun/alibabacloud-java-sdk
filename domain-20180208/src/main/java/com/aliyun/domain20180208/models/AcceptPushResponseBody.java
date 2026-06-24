// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class AcceptPushResponseBody extends TeaModel {
    /**
     * <p>RAM鉴权失败时的标准化错误详情，JSON字符串，包含NoPermissionType、PolicyType、AuthPrincipalType、EncodedDiagnosticMessage等字段</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;domain:AcceptPush&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>是否允许重试</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowRetry")
    public Boolean allowRetry;

    /**
     * <p>HTTP状态码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>业务数据模块</p>
     */
    @NameInMap("Module")
    public AcceptPushResponseBodyModule module;

    /**
     * <p>唯一请求识别码</p>
     * 
     * <strong>example:</strong>
     * <p>2DEDFF32-7827-46B1-BE90-3DB8ABD91A58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>是否调用成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AcceptPushResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AcceptPushResponseBody self = new AcceptPushResponseBody();
        return TeaModel.build(map, self);
    }

    public AcceptPushResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public AcceptPushResponseBody setAllowRetry(Boolean allowRetry) {
        this.allowRetry = allowRetry;
        return this;
    }
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    public AcceptPushResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AcceptPushResponseBody setModule(AcceptPushResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AcceptPushResponseBodyModule getModule() {
        return this.module;
    }

    public AcceptPushResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AcceptPushResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AcceptPushResponseBodyModule extends TeaModel {
        /**
         * <p>结果码，失败时返回</p>
         * 
         * <strong>example:</strong>
         * <p>ALREADY_ACCEPTED</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>结果描述</p>
         * 
         * <strong>example:</strong>
         * <p>接收成功</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Push编号</p>
         * 
         * <strong>example:</strong>
         * <p>push_20250101_abc123</p>
         */
        @NameInMap("PushNo")
        public String pushNo;

        /**
         * <p>是否接收成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static AcceptPushResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AcceptPushResponseBodyModule self = new AcceptPushResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AcceptPushResponseBodyModule setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AcceptPushResponseBodyModule setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AcceptPushResponseBodyModule setPushNo(String pushNo) {
            this.pushNo = pushNo;
            return this;
        }
        public String getPushNo() {
            return this.pushNo;
        }

        public AcceptPushResponseBodyModule setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
