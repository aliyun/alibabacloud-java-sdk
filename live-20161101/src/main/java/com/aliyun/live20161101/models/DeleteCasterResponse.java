// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    public static DeleteCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterResponse self = new DeleteCasterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCasterResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
