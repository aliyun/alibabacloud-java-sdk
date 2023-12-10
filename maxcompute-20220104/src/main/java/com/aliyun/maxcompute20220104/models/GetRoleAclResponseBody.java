// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetRoleAclResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetRoleAclResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRoleAclResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoleAclResponseBody self = new GetRoleAclResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoleAclResponseBody setData(GetRoleAclResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRoleAclResponseBodyData getData() {
        return this.data;
    }

    public GetRoleAclResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetRoleAclResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetRoleAclResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetRoleAclResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRoleAclResponseBodyDataFunction extends TeaModel {
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

        @NameInMap("schemaName")
        public String schemaName;

        public static GetRoleAclResponseBodyDataFunction build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclResponseBodyDataFunction self = new GetRoleAclResponseBodyDataFunction();
            return TeaModel.build(map, self);
        }

        public GetRoleAclResponseBodyDataFunction setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetRoleAclResponseBodyDataFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRoleAclResponseBodyDataFunction setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetRoleAclResponseBodyDataInstance extends TeaModel {
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

        @NameInMap("schemaName")
        public String schemaName;

        public static GetRoleAclResponseBodyDataInstance build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclResponseBodyDataInstance self = new GetRoleAclResponseBodyDataInstance();
            return TeaModel.build(map, self);
        }

        public GetRoleAclResponseBodyDataInstance setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetRoleAclResponseBodyDataInstance setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRoleAclResponseBodyDataInstance setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetRoleAclResponseBodyDataPackage extends TeaModel {
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

        @NameInMap("schemaName")
        public String schemaName;

        public static GetRoleAclResponseBodyDataPackage build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclResponseBodyDataPackage self = new GetRoleAclResponseBodyDataPackage();
            return TeaModel.build(map, self);
        }

        public GetRoleAclResponseBodyDataPackage setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetRoleAclResponseBodyDataPackage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRoleAclResponseBodyDataPackage setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetRoleAclResponseBodyDataProject extends TeaModel {
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

        @NameInMap("schemaName")
        public String schemaName;

        public static GetRoleAclResponseBodyDataProject build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclResponseBodyDataProject self = new GetRoleAclResponseBodyDataProject();
            return TeaModel.build(map, self);
        }

        public GetRoleAclResponseBodyDataProject setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetRoleAclResponseBodyDataProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRoleAclResponseBodyDataProject setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetRoleAclResponseBodyDataResource extends TeaModel {
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

        @NameInMap("schemaName")
        public String schemaName;

        public static GetRoleAclResponseBodyDataResource build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclResponseBodyDataResource self = new GetRoleAclResponseBodyDataResource();
            return TeaModel.build(map, self);
        }

        public GetRoleAclResponseBodyDataResource setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetRoleAclResponseBodyDataResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRoleAclResponseBodyDataResource setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetRoleAclResponseBodyDataTable extends TeaModel {
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

        @NameInMap("schemaName")
        public String schemaName;

        public static GetRoleAclResponseBodyDataTable build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclResponseBodyDataTable self = new GetRoleAclResponseBodyDataTable();
            return TeaModel.build(map, self);
        }

        public GetRoleAclResponseBodyDataTable setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetRoleAclResponseBodyDataTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRoleAclResponseBodyDataTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetRoleAclResponseBodyData extends TeaModel {
        /**
         * <p>The function.</p>
         */
        @NameInMap("function")
        public java.util.List<GetRoleAclResponseBodyDataFunction> function;

        /**
         * <p>The instance.</p>
         */
        @NameInMap("instance")
        public java.util.List<GetRoleAclResponseBodyDataInstance> instance;

        /**
         * <p>The package.</p>
         */
        @NameInMap("package")
        public java.util.List<GetRoleAclResponseBodyDataPackage> _package;

        /**
         * <p>The project.</p>
         */
        @NameInMap("project")
        public java.util.List<GetRoleAclResponseBodyDataProject> project;

        /**
         * <p>The resource.</p>
         */
        @NameInMap("resource")
        public java.util.List<GetRoleAclResponseBodyDataResource> resource;

        /**
         * <p>The table.</p>
         */
        @NameInMap("table")
        public java.util.List<GetRoleAclResponseBodyDataTable> table;

        public static GetRoleAclResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRoleAclResponseBodyData self = new GetRoleAclResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRoleAclResponseBodyData setFunction(java.util.List<GetRoleAclResponseBodyDataFunction> function) {
            this.function = function;
            return this;
        }
        public java.util.List<GetRoleAclResponseBodyDataFunction> getFunction() {
            return this.function;
        }

        public GetRoleAclResponseBodyData setInstance(java.util.List<GetRoleAclResponseBodyDataInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<GetRoleAclResponseBodyDataInstance> getInstance() {
            return this.instance;
        }

        public GetRoleAclResponseBodyData set_package(java.util.List<GetRoleAclResponseBodyDataPackage> _package) {
            this._package = _package;
            return this;
        }
        public java.util.List<GetRoleAclResponseBodyDataPackage> get_package() {
            return this._package;
        }

        public GetRoleAclResponseBodyData setProject(java.util.List<GetRoleAclResponseBodyDataProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<GetRoleAclResponseBodyDataProject> getProject() {
            return this.project;
        }

        public GetRoleAclResponseBodyData setResource(java.util.List<GetRoleAclResponseBodyDataResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<GetRoleAclResponseBodyDataResource> getResource() {
            return this.resource;
        }

        public GetRoleAclResponseBodyData setTable(java.util.List<GetRoleAclResponseBodyDataTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<GetRoleAclResponseBodyDataTable> getTable() {
            return this.table;
        }

    }

}
