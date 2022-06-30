// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class DeleteAppVersionResponseBody extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAppVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppVersionResponseBody self = new DeleteAppVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAppVersionResponseBody setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public DeleteAppVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
