// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ModifyApplicationSpecResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>-1</p>
     */
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
     * <p>A3488F1D-xxxx-xxxx-xxxx-5374BA0F3562</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifyApplicationSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationSpecResponseBody self = new ModifyApplicationSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationSpecResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ModifyApplicationSpecResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyApplicationSpecResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ModifyApplicationSpecResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyApplicationSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyApplicationSpecResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
