// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DisableDelegateAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DisableDelegateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableDelegateAccountResponseBody self = new DisableDelegateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableDelegateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
