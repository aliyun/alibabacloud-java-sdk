// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeElbAvailableResourceInfoResponseBody extends TeaModel {
    @NameInMap("ElbAvailableResourceInfo")
    public java.util.List<DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo> elbAvailableResourceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeElbAvailableResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeElbAvailableResourceInfoResponseBody self = new DescribeElbAvailableResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeElbAvailableResourceInfoResponseBody setElbAvailableResourceInfo(java.util.List<DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo> elbAvailableResourceInfo) {
        this.elbAvailableResourceInfo = elbAvailableResourceInfo;
        return this;
    }
    public java.util.List<DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo> getElbAvailableResourceInfo() {
        return this.elbAvailableResourceInfo;
    }

    public DescribeElbAvailableResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("CanBuyCount")
        public String canBuyCount;

        @NameInMap("EnName")
        public String enName;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("LoadBalancerSpec")
        public java.util.List<String> loadBalancerSpec;

        @NameInMap("Name")
        public String name;

        @NameInMap("Province")
        public String province;

        public static DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo self = new DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo setCanBuyCount(String canBuyCount) {
            this.canBuyCount = canBuyCount;
            return this;
        }
        public String getCanBuyCount() {
            return this.canBuyCount;
        }

        public DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo setLoadBalancerSpec(java.util.List<String> loadBalancerSpec) {
            this.loadBalancerSpec = loadBalancerSpec;
            return this;
        }
        public java.util.List<String> getLoadBalancerSpec() {
            return this.loadBalancerSpec;
        }

        public DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeElbAvailableResourceInfoResponseBodyElbAvailableResourceInfo setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

}
