// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DetachEaisEiResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DetachEaisEiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachEaisEiResponseBody self = new DetachEaisEiResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachEaisEiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
