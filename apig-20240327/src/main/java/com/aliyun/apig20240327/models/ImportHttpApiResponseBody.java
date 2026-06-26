// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ImportHttpApiResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The API information.</p>
     */
    @NameInMap("data")
    public ImportHttpApiResponseBodyData data;

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
     * <p>CE857A85-251D-5018-8103-A38957D71E20</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ImportHttpApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportHttpApiResponseBody self = new ImportHttpApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportHttpApiResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportHttpApiResponseBody setData(ImportHttpApiResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportHttpApiResponseBodyData getData() {
        return this.data;
    }

    public ImportHttpApiResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportHttpApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImportHttpApiResponseBodyDataDryRunInfoFailureComponents extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>数据结构定义有误。</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The data structure name.</p>
         * 
         * <strong>example:</strong>
         * <p>orderDTO</p>
         */
        @NameInMap("name")
        public String name;

        public static ImportHttpApiResponseBodyDataDryRunInfoFailureComponents build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyDataDryRunInfoFailureComponents self = new ImportHttpApiResponseBodyDataDryRunInfoFailureComponents();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyDataDryRunInfoFailureComponents setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoFailureComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ImportHttpApiResponseBodyDataDryRunInfoFailureOperations extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>缺少响应定义。</p>
         */
        @NameInMap("errorMessage")
        public String errorMessage;

        /**
         * <p>The operation method.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The operation path.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/orders</p>
         */
        @NameInMap("path")
        public String path;

        public static ImportHttpApiResponseBodyDataDryRunInfoFailureOperations build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyDataDryRunInfoFailureOperations self = new ImportHttpApiResponseBodyDataDryRunInfoFailureOperations();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyDataDryRunInfoFailureOperations setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoFailureOperations setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoFailureOperations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes extends TeaModel {
        @NameInMap("errorMessage")
        public String errorMessage;

        @NameInMap("name")
        public String name;

        public static ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes self = new ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents extends TeaModel {
        /**
         * <p>The action to be performed after the dry run. Valid values:</p>
         * <ul>
         * <li>Create: Create.</li>
         * <li>Update: Update.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The data structure name.</p>
         * 
         * <strong>example:</strong>
         * <p>userDTO</p>
         */
        @NameInMap("name")
        public String name;

        public static ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents self = new ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations extends TeaModel {
        /**
         * <p>The action to be performed after the dry run. Valid values:</p>
         * <ul>
         * <li>Create: Create.</li>
         * <li>Update: Update.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The operation method.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("method")
        public String method;

        /**
         * <p>The operation name.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateUser</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The operation path.</p>
         * 
         * <strong>example:</strong>
         * <p>/v1/users</p>
         */
        @NameInMap("path")
        public String path;

        public static ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations self = new ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes extends TeaModel {
        @NameInMap("action")
        public String action;

        @NameInMap("name")
        public String name;

        public static ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes self = new ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ImportHttpApiResponseBodyDataDryRunInfo extends TeaModel {
        /**
         * <p>The error messages. If error messages are not empty, the API cannot be imported.</p>
         */
        @NameInMap("errorMessages")
        public java.util.List<String> errorMessages;

        /**
         * <p>The information about the existing API. If this field is not empty, the import updates this API.</p>
         */
        @NameInMap("existHttpApiInfo")
        public HttpApiApiInfo existHttpApiInfo;

        /**
         * <p>The list of data structures that failed the dry run.</p>
         */
        @NameInMap("failureComponents")
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureComponents> failureComponents;

        /**
         * <p>The list of operations that failed the dry run.</p>
         */
        @NameInMap("failureOperations")
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureOperations> failureOperations;

        @NameInMap("failureRoutes")
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes> failureRoutes;

        @NameInMap("mcpToolsDefinition")
        public String mcpToolsDefinition;

        /**
         * <p>The list of data structures that passed the dry run.</p>
         */
        @NameInMap("successComponents")
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents> successComponents;

        /**
         * <p>The list of operations that passed the dry run.</p>
         */
        @NameInMap("successOperations")
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations> successOperations;

        @NameInMap("successRoutes")
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes> successRoutes;

        /**
         * <p>The warning messages. If warning messages are not empty, some operations or data structures may not be imported.</p>
         */
        @NameInMap("warningMessages")
        public java.util.List<String> warningMessages;

        public static ImportHttpApiResponseBodyDataDryRunInfo build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyDataDryRunInfo self = new ImportHttpApiResponseBodyDataDryRunInfo();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setErrorMessages(java.util.List<String> errorMessages) {
            this.errorMessages = errorMessages;
            return this;
        }
        public java.util.List<String> getErrorMessages() {
            return this.errorMessages;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setExistHttpApiInfo(HttpApiApiInfo existHttpApiInfo) {
            this.existHttpApiInfo = existHttpApiInfo;
            return this;
        }
        public HttpApiApiInfo getExistHttpApiInfo() {
            return this.existHttpApiInfo;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setFailureComponents(java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureComponents> failureComponents) {
            this.failureComponents = failureComponents;
            return this;
        }
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureComponents> getFailureComponents() {
            return this.failureComponents;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setFailureOperations(java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureOperations> failureOperations) {
            this.failureOperations = failureOperations;
            return this;
        }
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureOperations> getFailureOperations() {
            return this.failureOperations;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setFailureRoutes(java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes> failureRoutes) {
            this.failureRoutes = failureRoutes;
            return this;
        }
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoFailureRoutes> getFailureRoutes() {
            return this.failureRoutes;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setMcpToolsDefinition(String mcpToolsDefinition) {
            this.mcpToolsDefinition = mcpToolsDefinition;
            return this;
        }
        public String getMcpToolsDefinition() {
            return this.mcpToolsDefinition;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setSuccessComponents(java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents> successComponents) {
            this.successComponents = successComponents;
            return this;
        }
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessComponents> getSuccessComponents() {
            return this.successComponents;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setSuccessOperations(java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations> successOperations) {
            this.successOperations = successOperations;
            return this;
        }
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessOperations> getSuccessOperations() {
            return this.successOperations;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setSuccessRoutes(java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes> successRoutes) {
            this.successRoutes = successRoutes;
            return this;
        }
        public java.util.List<ImportHttpApiResponseBodyDataDryRunInfoSuccessRoutes> getSuccessRoutes() {
            return this.successRoutes;
        }

        public ImportHttpApiResponseBodyDataDryRunInfo setWarningMessages(java.util.List<String> warningMessages) {
            this.warningMessages = warningMessages;
            return this;
        }
        public java.util.List<String> getWarningMessages() {
            return this.warningMessages;
        }

    }

    public static class ImportHttpApiResponseBodyData extends TeaModel {
        /**
         * <p>The dry run result.</p>
         */
        @NameInMap("dryRunInfo")
        public ImportHttpApiResponseBodyDataDryRunInfo dryRunInfo;

        /**
         * <p>The unique ID of the HTTP API.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxx</p>
         */
        @NameInMap("httpApiId")
        public String httpApiId;

        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>import-test</p>
         */
        @NameInMap("name")
        public String name;

        public static ImportHttpApiResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportHttpApiResponseBodyData self = new ImportHttpApiResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportHttpApiResponseBodyData setDryRunInfo(ImportHttpApiResponseBodyDataDryRunInfo dryRunInfo) {
            this.dryRunInfo = dryRunInfo;
            return this;
        }
        public ImportHttpApiResponseBodyDataDryRunInfo getDryRunInfo() {
            return this.dryRunInfo;
        }

        public ImportHttpApiResponseBodyData setHttpApiId(String httpApiId) {
            this.httpApiId = httpApiId;
            return this;
        }
        public String getHttpApiId() {
            return this.httpApiId;
        }

        public ImportHttpApiResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
