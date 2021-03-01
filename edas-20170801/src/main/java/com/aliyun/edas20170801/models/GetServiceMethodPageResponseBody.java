// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetServiceMethodPageResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceMethodPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageResponseBody self = new GetServiceMethodPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceMethodPageResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public GetServiceMethodPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceMethodPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceMethodPageResponseBody setData(GetServiceMethodPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceMethodPageResponseBodyData getData() {
        return this.data;
    }

    public GetServiceMethodPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceMethodPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceMethodPageResponseBodyDataResultReturnDefinition extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Id")
        public String id;

        public static GetServiceMethodPageResponseBodyDataResultReturnDefinition build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseBodyDataResultReturnDefinition self = new GetServiceMethodPageResponseBodyDataResultReturnDefinition();
            return TeaModel.build(map, self);
        }

        public GetServiceMethodPageResponseBodyDataResultReturnDefinition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetServiceMethodPageResponseBodyDataResultReturnDefinition setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class GetServiceMethodPageResponseBodyDataResult extends TeaModel {
        @NameInMap("ParameterDetails")
        public String parameterDetails;

        @NameInMap("ParameterNames")
        public String parameterNames;

        @NameInMap("Paths")
        public String paths;

        @NameInMap("ParameterTypes")
        public String parameterTypes;

        @NameInMap("ReturnType")
        public String returnType;

        @NameInMap("NameDetail")
        public String nameDetail;

        @NameInMap("ParameterDefinitions")
        public String parameterDefinitions;

        @NameInMap("ReturnDefinition")
        public GetServiceMethodPageResponseBodyDataResultReturnDefinition returnDefinition;

        @NameInMap("RequestMethods")
        public String requestMethods;

        @NameInMap("ReturnDetails")
        public String returnDetails;

        @NameInMap("Name")
        public String name;

        @NameInMap("MethodController")
        public String methodController;

        public static GetServiceMethodPageResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseBodyDataResult self = new GetServiceMethodPageResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetServiceMethodPageResponseBodyDataResult setParameterDetails(String parameterDetails) {
            this.parameterDetails = parameterDetails;
            return this;
        }
        public String getParameterDetails() {
            return this.parameterDetails;
        }

        public GetServiceMethodPageResponseBodyDataResult setParameterNames(String parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public String getParameterNames() {
            return this.parameterNames;
        }

        public GetServiceMethodPageResponseBodyDataResult setPaths(String paths) {
            this.paths = paths;
            return this;
        }
        public String getPaths() {
            return this.paths;
        }

        public GetServiceMethodPageResponseBodyDataResult setParameterTypes(String parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public String getParameterTypes() {
            return this.parameterTypes;
        }

        public GetServiceMethodPageResponseBodyDataResult setReturnType(String returnType) {
            this.returnType = returnType;
            return this;
        }
        public String getReturnType() {
            return this.returnType;
        }

        public GetServiceMethodPageResponseBodyDataResult setNameDetail(String nameDetail) {
            this.nameDetail = nameDetail;
            return this;
        }
        public String getNameDetail() {
            return this.nameDetail;
        }

        public GetServiceMethodPageResponseBodyDataResult setParameterDefinitions(String parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public String getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        public GetServiceMethodPageResponseBodyDataResult setReturnDefinition(GetServiceMethodPageResponseBodyDataResultReturnDefinition returnDefinition) {
            this.returnDefinition = returnDefinition;
            return this;
        }
        public GetServiceMethodPageResponseBodyDataResultReturnDefinition getReturnDefinition() {
            return this.returnDefinition;
        }

        public GetServiceMethodPageResponseBodyDataResult setRequestMethods(String requestMethods) {
            this.requestMethods = requestMethods;
            return this;
        }
        public String getRequestMethods() {
            return this.requestMethods;
        }

        public GetServiceMethodPageResponseBodyDataResult setReturnDetails(String returnDetails) {
            this.returnDetails = returnDetails;
            return this;
        }
        public String getReturnDetails() {
            return this.returnDetails;
        }

        public GetServiceMethodPageResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceMethodPageResponseBodyDataResult setMethodController(String methodController) {
            this.methodController = methodController;
            return this;
        }
        public String getMethodController() {
            return this.methodController;
        }

    }

    public static class GetServiceMethodPageResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GetServiceMethodPageResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        public static GetServiceMethodPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseBodyData self = new GetServiceMethodPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceMethodPageResponseBodyData setResult(java.util.List<GetServiceMethodPageResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GetServiceMethodPageResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GetServiceMethodPageResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public GetServiceMethodPageResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetServiceMethodPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
