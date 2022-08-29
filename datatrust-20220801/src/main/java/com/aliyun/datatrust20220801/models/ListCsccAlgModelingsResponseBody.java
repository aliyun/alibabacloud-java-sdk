// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccAlgModelingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccAlgModelingsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccAlgModelingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccAlgModelingsResponseBody self = new ListCsccAlgModelingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccAlgModelingsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccAlgModelingsResponseBody setData(java.util.List<ListCsccAlgModelingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccAlgModelingsResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccAlgModelingsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccAlgModelingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccAlgModelingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccAlgModelingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker extends TeaModel {
        @NameInMap("Format")
        public String format;

        @NameInMap("Type")
        public String type;

        public static ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker build(java.util.Map<String, ?> map) throws Exception {
            ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker self = new ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker();
            return TeaModel.build(map, self);
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails extends TeaModel {
        @NameInMap("Candidates")
        public java.util.List<String> candidates;

        @NameInMap("Checker")
        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker checker;

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

        public static ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails build(java.util.Map<String, ?> map) throws Exception {
            ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails self = new ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails();
            return TeaModel.build(map, self);
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setCandidates(java.util.List<String> candidates) {
            this.candidates = candidates;
            return this;
        }
        public java.util.List<String> getCandidates() {
            return this.candidates;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setChecker(ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker checker) {
            this.checker = checker;
            return this;
        }
        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetailsChecker getChecker() {
            return this.checker;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setDisplayMode(String displayMode) {
            this.displayMode = displayMode;
            return this;
        }
        public String getDisplayMode() {
            return this.displayMode;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setInputMode(String inputMode) {
            this.inputMode = inputMode;
            return this;
        }
        public String getInputMode() {
            return this.inputMode;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setParamDescription(String paramDescription) {
            this.paramDescription = paramDescription;
            return this;
        }
        public String getParamDescription() {
            return this.paramDescription;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails setParamNameForDisplay(String paramNameForDisplay) {
            this.paramNameForDisplay = paramNameForDisplay;
            return this;
        }
        public String getParamNameForDisplay() {
            return this.paramNameForDisplay;
        }

    }

    public static class ListCsccAlgModelingsResponseBodyData extends TeaModel {
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
        public java.util.List<ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails> paramDefinitionDetails;

        public static ListCsccAlgModelingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccAlgModelingsResponseBodyData self = new ListCsccAlgModelingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccAlgModelingsResponseBodyData setArgs(String args) {
            this.args = args;
            return this;
        }
        public String getArgs() {
            return this.args;
        }

        public ListCsccAlgModelingsResponseBodyData setClassificationId(Long classificationId) {
            this.classificationId = classificationId;
            return this;
        }
        public Long getClassificationId() {
            return this.classificationId;
        }

        public ListCsccAlgModelingsResponseBodyData setClassificationName(String classificationName) {
            this.classificationName = classificationName;
            return this;
        }
        public String getClassificationName() {
            return this.classificationName;
        }

        public ListCsccAlgModelingsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCsccAlgModelingsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListCsccAlgModelingsResponseBodyData setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListCsccAlgModelingsResponseBodyData setModelingId(Long modelingId) {
            this.modelingId = modelingId;
            return this;
        }
        public Long getModelingId() {
            return this.modelingId;
        }

        public ListCsccAlgModelingsResponseBodyData setModelingName(String modelingName) {
            this.modelingName = modelingName;
            return this;
        }
        public String getModelingName() {
            return this.modelingName;
        }

        public ListCsccAlgModelingsResponseBodyData setModelingType(Integer modelingType) {
            this.modelingType = modelingType;
            return this;
        }
        public Integer getModelingType() {
            return this.modelingType;
        }

        public ListCsccAlgModelingsResponseBodyData setModelingVersion(String modelingVersion) {
            this.modelingVersion = modelingVersion;
            return this;
        }
        public String getModelingVersion() {
            return this.modelingVersion;
        }

        public ListCsccAlgModelingsResponseBodyData setParamDefinition(String paramDefinition) {
            this.paramDefinition = paramDefinition;
            return this;
        }
        public String getParamDefinition() {
            return this.paramDefinition;
        }

        public ListCsccAlgModelingsResponseBodyData setParamDefinitionDetails(java.util.List<ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails> paramDefinitionDetails) {
            this.paramDefinitionDetails = paramDefinitionDetails;
            return this;
        }
        public java.util.List<ListCsccAlgModelingsResponseBodyDataParamDefinitionDetails> getParamDefinitionDetails() {
            return this.paramDefinitionDetails;
        }

    }

}
