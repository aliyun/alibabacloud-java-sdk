// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class MeetingFlashMinutesRequest extends TeaModel {
    @NameInMap("TenantContext")
    public MeetingFlashMinutesRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static MeetingFlashMinutesRequest build(java.util.Map<String, ?> map) throws Exception {
        MeetingFlashMinutesRequest self = new MeetingFlashMinutesRequest();
        return TeaModel.build(map, self);
    }

    public MeetingFlashMinutesRequest setTenantContext(MeetingFlashMinutesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public MeetingFlashMinutesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public MeetingFlashMinutesRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class MeetingFlashMinutesRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static MeetingFlashMinutesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            MeetingFlashMinutesRequestTenantContext self = new MeetingFlashMinutesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public MeetingFlashMinutesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
