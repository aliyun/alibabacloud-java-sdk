// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetClusterNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetClusterNameResponseBody self = new SetClusterNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SetClusterNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
