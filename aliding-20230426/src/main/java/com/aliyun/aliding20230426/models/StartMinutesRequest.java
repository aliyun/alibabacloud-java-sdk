// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartMinutesRequest extends TeaModel {
    @NameInMap("TenantContext")
    public StartMinutesRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61289fxxx</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>012345</p>
     */
    @NameInMap("ownerUserId")
    public String ownerUserId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("recordAudio")
    public Boolean recordAudio;

    public static StartMinutesRequest build(java.util.Map<String, ?> map) throws Exception {
        StartMinutesRequest self = new StartMinutesRequest();
        return TeaModel.build(map, self);
    }

    public StartMinutesRequest setTenantContext(StartMinutesRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public StartMinutesRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public StartMinutesRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public StartMinutesRequest setOwnerUserId(String ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    public StartMinutesRequest setRecordAudio(Boolean recordAudio) {
        this.recordAudio = recordAudio;
        return this;
    }
    public Boolean getRecordAudio() {
        return this.recordAudio;
    }

    public static class StartMinutesRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static StartMinutesRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            StartMinutesRequestTenantContext self = new StartMinutesRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public StartMinutesRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
