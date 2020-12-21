// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class SetImageNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetImageNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SetImageNameResponse self = new SetImageNameResponse();
        return TeaModel.build(map, self);
    }

    public SetImageNameResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
