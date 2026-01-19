// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>approle_01kghbvoptu5262q35aalvq7cxxxx</p>
     */
    @NameInMap("ApplicationRoleId")
    public String applicationRoleId;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateApplicationRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRoleResponseBody self = new CreateApplicationRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRoleResponseBody setApplicationRoleId(String applicationRoleId) {
        this.applicationRoleId = applicationRoleId;
        return this;
    }
    public String getApplicationRoleId() {
        return this.applicationRoleId;
    }

    public CreateApplicationRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
