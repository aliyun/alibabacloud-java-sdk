// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterDnatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetClusterDnatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetClusterDnatResponseBody self = new SetClusterDnatResponseBody();
        return TeaModel.build(map, self);
    }

    public SetClusterDnatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
