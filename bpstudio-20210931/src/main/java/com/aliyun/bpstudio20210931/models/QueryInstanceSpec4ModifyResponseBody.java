// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class QueryInstanceSpec4ModifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;PolicyType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalOwnerId&quot;: &quot;&quot;,
     *     &quot;EncodedDiagnosticMessage&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalType&quot;: &quot;&quot;,
     *     &quot;AuthPrincipalDisplayName&quot;: &quot;&quot;,
     *     &quot;NoPermissionType&quot;: &quot;&quot;,
     *     &quot;AuthAction&quot;: &quot;&quot;
     *   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>847C9D0A-BABD-589C-8A9C-6464409EDED9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryInstanceSpec4ModifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceSpec4ModifyResponseBody self = new QueryInstanceSpec4ModifyResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInstanceSpec4ModifyResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryInstanceSpec4ModifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryInstanceSpec4ModifyResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryInstanceSpec4ModifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryInstanceSpec4ModifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryInstanceSpec4ModifyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
