// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class ModifyHiTSDBInstanceClassResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHiTSDBInstanceClassResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHiTSDBInstanceClassResponseBody self = new ModifyHiTSDBInstanceClassResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHiTSDBInstanceClassResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
