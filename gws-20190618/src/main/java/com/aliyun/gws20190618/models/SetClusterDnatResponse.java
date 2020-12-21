// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterDnatResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetClusterDnatResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClusterDnatResponse self = new SetClusterDnatResponse();
        return TeaModel.build(map, self);
    }

    public SetClusterDnatResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
