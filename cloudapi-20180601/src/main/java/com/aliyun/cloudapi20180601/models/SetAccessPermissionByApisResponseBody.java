// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class SetAccessPermissionByApisResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessPermissionByApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionByApisResponseBody self = new SetAccessPermissionByApisResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionByApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
