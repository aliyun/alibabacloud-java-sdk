// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class ModifyDataCenterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDataCenterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataCenterResponseBody self = new ModifyDataCenterResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDataCenterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
