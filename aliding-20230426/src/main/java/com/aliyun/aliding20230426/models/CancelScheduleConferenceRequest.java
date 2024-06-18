// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CancelScheduleConferenceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2a489xxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("ScheduleConferenceId")
    public String scheduleConferenceId;

    @NameInMap("TenantContext")
    public CancelScheduleConferenceRequestTenantContext tenantContext;

    public static CancelScheduleConferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelScheduleConferenceRequest self = new CancelScheduleConferenceRequest();
        return TeaModel.build(map, self);
    }

    public CancelScheduleConferenceRequest setScheduleConferenceId(String scheduleConferenceId) {
        this.scheduleConferenceId = scheduleConferenceId;
        return this;
    }
    public String getScheduleConferenceId() {
        return this.scheduleConferenceId;
    }

    public CancelScheduleConferenceRequest setTenantContext(CancelScheduleConferenceRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CancelScheduleConferenceRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class CancelScheduleConferenceRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CancelScheduleConferenceRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CancelScheduleConferenceRequestTenantContext self = new CancelScheduleConferenceRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CancelScheduleConferenceRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
