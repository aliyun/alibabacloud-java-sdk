// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class DeleteHiTSDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteHiTSDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteHiTSDBInstanceResponseBody self = new DeleteHiTSDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteHiTSDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
