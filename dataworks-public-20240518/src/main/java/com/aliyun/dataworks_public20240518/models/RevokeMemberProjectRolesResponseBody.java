// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class RevokeMemberProjectRolesResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RevokeMemberProjectRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RevokeMemberProjectRolesResponseBody self = new RevokeMemberProjectRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public RevokeMemberProjectRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
