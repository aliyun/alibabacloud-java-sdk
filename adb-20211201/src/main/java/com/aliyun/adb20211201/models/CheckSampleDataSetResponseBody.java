// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CheckSampleDataSetResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0CE655C3-C211-513D-A42F-D4AE2D1A867C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the built-in dataset. Valid values:</p>
     * <ul>
     * <li><p><strong>SUCCEED</strong>: The dataset loaded successfully.</p>
     * </li>
     * <li><p><strong>INIT</strong>: Loading in progress.</p>
     * </li>
     * <li><p><strong>FAILED</strong>: Failed to load the dataset.</p>
     * </li>
     * <li><p><strong>UNINITIALIZED</strong>: Not loaded.</p>
     * </li>
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
