// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CloseVideoConferenceRequest extends TeaModel {
    @NameInMap("TenantContext")
    public CloseVideoConferenceRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static CloseVideoConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseVideoConferenceRequest self = new CloseVideoConferenceRequest();
        return TeaModel.build(map, self);
    }

    public CloseVideoConferenceRequest setTenantContext(CloseVideoConferenceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CloseVideoConferenceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CloseVideoConferenceRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class CloseVideoConferenceRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CloseVideoConferenceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CloseVideoConferenceRequestTenantContext self = new CloseVideoConferenceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CloseVideoConferenceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
