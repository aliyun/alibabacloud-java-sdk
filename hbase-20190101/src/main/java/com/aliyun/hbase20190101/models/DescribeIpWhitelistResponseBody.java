// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Groups")
    public DescribeIpWhitelistResponseBodyGroups groups;

    public static DescribeIpWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistResponseBody self = new DescribeIpWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpWhitelistResponseBody setGroups(DescribeIpWhitelistResponseBodyGroups groups) {
        this.groups = groups;
        return this;
    }
    public DescribeIpWhitelistResponseBodyGroups getGroups() {
        return this.groups;
    }

    public static class DescribeIpWhitelistResponseBodyGroupsGroupIpList extends TeaModel {
        @NameInMap("Ip")
        public java.util.List<String> ip;

        public static DescribeIpWhitelistResponseBodyGroupsGroupIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpWhitelistResponseBodyGroupsGroupIpList self = new DescribeIpWhitelistResponseBodyGroupsGroupIpList();
            return TeaModel.build(map, self);
        }

        public DescribeIpWhitelistResponseBodyGroupsGroupIpList setIp(java.util.List<String> ip) {
            this.ip = ip;
            return this;
        }
        public java.util.List<String> getIp() {
            return this.ip;
        }

    }

    public static class DescribeIpWhitelistResponseBodyGroupsGroup extends TeaModel {
        @NameInMap("IpVersion")
        public Integer ipVersion;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IpList")
        public DescribeIpWhitelistResponseBodyGroupsGroupIpList ipList;

        public static DescribeIpWhitelistResponseBodyGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpWhitelistResponseBodyGroupsGroup self = new DescribeIpWhitelistResponseBodyGroupsGroup();
            return TeaModel.build(map, self);
        }

        public DescribeIpWhitelistResponseBodyGroupsGroup setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeIpWhitelistResponseBodyGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeIpWhitelistResponseBodyGroupsGroup setIpList(DescribeIpWhitelistResponseBodyGroupsGroupIpList ipList) {
            this.ipList = ipList;
            return this;
        }
        public DescribeIpWhitelistResponseBodyGroupsGroupIpList getIpList() {
            return this.ipList;
        }

    }

    public static class DescribeIpWhitelistResponseBodyGroups extends TeaModel {
        @NameInMap("Group")
        public java.util.List<DescribeIpWhitelistResponseBodyGroupsGroup> group;

        public static DescribeIpWhitelistResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpWhitelistResponseBodyGroups self = new DescribeIpWhitelistResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeIpWhitelistResponseBodyGroups setGroup(java.util.List<DescribeIpWhitelistResponseBodyGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<DescribeIpWhitelistResponseBodyGroupsGroup> getGroup() {
            return this.group;
        }

    }

}
