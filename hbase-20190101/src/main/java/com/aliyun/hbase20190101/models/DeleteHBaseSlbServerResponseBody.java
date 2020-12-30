// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseSlbServerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHBaseSlbServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHBaseSlbServerResponseBody self = new DeleteHBaseSlbServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHBaseSlbServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
