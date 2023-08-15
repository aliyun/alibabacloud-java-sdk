// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class XpackRelateDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static XpackRelateDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        XpackRelateDBResponseBody self = new XpackRelateDBResponseBody();
        return TeaModel.build(map, self);
    }

    public XpackRelateDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
