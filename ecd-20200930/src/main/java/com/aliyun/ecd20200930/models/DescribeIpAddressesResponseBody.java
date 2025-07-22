// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeIpAddressesResponseBody extends TeaModel {
    @NameInMap("IpAddresses")
    public java.util.List<DescribeIpAddressesResponseBodyIpAddresses> ipAddresses;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeIpAddressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpAddressesResponseBody self = new DescribeIpAddressesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpAddressesResponseBody setIpAddresses(java.util.List<DescribeIpAddressesResponseBodyIpAddresses> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }
    public java.util.List<DescribeIpAddressesResponseBodyIpAddresses> getIpAddresses() {
        return this.ipAddresses;
    }

    public DescribeIpAddressesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeIpAddressesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeIpAddressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeIpAddressesResponseBodyIpAddresses extends TeaModel {
        @NameInMap("CreateByWuying")
        public Boolean createByWuying;

        @NameInMap("EipAddress")
        public String eipAddress;

        @NameInMap("EipId")
        public String eipId;

        @NameInMap("EipStatus")
        public String eipStatus;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        public static DescribeIpAddressesResponseBodyIpAddresses build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpAddressesResponseBodyIpAddresses self = new DescribeIpAddressesResponseBodyIpAddresses();
            return TeaModel.build(map, self);
        }

        public DescribeIpAddressesResponseBodyIpAddresses setCreateByWuying(Boolean createByWuying) {
            this.createByWuying = createByWuying;
            return this;
        }
        public Boolean getCreateByWuying() {
            return this.createByWuying;
        }

        public DescribeIpAddressesResponseBodyIpAddresses setEipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }
        public String getEipAddress() {
            return this.eipAddress;
        }

        public DescribeIpAddressesResponseBodyIpAddresses setEipId(String eipId) {
            this.eipId = eipId;
            return this;
        }
        public String getEipId() {
            return this.eipId;
        }

        public DescribeIpAddressesResponseBodyIpAddresses setEipStatus(String eipStatus) {
            this.eipStatus = eipStatus;
            return this;
        }
        public String getEipStatus() {
            return this.eipStatus;
        }

        public DescribeIpAddressesResponseBodyIpAddresses setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeIpAddressesResponseBodyIpAddresses setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

    }

}
