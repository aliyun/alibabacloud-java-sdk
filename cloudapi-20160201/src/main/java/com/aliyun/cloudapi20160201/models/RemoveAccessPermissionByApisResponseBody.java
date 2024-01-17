// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAccessPermissionByApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByApisResponseBody self = new RemoveAccessPermissionByApisResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
