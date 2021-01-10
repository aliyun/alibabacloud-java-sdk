// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CasterId")
    public String casterId;

    public static SetCasterConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetCasterConfigResponseBody self = new SetCasterConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetCasterConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetCasterConfigResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
