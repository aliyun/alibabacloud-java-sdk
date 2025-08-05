// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class EnableCheckerForProjectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableCheckerForProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableCheckerForProjectResponseBody self = new EnableCheckerForProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableCheckerForProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
