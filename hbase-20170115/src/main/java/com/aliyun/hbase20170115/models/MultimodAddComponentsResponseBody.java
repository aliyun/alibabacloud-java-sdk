// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class MultimodAddComponentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static MultimodAddComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MultimodAddComponentsResponseBody self = new MultimodAddComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public MultimodAddComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
