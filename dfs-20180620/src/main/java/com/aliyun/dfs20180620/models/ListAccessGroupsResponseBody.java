// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessGroupsResponseBody extends TeaModel {
    /**
     * <p>The access group information.</p>
     */
    @NameInMap("AccessGroups")
    public java.util.List<ListAccessGroupsResponseBodyAccessGroups> accessGroups;

    /**
     * <p>The pagination token.</p>
     * <p>If a single query does not return all results, a non-empty NextToken is returned. You can include the NextToken in the next request to continue the query.</p>
     * 
     * <strong>example:</strong>
     * <p>PtHVCBwpddbWVRCFe3wlB_-tOLtD4KSv3DzI7G6iywQSm69vY0lvOlDTzqVWqXWApvYQ2iUa8s4HbcFanMQfDIlds4da87_Ax4UJMva****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public ListAccessGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <p>The ID of the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        /**
         * <p>The name of the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cluster-policy</p>
         */
        @NameInMap("AccessGroupName")
        public String accessGroupName;

        /**
         * <p>The time when the access group was created. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-04-18T08:02:09.986217Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T08:02:09.986217Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dedicated access group for test clusters</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether the access group is the default access group.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The access group is the default access group. A default access group allows access from all IP addresses. You cannot delete a default access group or the rules within it.</li>
         * <li>false: The access group is not the default access group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The number of mount points associated with the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MountPointCount")
        public Integer mountPointCount;

        /**
         * <p>The network type of the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkType")
        public String networkType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of rules in the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
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
