// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetServiceListResponseBody extends TeaModel {
    // The status code returned.
    @NameInMap("Code")
    public Integer code;

    // The data entries returned.
    @NameInMap("Data")
    public java.util.List<GetServiceListResponseBodyData> data;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful.
    @NameInMap("Success")
    public Boolean success;

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

    public GetServiceListResponseBody setData(java.util.List<GetServiceListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetServiceListResponseBodyData> getData() {
        return this.data;
    }

    public GetServiceListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetServiceListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetServiceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetServiceListResponseBodyDataMethods extends TeaModel {
        // The controller of the method.
        @NameInMap("MethodController")
        public String methodController;

        // The name of the method.
        @NameInMap("Name")
        public String name;

        // The data types of the parameters.
        @NameInMap("ParameterTypes")
        public java.util.List<String> parameterTypes;

        // The paths.
        @NameInMap("Paths")
        public java.util.List<String> paths;

        // The methods.
        @NameInMap("RequestMethods")
        public java.util.List<String> requestMethods;

        // The type of the return value.
        @NameInMap("ReturnType")
        public String returnType;

        public static GetServiceListResponseBodyDataMethods build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListResponseBodyDataMethods self = new GetServiceListResponseBodyDataMethods();
            return TeaModel.build(map, self);
        }

        public GetServiceListResponseBodyDataMethods setMethodController(String methodController) {
            this.methodController = methodController;
            return this;
        }
        public String getMethodController() {
            return this.methodController;
        }

        public GetServiceListResponseBodyDataMethods setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetServiceListResponseBodyDataMethods setParameterTypes(java.util.List<String> parameterTypes) {
            this.parameterTypes = parameterTypes;
            return this;
        }
        public java.util.List<String> getParameterTypes() {
            return this.parameterTypes;
        }

        public GetServiceListResponseBodyDataMethods setPaths(java.util.List<String> paths) {
            this.paths = paths;
            return this;
        }
        public java.util.List<String> getPaths() {
            return this.paths;
        }

        public GetServiceListResponseBodyDataMethods setRequestMethods(java.util.List<String> requestMethods) {
            this.requestMethods = requestMethods;
            return this;
        }
        public java.util.List<String> getRequestMethods() {
            return this.requestMethods;
        }

        public GetServiceListResponseBodyDataMethods setReturnType(String returnType) {
            this.returnType = returnType;
            return this;
        }
        public String getReturnType() {
            return this.returnType;
        }

    }

    public static class GetServiceListResponseBodyData extends TeaModel {
        // The name of the Dubbo application.
        @NameInMap("DubboApplicationName")
        public String dubboApplicationName;

        // The name of the application.
        @NameInMap("EdasAppName")
        public String edasAppName;

        // The group.
        @NameInMap("Group")
        public String group;

        // The metadata.
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        // The methods.
        @NameInMap("Methods")
        public java.util.List<GetServiceListResponseBodyDataMethods> methods;

        // The type of the service registry.
        @NameInMap("RegistryType")
        public String registryType;

        // The name of the service.
        @NameInMap("ServiceName")
        public String serviceName;

        // The type of the service.
        @NameInMap("ServiceType")
        public String serviceType;

        // The name of the Spring application.
        @NameInMap("SpringApplicationName")
        public String springApplicationName;

        // The version information.
        @NameInMap("Version")
        public String version;

        public static GetServiceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListResponseBodyData self = new GetServiceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetServiceListResponseBodyData setDubboApplicationName(String dubboApplicationName) {
            this.dubboApplicationName = dubboApplicationName;
            return this;
        }
        public String getDubboApplicationName() {
            return this.dubboApplicationName;
        }

        public GetServiceListResponseBodyData setEdasAppName(String edasAppName) {
            this.edasAppName = edasAppName;
            return this;
        }
        public String getEdasAppName() {
            return this.edasAppName;
        }

        public GetServiceListResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetServiceListResponseBodyData setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public GetServiceListResponseBodyData setMethods(java.util.List<GetServiceListResponseBodyDataMethods> methods) {
            this.methods = methods;
            return this;
        }
        public java.util.List<GetServiceListResponseBodyDataMethods> getMethods() {
            return this.methods;
        }

        public GetServiceListResponseBodyData setRegistryType(String registryType) {
            this.registryType = registryType;
            return this;
        }
        public String getRegistryType() {
            return this.registryType;
        }

        public GetServiceListResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetServiceListResponseBodyData setServiceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public String getServiceType() {
            return this.serviceType;
        }

        public GetServiceListResponseBodyData setSpringApplicationName(String springApplicationName) {
            this.springApplicationName = springApplicationName;
            return this;
        }
        public String getSpringApplicationName() {
            return this.springApplicationName;
        }

        public GetServiceListResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
