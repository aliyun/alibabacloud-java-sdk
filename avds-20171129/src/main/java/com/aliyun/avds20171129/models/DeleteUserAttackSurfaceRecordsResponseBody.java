// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteUserAttackSurfaceRecordsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserAttackSurfaceRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAttackSurfaceRecordsResponseBody self = new DeleteUserAttackSurfaceRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserAttackSurfaceRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
