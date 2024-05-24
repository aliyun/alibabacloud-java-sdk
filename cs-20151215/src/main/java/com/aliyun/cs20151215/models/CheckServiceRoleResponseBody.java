// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CheckServiceRoleResponseBody extends TeaModel {
    @NameInMap("roles")
    public java.util.List<CheckServiceRoleResponseBodyRoles> roles;

    public static CheckServiceRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceRoleResponseBody self = new CheckServiceRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceRoleResponseBody setRoles(java.util.List<CheckServiceRoleResponseBodyRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<CheckServiceRoleResponseBodyRoles> getRoles() {
        return this.roles;
    }

    public static class CheckServiceRoleResponseBodyRoles extends TeaModel {
        @NameInMap("granted")
        public Boolean granted;

        @NameInMap("message")
        public String message;

        @NameInMap("name")
        public String name;

        public static CheckServiceRoleResponseBodyRoles build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceRoleResponseBodyRoles self = new CheckServiceRoleResponseBodyRoles();
            return TeaModel.build(map, self);
        }

        public CheckServiceRoleResponseBodyRoles setGranted(Boolean granted) {
            this.granted = granted;
            return this;
        }
        public Boolean getGranted() {
            return this.granted;
        }

        public CheckServiceRoleResponseBodyRoles setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CheckServiceRoleResponseBodyRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
