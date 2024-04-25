// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteIdpDepartmentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIdpDepartmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdpDepartmentResponseBody self = new DeleteIdpDepartmentResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdpDepartmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
