// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeInstanceIpAddressResponseBody extends TeaModel {
    @NameInMap("InstanceList")
    public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceList> instanceList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static DescribeInstanceIpAddressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIpAddressResponseBody self = new DescribeInstanceIpAddressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIpAddressResponseBody setInstanceList(java.util.List<DescribeInstanceIpAddressResponseBodyInstanceList> instanceList) {
        this.instanceList = instanceList;
        return this;
    }
    public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceList> getInstanceList() {
        return this.instanceList;
    }

    public DescribeInstanceIpAddressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceIpAddressResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig extends TeaModel {
        @NameInMap("BlackholeThreshold")
        public Integer blackholeThreshold;

        @NameInMap("DefenseBpsThreshold")
        public Integer defenseBpsThreshold;

        @NameInMap("DefensePpsThreshold")
        public Integer defensePpsThreshold;

        @NameInMap("ElasticThreshold")
        public Integer elasticThreshold;

        @NameInMap("InstanceIp")
        public String instanceIp;

        @NameInMap("IpStatus")
        public String ipStatus;

        @NameInMap("IpVersion")
        public String ipVersion;

        @NameInMap("IsBgppack")
        public Boolean isBgppack;

        @NameInMap("RegionId")
        public String regionId;

        public static DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig self = new DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setBlackholeThreshold(Integer blackholeThreshold) {
            this.blackholeThreshold = blackholeThreshold;
            return this;
        }
        public Integer getBlackholeThreshold() {
            return this.blackholeThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setDefenseBpsThreshold(Integer defenseBpsThreshold) {
            this.defenseBpsThreshold = defenseBpsThreshold;
            return this;
        }
        public Integer getDefenseBpsThreshold() {
            return this.defenseBpsThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setDefensePpsThreshold(Integer defensePpsThreshold) {
            this.defensePpsThreshold = defensePpsThreshold;
            return this;
        }
        public Integer getDefensePpsThreshold() {
            return this.defensePpsThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setElasticThreshold(Integer elasticThreshold) {
            this.elasticThreshold = elasticThreshold;
            return this;
        }
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setInstanceIp(String instanceIp) {
            this.instanceIp = instanceIp;
            return this;
        }
        public String getInstanceIp() {
            return this.instanceIp;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setIpStatus(String ipStatus) {
            this.ipStatus = ipStatus;
            return this;
        }
        public String getIpStatus() {
            return this.ipStatus;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setIpVersion(String ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public String getIpVersion() {
            return this.ipVersion;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setIsBgppack(Boolean isBgppack) {
            this.isBgppack = isBgppack;
            return this;
        }
        public Boolean getIsBgppack() {
            return this.isBgppack;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribeInstanceIpAddressResponseBodyInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InstanceStatus")
        public String instanceStatus;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("IpAddressConfig")
        public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig> ipAddressConfig;

        public static DescribeInstanceIpAddressResponseBodyInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceIpAddressResponseBodyInstanceList self = new DescribeInstanceIpAddressResponseBodyInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstanceIpAddressResponseBodyInstanceList setIpAddressConfig(java.util.List<DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig> ipAddressConfig) {
            this.ipAddressConfig = ipAddressConfig;
            return this;
        }
        public java.util.List<DescribeInstanceIpAddressResponseBodyInstanceListIpAddressConfig> getIpAddressConfig() {
            return this.ipAddressConfig;
        }

    }

}
