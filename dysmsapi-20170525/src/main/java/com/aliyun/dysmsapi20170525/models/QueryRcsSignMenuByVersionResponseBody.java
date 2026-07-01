// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRcsSignMenuByVersionResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryRcsSignMenuByVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRcsSignMenuByVersionResponseBody self = new QueryRcsSignMenuByVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRcsSignMenuByVersionResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryRcsSignMenuByVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRcsSignMenuByVersionResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public QueryRcsSignMenuByVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRcsSignMenuByVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRcsSignMenuByVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
