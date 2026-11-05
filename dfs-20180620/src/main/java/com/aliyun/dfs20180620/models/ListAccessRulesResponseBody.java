// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class ListAccessRulesResponseBody extends TeaModel {
    /**
     * <p>The access group rules.</p>
     */
    @NameInMap("AccessRules")
    public java.util.List<ListAccessRulesResponseBodyAccessRules> accessRules;

    /**
     * <p>The token for the next page.</p>
     * <p>If a single query does not return all entries, a non-empty NextToken is returned. You can specify the NextToken in a subsequent query to continue the query.</p>
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
         * <p>The ID of the access group.</p>
         * 
         * <strong>example:</strong>
         * <p>acg-e3755fb0-358d-4286-9942-8d461048****</p>
         */
        @NameInMap("AccessGroupId")
        public String accessGroupId;

        /**
         * <p>The ID of the access group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-c38028f0-f313-4385-9456-3501b1f5****</p>
         */
        @NameInMap("AccessRuleId")
        public String accessRuleId;

        /**
         * <p>The time when the access group rule was created. The time is displayed in UTC and follows the ISO 8601 standard. Example: 2022-04-18T08:02:09.986217Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-04-18T08:02:09.986217Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the access group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>CIDR block of the log upload server</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The IP address or CIDR block of the authorized object.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.0/24</p>
         */
        @NameInMap("NetworkSegment")
        public String networkSegment;

        /**
         * <p>The priority of the access group rule.</p>
         * <p>If an authorized object matches multiple rules, the rule with the highest priority takes effect.</p>
         * <p>Valid values: 1 to 100. A value of 1 indicates the highest priority.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The read and write permissions of the authorized object on the file system.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RDWR: read and write</li>
         * <li>RDONLY: read-only</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RDWR</p>
         */
        @NameInMap("RWAccessType")
        public String RWAccessType;

        /**
         * <p>The region ID.</p>
         * 
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
