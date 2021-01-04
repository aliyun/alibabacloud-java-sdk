// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeIpWhitelistGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Groups")
    public DescribeIpWhitelistGroupsResponseBodyGroups groups;

    public static DescribeIpWhitelistGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIpWhitelistGroupsResponseBody self = new DescribeIpWhitelistGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIpWhitelistGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIpWhitelistGroupsResponseBody setGroups(DescribeIpWhitelistGroupsResponseBodyGroups groups) {
        this.groups = groups;
        return this;
    }
    public DescribeIpWhitelistGroupsResponseBodyGroups getGroups() {
        return this.groups;
    }

    public static class DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList extends TeaModel {
        @NameInMap("IP")
        public java.util.List<String> IP;

        public static DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList self = new DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList();
            return TeaModel.build(map, self);
        }

        public DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList setIP(java.util.List<String> IP) {
            this.IP = IP;
            return this;
        }
        public java.util.List<String> getIP() {
            return this.IP;
        }

    }

    public static class DescribeIpWhitelistGroupsResponseBodyGroupsGroup extends TeaModel {
        @NameInMap("IpVersion")
        public Integer ipVersion;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IpList")
        public DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList ipList;

        public static DescribeIpWhitelistGroupsResponseBodyGroupsGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpWhitelistGroupsResponseBodyGroupsGroup self = new DescribeIpWhitelistGroupsResponseBodyGroupsGroup();
            return TeaModel.build(map, self);
        }

        public DescribeIpWhitelistGroupsResponseBodyGroupsGroup setIpVersion(Integer ipVersion) {
            this.ipVersion = ipVersion;
            return this;
        }
        public Integer getIpVersion() {
            return this.ipVersion;
        }

        public DescribeIpWhitelistGroupsResponseBodyGroupsGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeIpWhitelistGroupsResponseBodyGroupsGroup setIpList(DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList ipList) {
            this.ipList = ipList;
            return this;
        }
        public DescribeIpWhitelistGroupsResponseBodyGroupsGroupIpList getIpList() {
            return this.ipList;
        }

    }

    public static class DescribeIpWhitelistGroupsResponseBodyGroups extends TeaModel {
        @NameInMap("Group")
        public java.util.List<DescribeIpWhitelistGroupsResponseBodyGroupsGroup> group;

        public static DescribeIpWhitelistGroupsResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeIpWhitelistGroupsResponseBodyGroups self = new DescribeIpWhitelistGroupsResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public DescribeIpWhitelistGroupsResponseBodyGroups setGroup(java.util.List<DescribeIpWhitelistGroupsResponseBodyGroupsGroup> group) {
            this.group = group;
            return this;
        }
        public java.util.List<DescribeIpWhitelistGroupsResponseBodyGroupsGroup> getGroup() {
            return this.group;
        }

    }

}
