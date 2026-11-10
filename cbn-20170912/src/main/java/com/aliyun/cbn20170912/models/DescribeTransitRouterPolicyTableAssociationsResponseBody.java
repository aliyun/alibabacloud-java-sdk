// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeTransitRouterPolicyTableAssociationsResponseBody extends TeaModel {
    /**
     * <p>The associate relationships between the policy routing table and network connectivity instances.</p>
     */
    @NameInMap("Associations")
    public java.util.List<DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations> associations;

    /**
     * <p>The number of entries returned per page in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query in a paginated query.</p>
     * 
     * <strong>example:</strong>
     * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13526224-5780-4426-8BDF-BC8B08700F22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTransitRouterPolicyTableAssociationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitRouterPolicyTableAssociationsResponseBody self = new DescribeTransitRouterPolicyTableAssociationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTransitRouterPolicyTableAssociationsResponseBody setAssociations(java.util.List<DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations> associations) {
        this.associations = associations;
        return this;
    }
    public java.util.List<DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations> getAssociations() {
        return this.associations;
    }

    public DescribeTransitRouterPolicyTableAssociationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeTransitRouterPolicyTableAssociationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeTransitRouterPolicyTableAssociationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTransitRouterPolicyTableAssociationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations extends TeaModel {
        /**
         * <p>The ID of the association between the policy route table and the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pta-vfan3mbxoespx7xvyt</p>
         */
        @NameInMap("AssociationId")
        public String associationId;

        /**
         * <p>The ID of the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-123qsrads</p>
         */
        @NameInMap("AttachmentId")
        public String attachmentId;

        /**
         * <p>The instance ID of the policy routing table.</p>
         * 
         * <strong>example:</strong>
         * <p>ptbl-123adfzcx</p>
         */
        @NameInMap("PolicyTableId")
        public String policyTableId;

        /**
         * <p>The status of the association. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: Active.</li>
         * <li><strong>Associating</strong>: Associating.</li>
         * <li><strong>Dissociating</strong>: Dissociating.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations build(java.util.Map<String, ?> map) throws Exception {
            DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations self = new DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations();
            return TeaModel.build(map, self);
        }

        public DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations setAssociationId(String associationId) {
            this.associationId = associationId;
            return this;
        }
        public String getAssociationId() {
            return this.associationId;
        }

        public DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations setPolicyTableId(String policyTableId) {
            this.policyTableId = policyTableId;
            return this;
        }
        public String getPolicyTableId() {
            return this.policyTableId;
        }

        public DescribeTransitRouterPolicyTableAssociationsResponseBodyAssociations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
