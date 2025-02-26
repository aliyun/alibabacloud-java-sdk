// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class CreateDefaultRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{ &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;, &quot;AuthPrincipalOwnerId&quot;: &quot;xxxx&quot;, &quot;EncodedDiagnosticMessage&quot;: &quot;xxxx&quot;, &quot;AuthPrincipalType&quot;: &quot;SubUser&quot;, &quot;AuthPrincipalDisplayName&quot;: &quot;xxxx&quot;, &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;, &quot;AuthAction&quot;: &quot;milvus:xxxx&quot; }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <strong>example:</strong>
     * <p>Instance.NotFound</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Failed to find instance c-123xxx</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>ABCD-1234-5678-EFGH</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateDefaultRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultRoleResponseBody self = new CreateDefaultRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDefaultRoleResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateDefaultRoleResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateDefaultRoleResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public CreateDefaultRoleResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public CreateDefaultRoleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateDefaultRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDefaultRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
