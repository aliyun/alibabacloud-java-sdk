// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>zzz</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>public_template</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    @NameInMap("TenantContext")
    public ListTemplateRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>workspaceId</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTemplateRequest self = new ListTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListTemplateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListTemplateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public ListTemplateRequest setTenantContext(ListTemplateRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public ListTemplateRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public ListTemplateRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListTemplateRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static ListTemplateRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            ListTemplateRequestTenantContext self = new ListTemplateRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public ListTemplateRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
