// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DisableCheckerForProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableCheckerForProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableCheckerForProjectResponseBody self = new DisableCheckerForProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableCheckerForProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
