// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class QueryEniQosGroupByEniResponseBody extends TeaModel {
    @NameInMap("QosGroupName")
    public String qosGroupName;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryEniQosGroupByEniResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEniQosGroupByEniResponseBody self = new QueryEniQosGroupByEniResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEniQosGroupByEniResponseBody setQosGroupName(String qosGroupName) {
        this.qosGroupName = qosGroupName;
        return this;
    }
    public String getQosGroupName() {
        return this.qosGroupName;
    }

    public QueryEniQosGroupByEniResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
