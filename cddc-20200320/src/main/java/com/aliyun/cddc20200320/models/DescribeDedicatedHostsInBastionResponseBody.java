// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostsInBastionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BastionInstanceId")
    public String bastionInstanceId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("Hosts")
    public java.util.List<DescribeDedicatedHostsInBastionResponseBodyHosts> hosts;

    public static DescribeDedicatedHostsInBastionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostsInBastionResponseBody self = new DescribeDedicatedHostsInBastionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostsInBastionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDedicatedHostsInBastionResponseBody setBastionInstanceId(String bastionInstanceId) {
        this.bastionInstanceId = bastionInstanceId;
        return this;
    }
    public String getBastionInstanceId() {
        return this.bastionInstanceId;
    }

    public DescribeDedicatedHostsInBastionResponseBody setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public DescribeDedicatedHostsInBastionResponseBody setHosts(java.util.List<DescribeDedicatedHostsInBastionResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<DescribeDedicatedHostsInBastionResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public static class DescribeDedicatedHostsInBastionResponseBodyHosts extends TeaModel {
        @NameInMap("HostDescription")
        public String hostDescription;

        @NameInMap("Comment")
        public String comment;

        @NameInMap("BastionHostId")
        public String bastionHostId;

        @NameInMap("OsName")
        public String osName;

        @NameInMap("HostAccountCount")
        public String hostAccountCount;

        @NameInMap("DedicatedHostId")
        public String dedicatedHostId;

        @NameInMap("HostPrivateIp")
        public String hostPrivateIp;

        @NameInMap("AccountCreating")
        public Boolean accountCreating;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeDedicatedHostsInBastionResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDedicatedHostsInBastionResponseBodyHosts self = new DescribeDedicatedHostsInBastionResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setHostDescription(String hostDescription) {
            this.hostDescription = hostDescription;
            return this;
        }
        public String getHostDescription() {
            return this.hostDescription;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setBastionHostId(String bastionHostId) {
            this.bastionHostId = bastionHostId;
            return this;
        }
        public String getBastionHostId() {
            return this.bastionHostId;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setHostAccountCount(String hostAccountCount) {
            this.hostAccountCount = hostAccountCount;
            return this;
        }
        public String getHostAccountCount() {
            return this.hostAccountCount;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setDedicatedHostId(String dedicatedHostId) {
            this.dedicatedHostId = dedicatedHostId;
            return this;
        }
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setHostPrivateIp(String hostPrivateIp) {
            this.hostPrivateIp = hostPrivateIp;
            return this;
        }
        public String getHostPrivateIp() {
            return this.hostPrivateIp;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setAccountCreating(Boolean accountCreating) {
            this.accountCreating = accountCreating;
            return this;
        }
        public Boolean getAccountCreating() {
            return this.accountCreating;
        }

        public DescribeDedicatedHostsInBastionResponseBodyHosts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
