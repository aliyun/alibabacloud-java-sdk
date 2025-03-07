// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveInputSecurityGroupsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The security groups.</p>
     */
    @NameInMap("SecurityGroups")
    public java.util.List<ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups> securityGroups;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMediaLiveInputSecurityGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveInputSecurityGroupsResponseBody self = new ListMediaLiveInputSecurityGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveInputSecurityGroupsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaLiveInputSecurityGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaLiveInputSecurityGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaLiveInputSecurityGroupsResponseBody setSecurityGroups(java.util.List<ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }
    public java.util.List<ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups> getSecurityGroups() {
        return this.securityGroups;
    }

    public ListMediaLiveInputSecurityGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups extends TeaModel {
        /**
         * <p>The time when the security group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-03T06:56:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The IDs of the inputs associated with the security group.</p>
         */
        @NameInMap("InputIds")
        public java.util.List<String> inputIds;

        /**
         * <p>The security group name.</p>
         * 
         * <strong>example:</strong>
         * <p>mysg</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the security group.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        /**
         * <p>The security group rules.</p>
         */
        @NameInMap("WhitelistRules")
        public java.util.List<String> whitelistRules;

        public static ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups self = new ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups setInputIds(java.util.List<String> inputIds) {
            this.inputIds = inputIds;
            return this;
        }
        public java.util.List<String> getInputIds() {
            return this.inputIds;
        }

        public ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListMediaLiveInputSecurityGroupsResponseBodySecurityGroups setWhitelistRules(java.util.List<String> whitelistRules) {
            this.whitelistRules = whitelistRules;
            return this;
        }
        public java.util.List<String> getWhitelistRules() {
            return this.whitelistRules;
        }

    }

}
