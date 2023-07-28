// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvAccountStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the account.</p>
     * <br>
     * <p>*   **online**</p>
     * <p>*   **offline**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDcdnKvAccountStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvAccountStatusResponseBody self = new DescribeDcdnKvAccountStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvAccountStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnKvAccountStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
