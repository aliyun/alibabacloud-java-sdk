// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ImportSwaggerResponseBody extends TeaModel {
    /**
     * <p>The APIs that failed to be created based on the Swagger-compliant data imported this time.</p>
     */
    @NameInMap("Failed")
    public ImportSwaggerResponseBodyFailed failed;

    /**
     * <p>The models that failed to be imported through the Swagger-compliant data this time.</p>
     */
    @NameInMap("ModelFailed")
    public ImportSwaggerResponseBodyModelFailed modelFailed;

    /**
     * <p>The models that were imported through the Swagger-compliant data this time.</p>
     */
    @NameInMap("ModelSuccess")
    public ImportSwaggerResponseBodyModelSuccess modelSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>647CEF05-404C-4125-B3D7-44792EB77392</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The APIs that are created based on the Swagger-compliant data imported this time.</p>
     */
    @NameInMap("Success")
    public ImportSwaggerResponseBodySuccess success;

    public static ImportSwaggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportSwaggerResponseBody self = new ImportSwaggerResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportSwaggerResponseBody setFailed(ImportSwaggerResponseBodyFailed failed) {
        this.failed = failed;
        return this;
    }
    public ImportSwaggerResponseBodyFailed getFailed() {
        return this.failed;
    }

    public ImportSwaggerResponseBody setModelFailed(ImportSwaggerResponseBodyModelFailed modelFailed) {
        this.modelFailed = modelFailed;
        return this;
    }
    public ImportSwaggerResponseBodyModelFailed getModelFailed() {
        return this.modelFailed;
    }

    public ImportSwaggerResponseBody setModelSuccess(ImportSwaggerResponseBodyModelSuccess modelSuccess) {
        this.modelSuccess = modelSuccess;
        return this;
    }
    public ImportSwaggerResponseBodyModelSuccess getModelSuccess() {
        return this.modelSuccess;
    }

    public ImportSwaggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportSwaggerResponseBody setSuccess(ImportSwaggerResponseBodySuccess success) {
        this.success = success;
        return this;
    }
    public ImportSwaggerResponseBodySuccess getSuccess() {
        return this.success;
    }

    public static class ImportSwaggerResponseBodyFailedApiImportSwaggerFailed extends TeaModel {
        /**
         * <p>The error message returned when the API is created.</p>
         * 
         * <strong>example:</strong>
         * <p>api already exists : apiUid ===&gt; 8e274ec61cf6468e83b68371956831cb</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The HTTP method configured when the API is created.</p>
         * 
         * <strong>example:</strong>
         * <p>post</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The request path configured when the API is created.</p>
         * 
         * <strong>example:</strong>
         * <p>/http/get/mapping</p>
         */
        @NameInMap("Path")
        public String path;

        public static ImportSwaggerResponseBodyFailedApiImportSwaggerFailed build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodyFailedApiImportSwaggerFailed self = new ImportSwaggerResponseBodyFailedApiImportSwaggerFailed();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodyFailedApiImportSwaggerFailed setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ImportSwaggerResponseBodyFailedApiImportSwaggerFailed setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public ImportSwaggerResponseBodyFailedApiImportSwaggerFailed setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ImportSwaggerResponseBodyFailed extends TeaModel {
        @NameInMap("ApiImportSwaggerFailed")
        public java.util.List<ImportSwaggerResponseBodyFailedApiImportSwaggerFailed> apiImportSwaggerFailed;

        public static ImportSwaggerResponseBodyFailed build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodyFailed self = new ImportSwaggerResponseBodyFailed();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodyFailed setApiImportSwaggerFailed(java.util.List<ImportSwaggerResponseBodyFailedApiImportSwaggerFailed> apiImportSwaggerFailed) {
            this.apiImportSwaggerFailed = apiImportSwaggerFailed;
            return this;
        }
        public java.util.List<ImportSwaggerResponseBodyFailedApiImportSwaggerFailed> getApiImportSwaggerFailed() {
            return this.apiImportSwaggerFailed;
        }

    }

    public static class ImportSwaggerResponseBodyModelFailedApiImportModelFailed extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>error msg</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>36d4bcfaec1946e1870d90b2d7519710</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>Region</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        public static ImportSwaggerResponseBodyModelFailedApiImportModelFailed build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodyModelFailedApiImportModelFailed self = new ImportSwaggerResponseBodyModelFailedApiImportModelFailed();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodyModelFailedApiImportModelFailed setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ImportSwaggerResponseBodyModelFailedApiImportModelFailed setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ImportSwaggerResponseBodyModelFailedApiImportModelFailed setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class ImportSwaggerResponseBodyModelFailed extends TeaModel {
        @NameInMap("ApiImportModelFailed")
        public java.util.List<ImportSwaggerResponseBodyModelFailedApiImportModelFailed> apiImportModelFailed;

        public static ImportSwaggerResponseBodyModelFailed build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodyModelFailed self = new ImportSwaggerResponseBodyModelFailed();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodyModelFailed setApiImportModelFailed(java.util.List<ImportSwaggerResponseBodyModelFailedApiImportModelFailed> apiImportModelFailed) {
            this.apiImportModelFailed = apiImportModelFailed;
            return this;
        }
        public java.util.List<ImportSwaggerResponseBodyModelFailedApiImportModelFailed> getApiImportModelFailed() {
            return this.apiImportModelFailed;
        }

    }

    public static class ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess extends TeaModel {
        /**
         * <p>The ID of the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>b2d552ed90ca435b86f7bf8d45414793</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>NewInstance</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The model operation</p>
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
         * <p>d4bcfaec1946e1870d</p>
         */
        @NameInMap("ModelUid")
        public String modelUid;

        public static ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess self = new ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelOperation(String modelOperation) {
            this.modelOperation = modelOperation;
            return this;
        }
        public String getModelOperation() {
            return this.modelOperation;
        }

        public ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelUid(String modelUid) {
            this.modelUid = modelUid;
            return this;
        }
        public String getModelUid() {
            return this.modelUid;
        }

    }

    public static class ImportSwaggerResponseBodyModelSuccess extends TeaModel {
        @NameInMap("ApiImportModelSuccess")
        public java.util.List<ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess> apiImportModelSuccess;

        public static ImportSwaggerResponseBodyModelSuccess build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodyModelSuccess self = new ImportSwaggerResponseBodyModelSuccess();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodyModelSuccess setApiImportModelSuccess(java.util.List<ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess> apiImportModelSuccess) {
            this.apiImportModelSuccess = apiImportModelSuccess;
            return this;
        }
        public java.util.List<ImportSwaggerResponseBodyModelSuccessApiImportModelSuccess> getApiImportModelSuccess() {
            return this.apiImportModelSuccess;
        }

    }

    public static class ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess extends TeaModel {
        /**
         * <p>Specifies whether the operation is CREATE or MODIFY.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ApiOperation")
        public String apiOperation;

        /**
         * <p>The UID of the successfully imported API.</p>
         * 
         * <strong>example:</strong>
         * <p>8e274ec61cf6468e83b68371956831cb</p>
         */
        @NameInMap("ApiUid")
        public String apiUid;

        /**
         * <p>The HTTP method configured when the API is created.</p>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        @NameInMap("HttpMethod")
        public String httpMethod;

        /**
         * <p>The request path configured when the API is created.</p>
         * 
         * <strong>example:</strong>
         * <p>/http/get/mapping</p>
         */
        @NameInMap("Path")
        public String path;

        public static ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess self = new ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess setApiOperation(String apiOperation) {
            this.apiOperation = apiOperation;
            return this;
        }
        public String getApiOperation() {
            return this.apiOperation;
        }

        public ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class ImportSwaggerResponseBodySuccess extends TeaModel {
        @NameInMap("ApiImportSwaggerSuccess")
        public java.util.List<ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess> apiImportSwaggerSuccess;

        public static ImportSwaggerResponseBodySuccess build(java.util.Map<String, ?> map) throws Exception {
            ImportSwaggerResponseBodySuccess self = new ImportSwaggerResponseBodySuccess();
            return TeaModel.build(map, self);
        }

        public ImportSwaggerResponseBodySuccess setApiImportSwaggerSuccess(java.util.List<ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess> apiImportSwaggerSuccess) {
            this.apiImportSwaggerSuccess = apiImportSwaggerSuccess;
            return this;
        }
        public java.util.List<ImportSwaggerResponseBodySuccessApiImportSwaggerSuccess> getApiImportSwaggerSuccess() {
            return this.apiImportSwaggerSuccess;
        }

    }

}
