// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiMarketInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceAttributes")
    public String instanceAttributes;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApiMarketInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMarketInstanceResponseBody self = new DescribeApiMarketInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiMarketInstanceResponseBody setInstanceAttributes(String instanceAttributes) {
        this.instanceAttributes = instanceAttributes;
        return this;
    }
    public String getInstanceAttributes() {
        return this.instanceAttributes;
    }

    public DescribeApiMarketInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
