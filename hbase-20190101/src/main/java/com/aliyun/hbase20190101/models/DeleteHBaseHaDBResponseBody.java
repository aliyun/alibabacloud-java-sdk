// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DeleteHBaseHaDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHBaseHaDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHBaseHaDBResponseBody self = new DeleteHBaseHaDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHBaseHaDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
