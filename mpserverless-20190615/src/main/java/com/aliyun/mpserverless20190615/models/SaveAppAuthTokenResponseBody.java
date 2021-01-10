// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class SaveAppAuthTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SaveAppAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveAppAuthTokenResponseBody self = new SaveAppAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveAppAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
