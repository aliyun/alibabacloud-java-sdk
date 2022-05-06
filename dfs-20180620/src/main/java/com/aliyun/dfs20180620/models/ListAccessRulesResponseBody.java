// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessRulesResponseBody extends TeaModel {
    @NameInMap("AccessRules")
    public java.util.List<ListAccessRulesResponseBodyAccessRules> accessRules;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAccessRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAccessRulesResponseBody self = new ListAccessRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAccessRulesResponseBody setAccessRules(java.util.List<ListAccessRulesResponseBodyAccessRules> accessRules) {
        this.accessRules = accessRules;
        return this;
    }
    public java.util.List<ListAccessRulesResponseBodyAccessRules> getAccessRules() {
        return this.accessRules;
    }

    public ListAccessRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAccessRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAccessRulesResponseBodyAccessRules extends TeaModel {
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        @NameInMap("AccessRuleId")
        public String accessRuleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("NetworkSegment")
        public String networkSegment;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("RWAccessType")
        public String RWAccessType;

        @NameInMap("RegionId")
        public String regionId;

        public static ListAccessRulesResponseBodyAccessRules build(java.util.Map<String, ?> map) throws Exception {
            ListAccessRulesResponseBodyAccessRules self = new ListAccessRulesResponseBodyAccessRules();
            return TeaModel.build(map, self);
        }

        public ListAccessRulesResponseBodyAccessRules setAccessGroupId(String accessGroupId) {
            this.accessGroupId = accessGroupId;
            return this;
        }
        public String getAccessGroupId() {
            return this.accessGroupId;
        }

        public ListAccessRulesResponseBodyAccessRules setAccessRuleId(String accessRuleId) {
            this.accessRuleId = accessRuleId;
            return this;
        }
        public String getAccessRuleId() {
            return this.accessRuleId;
        }

        public ListAccessRulesResponseBodyAccessRules setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAccessRulesResponseBodyAccessRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAccessRulesResponseBodyAccessRules setNetworkSegment(String networkSegment) {
            this.networkSegment = networkSegment;
            return this;
        }
        public String getNetworkSegment() {
            return this.networkSegment;
        }

        public ListAccessRulesResponseBodyAccessRules setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListAccessRulesResponseBodyAccessRules setRWAccessType(String RWAccessType) {
            this.RWAccessType = RWAccessType;
            return this;
        }
        public String getRWAccessType() {
            return this.RWAccessType;
        }

        public ListAccessRulesResponseBodyAccessRules setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
