// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class RelateDbForHBaseHaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DC654531-0799-4502-AFA5-80EE1C16829A</p>
     */
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
