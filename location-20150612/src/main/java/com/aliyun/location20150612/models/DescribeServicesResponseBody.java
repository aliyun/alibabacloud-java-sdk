// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.location20150612.models;

import com.aliyun.tea.*;

public class DescribeServicesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Services")
    public DescribeServicesResponseBodyServices services;

    public static DescribeServicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServicesResponseBody self = new DescribeServicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServicesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeServicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServicesResponseBody setServices(DescribeServicesResponseBodyServices services) {
        this.services = services;
        return this;
    }
    public DescribeServicesResponseBodyServices getServices() {
        return this.services;
    }

    public static class DescribeServicesResponseBodyServices extends TeaModel {
        @NameInMap("Services")
        public java.util.List<String> services;

        public static DescribeServicesResponseBodyServices build(java.util.Map<String, ?> map) throws Exception {
            DescribeServicesResponseBodyServices self = new DescribeServicesResponseBodyServices();
            return TeaModel.build(map, self);
        }

        public DescribeServicesResponseBodyServices setServices(java.util.List<String> services) {
            this.services = services;
            return this;
        }
        public java.util.List<String> getServices() {
            return this.services;
        }

    }

}
