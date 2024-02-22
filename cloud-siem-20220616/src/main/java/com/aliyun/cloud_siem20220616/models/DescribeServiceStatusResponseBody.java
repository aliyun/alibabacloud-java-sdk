// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the threat analysis feature is authorized to access the resource directory. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
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
