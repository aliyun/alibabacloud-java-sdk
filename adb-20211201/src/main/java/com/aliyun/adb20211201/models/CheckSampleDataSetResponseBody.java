// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckSampleDataSetResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0CE655C3-C211-513D-A42F-D4AE2D1A867C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of the built-in dataset. Valid values:</p>
     * <ul>
     * <li><strong>SUCCEED</strong>: The dataset is loaded.</li>
     * <li><strong>INIT</strong>: The dataset is being loaded.</li>
     * <li><strong>FAILED</strong>: The dataset failed to be loaded.</li>
     * <li><strong>UNINITIALIZED</strong>: The dataset is not loaded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UNINITIALIZED</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckSampleDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSampleDataSetResponseBody self = new CheckSampleDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSampleDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSampleDataSetResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
