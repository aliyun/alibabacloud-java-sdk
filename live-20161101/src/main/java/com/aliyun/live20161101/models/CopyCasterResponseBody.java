// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CasterId")
    public String casterId;

    public static CopyCasterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterResponseBody self = new CopyCasterResponseBody();
        return TeaModel.build(map, self);
    }

    public CopyCasterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CopyCasterResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

}
