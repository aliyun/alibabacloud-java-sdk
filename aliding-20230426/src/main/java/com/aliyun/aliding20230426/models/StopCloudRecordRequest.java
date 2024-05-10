// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StopCloudRecordRequest extends TeaModel {
    @NameInMap("TenantContext")
    public StopCloudRecordRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static StopCloudRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StopCloudRecordRequest self = new StopCloudRecordRequest();
        return TeaModel.build(map, self);
    }

    public StopCloudRecordRequest setTenantContext(StopCloudRecordRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public StopCloudRecordRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public StopCloudRecordRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class StopCloudRecordRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static StopCloudRecordRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            StopCloudRecordRequestTenantContext self = new StopCloudRecordRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public StopCloudRecordRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
