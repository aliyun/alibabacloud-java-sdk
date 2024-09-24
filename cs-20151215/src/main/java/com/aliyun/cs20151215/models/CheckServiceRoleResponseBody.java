// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CheckServiceRoleResponseBody extends TeaModel {
    /**
     * <p>The check results.</p>
     */
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
        /**
         * <p>Specifies whether the service role is granted required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("granted")
        public Boolean granted;

        /**
         * <p>The message returned if the service role is not granted required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>The role does not exist: AliyunCSManagedAutoScalerRole</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The service role name.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunCSManagedAutoScalerRole</p>
         */
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
