// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessRulesResponseBody extends TeaModel {
    @NameInMap("AccessRules")
    public java.util.List<ListAccessRulesResponseBodyAccessRules> accessRules;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>55C5FFD6-BF99-41BD-9C66-FFF39189****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
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

    public ListAccessRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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
        /**
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        /**
         * <strong>example:</strong>
         * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
         */
        @NameInMap("AccessRuleId")
        public String accessRuleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>192.0.2.0/24</p>
         */
        @NameInMap("NetworkSegment")
        public String networkSegment;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <strong>example:</strong>
         * <p>RDWR</p>
         */
        @NameInMap("RWAccessType")
        public String RWAccessType;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
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
