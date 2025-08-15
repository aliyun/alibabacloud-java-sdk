// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeResourceLifeCycleEventsResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>B10969CF-C743-55F8-9710-F0711504****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeResourceLifeCycleEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceLifeCycleEventsResponseBody self = new DescribeResourceLifeCycleEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceLifeCycleEventsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeResourceLifeCycleEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
