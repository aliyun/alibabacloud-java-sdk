// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class DescribeLensServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of EBS Lens. Valid values:</p>
     * <ul>
     * <li><p>Applying: The service is being applied for.</p>
     * </li>
     * <li><p>UnAvailable: The service is unavailable.</p>
     * </li>
     * <li><p>Available: The service is available.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Available</p>
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
