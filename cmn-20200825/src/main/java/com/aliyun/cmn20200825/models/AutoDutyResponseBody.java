// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class AutoDutyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AutoDutyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AutoDutyResponseBody self = new AutoDutyResponseBody();
        return TeaModel.build(map, self);
    }

    public AutoDutyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
