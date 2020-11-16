// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterChannelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SetCasterChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterChannelResponse self = new SetCasterChannelResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterChannelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
