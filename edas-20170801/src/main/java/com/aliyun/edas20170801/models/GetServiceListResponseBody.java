// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class GetServiceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<GetServiceListResponseBodyData> data;

    public static GetServiceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListResponseBody self = new GetServiceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetServiceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetServiceListResponseBody setData(java.util.List<GetServiceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetServiceListResponseBodyData> getData() {
        return this.data;
    }

    public static class GetServiceListResponseBodyDataMethods extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("ReturnType")
        public String returnType;

        @NameInMap("MethodController")
        public String methodController;

        @NameInMap("ParameterNames")
        public String parameterNames;

        @NameInMap("NameDetail")
        public String nameDetail;

        @NameInMap("ReturnDetails")
        public String returnDetails;

        @NameInMap("ParameterTypes")
        public String parameterTypes;

        @NameInMap("ParameterDetails")
        public String parameterDetails;

        @NameInMap("RequestMethods")
        public String requestMethods;

        @NameInMap("Paths")
        public String paths;

        @NameInMap("ParameterDefinitions")
        public String parameterDefinitions;

        public static GetServiceListResponseBodyDataMethods build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListResponseBodyDataMethods self = new GetServiceListResponseBodyDataMethods();
            return TeaModel.build(map, self);
        }

        public GetServiceListResponseBodyDataMethods setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceListResponseBodyDataMethods setReturnType(String returnType) {
            this.returnType = returnType;
            return this;
        }
        public String getReturnType() {
            return this.returnType;
        }

        public GetServiceListResponseBodyDataMethods setMethodController(String methodController) {
            this.methodController = methodController;
            return this;
        }
        public String getMethodController() {
            return this.methodController;
        }

        public GetServiceListResponseBodyDataMethods setParameterNames(String parameterNames) {
            this.parameterNames = parameterNames;
            return this;
        }
        public String getParameterNames() {
            return this.parameterNames;
        }

        public GetServiceListResponseBodyDataMethods setNameDetail(String nameDetail) {
            this.nameDetail = nameDetail;
            return this;
        }
        public String getNameDetail() {
            return this.nameDetail;
        }

        public GetServiceListResponseBodyDataMethods setReturnDetails(String returnDetails) {
            this.returnDetails = returnDetails;
            return this;
        }
        public String getReturnDetails() {
            return this.returnDetails;
        }

        public GetServiceListResponseBodyDataMethods setParameterTypes(String parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public String getParameterTypes() {
            return this.parameterTypes;
        }

        public GetServiceListResponseBodyDataMethods setParameterDetails(String parameterDetails) {
            this.parameterDetails = parameterDetails;
            return this;
        }
        public String getParameterDetails() {
            return this.parameterDetails;
        }

        public GetServiceListResponseBodyDataMethods setRequestMethods(String requestMethods) {
            this.requestMethods = requestMethods;
            return this;
        }
        public String getRequestMethods() {
            return this.requestMethods;
        }

        public GetServiceListResponseBodyDataMethods setPaths(String paths) {
            this.paths = paths;
            return this;
        }
        public String getPaths() {
            return this.paths;
        }

        public GetServiceListResponseBodyDataMethods setParameterDefinitions(String parameterDefinitions) {
            this.parameterDefinitions = parameterDefinitions;
            return this;
        }
        public String getParameterDefinitions() {
            return this.parameterDefinitions;
        }

    }

    public static class GetServiceListResponseBodyData extends TeaModel {
        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("EdasAppName")
        public String edasAppName;

        @NameInMap("DubboApplicationName")
        public String dubboApplicationName;

        @NameInMap("SpringApplicationName")
        public String springApplicationName;

        @NameInMap("ServiceType")
        public String serviceType;

        @NameInMap("RegistryType")
        public String registryType;

        @NameInMap("Version")
        public String version;

        @NameInMap("Group")
        public String group;

        @NameInMap("Metadata")
        public String metadata;

        @NameInMap("Methods")
        public java.util.List<GetServiceListResponseBodyDataMethods> methods;

        public static GetServiceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListResponseBodyData self = new GetServiceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceListResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceListResponseBodyData setEdasAppName(String edasAppName) {
            this.edasAppName = edasAppName;
            return this;
        }
        public String getEdasAppName() {
            return this.edasAppName;
        }

        public GetServiceListResponseBodyData setDubboApplicationName(String dubboApplicationName) {
            this.dubboApplicationName = dubboApplicationName;
            return this;
        }
        public String getDubboApplicationName() {
            return this.dubboApplicationName;
        }

        public GetServiceListResponseBodyData setSpringApplicationName(String springApplicationName) {
            this.springApplicationName = springApplicationName;
            return this;
        }
        public String getSpringApplicationName() {
            return this.springApplicationName;
        }

        public GetServiceListResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetServiceListResponseBodyData setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public GetServiceListResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetServiceListResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetServiceListResponseBodyData setMetadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public String getMetadata() {
            return this.metadata;
        }

        public GetServiceListResponseBodyData setMethods(java.util.List<GetServiceListResponseBodyDataMethods> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<GetServiceListResponseBodyDataMethods> getMethods() {
            return this.methods;
        }

    }

}
