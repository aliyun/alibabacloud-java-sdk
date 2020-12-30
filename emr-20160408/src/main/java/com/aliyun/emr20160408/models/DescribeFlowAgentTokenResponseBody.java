// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeFlowAgentTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static DescribeFlowAgentTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowAgentTokenResponseBody self = new DescribeFlowAgentTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlowAgentTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlowAgentTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
