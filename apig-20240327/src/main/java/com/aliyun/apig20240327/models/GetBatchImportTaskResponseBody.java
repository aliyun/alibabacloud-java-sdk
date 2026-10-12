// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetBatchImportTaskResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetBatchImportTaskResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CE534E1D-FCE4-5930-B784-E055EC1AEE6F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetBatchImportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchImportTaskResponseBody self = new GetBatchImportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchImportTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchImportTaskResponseBody setData(GetBatchImportTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBatchImportTaskResponseBodyData getData() {
        return this.data;
    }

    public GetBatchImportTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchImportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo extends TeaModel {
        /**
         * <p>Indicates whether versioning is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        /**
         * <p>The key in the specified header parameter when the header versioning scheme is used.</p>
         * 
         * <strong>example:</strong>
         * <p>my-version</p>
         */
        @NameInMap("headerName")
        public String headerName;

        /**
         * <p>The key in the specified query parameter when the query versioning scheme is used.</p>
         * 
         * <strong>example:</strong>
         * <p>myVersion</p>
         */
        @NameInMap("queryName")
        public String queryName;

        /**
         * <p>The versioning scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>Query</p>
         */
        @NameInMap("scheme")
        public String scheme;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("version")
        public String version;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo setQueryName(String queryName) {
            this.queryName = queryName;
            return this;
        }
        public String getQueryName() {
            return this.queryName;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }
        public String getScheme() {
            return this.scheme;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo extends TeaModel {
        /**
         * <p>The base path of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1</p>
         */
        @NameInMap("basePath")
        public String basePath;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The ID of the HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("httpApiId")
        public String httpApiId;

        /**
         * <p>The name of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The API type.</p>
         * 
         * <strong>example:</strong>
         * <p>Rest</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The API versioning information.</p>
         */
        @NameInMap("versionInfo")
        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo versionInfo;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo setBasePath(String basePath) {
            this.basePath = basePath;
            return this;
        }
        public String getBasePath() {
            return this.basePath;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo setHttpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }
        public String getHttpApiId() {
            return this.httpApiId;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo setVersionInfo(GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo versionInfo) {
            this.versionInfo = versionInfo;
            return this;
        }
        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfoVersionInfo getVersionInfo() {
            return this.versionInfo;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents extends TeaModel {
        /**
         * <p>The reason why the dry run failed.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid schema</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The name of the data structure.</p>
         * 
         * <strong>example:</strong>
         * <p>Pet</p>
         */
        @NameInMap("name")
        public String name;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations extends TeaModel {
        /**
         * <p>The reason why the dry run failed.</p>
         * 
         * <strong>example:</strong>
         * <p>unsupported operation</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The HTTP method of the REST API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The path of the REST API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>/pets/{petId}</p>
         */
        @NameInMap("path")
        public String path;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes extends TeaModel {
        /**
         * <p>The reason why the dry run failed.</p>
         * 
         * <strong>example:</strong>
         * <p>domain not found</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>route-pets</p>
         */
        @NameInMap("name")
        public String name;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents extends TeaModel {
        /**
         * <p>The action type to be performed after the dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The name of the data structure.</p>
         * 
         * <strong>example:</strong>
         * <p>Pet</p>
         */
        @NameInMap("name")
        public String name;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations extends TeaModel {
        /**
         * <p>The action type to be performed after the dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The HTTP method of the REST API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The name of the REST API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>getPetById</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The path of the REST API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>/pets/{petId}</p>
         */
        @NameInMap("path")
        public String path;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes extends TeaModel {
        /**
         * <p>The action type to be performed after the dry run.</p>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The name of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>route-pets</p>
         */
        @NameInMap("name")
        public String name;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo extends TeaModel {
        /**
         * <p>The list of dry run error messages.</p>
         */
        @NameInMap("errorMessages")
        public java.util.List<String> errorMessages;

        /**
         * <p>The basic information about the existing HTTP API matched during import.</p>
         */
        @NameInMap("existHttpApiInfo")
        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo existHttpApiInfo;

        /**
         * <p>The list of data structures that failed the dry run.</p>
         */
        @NameInMap("failureComponents")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents> failureComponents;

        /**
         * <p>The list of REST API operations that failed the dry run.</p>
         */
        @NameInMap("failureOperations")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations> failureOperations;

        /**
         * <p>The list of routes that failed the dry run.</p>
         */
        @NameInMap("failureRoutes")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes> failureRoutes;

        /**
         * <p>The list of data structures that passed the dry run.</p>
         */
        @NameInMap("successComponents")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents> successComponents;

        /**
         * <p>The list of REST API operations that passed the dry run.</p>
         */
        @NameInMap("successOperations")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations> successOperations;

        /**
         * <p>The list of routes that passed the dry run.</p>
         */
        @NameInMap("successRoutes")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes> successRoutes;

        /**
         * <p>The list of dry run warning messages.</p>
         */
        @NameInMap("warningMessages")
        public java.util.List<String> warningMessages;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo self = new GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setErrorMessages(java.util.List<String> errorMessages) {
            this.errorMessages = errorMessages;
            return this;
        }
        public java.util.List<String> getErrorMessages() {
            return this.errorMessages;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setExistHttpApiInfo(GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo existHttpApiInfo) {
            this.existHttpApiInfo = existHttpApiInfo;
            return this;
        }
        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoExistHttpApiInfo getExistHttpApiInfo() {
            return this.existHttpApiInfo;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setFailureComponents(java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents> failureComponents) {
            this.failureComponents = failureComponents;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureComponents> getFailureComponents() {
            return this.failureComponents;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setFailureOperations(java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations> failureOperations) {
            this.failureOperations = failureOperations;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureOperations> getFailureOperations() {
            return this.failureOperations;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setFailureRoutes(java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes> failureRoutes) {
            this.failureRoutes = failureRoutes;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoFailureRoutes> getFailureRoutes() {
            return this.failureRoutes;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setSuccessComponents(java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents> successComponents) {
            this.successComponents = successComponents;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessComponents> getSuccessComponents() {
            return this.successComponents;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setSuccessOperations(java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations> successOperations) {
            this.successOperations = successOperations;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessOperations> getSuccessOperations() {
            return this.successOperations;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setSuccessRoutes(java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes> successRoutes) {
            this.successRoutes = successRoutes;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfoSuccessRoutes> getSuccessRoutes() {
            return this.successRoutes;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo setWarningMessages(java.util.List<String> warningMessages) {
            this.warningMessages = warningMessages;
            return this;
        }
        public java.util.List<String> getWarningMessages() {
            return this.warningMessages;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultDryRunResults extends TeaModel {
        /**
         * <p>The API name. The value unknown is returned if the name cannot be identified.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The dry run details, including the operations, routes, components, and error or warning messages planned for creation or update in this file.</p>
         */
        @NameInMap("dryRunInfo")
        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo dryRunInfo;

        /**
         * <p>The dry run error message.</p>
         * 
         * <strong>example:</strong>
         * <p>unsupported oas version</p>
         */
        @NameInMap("error")
        public String error;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore.yaml</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static GetBatchImportTaskResponseBodyDataResultDryRunResults build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultDryRunResults self = new GetBatchImportTaskResponseBodyDataResultDryRunResults();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResults setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResults setDryRunInfo(GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo dryRunInfo) {
            this.dryRunInfo = dryRunInfo;
            return this;
        }
        public GetBatchImportTaskResponseBodyDataResultDryRunResultsDryRunInfo getDryRunInfo() {
            return this.dryRunInfo;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResults setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetBatchImportTaskResponseBodyDataResultDryRunResults setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultFailureItems extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <p>The API name. The value unknown is returned if the name cannot be identified.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid oas format</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore.yaml</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static GetBatchImportTaskResponseBodyDataResultFailureItems build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultFailureItems self = new GetBatchImportTaskResponseBodyDataResultFailureItems();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultFailureItems setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetBatchImportTaskResponseBodyDataResultFailureItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetBatchImportTaskResponseBodyDataResultFailureItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchImportTaskResponseBodyDataResultFailureItems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>my-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The object key of the specification file in the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>imports/batch.zip</p>
         */
        @NameInMap("objectKey")
        public String objectKey;

        /**
         * <p>The region ID of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        public static GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig self = new GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultImportRequest extends TeaModel {
        /**
         * <p>Specifies whether to allow overwriting existing APIs.</p>
         */
        @NameInMap("allowUpdate")
        public Boolean allowUpdate;

        /**
         * <p>The API type.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        @NameInMap("apiType")
        public String apiType;

        /**
         * <p>Specifies whether the request is in dry run mode. This parameter is fixed to false in the formal import request body.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-xxx</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The download URL of the OAS ZIP file, which is consistent with the dry run request.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip">https://oss-cn-hangzhou.aliyuncs.com/my-bucket/imports/batch.zip</a></p>
         */
        @NameInMap("specFileUrl")
        public String specFileUrl;

        /**
         * <p>The OSS configuration of the OAS file, which is consistent with the dry run request.</p>
         */
        @NameInMap("specOssConfig")
        public GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig specOssConfig;

        /**
         * <p>The conflict merge strategy used during import.</p>
         * 
         * <strong>example:</strong>
         * <p>ExistFirst</p>
         */
        @NameInMap("strategy")
        public String strategy;

        /**
         * <p>Specifies whether to import with gateway extension configurations.</p>
         */
        @NameInMap("withGatewayExtension")
        public Boolean withGatewayExtension;

        public static GetBatchImportTaskResponseBodyDataResultImportRequest build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultImportRequest self = new GetBatchImportTaskResponseBodyDataResultImportRequest();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setAllowUpdate(Boolean allowUpdate) {
            this.allowUpdate = allowUpdate;
            return this;
        }
        public Boolean getAllowUpdate() {
            return this.allowUpdate;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setSpecFileUrl(String specFileUrl) {
            this.specFileUrl = specFileUrl;
            return this;
        }
        public String getSpecFileUrl() {
            return this.specFileUrl;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setSpecOssConfig(GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig specOssConfig) {
            this.specOssConfig = specOssConfig;
            return this;
        }
        public GetBatchImportTaskResponseBodyDataResultImportRequestSpecOssConfig getSpecOssConfig() {
            return this.specOssConfig;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public GetBatchImportTaskResponseBodyDataResultImportRequest setWithGatewayExtension(Boolean withGatewayExtension) {
            this.withGatewayExtension = withGatewayExtension;
            return this;
        }
        public Boolean getWithGatewayExtension() {
            return this.withGatewayExtension;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResultSuccessItems extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("apiId")
        public String apiId;

        /**
         * <p>The API name. The value unknown is returned if the name cannot be identified.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid oas format</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>petstore.yaml</p>
         */
        @NameInMap("fileName")
        public String fileName;

        public static GetBatchImportTaskResponseBodyDataResultSuccessItems build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResultSuccessItems self = new GetBatchImportTaskResponseBodyDataResultSuccessItems();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResultSuccessItems setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public GetBatchImportTaskResponseBodyDataResultSuccessItems setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetBatchImportTaskResponseBodyDataResultSuccessItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchImportTaskResponseBodyDataResultSuccessItems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

    }

    public static class GetBatchImportTaskResponseBodyDataResult extends TeaModel {
        /**
         * <p>The API type.</p>
         * 
         * <strong>example:</strong>
         * <p>Http</p>
         */
        @NameInMap("apiType")
        public String apiType;

        /**
         * <p>Indicates whether the task is in dry run mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("dryRun")
        public Boolean dryRun;

        /**
         * <p>The list of dry run results.</p>
         */
        @NameInMap("dryRunResults")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResults> dryRunResults;

        /**
         * <p>The list of APIs that failed to be processed.</p>
         */
        @NameInMap("failureItems")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultFailureItems> failureItems;

        /**
         * <p>The gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>The formal import request body. This field is returned only for dry run tasks and can be resubmitted as the request body of BatchImportHttpApis. The dryRun parameter is fixed to false. Temporary specFileUrl values are still subject to URL expiration constraints.</p>
         */
        @NameInMap("importRequest")
        public GetBatchImportTaskResponseBodyDataResultImportRequest importRequest;

        /**
         * <p>The list of successfully processed APIs.</p>
         */
        @NameInMap("successItems")
        public java.util.List<GetBatchImportTaskResponseBodyDataResultSuccessItems> successItems;

        public static GetBatchImportTaskResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyDataResult self = new GetBatchImportTaskResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyDataResult setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public GetBatchImportTaskResponseBodyDataResult setDryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }
        public Boolean getDryRun() {
            return this.dryRun;
        }

        public GetBatchImportTaskResponseBodyDataResult setDryRunResults(java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResults> dryRunResults) {
            this.dryRunResults = dryRunResults;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultDryRunResults> getDryRunResults() {
            return this.dryRunResults;
        }

        public GetBatchImportTaskResponseBodyDataResult setFailureItems(java.util.List<GetBatchImportTaskResponseBodyDataResultFailureItems> failureItems) {
            this.failureItems = failureItems;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultFailureItems> getFailureItems() {
            return this.failureItems;
        }

        public GetBatchImportTaskResponseBodyDataResult setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetBatchImportTaskResponseBodyDataResult setImportRequest(GetBatchImportTaskResponseBodyDataResultImportRequest importRequest) {
            this.importRequest = importRequest;
            return this;
        }
        public GetBatchImportTaskResponseBodyDataResultImportRequest getImportRequest() {
            return this.importRequest;
        }

        public GetBatchImportTaskResponseBodyDataResult setSuccessItems(java.util.List<GetBatchImportTaskResponseBodyDataResultSuccessItems> successItems) {
            this.successItems = successItems;
            return this;
        }
        public java.util.List<GetBatchImportTaskResponseBodyDataResultSuccessItems> getSuccessItems() {
            return this.successItems;
        }

    }

    public static class GetBatchImportTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created. The time is in UTC and follows the RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-15T10:00:00Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>some apis import failed</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The number of processed items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("processedCount")
        public Integer processedCount;

        /**
         * <p>The task result details.</p>
         */
        @NameInMap("result")
        public GetBatchImportTaskResponseBodyDataResult result;

        /**
         * <p>The task status. Valid values: Pending, Running, Success, PartialSuccess, and Failed.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>async-task-xxx</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>BatchImport</p>
         */
        @NameInMap("taskType")
        public String taskType;

        /**
         * <p>The total count.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalCount")
        public Integer totalCount;

        public static GetBatchImportTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchImportTaskResponseBodyData self = new GetBatchImportTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBatchImportTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetBatchImportTaskResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchImportTaskResponseBodyData setProcessedCount(Integer processedCount) {
            this.processedCount = processedCount;
            return this;
        }
        public Integer getProcessedCount() {
            return this.processedCount;
        }

        public GetBatchImportTaskResponseBodyData setResult(GetBatchImportTaskResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public GetBatchImportTaskResponseBodyDataResult getResult() {
            return this.result;
        }

        public GetBatchImportTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchImportTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetBatchImportTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public GetBatchImportTaskResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
