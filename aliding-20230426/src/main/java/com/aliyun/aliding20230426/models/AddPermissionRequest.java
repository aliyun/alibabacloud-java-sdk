// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddPermissionRequest extends TeaModel {
    @NameInMap("DentryUuid")
    public String dentryUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Members")
    public java.util.List<AddPermissionRequestMembers> members;

    @NameInMap("Option")
    public AddPermissionRequestOption option;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleId")
    public String roleId;

    @NameInMap("TenantContext")
    public AddPermissionRequestTenantContext tenantContext;

    public static AddPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPermissionRequest self = new AddPermissionRequest();
        return TeaModel.build(map, self);
    }

    public AddPermissionRequest setDentryUuid(String dentryUuid) {
        this.dentryUuid = dentryUuid;
        return this;
    }
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    public AddPermissionRequest setMembers(java.util.List<AddPermissionRequestMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<AddPermissionRequestMembers> getMembers() {
        return this.members;
    }

    public AddPermissionRequest setOption(AddPermissionRequestOption option) {
        this.option = option;
        return this;
    }
    public AddPermissionRequestOption getOption() {
        return this.option;
    }

    public AddPermissionRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public AddPermissionRequest setTenantContext(AddPermissionRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public AddPermissionRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class AddPermissionRequestMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("CorpId")
        public String corpId;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>ORG</p>
         */
        @NameInMap("Type")
        public String type;

        public static AddPermissionRequestMembers build(java.util.Map<String, ?> map) throws Exception {
            AddPermissionRequestMembers self = new AddPermissionRequestMembers();
            return TeaModel.build(map, self);
        }

        public AddPermissionRequestMembers setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public AddPermissionRequestMembers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddPermissionRequestMembers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class AddPermissionRequestOption extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("Duration")
        public Long duration;

        public static AddPermissionRequestOption build(java.util.Map<String, ?> map) throws Exception {
            AddPermissionRequestOption self = new AddPermissionRequestOption();
            return TeaModel.build(map, self);
        }

        public AddPermissionRequestOption setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class AddPermissionRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static AddPermissionRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            AddPermissionRequestTenantContext self = new AddPermissionRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public AddPermissionRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
