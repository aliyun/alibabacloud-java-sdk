// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DescribeClusterResourcePoolSchedulerTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CurrentSchedulerType")
    public String currentSchedulerType;

    @NameInMap("SupportSchedulerType")
    public String supportSchedulerType;

    @NameInMap("DefaultSchedulerType")
    public String defaultSchedulerType;

    public static DescribeClusterResourcePoolSchedulerTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterResourcePoolSchedulerTypeResponseBody self = new DescribeClusterResourcePoolSchedulerTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterResourcePoolSchedulerTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterResourcePoolSchedulerTypeResponseBody setCurrentSchedulerType(String currentSchedulerType) {
        this.currentSchedulerType = currentSchedulerType;
        return this;
    }
    public String getCurrentSchedulerType() {
        return this.currentSchedulerType;
    }

    public DescribeClusterResourcePoolSchedulerTypeResponseBody setSupportSchedulerType(String supportSchedulerType) {
        this.supportSchedulerType = supportSchedulerType;
        return this;
    }
    public String getSupportSchedulerType() {
        return this.supportSchedulerType;
    }

    public DescribeClusterResourcePoolSchedulerTypeResponseBody setDefaultSchedulerType(String defaultSchedulerType) {
        this.defaultSchedulerType = defaultSchedulerType;
        return this;
    }
    public String getDefaultSchedulerType() {
        return this.defaultSchedulerType;
    }

}
