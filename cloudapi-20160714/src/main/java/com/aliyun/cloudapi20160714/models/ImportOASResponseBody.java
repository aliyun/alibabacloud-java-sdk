// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportOASResponseBody extends TeaModel {
    /**
     * <p>The error messages that appear due to the invalid data in the imported file.</p>
     */
    @NameInMap("ErrorMessages")
    public ImportOASResponseBodyErrorMessages errorMessages;

    /**
     * <p>The APIs that failed to pass the precheck.</p>
     */
    @NameInMap("FailedApis")
    public ImportOASResponseBodyFailedApis failedApis;

    /**
     * <p>The information about the models that failed to pass the precheck.</p>
     */
    @NameInMap("FailedModels")
    public ImportOASResponseBodyFailedModels failedModels;

    /**
     * <p>The ID of the asynchronous API import task that was generated during the import operation. This ID is used to query the execution status of the API import task.</p>
     * 
     * <strong>example:</strong>
     * <p>c16a1880f5164d779f6a54f64d997cd9</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E7FE7172-AA75-5880-B6F7-C00893E9BC06</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the APIs that have passed the precheck.</p>
     */
    @NameInMap("SuccessApis")
    public ImportOASResponseBodySuccessApis successApis;

    /**
     * <p>The information about the models that have passed the precheck.</p>
     */
    @NameInMap("SuccessModels")
    public ImportOASResponseBodySuccessModels successModels;

    /**
     * <p>The warning messages that appear due to the invalid data in the imported file.</p>
     */
    @NameInMap("WarningMessages")
    public ImportOASResponseBodyWarningMessages warningMessages;

    public static ImportOASResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportOASResponseBody self = new ImportOASResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportOASResponseBody setErrorMessages(ImportOASResponseBodyErrorMessages errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }
    public ImportOASResponseBodyErrorMessages getErrorMessages() {
        return this.errorMessages;
    }

    public ImportOASResponseBody setFailedApis(ImportOASResponseBodyFailedApis failedApis) {
        this.failedApis = failedApis;
        return this;
    }
    public ImportOASResponseBodyFailedApis getFailedApis() {
        return this.failedApis;
    }

    public ImportOASResponseBody setFailedModels(ImportOASResponseBodyFailedModels failedModels) {
        this.failedModels = failedModels;
        return this;
    }
    public ImportOASResponseBodyFailedModels getFailedModels() {
        return this.failedModels;
    }

    public ImportOASResponseBody setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public ImportOASResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportOASResponseBody setSuccessApis(ImportOASResponseBodySuccessApis successApis) {
        this.successApis = successApis;
        return this;
    }
    public ImportOASResponseBodySuccessApis getSuccessApis() {
        return this.successApis;
    }

    public ImportOASResponseBody setSuccessModels(ImportOASResponseBodySuccessModels successModels) {
        this.successModels = successModels;
        return this;
    }
    public ImportOASResponseBodySuccessModels getSuccessModels() {
        return this.successModels;
    }

    public ImportOASResponseBody setWarningMessages(ImportOASResponseBodyWarningMessages warningMessages) {
        this.warningMessages = warningMessages;
        return this;
    }
    public ImportOASResponseBodyWarningMessages getWarningMessages() {
        return this.warningMessages;
    }

    public static class ImportOASResponseBodyErrorMessages extends TeaModel {
        @NameInMap("ErrorMessage")
        public java.util.List<String> errorMessage;

        public static ImportOASResponseBodyErrorMessages build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodyErrorMessages self = new ImportOASResponseBodyErrorMessages();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodyErrorMessages setErrorMessage(java.util.List<String> errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public java.util.List<String> getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class ImportOASResponseBodyFailedApisFailedApi extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid Api Definition.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The HTTP method configured when you created the API.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The request path configured when you created the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/st1</p>
         */
        @NameInMap("Path")
        public String path;

        public static ImportOASResponseBodyFailedApisFailedApi build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodyFailedApisFailedApi self = new ImportOASResponseBodyFailedApisFailedApi();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodyFailedApisFailedApi setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ImportOASResponseBodyFailedApisFailedApi setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public ImportOASResponseBodyFailedApisFailedApi setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ImportOASResponseBodyFailedApis extends TeaModel {
        @NameInMap("FailedApi")
        public java.util.List<ImportOASResponseBodyFailedApisFailedApi> failedApi;

        public static ImportOASResponseBodyFailedApis build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodyFailedApis self = new ImportOASResponseBodyFailedApis();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodyFailedApis setFailedApi(java.util.List<ImportOASResponseBodyFailedApisFailedApi> failedApi) {
            this.failedApi = failedApi;
            return this;
        }
        public java.util.List<ImportOASResponseBodyFailedApisFailedApi> getFailedApi() {
            return this.failedApi;
        }

    }

    public static class ImportOASResponseBodyFailedModelsFailedModel extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid Model Definition.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>2c1bc62e19614cc68c6b0b484bc9c5db</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        public static ImportOASResponseBodyFailedModelsFailedModel build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodyFailedModelsFailedModel self = new ImportOASResponseBodyFailedModelsFailedModel();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodyFailedModelsFailedModel setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ImportOASResponseBodyFailedModelsFailedModel setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ImportOASResponseBodyFailedModelsFailedModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class ImportOASResponseBodyFailedModels extends TeaModel {
        @NameInMap("FailedModel")
        public java.util.List<ImportOASResponseBodyFailedModelsFailedModel> failedModel;

        public static ImportOASResponseBodyFailedModels build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodyFailedModels self = new ImportOASResponseBodyFailedModels();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodyFailedModels setFailedModel(java.util.List<ImportOASResponseBodyFailedModelsFailedModel> failedModel) {
            this.failedModel = failedModel;
            return this;
        }
        public java.util.List<ImportOASResponseBodyFailedModelsFailedModel> getFailedModel() {
            return this.failedModel;
        }

    }

    public static class ImportOASResponseBodySuccessApisSuccessApi extends TeaModel {
        /**
         * <p>The ID of the API.</p>
         * 
         * <strong>example:</strong>
         * <p>92af1abffc2443eaa2b815fdbd9c13f1</p>
         */
        @NameInMap("ApiId")
        public String apiId;

        /**
         * <p>Indicates that the operation is CREATE or MODIFY.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ApiOperation")
        public String apiOperation;

        /**
         * <p>The HTTP method configured when you created the API.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The request path configured when you created the API.</p>
         * 
         * <strong>example:</strong>
         * <p>/st1</p>
         */
        @NameInMap("Path")
        public String path;

        public static ImportOASResponseBodySuccessApisSuccessApi build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodySuccessApisSuccessApi self = new ImportOASResponseBodySuccessApisSuccessApi();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodySuccessApisSuccessApi setApiId(String apiId) {
            this.apiId = apiId;
            return this;
        }
        public String getApiId() {
            return this.apiId;
        }

        public ImportOASResponseBodySuccessApisSuccessApi setApiOperation(String apiOperation) {
            this.apiOperation = apiOperation;
            return this;
        }
        public String getApiOperation() {
            return this.apiOperation;
        }

        public ImportOASResponseBodySuccessApisSuccessApi setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public ImportOASResponseBodySuccessApisSuccessApi setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ImportOASResponseBodySuccessApis extends TeaModel {
        @NameInMap("SuccessApi")
        public java.util.List<ImportOASResponseBodySuccessApisSuccessApi> successApi;

        public static ImportOASResponseBodySuccessApis build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodySuccessApis self = new ImportOASResponseBodySuccessApis();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodySuccessApis setSuccessApi(java.util.List<ImportOASResponseBodySuccessApisSuccessApi> successApi) {
            this.successApi = successApi;
            return this;
        }
        public java.util.List<ImportOASResponseBodySuccessApisSuccessApi> getSuccessApi() {
            return this.successApi;
        }

    }

    public static class ImportOASResponseBodySuccessModelsSuccessModel extends TeaModel {
        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>feaccf67040643bcbdedb253e59eb527</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The operation of the model. Valid values: CREATE and MODIFY.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ModelOperation")
        public String modelOperation;

        /**
         * <p>The UID of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1r4efwee19614cc68c6b0b484bc9c5dbs</p>
         */
        @NameInMap("ModelUid")
        public String modelUid;

        public static ImportOASResponseBodySuccessModelsSuccessModel build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodySuccessModelsSuccessModel self = new ImportOASResponseBodySuccessModelsSuccessModel();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodySuccessModelsSuccessModel setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ImportOASResponseBodySuccessModelsSuccessModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ImportOASResponseBodySuccessModelsSuccessModel setModelOperation(String modelOperation) {
            this.modelOperation = modelOperation;
            return this;
        }
        public String getModelOperation() {
            return this.modelOperation;
        }

        public ImportOASResponseBodySuccessModelsSuccessModel setModelUid(String modelUid) {
            this.modelUid = modelUid;
            return this;
        }
        public String getModelUid() {
            return this.modelUid;
        }

    }

    public static class ImportOASResponseBodySuccessModels extends TeaModel {
        @NameInMap("SuccessModel")
        public java.util.List<ImportOASResponseBodySuccessModelsSuccessModel> successModel;

        public static ImportOASResponseBodySuccessModels build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodySuccessModels self = new ImportOASResponseBodySuccessModels();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodySuccessModels setSuccessModel(java.util.List<ImportOASResponseBodySuccessModelsSuccessModel> successModel) {
            this.successModel = successModel;
            return this;
        }
        public java.util.List<ImportOASResponseBodySuccessModelsSuccessModel> getSuccessModel() {
            return this.successModel;
        }

    }

    public static class ImportOASResponseBodyWarningMessages extends TeaModel {
        @NameInMap("WarningMessage")
        public java.util.List<String> warningMessage;

        public static ImportOASResponseBodyWarningMessages build(java.util.Map<String, ?> map) throws Exception {
            ImportOASResponseBodyWarningMessages self = new ImportOASResponseBodyWarningMessages();
            return TeaModel.build(map, self);
        }

        public ImportOASResponseBodyWarningMessages setWarningMessage(java.util.List<String> warningMessage) {
            this.warningMessage = warningMessage;
            return this;
        }
        public java.util.List<String> getWarningMessage() {
            return this.warningMessage;
        }

    }

}
