// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class PolicyItem extends TeaModel {
    @NameInMap("Accesses")
    public java.util.List<PolicyItemAccesses> accesses;

    @NameInMap("Conditions")
    public java.util.List<PolicyItemCondition> conditions;

    @NameInMap("DelegateAdmin")
    public Boolean delegateAdmin;

    @NameInMap("Groups")
    public java.util.List<String> groups;

    @NameInMap("Roles")
    public java.util.List<String> roles;

    @NameInMap("Users")
    public java.util.List<String> users;

    public static PolicyItem build(java.util.Map<String, ?> map) throws Exception {
        PolicyItem self = new PolicyItem();
        return TeaModel.build(map, self);
    }

    public PolicyItem setAccesses(java.util.List<PolicyItemAccesses> accesses) {
        this.accesses = accesses;
        return this;
    }
    public java.util.List<PolicyItemAccesses> getAccesses() {
        return this.accesses;
    }

    public PolicyItem setConditions(java.util.List<PolicyItemCondition> conditions) {
        this.conditions = conditions;
        return this;
    }
    public java.util.List<PolicyItemCondition> getConditions() {
        return this.conditions;
    }

    public PolicyItem setDelegateAdmin(Boolean delegateAdmin) {
        this.delegateAdmin = delegateAdmin;
        return this;
    }
    public Boolean getDelegateAdmin() {
        return this.delegateAdmin;
    }

    public PolicyItem setGroups(java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public PolicyItem setRoles(java.util.List<String> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<String> getRoles() {
        return this.roles;
    }

    public PolicyItem setUsers(java.util.List<String> users) {
        this.users = users;
        return this;
    }
    public java.util.List<String> getUsers() {
        return this.users;
    }

    public static class PolicyItemAccesses extends TeaModel {
        @NameInMap("IsAllowed")
        public Boolean isAllowed;

        @NameInMap("Type")
        public String type;

        public static PolicyItemAccesses build(java.util.Map<String, ?> map) throws Exception {
            PolicyItemAccesses self = new PolicyItemAccesses();
            return TeaModel.build(map, self);
        }

        public PolicyItemAccesses setIsAllowed(Boolean isAllowed) {
            this.isAllowed = isAllowed;
            return this;
        }
        public Boolean getIsAllowed() {
            return this.isAllowed;
        }

        public PolicyItemAccesses setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
