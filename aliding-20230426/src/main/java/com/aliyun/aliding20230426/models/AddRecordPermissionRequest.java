// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddRecordPermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>minutes</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1dddwrqrq</p>
     */
    @NameInMap("ConferenceId")
    public String conferenceId;

    @NameInMap("TenantContext")
    public AddRecordPermissionRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>012345</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static AddRecordPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRecordPermissionRequest self = new AddRecordPermissionRequest();
        return TeaModel.build(map, self);
    }

    public AddRecordPermissionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public AddRecordPermissionRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public AddRecordPermissionRequest setTenantContext(AddRecordPermissionRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddRecordPermissionRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public AddRecordPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class AddRecordPermissionRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static AddRecordPermissionRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddRecordPermissionRequestTenantContext self = new AddRecordPermissionRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddRecordPermissionRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
