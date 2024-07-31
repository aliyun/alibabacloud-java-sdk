// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class AddProjectMemberToRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
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
