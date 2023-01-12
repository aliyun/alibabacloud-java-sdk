// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class QueryCrossPrivatePermissionResponseBody extends TeaModel {
    @NameInMap("CrossPrivatePermission")
    public Boolean crossPrivatePermission;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCrossPrivatePermissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCrossPrivatePermissionResponseBody self = new QueryCrossPrivatePermissionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCrossPrivatePermissionResponseBody setCrossPrivatePermission(Boolean crossPrivatePermission) {
        this.crossPrivatePermission = crossPrivatePermission;
        return this;
    }
    public Boolean getCrossPrivatePermission() {
        return this.crossPrivatePermission;
    }

    public QueryCrossPrivatePermissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
