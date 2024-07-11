// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceUsageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>A2D841CE-D066-53E8-B9AC-3731DCC85397</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;disk_usage_record\&quot;:{\&quot;disk_used\&quot;:\&quot;0.9GB\&quot;,\&quot;disk_total\&quot;:\&quot;1156.1GB\&quot;,\&quot;usage_rate\&quot;:\&quot;1%\&quot;}}</p>
     */
    @NameInMap("Result")
    public String result;

    public static DescribeDBInstanceUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceUsageResponseBody self = new DescribeDBInstanceUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBInstanceUsageResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
