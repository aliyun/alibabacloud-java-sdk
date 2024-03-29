// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCasterResponseBody extends TeaModel {
    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCasterResponseBody self = new CreateCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCasterResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public CreateCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
