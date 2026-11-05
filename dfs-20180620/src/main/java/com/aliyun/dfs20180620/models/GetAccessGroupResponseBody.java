// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetAccessGroupResponseBody extends TeaModel {
    /**
     * <p>The access group information.</p>
     */
    @NameInMap("AccessGroup")
    public GetAccessGroupResponseBodyAccessGroup accessGroup;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetAccessGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAccessGroupResponseBody self = new GetAccessGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAccessGroupResponseBody setAccessGroup(GetAccessGroupResponseBodyAccessGroup accessGroup) {
        this.accessGroup = accessGroup;
        return this;
    }
    public GetAccessGroupResponseBodyAccessGroup getAccessGroup() {
        return this.accessGroup;
    }

    public GetAccessGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetAccessGroupResponseBodyAccessGroup extends TeaModel {
        /**
         * <p>The access group ID.</p>
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
         * <p>Indicates whether the access group is the default access group. Valid values:</p>
         * <ul>
         * <li>true: The access group is the default access group. When the access group is the default access group, all IP addresses are allowed to access it, and you cannot delete the default access group or the permission rules in the access group.</li>
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
         * <p>The number of permission rules in the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        public static GetAccessGroupResponseBodyAccessGroup build(java.util.Map<String, ?> map) throws Exception {
            GetAccessGroupResponseBodyAccessGroup self = new GetAccessGroupResponseBodyAccessGroup();
            return TeaModel.build(map, self);
        }

        public GetAccessGroupResponseBodyAccessGroup setAccessGroupId(String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        public GetAccessGroupResponseBodyAccessGroup setAccessGroupName(String accessGroupName) {
            this.accessGroupName = accessGroupName;
            return this;
        }
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        public GetAccessGroupResponseBodyAccessGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetAccessGroupResponseBodyAccessGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAccessGroupResponseBodyAccessGroup setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetAccessGroupResponseBodyAccessGroup setMountPointCount(Integer mountPointCount) {
            this.mountPointCount = mountPointCount;
            return this;
        }
        public Integer getMountPointCount() {
            return this.mountPointCount;
        }

        public GetAccessGroupResponseBodyAccessGroup setNetworkType(String networkType) {
            this.networkType = networkType;
            return this;
        }
        public String getNetworkType() {
            return this.networkType;
        }

        public GetAccessGroupResponseBodyAccessGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetAccessGroupResponseBodyAccessGroup setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

    }

}
