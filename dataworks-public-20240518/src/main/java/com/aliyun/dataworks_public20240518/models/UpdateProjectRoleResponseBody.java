// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateProjectRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>037DFCE4-ABA5-51D7-9F2D-CCF709252DAA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProjectRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectRoleResponseBody self = new UpdateProjectRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
