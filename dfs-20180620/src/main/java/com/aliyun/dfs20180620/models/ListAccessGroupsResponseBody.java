// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessGroupsResponseBody extends TeaModel {
    @NameInMap("AccessGroups")
    public java.util.List<ListAccessGroupsResponseBodyAccessGroups> accessGroups;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccessGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessGroupsResponseBody self = new ListAccessGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessGroupsResponseBody setAccessGroups(java.util.List<ListAccessGroupsResponseBodyAccessGroups> accessGroups) {
        this.accessGroups = accessGroups;
        return this;
    }
    public java.util.List<ListAccessGroupsResponseBodyAccessGroups> getAccessGroups() {
        return this.accessGroups;
    }

    public ListAccessGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccessGroupsResponseBodyAccessGroups extends TeaModel {
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        @NameInMap("AccessGroupName")
        public String accessGroupName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("MountPointCount")
        public Integer mountPointCount;

        @NameInMap("NetworkType")
        public String networkType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        public static ListAccessGroupsResponseBodyAccessGroups build(java.util.Map<String, ?> map) throws Exception {
            ListAccessGroupsResponseBodyAccessGroups self = new ListAccessGroupsResponseBodyAccessGroups();
            return TeaModel.build(map, self);
        }

        public ListAccessGroupsResponseBodyAccessGroups setAccessGroupId(String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        public ListAccessGroupsResponseBodyAccessGroups setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public ListAccessGroupsResponseBodyAccessGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAccessGroupsResponseBodyAccessGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAccessGroupsResponseBodyAccessGroups setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListAccessGroupsResponseBodyAccessGroups setMountPointCount(Integer mountPointCount) {
            this.mountPointCount = mountPointCount;
            return this;
        }
        public Integer getMountPointCount() {
            return this.mountPointCount;
        }

        public ListAccessGroupsResponseBodyAccessGroups setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public ListAccessGroupsResponseBodyAccessGroups setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListAccessGroupsResponseBodyAccessGroups setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

    }

}
