// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DelAuthTokenResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DelAuthTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelAuthTokenResponseBody self = new DelAuthTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DelAuthTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DelAuthTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
