// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpSyncConfig extends TeaModel {
    @NameInMap("AutoSyncEnabled")
    public Boolean autoSyncEnabled;

    @NameInMap("IdpDepartmentInfos")
    public java.util.List<IdpSyncConfigIdpDepartmentInfos> idpDepartmentInfos;

    @NameInMap("ScheduleSyncIntervalSecond")
    public Long scheduleSyncIntervalSecond;

    @NameInMap("UserSyncEnabled")
    public Boolean userSyncEnabled;

    public static IdpSyncConfig build(java.util.Map<String, ?> map) throws Exception {
        IdpSyncConfig self = new IdpSyncConfig();
        return TeaModel.build(map, self);
    }

    public IdpSyncConfig setAutoSyncEnabled(Boolean autoSyncEnabled) {
        this.autoSyncEnabled = autoSyncEnabled;
        return this;
    }
    public Boolean getAutoSyncEnabled() {
        return this.autoSyncEnabled;
    }

    public IdpSyncConfig setIdpDepartmentInfos(java.util.List<IdpSyncConfigIdpDepartmentInfos> idpDepartmentInfos) {
        this.idpDepartmentInfos = idpDepartmentInfos;
        return this;
    }
    public java.util.List<IdpSyncConfigIdpDepartmentInfos> getIdpDepartmentInfos() {
        return this.idpDepartmentInfos;
    }

    public IdpSyncConfig setScheduleSyncIntervalSecond(Long scheduleSyncIntervalSecond) {
        this.scheduleSyncIntervalSecond = scheduleSyncIntervalSecond;
        return this;
    }
    public Long getScheduleSyncIntervalSecond() {
        return this.scheduleSyncIntervalSecond;
    }

    public IdpSyncConfig setUserSyncEnabled(Boolean userSyncEnabled) {
        this.userSyncEnabled = userSyncEnabled;
        return this;
    }
    public Boolean getUserSyncEnabled() {
        return this.userSyncEnabled;
    }

    public static class IdpSyncConfigIdpDepartmentInfos extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static IdpSyncConfigIdpDepartmentInfos build(java.util.Map<String, ?> map) throws Exception {
            IdpSyncConfigIdpDepartmentInfos self = new IdpSyncConfigIdpDepartmentInfos();
            return TeaModel.build(map, self);
        }

        public IdpSyncConfigIdpDepartmentInfos setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IdpSyncConfigIdpDepartmentInfos setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
