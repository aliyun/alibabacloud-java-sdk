// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class AttachDBInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachDBInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDBInstancesResponseBody self = new AttachDBInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDBInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
