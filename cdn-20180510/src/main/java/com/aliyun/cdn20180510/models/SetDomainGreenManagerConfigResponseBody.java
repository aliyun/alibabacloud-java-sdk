// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetDomainGreenManagerConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDomainGreenManagerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDomainGreenManagerConfigResponseBody self = new SetDomainGreenManagerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDomainGreenManagerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
