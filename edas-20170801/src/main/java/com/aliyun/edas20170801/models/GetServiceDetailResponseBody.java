// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceDetailResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public GetServiceDetailResponseBodyData data;

    /**
     * <p>The message returned for the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetServiceDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailResponseBody self = new GetServiceDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceDetailResponseBody setData(GetServiceDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetServiceDetailResponseBodyData getData() {
        return this.data;
    }

    public GetServiceDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceDetailResponseBodyDataMethodsReturnDefinition extends TeaModel {
        /**
         * <p>The ID of the return value.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the response.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetServiceDetailResponseBodyDataMethodsReturnDefinition build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataMethodsReturnDefinition self = new GetServiceDetailResponseBodyDataMethodsReturnDefinition();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataMethodsReturnDefinition setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetServiceDetailResponseBodyDataMethodsReturnDefinition setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetServiceDetailResponseBodyDataMethods extends TeaModel {
        /**
         * <p>The controllers.</p>
         */
        @NameInMap("MethodController")
        public String methodController;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The specific name.</p>
         */
        @NameInMap("NameDetail")
        public String nameDetail;

        /**
         * <p>The parameter definitions.</p>
         */
        @NameInMap("ParameterDefinitions")
        public String parameterDefinitions;

        /**
         * <p>The parameter details.</p>
         */
        @NameInMap("ParameterDetails")
        public String parameterDetails;

        /**
         * <p>The parameter names.</p>
         */
        @NameInMap("ParameterNames")
        public String parameterNames;

        /**
         * <p>The parameter types.</p>
         */
        @NameInMap("ParameterTypes")
        public String parameterTypes;

        /**
         * <p>The method paths.</p>
         */
        @NameInMap("Paths")
        public String paths;

        /**
         * <p>The request methods.</p>
         */
        @NameInMap("RequestMethods")
        public String requestMethods;

        /**
         * <p>The definition of the value returned by the method.</p>
         */
        @NameInMap("ReturnDefinition")
        public GetServiceDetailResponseBodyDataMethodsReturnDefinition returnDefinition;

        /**
         * <p>The response details.</p>
         */
        @NameInMap("ReturnDetails")
        public String returnDetails;

        /**
         * <p>The type of the response.</p>
         */
        @NameInMap("ReturnType")
        public String returnType;

        public static GetServiceDetailResponseBodyDataMethods build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyDataMethods self = new GetServiceDetailResponseBodyDataMethods();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyDataMethods setMethodController(String methodController) {
            this.methodController = methodController;
            return this;
        }
        public String getMethodController() {
            return this.methodController;
        }

        public GetServiceDetailResponseBodyDataMethods setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceDetailResponseBodyDataMethods setNameDetail(String nameDetail) {
            this.nameDetail = nameDetail;
            return this;
        }
        public String getNameDetail() {
            return this.nameDetail;
        }

        public GetServiceDetailResponseBodyDataMethods setParameterDefinitions(String parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public String getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        public GetServiceDetailResponseBodyDataMethods setParameterDetails(String parameterDetails) {
            this.parameterDetails = parameterDetails;
            return this;
        }
        public String getParameterDetails() {
            return this.parameterDetails;
        }

        public GetServiceDetailResponseBodyDataMethods setParameterNames(String parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public String getParameterNames() {
            return this.parameterNames;
        }

        public GetServiceDetailResponseBodyDataMethods setParameterTypes(String parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public String getParameterTypes() {
            return this.parameterTypes;
        }

        public GetServiceDetailResponseBodyDataMethods setPaths(String paths) {
            this.paths = paths;
            return this;
        }
        public String getPaths() {
            return this.paths;
        }

        public GetServiceDetailResponseBodyDataMethods setRequestMethods(String requestMethods) {
            this.requestMethods = requestMethods;
            return this;
        }
        public String getRequestMethods() {
            return this.requestMethods;
        }

        public GetServiceDetailResponseBodyDataMethods setReturnDefinition(GetServiceDetailResponseBodyDataMethodsReturnDefinition returnDefinition) {
            this.returnDefinition = returnDefinition;
            return this;
        }
        public GetServiceDetailResponseBodyDataMethodsReturnDefinition getReturnDefinition() {
            return this.returnDefinition;
        }

        public GetServiceDetailResponseBodyDataMethods setReturnDetails(String returnDetails) {
            this.returnDetails = returnDetails;
            return this;
        }
        public String getReturnDetails() {
            return this.returnDetails;
        }

        public GetServiceDetailResponseBodyDataMethods setReturnType(String returnType) {
            this.returnType = returnType;
            return this;
        }
        public String getReturnType() {
            return this.returnType;
        }

    }

    public static class GetServiceDetailResponseBodyData extends TeaModel {
        /**
         * <p>The name of the Dubbo application.</p>
         */
        @NameInMap("DubboApplicationName")
        public String dubboApplicationName;

        /**
         * <p>The name of the Enterprise Distributed Application Service (EDAS) application.</p>
         */
        @NameInMap("EdasAppName")
        public String edasAppName;

        /**
         * <p>The group.</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The metadata.</p>
         */
        @NameInMap("Metadata")
        public String metadata;

        /**
         * <p>The methods.</p>
         */
        @NameInMap("Methods")
        public java.util.List<GetServiceDetailResponseBodyDataMethods> methods;

        /**
         * <p>The type of the service registry.</p>
         */
        @NameInMap("RegistryType")
        public String registryType;

        /**
         * <p>The name of the service.</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The type of the service.</p>
         */
        @NameInMap("ServiceType")
        public String serviceType;

        /**
         * <p>The name of the Spring application.</p>
         */
        @NameInMap("SpringApplicationName")
        public String springApplicationName;

        /**
         * <p>The version number.</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetServiceDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseBodyData self = new GetServiceDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceDetailResponseBodyData setDubboApplicationName(String dubboApplicationName) {
            this.dubboApplicationName = dubboApplicationName;
            return this;
        }
        public String getDubboApplicationName() {
            return this.dubboApplicationName;
        }

        public GetServiceDetailResponseBodyData setEdasAppName(String edasAppName) {
            this.edasAppName = edasAppName;
            return this;
        }
        public String getEdasAppName() {
            return this.edasAppName;
        }

        public GetServiceDetailResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetServiceDetailResponseBodyData setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public GetServiceDetailResponseBodyData setMethods(java.util.List<GetServiceDetailResponseBodyDataMethods> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<GetServiceDetailResponseBodyDataMethods> getMethods() {
            return this.methods;
        }

        public GetServiceDetailResponseBodyData setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public GetServiceDetailResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceDetailResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetServiceDetailResponseBodyData setSpringApplicationName(String springApplicationName) {
            this.springApplicationName = springApplicationName;
            return this;
        }
        public String getSpringApplicationName() {
            return this.springApplicationName;
        }

        public GetServiceDetailResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
