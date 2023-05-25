// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportOASResponseBody extends TeaModel {
    @NameInMap("ErrorMessages")
    public ImportOASResponseBodyErrorMessages errorMessages;

    @NameInMap("FailedApis")
    public ImportOASResponseBodyFailedApis failedApis;

    @NameInMap("FailedModels")
    public ImportOASResponseBodyFailedModels failedModels;

    @NameInMap("OperationId")
    public String operationId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuccessApis")
    public ImportOASResponseBodySuccessApis successApis;

    @NameInMap("SuccessModels")
    public ImportOASResponseBodySuccessModels successModels;

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
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("HttpMethod")
        public String httpMethod;

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
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("GroupId")
        public String groupId;

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
        @NameInMap("ApiId")
        public String apiId;

        @NameInMap("ApiOperation")
        public String apiOperation;

        @NameInMap("HttpMethod")
        public String httpMethod;

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
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("ModelOperation")
        public String modelOperation;

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
