// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class ModifyHiTSDBInstanceSecurityIpListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyHiTSDBInstanceSecurityIpListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyHiTSDBInstanceSecurityIpListResponseBody self = new ModifyHiTSDBInstanceSecurityIpListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyHiTSDBInstanceSecurityIpListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
