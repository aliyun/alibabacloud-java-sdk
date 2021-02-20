// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteOrgAttackSurfaceRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteOrgAttackSurfaceRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrgAttackSurfaceRecordsResponseBody self = new DeleteOrgAttackSurfaceRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteOrgAttackSurfaceRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
