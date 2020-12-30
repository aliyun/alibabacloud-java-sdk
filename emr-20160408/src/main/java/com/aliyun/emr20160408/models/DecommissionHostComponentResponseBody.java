// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DecommissionHostComponentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DecommissionHostComponentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DecommissionHostComponentResponseBody self = new DecommissionHostComponentResponseBody();
        return TeaModel.build(map, self);
    }

    public DecommissionHostComponentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
