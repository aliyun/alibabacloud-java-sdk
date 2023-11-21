// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckCommercialStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckCommercialStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCommercialStatusResponseBody self = new CheckCommercialStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCommercialStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckCommercialStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
