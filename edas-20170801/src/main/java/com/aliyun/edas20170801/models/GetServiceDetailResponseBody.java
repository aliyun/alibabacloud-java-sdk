// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetServiceDetailResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Id")
        public String id;

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
        @NameInMap("MethodController")
        public String methodController;

        @NameInMap("Name")
        public String name;

        @NameInMap("NameDetail")
        public String nameDetail;

        @NameInMap("ParameterDefinitions")
        public String parameterDefinitions;

        @NameInMap("ParameterDetails")
        public String parameterDetails;

        @NameInMap("ParameterNames")
        public String parameterNames;

        @NameInMap("ParameterTypes")
        public String parameterTypes;

        @NameInMap("Paths")
        public String paths;

        @NameInMap("RequestMethods")
        public String requestMethods;

        @NameInMap("ReturnDefinition")
        public GetServiceDetailResponseBodyDataMethodsReturnDefinition returnDefinition;

        @NameInMap("ReturnDetails")
        public String returnDetails;

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
        @NameInMap("DubboApplicationName")
        public String dubboApplicationName;

        @NameInMap("EdasAppName")
        public String edasAppName;

        @NameInMap("Group")
        public String group;

        @NameInMap("Metadata")
        public String metadata;

        @NameInMap("Methods")
        public java.util.List<GetServiceDetailResponseBodyDataMethods> methods;

        @NameInMap("RegistryType")
        public String registryType;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("SpringApplicationName")
        public String springApplicationName;

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
