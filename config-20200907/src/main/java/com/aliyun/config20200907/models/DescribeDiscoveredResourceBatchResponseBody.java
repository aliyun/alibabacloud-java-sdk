// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DescribeDiscoveredResourceBatchResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>6CE4ABA1-9A57-41A9-8EA9-E8B17D4671CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDiscoveredResourceBatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiscoveredResourceBatchResponseBody self = new DescribeDiscoveredResourceBatchResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDiscoveredResourceBatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
