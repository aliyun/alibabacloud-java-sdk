// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScenegroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidt*****Xa4K10w==</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    @NameInMap("TenantContext")
    public GetScenegroupRequestTenantContext tenantContext;

    public static GetScenegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenegroupRequest self = new GetScenegroupRequest();
        return TeaModel.build(map, self);
    }

    public GetScenegroupRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetScenegroupRequest setTenantContext(GetScenegroupRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetScenegroupRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetScenegroupRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetScenegroupRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetScenegroupRequestTenantContext self = new GetScenegroupRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetScenegroupRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
