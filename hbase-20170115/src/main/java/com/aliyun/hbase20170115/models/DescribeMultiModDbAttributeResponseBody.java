// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeMultiModDbAttributeResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMultiModDbAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMultiModDbAttributeResponseBody self = new DescribeMultiModDbAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMultiModDbAttributeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeMultiModDbAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
