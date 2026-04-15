// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchQueryGroupMemberRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>COOLAPP_XXXXX</p>
     */
    @NameInMap("CoolAppCode")
    public String coolAppCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Long maxResults;

    /**
     * <strong>example:</strong>
     * <p>weqrwereqsadqaadfafa</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidt*****Xa4K10w==</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    @NameInMap("TenantContext")
    public BatchQueryGroupMemberRequestTenantContext tenantContext;

    public static BatchQueryGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryGroupMemberRequest self = new BatchQueryGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryGroupMemberRequest setCoolAppCode(String coolAppCode) {
        this.coolAppCode = coolAppCode;
        return this;
    }
    public String getCoolAppCode() {
        return this.coolAppCode;
    }

    public BatchQueryGroupMemberRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public BatchQueryGroupMemberRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public BatchQueryGroupMemberRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public BatchQueryGroupMemberRequest setTenantContext(BatchQueryGroupMemberRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public BatchQueryGroupMemberRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class BatchQueryGroupMemberRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static BatchQueryGroupMemberRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryGroupMemberRequestTenantContext self = new BatchQueryGroupMemberRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public BatchQueryGroupMemberRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
