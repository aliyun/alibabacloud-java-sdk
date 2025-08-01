// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateSupabaseProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sbp-180****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSupabaseProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSupabaseProjectResponseBody self = new CreateSupabaseProjectResponseBody();
        return TeaModel.build(map, self);
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
