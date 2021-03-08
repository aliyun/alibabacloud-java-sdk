// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class RestartHiTSDBInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RestartHiTSDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RestartHiTSDBInstanceResponseBody self = new RestartHiTSDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public RestartHiTSDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
