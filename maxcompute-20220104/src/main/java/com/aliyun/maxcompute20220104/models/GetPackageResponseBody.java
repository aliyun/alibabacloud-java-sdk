// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetPackageResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetPackageResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPackageResponseBody self = new GetPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPackageResponseBody setData(GetPackageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPackageResponseBodyData getData() {
        return this.data;
    }

    public GetPackageResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPackageResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetPackageResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPackageResponseBodyDataAllowedProjectList extends TeaModel {
        /**
         * <p>The security level for sensitive data.</p>
         */
        @NameInMap("label")
        public String label;

        /**
         * <p>The name of the MaxCompute project.</p>
         */
        @NameInMap("project")
        public String project;

        public static GetPackageResponseBodyDataAllowedProjectList build(java.util.Map<String, ?> map) throws Exception {
            GetPackageResponseBodyDataAllowedProjectList self = new GetPackageResponseBodyDataAllowedProjectList();
            return TeaModel.build(map, self);
        }

        public GetPackageResponseBodyDataAllowedProjectList setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetPackageResponseBodyDataAllowedProjectList setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class GetPackageResponseBodyDataResourceListFunction extends TeaModel {
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

        /**
         * <p>The name of schema.</p>
         */
        @NameInMap("schemaName")
        public String schemaName;

        public static GetPackageResponseBodyDataResourceListFunction build(java.util.Map<String, ?> map) throws Exception {
            GetPackageResponseBodyDataResourceListFunction self = new GetPackageResponseBodyDataResourceListFunction();
            return TeaModel.build(map, self);
        }

        public GetPackageResponseBodyDataResourceListFunction setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetPackageResponseBodyDataResourceListFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPackageResponseBodyDataResourceListFunction setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetPackageResponseBodyDataResourceListResource extends TeaModel {
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

        /**
         * <p>The name of schema.</p>
         */
        @NameInMap("schemaName")
        public String schemaName;

        public static GetPackageResponseBodyDataResourceListResource build(java.util.Map<String, ?> map) throws Exception {
            GetPackageResponseBodyDataResourceListResource self = new GetPackageResponseBodyDataResourceListResource();
            return TeaModel.build(map, self);
        }

        public GetPackageResponseBodyDataResourceListResource setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetPackageResponseBodyDataResourceListResource setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPackageResponseBodyDataResourceListResource setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetPackageResponseBodyDataResourceListTable extends TeaModel {
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

        /**
         * <p>The name of schema.</p>
         */
        @NameInMap("schemaName")
        public String schemaName;

        public static GetPackageResponseBodyDataResourceListTable build(java.util.Map<String, ?> map) throws Exception {
            GetPackageResponseBodyDataResourceListTable self = new GetPackageResponseBodyDataResourceListTable();
            return TeaModel.build(map, self);
        }

        public GetPackageResponseBodyDataResourceListTable setActions(java.util.List<String> actions) {
            this.actions = actions;
            return this;
        }
        public java.util.List<String> getActions() {
            return this.actions;
        }

        public GetPackageResponseBodyDataResourceListTable setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPackageResponseBodyDataResourceListTable setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

    }

    public static class GetPackageResponseBodyDataResourceList extends TeaModel {
        /**
         * <p>The functions.</p>
         */
        @NameInMap("function")
        public java.util.List<GetPackageResponseBodyDataResourceListFunction> function;

        /**
         * <p>The resources.</p>
         */
        @NameInMap("resource")
        public java.util.List<GetPackageResponseBodyDataResourceListResource> resource;

        /**
         * <p>The tables.</p>
         */
        @NameInMap("table")
        public java.util.List<GetPackageResponseBodyDataResourceListTable> table;

        public static GetPackageResponseBodyDataResourceList build(java.util.Map<String, ?> map) throws Exception {
            GetPackageResponseBodyDataResourceList self = new GetPackageResponseBodyDataResourceList();
            return TeaModel.build(map, self);
        }

        public GetPackageResponseBodyDataResourceList setFunction(java.util.List<GetPackageResponseBodyDataResourceListFunction> function) {
            this.function = function;
            return this;
        }
        public java.util.List<GetPackageResponseBodyDataResourceListFunction> getFunction() {
            return this.function;
        }

        public GetPackageResponseBodyDataResourceList setResource(java.util.List<GetPackageResponseBodyDataResourceListResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<GetPackageResponseBodyDataResourceListResource> getResource() {
            return this.resource;
        }

        public GetPackageResponseBodyDataResourceList setTable(java.util.List<GetPackageResponseBodyDataResourceListTable> table) {
            this.table = table;
            return this;
        }
        public java.util.List<GetPackageResponseBodyDataResourceListTable> getTable() {
            return this.table;
        }

    }

    public static class GetPackageResponseBodyData extends TeaModel {
        /**
         * <p>The projects in which the package is installed.</p>
         */
        @NameInMap("allowedProjectList")
        public java.util.List<GetPackageResponseBodyDataAllowedProjectList> allowedProjectList;

        /**
         * <p>The details of the resources that are included in the package.</p>
         */
        @NameInMap("resourceList")
        public GetPackageResponseBodyDataResourceList resourceList;

        public static GetPackageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPackageResponseBodyData self = new GetPackageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPackageResponseBodyData setAllowedProjectList(java.util.List<GetPackageResponseBodyDataAllowedProjectList> allowedProjectList) {
            this.allowedProjectList = allowedProjectList;
            return this;
        }
        public java.util.List<GetPackageResponseBodyDataAllowedProjectList> getAllowedProjectList() {
            return this.allowedProjectList;
        }

        public GetPackageResponseBodyData setResourceList(GetPackageResponseBodyDataResourceList resourceList) {
            this.resourceList = resourceList;
            return this;
        }
        public GetPackageResponseBodyDataResourceList getResourceList() {
            return this.resourceList;
        }

    }

}
