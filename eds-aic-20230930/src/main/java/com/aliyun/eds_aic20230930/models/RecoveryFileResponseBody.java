// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RecoveryFileResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static RecoveryFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecoveryFileResponseBody self = new RecoveryFileResponseBody();
        return TeaModel.build(map, self);
    }

    public RecoveryFileResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public RecoveryFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
