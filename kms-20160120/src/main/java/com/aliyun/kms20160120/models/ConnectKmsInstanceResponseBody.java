// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ConnectKmsInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ConnectKmsInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConnectKmsInstanceResponseBody self = new ConnectKmsInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ConnectKmsInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
