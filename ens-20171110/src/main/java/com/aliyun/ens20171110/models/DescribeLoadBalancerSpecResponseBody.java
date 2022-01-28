// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerSpecResponseBody extends TeaModel {
    @NameInMap("LoadBalancerSpecs")
    public java.util.List<DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs> loadBalancerSpecs;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLoadBalancerSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancerSpecResponseBody self = new DescribeLoadBalancerSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancerSpecResponseBody setLoadBalancerSpecs(java.util.List<DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs> loadBalancerSpecs) {
        this.loadBalancerSpecs = loadBalancerSpecs;
        return this;
    }
    public java.util.List<DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs> getLoadBalancerSpecs() {
        return this.loadBalancerSpecs;
    }

    public DescribeLoadBalancerSpecResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancerSpecResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancerSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancerSpecResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("LoadBalancerSpec")
        public String loadBalancerSpec;

        public static DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs self = new DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs setLoadBalancerSpec(String loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }
        public String getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

    }

}
