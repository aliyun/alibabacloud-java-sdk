// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class SetAccessPermissionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetAccessPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetAccessPermissionsResponseBody self = new SetAccessPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public SetAccessPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
