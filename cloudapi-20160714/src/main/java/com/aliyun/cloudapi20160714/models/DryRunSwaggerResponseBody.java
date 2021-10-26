// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DryRunSwaggerResponseBody extends TeaModel {
    @NameInMap("GlobalCondition")
    public String globalCondition;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public DryRunSwaggerResponseBodySuccess success;

    @NameInMap("Failed")
    public DryRunSwaggerResponseBodyFailed failed;

    @NameInMap("ModelFailed")
    public DryRunSwaggerResponseBodyModelFailed modelFailed;

    @NameInMap("ModelSuccess")
    public DryRunSwaggerResponseBodyModelSuccess modelSuccess;

    public static DryRunSwaggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DryRunSwaggerResponseBody self = new DryRunSwaggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DryRunSwaggerResponseBody setGlobalCondition(String globalCondition) {
        this.globalCondition = globalCondition;
        return this;
    }
    public String getGlobalCondition() {
        return this.globalCondition;
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

    public DryRunSwaggerResponseBody setFailed(DryRunSwaggerResponseBodyFailed failed) {
        this.failed = failed;
        return this;
    }
    public DryRunSwaggerResponseBodyFailed getFailed() {
        return this.failed;
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

    public static class DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("ApiSwagger")
        public String apiSwagger;

        @NameInMap("ApiOperation")
        public String apiOperation;

        @NameInMap("ApiUid")
        public String apiUid;

        public static DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess self = new DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setApiSwagger(String apiSwagger) {
            this.apiSwagger = apiSwagger;
            return this;
        }
        public String getApiSwagger() {
            return this.apiSwagger;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setApiOperation(String apiOperation) {
            this.apiOperation = apiOperation;
            return this;
        }
        public String getApiOperation() {
            return this.apiOperation;
        }

        public DryRunSwaggerResponseBodySuccessApiDryRunSwaggerSuccess setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
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

    public static class DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed extends TeaModel {
        @NameInMap("Path")
        public String path;

        @NameInMap("HttpMethod")
        public String httpMethod;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        public static DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed self = new DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed setHttpMethod(String httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public String getHttpMethod() {
            return this.httpMethod;
        }

        public DryRunSwaggerResponseBodyFailedApiImportSwaggerFailed setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
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
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("GroupId")
        public String groupId;

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

        public DryRunSwaggerResponseBodyModelFailedApiImportModelFailed setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DryRunSwaggerResponseBodyModelFailedApiImportModelFailed setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
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
        @NameInMap("ModelUid")
        public String modelUid;

        @NameInMap("ModelName")
        public String modelName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ModelOperation")
        public String modelOperation;

        public static DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess build(java.util.Map<String, ?> map) throws Exception {
            DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess self = new DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess();
            return TeaModel.build(map, self);
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelUid(String modelUid) {
            this.modelUid = modelUid;
            return this;
        }
        public String getModelUid() {
            return this.modelUid;
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DryRunSwaggerResponseBodyModelSuccessApiImportModelSuccess setModelOperation(String modelOperation) {
            this.modelOperation = modelOperation;
            return this;
        }
        public String getModelOperation() {
            return this.modelOperation;
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

}
