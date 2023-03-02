// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddProjectMemberToRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddProjectMemberToRoleResponseBody self = new AddProjectMemberToRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddProjectMemberToRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
