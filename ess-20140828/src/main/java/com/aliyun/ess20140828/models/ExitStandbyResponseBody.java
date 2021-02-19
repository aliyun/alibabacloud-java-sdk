// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class ExitStandbyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ExitStandbyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExitStandbyResponseBody self = new ExitStandbyResponseBody();
        return TeaModel.build(map, self);
    }

    public ExitStandbyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
