// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListRolesResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListRolesResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRolesResponseBody self = new ListRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRolesResponseBody setData(ListRolesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRolesResponseBodyData getData() {
        return this.data;
    }

    public ListRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRolesResponseBodyDataRolesAclFunction extends TeaModel {
        /**
         * <p>The operations that were performed on the function.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the function.</p>
         */
        @NameInMap("name")
        public String name;

        public static ListRolesResponseBodyDataRolesAclFunction build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRolesAclFunction self = new ListRolesResponseBodyDataRolesAclFunction();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRolesAclFunction setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListRolesResponseBodyDataRolesAclFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRolesResponseBodyDataRolesAclInstance extends TeaModel {
        /**
         * <p>The operations that were performed on the instance.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the instance.</p>
         */
        @NameInMap("name")
        public String name;

        public static ListRolesResponseBodyDataRolesAclInstance build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRolesAclInstance self = new ListRolesResponseBodyDataRolesAclInstance();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRolesAclInstance setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListRolesResponseBodyDataRolesAclInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRolesResponseBodyDataRolesAclPackage extends TeaModel {
        /**
         * <p>The operations that were performed on the package.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the package.</p>
         */
        @NameInMap("name")
        public String name;

        public static ListRolesResponseBodyDataRolesAclPackage build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRolesAclPackage self = new ListRolesResponseBodyDataRolesAclPackage();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRolesAclPackage setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListRolesResponseBodyDataRolesAclPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRolesResponseBodyDataRolesAclProject extends TeaModel {
        /**
         * <p>The operations that were performed on the project.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the MaxCompute project.</p>
         */
        @NameInMap("name")
        public String name;

        public static ListRolesResponseBodyDataRolesAclProject build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRolesAclProject self = new ListRolesResponseBodyDataRolesAclProject();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRolesAclProject setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListRolesResponseBodyDataRolesAclProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRolesResponseBodyDataRolesAclResource extends TeaModel {
        /**
         * <p>The operations that were performed on the resource.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the resource.</p>
         */
        @NameInMap("name")
        public String name;

        public static ListRolesResponseBodyDataRolesAclResource build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRolesAclResource self = new ListRolesResponseBodyDataRolesAclResource();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRolesAclResource setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListRolesResponseBodyDataRolesAclResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRolesResponseBodyDataRolesAclTable extends TeaModel {
        /**
         * <p>The operations that were performed on the table.</p>
         */
        @NameInMap("actions")
        public java.util.List<String> actions;

        /**
         * <p>The name of the table.</p>
         */
        @NameInMap("name")
        public String name;

        public static ListRolesResponseBodyDataRolesAclTable build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRolesAclTable self = new ListRolesResponseBodyDataRolesAclTable();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRolesAclTable setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public ListRolesResponseBodyDataRolesAclTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListRolesResponseBodyDataRolesAcl extends TeaModel {
        /**
         * <p>The function.</p>
         */
        @NameInMap("function")
        public java.util.List<ListRolesResponseBodyDataRolesAclFunction> function;

        /**
         * <p>The instance.</p>
         */
        @NameInMap("instance")
        public java.util.List<ListRolesResponseBodyDataRolesAclInstance> instance;

        /**
         * <p>The package.</p>
         */
        @NameInMap("package")
        public java.util.List<ListRolesResponseBodyDataRolesAclPackage> _package;

        /**
         * <p>The project.</p>
         */
        @NameInMap("project")
        public java.util.List<ListRolesResponseBodyDataRolesAclProject> project;

        /**
         * <p>The resource.</p>
         */
        @NameInMap("resource")
        public java.util.List<ListRolesResponseBodyDataRolesAclResource> resource;

        /**
         * <p>The table.</p>
         */
        @NameInMap("table")
        public java.util.List<ListRolesResponseBodyDataRolesAclTable> table;

        public static ListRolesResponseBodyDataRolesAcl build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRolesAcl self = new ListRolesResponseBodyDataRolesAcl();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRolesAcl setFunction(java.util.List<ListRolesResponseBodyDataRolesAclFunction> function) {
            this.function = function;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRolesAclFunction> getFunction() {
            return this.function;
        }

        public ListRolesResponseBodyDataRolesAcl setInstance(java.util.List<ListRolesResponseBodyDataRolesAclInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRolesAclInstance> getInstance() {
            return this.instance;
        }

        public ListRolesResponseBodyDataRolesAcl set_package(java.util.List<ListRolesResponseBodyDataRolesAclPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRolesAclPackage> get_package() {
            return this._package;
        }

        public ListRolesResponseBodyDataRolesAcl setProject(java.util.List<ListRolesResponseBodyDataRolesAclProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRolesAclProject> getProject() {
            return this.project;
        }

        public ListRolesResponseBodyDataRolesAcl setResource(java.util.List<ListRolesResponseBodyDataRolesAclResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRolesAclResource> getResource() {
            return this.resource;
        }

        public ListRolesResponseBodyDataRolesAcl setTable(java.util.List<ListRolesResponseBodyDataRolesAclTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRolesAclTable> getTable() {
            return this.table;
        }

    }

    public static class ListRolesResponseBodyDataRoles extends TeaModel {
        /**
         * <p>The ACL-based permissions that are granted to the role.</p>
         */
        @NameInMap("acl")
        public ListRolesResponseBodyDataRolesAcl acl;

        /**
         * <p>The name of the role.</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The policy that is attached to the role.</p>
         */
        @NameInMap("policy")
        public String policy;

        /**
         * <p>The type of the role.</p>
         */
        @NameInMap("type")
        public String type;

        public static ListRolesResponseBodyDataRoles build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyDataRoles self = new ListRolesResponseBodyDataRoles();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyDataRoles setAcl(ListRolesResponseBodyDataRolesAcl acl) {
            this.acl = acl;
            return this;
        }
        public ListRolesResponseBodyDataRolesAcl getAcl() {
            return this.acl;
        }

        public ListRolesResponseBodyDataRoles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRolesResponseBodyDataRoles setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public ListRolesResponseBodyDataRoles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListRolesResponseBodyData extends TeaModel {
        /**
         * <p>The MaxCompute project-level roles.</p>
         */
        @NameInMap("roles")
        public java.util.List<ListRolesResponseBodyDataRoles> roles;

        public static ListRolesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRolesResponseBodyData self = new ListRolesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRolesResponseBodyData setRoles(java.util.List<ListRolesResponseBodyDataRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<ListRolesResponseBodyDataRoles> getRoles() {
            return this.roles;
        }

    }

}
