// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetIpAllowListConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetIpAllowListConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetIpAllowListConfigResponseBody self = new SetIpAllowListConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetIpAllowListConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
