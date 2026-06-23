// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteProjectRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5BCD2252-F184-55A8-9675-337C43BE0CD1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProjectRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProjectRoleResponseBody self = new DeleteProjectRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProjectRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
