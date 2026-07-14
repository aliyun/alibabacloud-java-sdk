// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseProjectResponseBody extends TeaModel {
    /**
     * <p>The ID of the associated order.</p>
     * 
     * <strong>example:</strong>
     * <p>278880417310796</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The instance ID of the Supabase instance.</p>
     * 
     * <strong>example:</strong>
     * <p>spb-xxxx</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSupabaseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseProjectResponseBody self = new CreateSupabaseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSupabaseProjectResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateSupabaseProjectResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateSupabaseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
