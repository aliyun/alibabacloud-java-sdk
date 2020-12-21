// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetClusterNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClusterNameResponse self = new SetClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public SetClusterNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
