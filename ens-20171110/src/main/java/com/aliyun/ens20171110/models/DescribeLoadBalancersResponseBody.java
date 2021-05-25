// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeLoadBalancersResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("LoadBalancers")
    public DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers;

    public static DescribeLoadBalancersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoadBalancersResponseBody self = new DescribeLoadBalancersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLoadBalancersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLoadBalancersResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLoadBalancersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLoadBalancersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLoadBalancersResponseBody setLoadBalancers(DescribeLoadBalancersResponseBodyLoadBalancers loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }
    public DescribeLoadBalancersResponseBodyLoadBalancers getLoadBalancers() {
        return this.loadBalancers;
    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer extends TeaModel {
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        @NameInMap("LoadBalancerName")
        public String loadBalancerName;

        @NameInMap("LoadBalancerStatus")
        public String loadBalancerStatus;

        @NameInMap("Address")
        public String address;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("NetworkId")
        public String networkId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AddressIPVersion")
        public String addressIPVersion;

        public static DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer self = new DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerName(String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setLoadBalancerStatus(String loadBalancerStatus) {
            this.loadBalancerStatus = loadBalancerStatus;
            return this;
        }
        public String getLoadBalancerStatus() {
            return this.loadBalancerStatus;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setNetworkId(String networkId) {
            this.networkId = networkId;
            return this;
        }
        public String getNetworkId() {
            return this.networkId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer setAddressIPVersion(String addressIPVersion) {
            this.addressIPVersion = addressIPVersion;
            return this;
        }
        public String getAddressIPVersion() {
            return this.addressIPVersion;
        }

    }

    public static class DescribeLoadBalancersResponseBodyLoadBalancers extends TeaModel {
        @NameInMap("LoadBalancer")
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer;

        public static DescribeLoadBalancersResponseBodyLoadBalancers build(java.util.Map<String, ?> map) throws Exception {
            DescribeLoadBalancersResponseBodyLoadBalancers self = new DescribeLoadBalancersResponseBodyLoadBalancers();
            return TeaModel.build(map, self);
        }

        public DescribeLoadBalancersResponseBodyLoadBalancers setLoadBalancer(java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }
        public java.util.List<DescribeLoadBalancersResponseBodyLoadBalancersLoadBalancer> getLoadBalancer() {
            return this.loadBalancer;
        }

    }

}
