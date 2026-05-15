// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectRoleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>base_role_dte</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>B313938A-4475-599B-98EB-A0875019FD5B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProjectRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRoleResponseBody self = new CreateProjectRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProjectRoleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateProjectRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
