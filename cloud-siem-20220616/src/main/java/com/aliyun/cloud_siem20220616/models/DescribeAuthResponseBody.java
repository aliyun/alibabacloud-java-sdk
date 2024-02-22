// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAuthResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the SIEM system is granted the required permissions. Valid values:</p>
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

    public static DescribeAuthResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthResponseBody self = new DescribeAuthResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DescribeAuthResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
