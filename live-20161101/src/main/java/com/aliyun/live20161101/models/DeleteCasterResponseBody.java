// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterResponseBody self = new DeleteCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCasterResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DeleteCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
