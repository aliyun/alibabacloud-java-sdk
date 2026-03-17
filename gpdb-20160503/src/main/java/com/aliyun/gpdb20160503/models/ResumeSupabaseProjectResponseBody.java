// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResumeSupabaseProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeSupabaseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeSupabaseProjectResponseBody self = new ResumeSupabaseProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeSupabaseProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
