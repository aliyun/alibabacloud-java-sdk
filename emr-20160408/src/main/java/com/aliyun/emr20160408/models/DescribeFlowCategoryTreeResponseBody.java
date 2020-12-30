// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowCategoryTreeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static DescribeFlowCategoryTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowCategoryTreeResponseBody self = new DescribeFlowCategoryTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowCategoryTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowCategoryTreeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
