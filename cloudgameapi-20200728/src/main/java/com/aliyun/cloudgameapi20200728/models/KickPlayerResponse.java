// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class KickPlayerResponse extends TeaModel {
    @NameInMap("Data")
    @Validation(required = true)
    public Boolean data;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static KickPlayerResponse build(java.util.Map<String, ?> map) throws Exception {
        KickPlayerResponse self = new KickPlayerResponse();
        return TeaModel.build(map, self);
    }

    public KickPlayerResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public KickPlayerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
