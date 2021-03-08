// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20170601.models;

import com.aliyun.tea.*;

public class SwitchHiTSDBInstancePublicNetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchHiTSDBInstancePublicNetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchHiTSDBInstancePublicNetResponseBody self = new SwitchHiTSDBInstancePublicNetResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchHiTSDBInstancePublicNetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
