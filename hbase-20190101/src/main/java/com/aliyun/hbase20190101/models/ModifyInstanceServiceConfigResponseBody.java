// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceServiceConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceServiceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceServiceConfigResponseBody self = new ModifyInstanceServiceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceServiceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
