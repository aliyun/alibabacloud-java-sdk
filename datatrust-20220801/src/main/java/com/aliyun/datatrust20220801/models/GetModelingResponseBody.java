// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetModelingResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetModelingResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetModelingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetModelingResponseBody self = new GetModelingResponseBody();
        return TeaModel.build(map, self);
    }

    public GetModelingResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetModelingResponseBody setData(GetModelingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetModelingResponseBodyData getData() {
        return this.data;
    }

    public GetModelingResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetModelingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetModelingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetModelingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetModelingResponseBodyDataParamDefinitionDetailsChecker extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("Type")
        public String type;

        public static GetModelingResponseBodyDataParamDefinitionDetailsChecker build(java.util.Map<String, ?> map) throws Exception {
            GetModelingResponseBodyDataParamDefinitionDetailsChecker self = new GetModelingResponseBodyDataParamDefinitionDetailsChecker();
            return TeaModel.build(map, self);
        }

        public GetModelingResponseBodyDataParamDefinitionDetailsChecker setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetModelingResponseBodyDataParamDefinitionDetailsChecker setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetModelingResponseBodyDataParamDefinitionDetails extends TeaModel {
        @NameInMap("Candidates")
        public java.util.List<String> candidates;

        @NameInMap("Checker")
        public GetModelingResponseBodyDataParamDefinitionDetailsChecker checker;

        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("DisplayMode")
        public String displayMode;

        @NameInMap("InputMode")
        public String inputMode;

        @NameInMap("ParamDescription")
        public String paramDescription;

        @NameInMap("ParamName")
        public String paramName;

        @NameInMap("ParamNameForDisplay")
        public String paramNameForDisplay;

        public static GetModelingResponseBodyDataParamDefinitionDetails build(java.util.Map<String, ?> map) throws Exception {
            GetModelingResponseBodyDataParamDefinitionDetails self = new GetModelingResponseBodyDataParamDefinitionDetails();
            return TeaModel.build(map, self);
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setCandidates(java.util.List<String> candidates) {
            this.candidates = candidates;
            return this;
        }
        public java.util.List<String> getCandidates() {
            return this.candidates;
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setChecker(GetModelingResponseBodyDataParamDefinitionDetailsChecker checker) {
            this.checker = checker;
            return this;
        }
        public GetModelingResponseBodyDataParamDefinitionDetailsChecker getChecker() {
            return this.checker;
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setParamDescription(String paramDescription) {
            this.paramDescription = paramDescription;
            return this;
        }
        public String getParamDescription() {
            return this.paramDescription;
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetModelingResponseBodyDataParamDefinitionDetails setParamNameForDisplay(String paramNameForDisplay) {
            this.paramNameForDisplay = paramNameForDisplay;
            return this;
        }
        public String getParamNameForDisplay() {
            return this.paramNameForDisplay;
        }

    }

    public static class GetModelingResponseBodyData extends TeaModel {
        @NameInMap("Args")
        public String args;

        @NameInMap("ClassificationId")
        public Long classificationId;

        @NameInMap("ClassificationName")
        public String classificationName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ModelingId")
        public Long modelingId;

        @NameInMap("ModelingName")
        public String modelingName;

        @NameInMap("ModelingType")
        public Integer modelingType;

        @NameInMap("ModelingVersion")
        public String modelingVersion;

        @NameInMap("ParamDefinition")
        public String paramDefinition;

        @NameInMap("ParamDefinitionDetails")
        public java.util.List<GetModelingResponseBodyDataParamDefinitionDetails> paramDefinitionDetails;

        public static GetModelingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetModelingResponseBodyData self = new GetModelingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetModelingResponseBodyData setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public GetModelingResponseBodyData setClassificationId(Long classificationId) {
            this.classificationId = classificationId;
            return this;
        }
        public Long getClassificationId() {
            return this.classificationId;
        }

        public GetModelingResponseBodyData setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public GetModelingResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetModelingResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetModelingResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public GetModelingResponseBodyData setModelingId(Long modelingId) {
            this.modelingId = modelingId;
            return this;
        }
        public Long getModelingId() {
            return this.modelingId;
        }

        public GetModelingResponseBodyData setModelingName(String modelingName) {
            this.modelingName = modelingName;
            return this;
        }
        public String getModelingName() {
            return this.modelingName;
        }

        public GetModelingResponseBodyData setModelingType(Integer modelingType) {
            this.modelingType = modelingType;
            return this;
        }
        public Integer getModelingType() {
            return this.modelingType;
        }

        public GetModelingResponseBodyData setModelingVersion(String modelingVersion) {
            this.modelingVersion = modelingVersion;
            return this;
        }
        public String getModelingVersion() {
            return this.modelingVersion;
        }

        public GetModelingResponseBodyData setParamDefinition(String paramDefinition) {
            this.paramDefinition = paramDefinition;
            return this;
        }
        public String getParamDefinition() {
            return this.paramDefinition;
        }

        public GetModelingResponseBodyData setParamDefinitionDetails(java.util.List<GetModelingResponseBodyDataParamDefinitionDetails> paramDefinitionDetails) {
            this.paramDefinitionDetails = paramDefinitionDetails;
            return this;
        }
        public java.util.List<GetModelingResponseBodyDataParamDefinitionDetails> getParamDefinitionDetails() {
            return this.paramDefinitionDetails;
        }

    }

}
