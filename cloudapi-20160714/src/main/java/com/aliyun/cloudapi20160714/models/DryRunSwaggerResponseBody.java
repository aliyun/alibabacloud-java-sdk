// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DryRunSwaggerResponseBody extends TeaModel {
    /**
     * <p>The APIs that failed to be created based on the Swagger-compliant data imported this time.</p>
     */
    @NameInMap("Failed")
    public DryRunSwaggerResponseBodyFailed failed;

    /**
     * <p>The global condition.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("GlobalCondition")
    public String globalCondition;

    /**
     * <p>The models that failed to be imported through the Swagger-compliant data this time.</p>
     */
    @NameInMap("ModelFailed")
    public DryRunSwaggerResponseBodyModelFailed modelFailed;

    /**
     * <p>The models that failed to be imported through the Swagger-compliant data this time.</p>
     */
    @NameInMap("ModelSuccess")
    public DryRunSwaggerResponseBodyModelSuccess modelSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EF924FE4-2EDD-4CD3-89EC-34E4708574E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The APIs that are created based on the Swagger-compliant data imported this time.</p>
     */
    @NameInMap("Success")
    public DryRunSwaggerResponseBodySuccess success;

    public static DryRunSwaggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DryRunSwaggerResponseBody self = new DryRunSwaggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DryRunSwaggerResponseBody setFailed(DryRunSwaggerResponseBodyFailed failed) {
        this.failed = failed;
        return this;
    }
    public DryRunSwaggerResponseBodyFailed getFailed() {
        return this.failed;
    }

    public DryRunSwaggerResponseBody setGlobalCondition(String globalCondition) {
        this.globalCondition = globalCondition;
        return this;
    }
    public String getGlobalCondition() {
        return this.globalCondition;
    }

    public DryRunSwaggerResponseBody setModelFailed(DryRunSwaggerResponseBodyModelFailed modelFailed) {
        this.modelFailed = modelFailed;
        return this;
    }
    public DryRunSwaggerResponseBodyModelFailed getModelFailed() {
        return this.modelFailed;
    }

    public DryRunSwaggerResponseBody setModelSuccess(DryRunSwaggerResponseBodyModelSuccess modelSuccess) {
        this.modelSuccess = modelSuccess;
        return this;
    }
    public DryRunSwaggerResponseBodyModelSuccess getModelSuccess() {
        return this.modelSuccess;
    }

    public DryRunSwaggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DryRunSwaggerResponseBody setSuccess(DryRunSwaggerResponseBodySuccess success) {
        this.success = success;
        return this;
    }
    public DryRunSwaggerResponseBodySuccess getSuccess() {
        return this.success;
    }

    public static class DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed extends TeaModel {
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

        public static DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed self = new DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DryRunSwaggerResponseBodyFailed extends TeaModel {
        @NameInMap("ApiImportSwaggerFailed")
        public java.util.List<DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed> apiImportSwaggerFailed;

        public static DryRunSwaggerResponseBodyFailed build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyFailed self = new DryRunSwaggerResponseBodyFailed();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyFailed setApiImportSwaggerFailed(java.util.List<DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed> apiImportSwaggerFailed) {
            this.apiImportSwaggerFailed = apiImportSwaggerFailed;
            return this;
        }
        public java.util.List<DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed> getApiImportSwaggerFailed() {
            return this.apiImportSwaggerFailed;
        }

    }

    public static class DryRunSwaggerResponseBodyModelFailedApiImportModelFailed extends TeaModel {
        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Not Found</p>
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

        public static DryRunSwaggerResponseBodyModelFailedApiImportModelFailed build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyModelFailedApiImportModelFailed self = new DryRunSwaggerResponseBodyModelFailedApiImportModelFailed();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyModelFailedApiImportModelFailed setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DryRunSwaggerResponseBodyModelFailedApiImportModelFailed setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DryRunSwaggerResponseBodyModelFailedApiImportModelFailed setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class DryRunSwaggerResponseBodyModelFailed extends TeaModel {
        @NameInMap("ApiImportModelFailed")
        public java.util.List<DryRunSwaggerResponseBodyModelFailedApiImportModelFailed> apiImportModelFailed;

        public static DryRunSwaggerResponseBodyModelFailed build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyModelFailed self = new DryRunSwaggerResponseBodyModelFailed();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyModelFailed setApiImportModelFailed(java.util.List<DryRunSwaggerResponseBodyModelFailedApiImportModelFailed> apiImportModelFailed) {
            this.apiImportModelFailed = apiImportModelFailed;
            return this;
        }
        public java.util.List<DryRunSwaggerResponseBodyModelFailedApiImportModelFailed> getApiImportModelFailed() {
            return this.apiImportModelFailed;
        }

    }

    public static class DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess extends TeaModel {
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
         * <p>The model operation.</p>
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
         * <p>ec1946e1870d90b2d7519</p>
         */
        @NameInMap("ModelUid")
        public String modelUid;

        public static DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess self = new DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelOperation(String modelOperation) {
            this.modelOperation = modelOperation;
            return this;
        }
        public String getModelOperation() {
            return this.modelOperation;
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelUid(String modelUid) {
            this.modelUid = modelUid;
            return this;
        }
        public String getModelUid() {
            return this.modelUid;
        }

    }

    public static class DryRunSwaggerResponseBodyModelSuccess extends TeaModel {
        @NameInMap("ApiImportModelSuccess")
        public java.util.List<DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess> apiImportModelSuccess;

        public static DryRunSwaggerResponseBodyModelSuccess build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyModelSuccess self = new DryRunSwaggerResponseBodyModelSuccess();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyModelSuccess setApiImportModelSuccess(java.util.List<DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess> apiImportModelSuccess) {
            this.apiImportModelSuccess = apiImportModelSuccess;
            return this;
        }
        public java.util.List<DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess> getApiImportModelSuccess() {
            return this.apiImportModelSuccess;
        }

    }

    public static class DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess extends TeaModel {
        /**
         * <p>Specifies whether the operation is CREATE or MODIFY.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE</p>
         */
        @NameInMap("ApiOperation")
        public String apiOperation;

        /**
         * <p>The API definition that complies with the Swagger specification.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;A Swagger API definition in YAML&quot;</p>
         */
        @NameInMap("ApiSwagger")
        public String apiSwagger;

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

        public static DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess self = new DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setApiOperation(String apiOperation) {
            this.apiOperation = apiOperation;
            return this;
        }
        public String getApiOperation() {
            return this.apiOperation;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setApiSwagger(String apiSwagger) {
            this.apiSwagger = apiSwagger;
            return this;
        }
        public String getApiSwagger() {
            return this.apiSwagger;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

    public static class DryRunSwaggerResponseBodySuccess extends TeaModel {
        @NameInMap("ApiDryRunSwaggerSuccess")
        public java.util.List<DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess;

        public static DryRunSwaggerResponseBodySuccess build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodySuccess self = new DryRunSwaggerResponseBodySuccess();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodySuccess setApiDryRunSwaggerSuccess(java.util.List<DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess> apiDryRunSwaggerSuccess) {
            this.apiDryRunSwaggerSuccess = apiDryRunSwaggerSuccess;
            return this;
        }
        public java.util.List<DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess> getApiDryRunSwaggerSuccess() {
            return this.apiDryRunSwaggerSuccess;
        }

    }

}
