// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetApplicationSsoConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetApplicationSsoConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetApplicationSsoConfigResponseBody self = new SetApplicationSsoConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetApplicationSsoConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
