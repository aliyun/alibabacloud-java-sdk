// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class KickPlayerResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static KickPlayerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KickPlayerResponseBody self = new KickPlayerResponseBody();
        return TeaModel.build(map, self);
    }

    public KickPlayerResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public KickPlayerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
