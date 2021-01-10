// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetCasterChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCasterChannelResponseBody self = new SetCasterChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCasterChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
