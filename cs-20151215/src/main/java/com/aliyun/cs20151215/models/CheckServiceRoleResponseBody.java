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
         * <p>Indicates whether the service role is assigned to ACK.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: The role is assigned to ACK.</li>
         * <li>false: The role is not assigned to ACK.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("granted")
        public Boolean granted;

        /**
         * <p>The message that is displayed for a role that is not assigned to ACK.</p>
         * 
         * <strong>example:</strong>
         * <p>The role does not exist: AliyunCSManagedAutoScalerRole</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The name of the service role.</p>
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
