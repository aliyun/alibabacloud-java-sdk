// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>66428721-FFEC-5023-B4E5-3BD1B67837E0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateServiceLinkedRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleResponseBody self = new CreateServiceLinkedRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
