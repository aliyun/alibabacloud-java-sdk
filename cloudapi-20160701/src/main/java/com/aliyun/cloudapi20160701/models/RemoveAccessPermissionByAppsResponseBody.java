// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAccessPermissionByAppsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByAppsResponseBody self = new RemoveAccessPermissionByAppsResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByAppsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
