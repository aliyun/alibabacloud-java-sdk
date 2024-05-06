// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class CreateHbaseSlbServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHbaseSlbServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHbaseSlbServerResponseBody self = new CreateHbaseSlbServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHbaseSlbServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
