// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GrantMemberProjectRolesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2d9ced66-38ef-4923-baf6-391dd3a7e656</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GrantMemberProjectRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantMemberProjectRolesResponseBody self = new GrantMemberProjectRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantMemberProjectRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
