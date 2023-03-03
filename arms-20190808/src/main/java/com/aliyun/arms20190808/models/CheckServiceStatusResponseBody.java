// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful.</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The ID of the request. You can query logs and troubleshoot issues based on the ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceStatusResponseBody self = new CheckServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
