// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeBriefDedicatedHostsResponseBody extends TeaModel {
    @NameInMap("TotalRecords")
    public Integer totalRecords;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DedicatedHosts")
    public java.util.List<DescribeBriefDedicatedHostsResponseBodyDedicatedHosts> dedicatedHosts;

    public static DescribeBriefDedicatedHostsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBriefDedicatedHostsResponseBody self = new DescribeBriefDedicatedHostsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBriefDedicatedHostsResponseBody setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public DescribeBriefDedicatedHostsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBriefDedicatedHostsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBriefDedicatedHostsResponseBody setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeBriefDedicatedHostsResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeBriefDedicatedHostsResponseBody setDedicatedHosts(java.util.List<DescribeBriefDedicatedHostsResponseBodyDedicatedHosts> dedicatedHosts) {
        this.dedicatedHosts = dedicatedHosts;
        return this;
    }
    public java.util.List<DescribeBriefDedicatedHostsResponseBodyDedicatedHosts> getDedicatedHosts() {
        return this.dedicatedHosts;
    }

    public static class DescribeBriefDedicatedHostsResponseBodyDedicatedHosts extends TeaModel {
        @NameInMap("AllocationStatus")
        public String allocationStatus;

        @NameInMap("Region")
        public String region;

        @NameInMap("HostStatus")
        public String hostStatus;

        @NameInMap("ZoneId")
        public String zoneId;

        @NameInMap("HostCPU")
        public Integer hostCPU;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("HostMem")
        public Integer hostMem;

        @NameInMap("CreatedTime")
        public String createdTime;

        public static DescribeBriefDedicatedHostsResponseBodyDedicatedHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeBriefDedicatedHostsResponseBodyDedicatedHosts self = new DescribeBriefDedicatedHostsResponseBodyDedicatedHosts();
            return TeaModel.build(map, self);
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setAllocationStatus(String allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public String getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setHostStatus(String hostStatus) {
            this.hostStatus = hostStatus;
            return this;
        }
        public String getHostStatus() {
            return this.hostStatus;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setHostCPU(Integer hostCPU) {
            this.hostCPU = hostCPU;
            return this;
        }
        public Integer getHostCPU() {
            return this.hostCPU;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setHostMem(Integer hostMem) {
            this.hostMem = hostMem;
            return this;
        }
        public Integer getHostMem() {
            return this.hostMem;
        }

        public DescribeBriefDedicatedHostsResponseBodyDedicatedHosts setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

    }

}
