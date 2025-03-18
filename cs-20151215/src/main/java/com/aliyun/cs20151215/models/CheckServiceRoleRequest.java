// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CheckServiceRoleRequest extends TeaModel {
    /**
     * <p>The service roles that you want to check.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("roles")
    public java.util.List<CheckServiceRoleRequestRoles> roles;

    public static CheckServiceRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceRoleRequest self = new CheckServiceRoleRequest();
        return TeaModel.build(map, self);
    }

    public CheckServiceRoleRequest setRoles(java.util.List<CheckServiceRoleRequestRoles> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<CheckServiceRoleRequestRoles> getRoles() {
        return this.roles;
    }

    public static class CheckServiceRoleRequestRoles extends TeaModel {
        /**
         * <p>The name of the service role. For more information about ACK roles, see <a href="https://help.aliyun.com/document_detail/86483.html">ACK roles</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunCSManagedAutoScalerRole</p>
         */
        @NameInMap("name")
        public String name;

        public static CheckServiceRoleRequestRoles build(java.util.Map<String, ?> map) throws Exception {
            CheckServiceRoleRequestRoles self = new CheckServiceRoleRequestRoles();
            return TeaModel.build(map, self);
        }

        public CheckServiceRoleRequestRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
