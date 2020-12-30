// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIpBlackListConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetIpBlackListConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetIpBlackListConfigResponseBody self = new SetIpBlackListConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetIpBlackListConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
