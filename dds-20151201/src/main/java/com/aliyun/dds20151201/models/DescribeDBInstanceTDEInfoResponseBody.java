// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceTDEInfoResponseBody extends TeaModel {
    @NameInMap("TDEStatus")
    public String TDEStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDBInstanceTDEInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceTDEInfoResponseBody self = new DescribeDBInstanceTDEInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceTDEInfoResponseBody setTDEStatus(String TDEStatus) {
        this.TDEStatus = TDEStatus;
        return this;
    }
    public String getTDEStatus() {
        return this.TDEStatus;
    }

    public DescribeDBInstanceTDEInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
