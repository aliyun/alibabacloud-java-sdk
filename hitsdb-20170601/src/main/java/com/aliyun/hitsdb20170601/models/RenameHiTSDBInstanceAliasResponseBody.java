// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class RenameHiTSDBInstanceAliasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RenameHiTSDBInstanceAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameHiTSDBInstanceAliasResponseBody self = new RenameHiTSDBInstanceAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameHiTSDBInstanceAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
