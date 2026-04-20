// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ModifySupabaseAutoScalePolicyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>07F6177E-6DE4-408A-BB4F-0723301340F3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifySupabaseAutoScalePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySupabaseAutoScalePolicyResponseBody self = new ModifySupabaseAutoScalePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySupabaseAutoScalePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
