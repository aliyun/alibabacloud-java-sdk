// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Name")
    public String name;

    public static DescribeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowRequest self = new DescribeFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
