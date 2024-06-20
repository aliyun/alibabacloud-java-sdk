// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StopMinutesRequest extends TeaModel {
    @NameInMap("TenantContext")
    public StopMinutesRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static StopMinutesRequest build(java.util.Map<String, ?> map) throws Exception {
        StopMinutesRequest self = new StopMinutesRequest();
        return TeaModel.build(map, self);
    }

    public StopMinutesRequest setTenantContext(StopMinutesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public StopMinutesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public StopMinutesRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class StopMinutesRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static StopMinutesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            StopMinutesRequestTenantContext self = new StopMinutesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public StopMinutesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
