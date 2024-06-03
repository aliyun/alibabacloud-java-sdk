// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class EnableDelegateAccountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EnableDelegateAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableDelegateAccountResponseBody self = new EnableDelegateAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableDelegateAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
