// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterConfigResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static SetCasterConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterConfigResponse self = new SetCasterConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterConfigResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetCasterConfigResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
