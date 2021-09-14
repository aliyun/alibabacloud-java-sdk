// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsCheckInBastionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BastionInstanceId")
    public String bastionInstanceId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("Hosts")
    public java.util.List<DescribeDedicatedHostsCheckInBastionResponseBodyHosts> hosts;

    public static DescribeDedicatedHostsCheckInBastionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsCheckInBastionResponseBody self = new DescribeDedicatedHostsCheckInBastionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsCheckInBastionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostsCheckInBastionResponseBody setBastionInstanceId(String bastionInstanceId) {
        this.bastionInstanceId = bastionInstanceId;
        return this;
    }
    public String getBastionInstanceId() {
        return this.bastionInstanceId;
    }

    public DescribeDedicatedHostsCheckInBastionResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostsCheckInBastionResponseBody setHosts(java.util.List<DescribeDedicatedHostsCheckInBastionResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<DescribeDedicatedHostsCheckInBastionResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public static class DescribeDedicatedHostsCheckInBastionResponseBodyHosts extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("DedicatedHostName")
        public String dedicatedHostName;

        @NameInMap("AllocationStatus")
        public Boolean allocationStatus;

        @NameInMap("InBastion")
        public Boolean inBastion;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Ip")
        public String ip;

        public static DescribeDedicatedHostsCheckInBastionResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsCheckInBastionResponseBodyHosts self = new DescribeDedicatedHostsCheckInBastionResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsCheckInBastionResponseBodyHosts setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDedicatedHostsCheckInBastionResponseBodyHosts setDedicatedHostName(String dedicatedHostName) {
            this.dedicatedHostName = dedicatedHostName;
            return this;
        }
        public String getDedicatedHostName() {
            return this.dedicatedHostName;
        }

        public DescribeDedicatedHostsCheckInBastionResponseBodyHosts setAllocationStatus(Boolean allocationStatus) {
            this.allocationStatus = allocationStatus;
            return this;
        }
        public Boolean getAllocationStatus() {
            return this.allocationStatus;
        }

        public DescribeDedicatedHostsCheckInBastionResponseBodyHosts setInBastion(Boolean inBastion) {
            this.inBastion = inBastion;
            return this;
        }
        public Boolean getInBastion() {
            return this.inBastion;
        }

        public DescribeDedicatedHostsCheckInBastionResponseBodyHosts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeDedicatedHostsCheckInBastionResponseBodyHosts setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
