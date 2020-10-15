// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeNetworkInterfacesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("NetworkInterfaceSets")
    @Validation(required = true)
    public DescribeNetworkInterfacesResponseNetworkInterfaceSets networkInterfaceSets;

    public static DescribeNetworkInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInterfacesResponse self = new DescribeNetworkInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInterfacesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNetworkInterfacesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeNetworkInterfacesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeNetworkInterfacesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeNetworkInterfacesResponse setNetworkInterfaceSets(DescribeNetworkInterfacesResponseNetworkInterfaceSets networkInterfaceSets) {
        this.networkInterfaceSets = networkInterfaceSets;
        return this;
    }
    public DescribeNetworkInterfacesResponseNetworkInterfaceSets getNetworkInterfaceSets() {
        return this.networkInterfaceSets;
    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet extends TeaModel {
        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("PrimaryIp")
        @Validation(required = true)
        public String primaryIp;

        @NameInMap("EnsRegionId")
        @Validation(required = true)
        public String ensRegionId;

        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("VSwitchId")
        @Validation(required = true)
        public String vSwitchId;

        @NameInMap("NetworkInterfaceId")
        @Validation(required = true)
        public String networkInterfaceId;

        @NameInMap("MacAddress")
        @Validation(required = true)
        public String macAddress;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        @NameInMap("PrimaryIpType")
        @Validation(required = true)
        public String primaryIpType;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet self = new DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setPrimaryIp(String primaryIp) {
            this.primaryIp = primaryIp;
            return this;
        }
        public String getPrimaryIp() {
            return this.primaryIp;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setMacAddress(String macAddress) {
            this.macAddress = macAddress;
            return this;
        }
        public String getMacAddress() {
            return this.macAddress;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet setPrimaryIpType(String primaryIpType) {
            this.primaryIpType = primaryIpType;
            return this;
        }
        public String getPrimaryIpType() {
            return this.primaryIpType;
        }

    }

    public static class DescribeNetworkInterfacesResponseNetworkInterfaceSets extends TeaModel {
        @NameInMap("NetworkInterfaceSet")
        @Validation(required = true)
        public java.util.List<DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet;

        public static DescribeNetworkInterfacesResponseNetworkInterfaceSets build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkInterfacesResponseNetworkInterfaceSets self = new DescribeNetworkInterfacesResponseNetworkInterfaceSets();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkInterfacesResponseNetworkInterfaceSets setNetworkInterfaceSet(java.util.List<DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet> networkInterfaceSet) {
            this.networkInterfaceSet = networkInterfaceSet;
            return this;
        }
        public java.util.List<DescribeNetworkInterfacesResponseNetworkInterfaceSetsNetworkInterfaceSet> getNetworkInterfaceSet() {
            return this.networkInterfaceSet;
        }

    }

}
