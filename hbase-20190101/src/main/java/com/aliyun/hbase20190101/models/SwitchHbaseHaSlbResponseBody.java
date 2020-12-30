// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class SwitchHbaseHaSlbResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchHbaseHaSlbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchHbaseHaSlbResponseBody self = new SwitchHbaseHaSlbResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchHbaseHaSlbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
