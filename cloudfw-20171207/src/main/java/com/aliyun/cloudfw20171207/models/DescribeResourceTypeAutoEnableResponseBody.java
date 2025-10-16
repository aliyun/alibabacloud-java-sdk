// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeResourceTypeAutoEnableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>7447795A-39AB-52CB-8F92-128DF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceTypeAutoEnable")
    public java.util.Map<String, Boolean> resourceTypeAutoEnable;

    public static DescribeResourceTypeAutoEnableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceTypeAutoEnableResponseBody self = new DescribeResourceTypeAutoEnableResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceTypeAutoEnableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceTypeAutoEnableResponseBody setResourceTypeAutoEnable(java.util.Map<String, Boolean> resourceTypeAutoEnable) {
        this.resourceTypeAutoEnable = resourceTypeAutoEnable;
        return this;
    }
    public java.util.Map<String, Boolean> getResourceTypeAutoEnable() {
        return this.resourceTypeAutoEnable;
    }

}
