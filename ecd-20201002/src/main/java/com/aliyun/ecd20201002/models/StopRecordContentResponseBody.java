// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class StopRecordContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopRecordContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopRecordContentResponseBody self = new StopRecordContentResponseBody();
        return TeaModel.build(map, self);
    }

    public StopRecordContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
