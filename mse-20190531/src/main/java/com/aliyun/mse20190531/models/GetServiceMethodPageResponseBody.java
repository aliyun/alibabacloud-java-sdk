// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetServiceMethodPageResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetServiceMethodPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageResponseBody self = new GetServiceMethodPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceMethodPageResponseBody setData(GetServiceMethodPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceMethodPageResponseBodyData getData() {
        return this.data;
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

    public GetServiceMethodPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceMethodPageResponseBodyDataResultParameterDefinitions extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static GetServiceMethodPageResponseBodyDataResultParameterDefinitions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseBodyDataResultParameterDefinitions self = new GetServiceMethodPageResponseBodyDataResultParameterDefinitions();
            return TeaModel.build(map, self);
        }

        public GetServiceMethodPageResponseBodyDataResultParameterDefinitions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetServiceMethodPageResponseBodyDataResultParameterDefinitions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceMethodPageResponseBodyDataResultParameterDefinitions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceMethodPageResponseBodyDataResult extends TeaModel {
        @NameInMap("MethodController")
        public String methodController;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameDetail")
        public String nameDetail;

        @NameInMap("ParameterDefinitions")
        public java.util.List<GetServiceMethodPageResponseBodyDataResultParameterDefinitions> parameterDefinitions;

        @NameInMap("ParameterDetails")
        public java.util.List<String> parameterDetails;

        @NameInMap("ParameterTypes")
        public java.util.List<String> parameterTypes;

        @NameInMap("Paths")
        public java.util.List<String> paths;

        @NameInMap("RequestMethods")
        public java.util.List<String> requestMethods;

        @NameInMap("ReturnDetails")
        public String returnDetails;

        @NameInMap("ReturnType")
        public String returnType;

        public static GetServiceMethodPageResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseBodyDataResult self = new GetServiceMethodPageResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GetServiceMethodPageResponseBodyDataResult setMethodController(String methodController) {
            this.methodController = methodController;
            return this;
        }
        public String getMethodController() {
            return this.methodController;
        }

        public GetServiceMethodPageResponseBodyDataResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceMethodPageResponseBodyDataResult setNameDetail(String nameDetail) {
            this.nameDetail = nameDetail;
            return this;
        }
        public String getNameDetail() {
            return this.nameDetail;
        }

        public GetServiceMethodPageResponseBodyDataResult setParameterDefinitions(java.util.List<GetServiceMethodPageResponseBodyDataResultParameterDefinitions> parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public java.util.List<GetServiceMethodPageResponseBodyDataResultParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        public GetServiceMethodPageResponseBodyDataResult setParameterDetails(java.util.List<String> parameterDetails) {
            this.parameterDetails = parameterDetails;
            return this;
        }
        public java.util.List<String> getParameterDetails() {
            return this.parameterDetails;
        }

        public GetServiceMethodPageResponseBodyDataResult setParameterTypes(java.util.List<String> parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public java.util.List<String> getParameterTypes() {
            return this.parameterTypes;
        }

        public GetServiceMethodPageResponseBodyDataResult setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public GetServiceMethodPageResponseBodyDataResult setRequestMethods(java.util.List<String> requestMethods) {
            this.requestMethods = requestMethods;
            return this;
        }
        public java.util.List<String> getRequestMethods() {
            return this.requestMethods;
        }

        public GetServiceMethodPageResponseBodyDataResult setReturnDetails(String returnDetails) {
            this.returnDetails = returnDetails;
            return this;
        }
        public String getReturnDetails() {
            return this.returnDetails;
        }

        public GetServiceMethodPageResponseBodyDataResult setReturnType(String returnType) {
            this.returnType = returnType;
            return this;
        }
        public String getReturnType() {
            return this.returnType;
        }

    }

    public static class GetServiceMethodPageResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<GetServiceMethodPageResponseBodyDataResult> result;

        @NameInMap("TotalSize")
        public Integer totalSize;

        public static GetServiceMethodPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseBodyData self = new GetServiceMethodPageResponseBodyData();
            return TeaModel.build(map, self);
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

    }

}
