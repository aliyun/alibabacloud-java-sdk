// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteAlidingAssistantRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("AssistantId")
    public String assistantId;

    @NameInMap("TenantContext")
    public DeleteAlidingAssistantRequestTenantContext tenantContext;

    public static DeleteAlidingAssistantRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlidingAssistantRequest self = new DeleteAlidingAssistantRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlidingAssistantRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public DeleteAlidingAssistantRequest setTenantContext(DeleteAlidingAssistantRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public DeleteAlidingAssistantRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class DeleteAlidingAssistantRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static DeleteAlidingAssistantRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            DeleteAlidingAssistantRequestTenantContext self = new DeleteAlidingAssistantRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public DeleteAlidingAssistantRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
