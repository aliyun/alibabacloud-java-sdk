// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdatePermissionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>kDnRL6jAJMLgNkw7tBnw5aY4VyMoPYe1</p>
     */
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<UpdatePermissionRequestMembers> members;

    @NameInMap("Option")
    public UpdatePermissionRequestOption option;

    /**
     * <strong>example:</strong>
     * <p>READER</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    @NameInMap("TenantContext")
    public UpdatePermissionRequestTenantContext tenantContext;

    public static UpdatePermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePermissionRequest self = new UpdatePermissionRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePermissionRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public UpdatePermissionRequest setMembers(java.util.List<UpdatePermissionRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<UpdatePermissionRequestMembers> getMembers() {
        return this.members;
    }

    public UpdatePermissionRequest setOption(UpdatePermissionRequestOption option) {
        this.option = option;
        return this;
    }
    public UpdatePermissionRequestOption getOption() {
        return this.option;
    }

    public UpdatePermissionRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public UpdatePermissionRequest setTenantContext(UpdatePermissionRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public UpdatePermissionRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class UpdatePermissionRequestMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p>ORG</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>ORG</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdatePermissionRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            UpdatePermissionRequestMembers self = new UpdatePermissionRequestMembers();
            return TeaModel.build(map, self);
        }

        public UpdatePermissionRequestMembers setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public UpdatePermissionRequestMembers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdatePermissionRequestMembers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdatePermissionRequestOption extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Long duration;

        public static UpdatePermissionRequestOption build(java.util.Map<String, ?> map) throws Exception {
            UpdatePermissionRequestOption self = new UpdatePermissionRequestOption();
            return TeaModel.build(map, self);
        }

        public UpdatePermissionRequestOption setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class UpdatePermissionRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static UpdatePermissionRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            UpdatePermissionRequestTenantContext self = new UpdatePermissionRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public UpdatePermissionRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
