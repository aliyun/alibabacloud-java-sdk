// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancerSpecResponseBody extends TeaModel {
    /**
     * <p>The specifications. Valid values:</p>
     */
    @NameInMap("LoadBalancerSpecs")
    public java.util.List<DescribeLoadBalancerSpecResponseBodyLoadBalancerSpecs> loadBalancerSpecs;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The display name of the instance type.</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The specifications of the ELB instance.</p>
         */
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
