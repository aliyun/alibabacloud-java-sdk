// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartCloudRecordRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("SmallWindowPosition")
    public String smallWindowPosition;

    @NameInMap("TenantContext")
    public StartCloudRecordRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static StartCloudRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordRequest self = new StartCloudRecordRequest();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public StartCloudRecordRequest setSmallWindowPosition(String smallWindowPosition) {
        this.smallWindowPosition = smallWindowPosition;
        return this;
    }
    public String getSmallWindowPosition() {
        return this.smallWindowPosition;
    }

    public StartCloudRecordRequest setTenantContext(StartCloudRecordRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public StartCloudRecordRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public StartCloudRecordRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class StartCloudRecordRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static StartCloudRecordRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            StartCloudRecordRequestTenantContext self = new StartCloudRecordRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public StartCloudRecordRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
