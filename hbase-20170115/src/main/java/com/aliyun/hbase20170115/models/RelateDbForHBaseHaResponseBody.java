// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class RelateDbForHBaseHaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RelateDbForHBaseHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RelateDbForHBaseHaResponseBody self = new RelateDbForHBaseHaResponseBody();
        return TeaModel.build(map, self);
    }

    public RelateDbForHBaseHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
