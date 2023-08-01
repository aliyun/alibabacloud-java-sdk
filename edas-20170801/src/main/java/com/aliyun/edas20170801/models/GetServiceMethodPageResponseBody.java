// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned.</p>
     */
    @NameInMap("Data")
    public GetServiceMethodPageResponseBodyData data;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServiceMethodPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageResponseBody self = new GetServiceMethodPageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceMethodPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetServiceMethodPageResponseBody setData(GetServiceMethodPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceMethodPageResponseBodyData getData() {
        return this.data;
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

    public GetServiceMethodPageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceMethodPageResponseBodyDataResultReturnDefinition extends TeaModel {
        /**
         * <p>The ID of the return value.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The data format of the response.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServiceMethodPageResponseBodyDataResultReturnDefinition build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseBodyDataResultReturnDefinition self = new GetServiceMethodPageResponseBodyDataResultReturnDefinition();
            return TeaModel.build(map, self);
        }

        public GetServiceMethodPageResponseBodyDataResultReturnDefinition setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetServiceMethodPageResponseBodyDataResultReturnDefinition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceMethodPageResponseBodyDataResult extends TeaModel {
        /**
         * <p>The method.</p>
         */
        @NameInMap("MethodController")
        public String methodController;

        /**
         * <p>The name of the method.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The details of the method.</p>
         */
        @NameInMap("NameDetail")
        public String nameDetail;

        /**
         * <p>The definition of the parameter.</p>
         */
        @NameInMap("ParameterDefinitions")
        public String parameterDefinitions;

        /**
         * <p>The details of the parameters.</p>
         */
        @NameInMap("ParameterDetails")
        public String parameterDetails;

        /**
         * <p>The name of the parameter.</p>
         */
        @NameInMap("ParameterNames")
        public String parameterNames;

        /**
         * <p>The data type of the parameter.</p>
         */
        @NameInMap("ParameterTypes")
        public String parameterTypes;

        /**
         * <p>The method path.</p>
         */
        @NameInMap("Paths")
        public String paths;

        /**
         * <p>The request method.</p>
         */
        @NameInMap("RequestMethods")
        public String requestMethods;

        /**
         * <p>The return value.</p>
         */
        @NameInMap("ReturnDefinition")
        public GetServiceMethodPageResponseBodyDataResultReturnDefinition returnDefinition;

        /**
         * <p>The details of the response.</p>
         */
        @NameInMap("ReturnDetails")
        public String returnDetails;

        /**
         * <p>The data format of the response.</p>
         */
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

        public GetServiceMethodPageResponseBodyDataResult setParameterDefinitions(String parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public String getParameterDefinitions() {
            return this.parameterDefinitions;
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

        public GetServiceMethodPageResponseBodyDataResult setParameterTypes(String parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public String getParameterTypes() {
            return this.parameterTypes;
        }

        public GetServiceMethodPageResponseBodyDataResult setPaths(String paths) {
            this.paths = paths;
            return this;
        }
        public String getPaths() {
            return this.paths;
        }

        public GetServiceMethodPageResponseBodyDataResult setRequestMethods(String requestMethods) {
            this.requestMethods = requestMethods;
            return this;
        }
        public String getRequestMethods() {
            return this.requestMethods;
        }

        public GetServiceMethodPageResponseBodyDataResult setReturnDefinition(GetServiceMethodPageResponseBodyDataResultReturnDefinition returnDefinition) {
            this.returnDefinition = returnDefinition;
            return this;
        }
        public GetServiceMethodPageResponseBodyDataResultReturnDefinition getReturnDefinition() {
            return this.returnDefinition;
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
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The data about the method.</p>
         */
        @NameInMap("Result")
        public java.util.List<GetServiceMethodPageResponseBodyDataResult> result;

        /**
         * <p>The total number of entries.</p>
         */
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
