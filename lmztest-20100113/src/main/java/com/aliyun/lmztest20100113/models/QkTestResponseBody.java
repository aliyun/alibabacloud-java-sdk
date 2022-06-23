// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20100113.models;

import com.aliyun.tea.*;

public class QkTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static QkTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QkTestResponseBody self = new QkTestResponseBody();
        return TeaModel.build(map, self);
    }

    public QkTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
