// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CreateHBaseSlbServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateHBaseSlbServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHBaseSlbServerResponseBody self = new CreateHBaseSlbServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHBaseSlbServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
