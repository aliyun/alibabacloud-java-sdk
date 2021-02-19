// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class EnterStandbyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnterStandbyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterStandbyResponseBody self = new EnterStandbyResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterStandbyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
