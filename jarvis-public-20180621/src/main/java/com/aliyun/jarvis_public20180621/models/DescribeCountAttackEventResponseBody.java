// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.jarvis_public20180621.models;

import com.aliyun.tea.*;

public class DescribeCountAttackEventResponseBody extends TeaModel {
    @NameInMap("Count")
    public Long count;

    @NameInMap("Module")
    public String module;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCountAttackEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCountAttackEventResponseBody self = new DescribeCountAttackEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCountAttackEventResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public DescribeCountAttackEventResponseBody setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public DescribeCountAttackEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
