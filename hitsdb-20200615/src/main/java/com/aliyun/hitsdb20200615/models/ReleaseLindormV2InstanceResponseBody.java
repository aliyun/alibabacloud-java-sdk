// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ReleaseLindormV2InstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>0A7153E4-8354-497E-87E5-5D0EBEF5AEB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ReleaseLindormV2InstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReleaseLindormV2InstanceResponseBody self = new ReleaseLindormV2InstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReleaseLindormV2InstanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ReleaseLindormV2InstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
