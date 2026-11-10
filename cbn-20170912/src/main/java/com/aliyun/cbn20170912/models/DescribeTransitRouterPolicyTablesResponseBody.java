// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyTablesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, no subsequent query is required.</li>
     * <li>If NextToken is returned, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dd20****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The policy route tables.</p>
     */
    @NameInMap("PolicyTables")
    public java.util.List<DescribeTransitRouterPolicyTablesResponseBodyPolicyTables> policyTables;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2BFA6822-240E-4E27-B4C8-AA400EF7474D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTransitRouterPolicyTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyTablesResponseBody self = new DescribeTransitRouterPolicyTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyTablesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTransitRouterPolicyTablesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTransitRouterPolicyTablesResponseBody setPolicyTables(java.util.List<DescribeTransitRouterPolicyTablesResponseBodyPolicyTables> policyTables) {
        this.policyTables = policyTables;
        return this;
    }
    public java.util.List<DescribeTransitRouterPolicyTablesResponseBodyPolicyTables> getPolicyTables() {
        return this.policyTables;
    }

    public DescribeTransitRouterPolicyTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitRouterPolicyTablesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags self = new DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeTransitRouterPolicyTablesResponseBodyPolicyTables extends TeaModel {
        /**
         * <p>The network instance attachments associated with the policy route table.</p>
         */
        @NameInMap("Attachments")
        public java.util.List<String> attachments;

        /**
         * <p>The time when the policy route table was created.</p>
         * <p>The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2019-10-22T07:44Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the policy route table.</p>
         * 
         * <strong>example:</strong>
         * <p>descriptiontest</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the policy route table.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The policy routing table instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ptbl-44m0p68spvlrqq****</p>
         */
        @NameInMap("PolicyTableId")
        public String policyTableId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the policy route table. Valid values:</p>
         * <ul>
         * <li><p>Creating: The policy route table is being created.</p>
         * </li>
         * <li><p>Active: The policy route table is running.</p>
         * </li>
         * <li><p>Deleting: The policy route table is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags added to the policy route table.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags> tags;

        /**
         * <p>The ID of the Enterprise Edition transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-uf654ttymmljlvh2x****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        public static DescribeTransitRouterPolicyTablesResponseBodyPolicyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterPolicyTablesResponseBodyPolicyTables self = new DescribeTransitRouterPolicyTablesResponseBodyPolicyTables();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setAttachments(java.util.List<String> attachments) {
            this.attachments = attachments;
            return this;
        }
        public java.util.List<String> getAttachments() {
            return this.attachments;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setPolicyTableId(String policyTableId) {
            this.policyTableId = policyTableId;
            return this;
        }
        public String getPolicyTableId() {
            return this.policyTableId;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setTags(java.util.List<DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeTransitRouterPolicyTablesResponseBodyPolicyTablesTags> getTags() {
            return this.tags;
        }

        public DescribeTransitRouterPolicyTablesResponseBodyPolicyTables setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

    }

}
