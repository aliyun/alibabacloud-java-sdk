// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class StartRecordContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartRecordContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartRecordContentResponseBody self = new StartRecordContentResponseBody();
        return TeaModel.build(map, self);
    }

    public StartRecordContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
