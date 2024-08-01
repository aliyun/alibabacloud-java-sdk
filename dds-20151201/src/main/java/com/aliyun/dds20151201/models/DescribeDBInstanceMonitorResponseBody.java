// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceMonitorResponseBody extends TeaModel {
    /**
     * <p>The collection frequency of monitoring data for the instance. Valid value: <strong>5</strong>. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EFD65226-08CC-4C4D-B6A4-CB3C382F67B0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceMonitorResponseBody self = new DescribeDBInstanceMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceMonitorResponseBody setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public DescribeDBInstanceMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
