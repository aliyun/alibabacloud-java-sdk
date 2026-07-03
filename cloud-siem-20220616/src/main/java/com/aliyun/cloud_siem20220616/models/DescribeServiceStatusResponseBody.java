// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * <ul>
     * <li><p>true: The authorization is granted.</p>
     * </li>
     * <li><p>false: The authorization is not granted.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceStatusResponseBody self = new DescribeServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DescribeServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
