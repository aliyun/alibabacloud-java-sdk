// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of CloudLens for EBS. Valid values:</p>
     * <br>
     * <p>*   Applying</p>
     * <p>*   UnAvailable</p>
     * <p>*   Available</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeLensServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLensServiceStatusResponseBody self = new DescribeLensServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLensServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLensServiceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
