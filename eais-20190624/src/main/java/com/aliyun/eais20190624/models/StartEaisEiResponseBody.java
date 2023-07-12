// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class StartEaisEiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartEaisEiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartEaisEiResponseBody self = new StartEaisEiResponseBody();
        return TeaModel.build(map, self);
    }

    public StartEaisEiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
