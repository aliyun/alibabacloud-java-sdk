// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableApplicationSsoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableApplicationSsoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableApplicationSsoResponseBody self = new EnableApplicationSsoResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableApplicationSsoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
