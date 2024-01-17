// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RemoveAccessPermissionByAppsForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAccessPermissionByAppsForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessPermissionByAppsForInnerResponseBody self = new RemoveAccessPermissionByAppsForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAccessPermissionByAppsForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
