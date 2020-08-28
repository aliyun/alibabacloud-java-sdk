// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("HttpCode")
    @Validation(required = true)
    public String httpCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetServiceDetailResponseData data;

    public static GetServiceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceDetailResponse self = new GetServiceDetailResponse();
        return TeaModel.build(map, self);
    }

    public static class GetServiceDetailResponseDataMethodsParameterDefinitions extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static GetServiceDetailResponseDataMethodsParameterDefinitions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseDataMethodsParameterDefinitions self = new GetServiceDetailResponseDataMethodsParameterDefinitions();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceDetailResponseDataMethods extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ReturnType")
        @Validation(required = true)
        public String returnType;

        @NameInMap("NameDetail")
        @Validation(required = true)
        public String nameDetail;

        @NameInMap("ReturnDetails")
        @Validation(required = true)
        public String returnDetails;

        @NameInMap("MethodController")
        @Validation(required = true)
        public String methodController;

        @NameInMap("ParameterDefinitions")
        @Validation(required = true)
        public java.util.List<GetServiceDetailResponseDataMethodsParameterDefinitions> parameterDefinitions;

        @NameInMap("ParameterTypes")
        @Validation(required = true)
        public java.util.List<String> parameterTypes;

        @NameInMap("RequestMethods")
        @Validation(required = true)
        public java.util.List<String> requestMethods;

        @NameInMap("Paths")
        @Validation(required = true)
        public java.util.List<String> paths;

        @NameInMap("ParameterDetails")
        @Validation(required = true)
        public java.util.List<String> parameterDetails;

        public static GetServiceDetailResponseDataMethods build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseDataMethods self = new GetServiceDetailResponseDataMethods();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceDetailResponseData extends TeaModel {
        @NameInMap("ServiceName")
        @Validation(required = true)
        public String serviceName;

        @NameInMap("Version")
        @Validation(required = true)
        public String version;

        @NameInMap("Group")
        @Validation(required = true)
        public String group;

        @NameInMap("DubboApplicationName")
        @Validation(required = true)
        public String dubboApplicationName;

        @NameInMap("EdasAppName")
        @Validation(required = true)
        public String edasAppName;

        @NameInMap("SpringApplicationName")
        @Validation(required = true)
        public Integer springApplicationName;

        @NameInMap("ServiceType")
        @Validation(required = true)
        public String serviceType;

        @NameInMap("Metadata")
        @Validation(required = true)
        public java.util.Map<String, ?> metadata;

        @NameInMap("Methods")
        @Validation(required = true)
        public java.util.List<GetServiceDetailResponseDataMethods> methods;

        public static GetServiceDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceDetailResponseData self = new GetServiceDetailResponseData();
            return TeaModel.build(map, self);
        }

    }

}
