// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowRequest extends TeaModel {
    /**
     * <p>The name of the flow.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowRequest self = new DescribeFlowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeFlowRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
