// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SetConferenceHostsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    @NameInMap("TenantContext")
    public SetConferenceHostsRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[ &quot;012345&quot;]</p>
     */
    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>607452e01401526ee39609e1</p>
     */
    @NameInMap("conferenceId")
    public String conferenceId;

    public static SetConferenceHostsRequest build(java.util.Map<String, ?> map) throws Exception {
        SetConferenceHostsRequest self = new SetConferenceHostsRequest();
        return TeaModel.build(map, self);
    }

    public SetConferenceHostsRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public SetConferenceHostsRequest setTenantContext(SetConferenceHostsRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SetConferenceHostsRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public SetConferenceHostsRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public SetConferenceHostsRequest setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }
    public String getConferenceId() {
        return this.conferenceId;
    }

    public static class SetConferenceHostsRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static SetConferenceHostsRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SetConferenceHostsRequestTenantContext self = new SetConferenceHostsRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SetConferenceHostsRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
