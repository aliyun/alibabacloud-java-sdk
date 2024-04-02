// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeCloudMonitorServicesResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<String> items;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCloudMonitorServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMonitorServicesResponseBody self = new DescribeCloudMonitorServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMonitorServicesResponseBody setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public DescribeCloudMonitorServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudMonitorServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
