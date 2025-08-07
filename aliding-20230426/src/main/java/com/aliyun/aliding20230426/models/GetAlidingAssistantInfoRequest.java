// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAlidingAssistantInfoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("AssistantId")
    public String assistantId;

    @NameInMap("TenantContext")
    public GetAlidingAssistantInfoRequestTenantContext tenantContext;

    public static GetAlidingAssistantInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlidingAssistantInfoRequest self = new GetAlidingAssistantInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAlidingAssistantInfoRequest setAssistantId(String assistantId) {
        this.assistantId = assistantId;
        return this;
    }
    public String getAssistantId() {
        return this.assistantId;
    }

    public GetAlidingAssistantInfoRequest setTenantContext(GetAlidingAssistantInfoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetAlidingAssistantInfoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetAlidingAssistantInfoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetAlidingAssistantInfoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetAlidingAssistantInfoRequestTenantContext self = new GetAlidingAssistantInfoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetAlidingAssistantInfoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
