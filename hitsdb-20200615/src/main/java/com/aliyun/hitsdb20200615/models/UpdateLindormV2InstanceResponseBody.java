// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class UpdateLindormV2InstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;AuthAction&quot;:&quot;xxx&quot;,&quot;AuthPrincipalDisplayName&quot;:&quot;222&quot;,&quot;AuthPrincipalOwnerId&quot;:&quot;111&quot;,&quot;AuthPrincipalType&quot;:&quot;SubUser&quot;,,&quot;NoPermissionType&quot;:&quot;ImplicitDeny&quot;,&quot;PolicyType&quot;:&quot;AccountLevelIdentityBasedPolicy&quot;,&quot;EncodedDiagnosticMessage&quot;:&quot;xxxxxx&quot;}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>ld-bp1478w1603****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>240136741090345</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <strong>example:</strong>
     * <p>1556DCB0-043A-4444-8BD9-CF4A68E7EE64</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLindormV2InstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLindormV2InstanceResponseBody self = new UpdateLindormV2InstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLindormV2InstanceResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public UpdateLindormV2InstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateLindormV2InstanceResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public UpdateLindormV2InstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
