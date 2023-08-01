// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListMethodsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The returned message that indicates whether the request is successful.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about service methods.</p>
     */
    @NameInMap("ServiceMethodList")
    public ListMethodsResponseBodyServiceMethodList serviceMethodList;

    public static ListMethodsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMethodsResponseBody self = new ListMethodsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMethodsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListMethodsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMethodsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMethodsResponseBody setServiceMethodList(ListMethodsResponseBodyServiceMethodList serviceMethodList) {
        this.serviceMethodList = serviceMethodList;
        return this;
    }
    public ListMethodsResponseBodyServiceMethodList getServiceMethodList() {
        return this.serviceMethodList;
    }

    public static class ListMethodsResponseBodyServiceMethodListServiceMethodInputParams extends TeaModel {
        @NameInMap("InputParam")
        public java.util.List<String> inputParam;

        public static ListMethodsResponseBodyServiceMethodListServiceMethodInputParams build(java.util.Map<String, ?> map) throws Exception {
            ListMethodsResponseBodyServiceMethodListServiceMethodInputParams self = new ListMethodsResponseBodyServiceMethodListServiceMethodInputParams();
            return TeaModel.build(map, self);
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethodInputParams setInputParam(java.util.List<String> inputParam) {
            this.inputParam = inputParam;
            return this;
        }
        public java.util.List<String> getInputParam() {
            return this.inputParam;
        }

    }

    public static class ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes extends TeaModel {
        @NameInMap("ParamType")
        public java.util.List<String> paramType;

        public static ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes build(java.util.Map<String, ?> map) throws Exception {
            ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes self = new ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes();
            return TeaModel.build(map, self);
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes setParamType(java.util.List<String> paramType) {
            this.paramType = paramType;
            return this;
        }
        public java.util.List<String> getParamType() {
            return this.paramType;
        }

    }

    public static class ListMethodsResponseBodyServiceMethodListServiceMethod extends TeaModel {
        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        @NameInMap("InputParams")
        public ListMethodsResponseBodyServiceMethodListServiceMethodInputParams inputParams;

        /**
         * <p>The name of the service method.</p>
         */
        @NameInMap("MethodName")
        public String methodName;

        /**
         * <p>The return type of the service method.</p>
         */
        @NameInMap("Output")
        public String output;

        @NameInMap("ParamTypes")
        public ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes paramTypes;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        public static ListMethodsResponseBodyServiceMethodListServiceMethod build(java.util.Map<String, ?> map) throws Exception {
            ListMethodsResponseBodyServiceMethodListServiceMethod self = new ListMethodsResponseBodyServiceMethodListServiceMethod();
            return TeaModel.build(map, self);
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethod setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethod setInputParams(ListMethodsResponseBodyServiceMethodListServiceMethodInputParams inputParams) {
            this.inputParams = inputParams;
            return this;
        }
        public ListMethodsResponseBodyServiceMethodListServiceMethodInputParams getInputParams() {
            return this.inputParams;
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethod setMethodName(String methodName) {
            this.methodName = methodName;
            return this;
        }
        public String getMethodName() {
            return this.methodName;
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethod setOutput(String output) {
            this.output = output;
            return this;
        }
        public String getOutput() {
            return this.output;
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethod setParamTypes(ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes paramTypes) {
            this.paramTypes = paramTypes;
            return this;
        }
        public ListMethodsResponseBodyServiceMethodListServiceMethodParamTypes getParamTypes() {
            return this.paramTypes;
        }

        public ListMethodsResponseBodyServiceMethodListServiceMethod setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

    }

    public static class ListMethodsResponseBodyServiceMethodList extends TeaModel {
        @NameInMap("ServiceMethod")
        public java.util.List<ListMethodsResponseBodyServiceMethodListServiceMethod> serviceMethod;

        public static ListMethodsResponseBodyServiceMethodList build(java.util.Map<String, ?> map) throws Exception {
            ListMethodsResponseBodyServiceMethodList self = new ListMethodsResponseBodyServiceMethodList();
            return TeaModel.build(map, self);
        }

        public ListMethodsResponseBodyServiceMethodList setServiceMethod(java.util.List<ListMethodsResponseBodyServiceMethodListServiceMethod> serviceMethod) {
            this.serviceMethod = serviceMethod;
            return this;
        }
        public java.util.List<ListMethodsResponseBodyServiceMethodListServiceMethod> getServiceMethod() {
            return this.serviceMethod;
        }

    }

}
