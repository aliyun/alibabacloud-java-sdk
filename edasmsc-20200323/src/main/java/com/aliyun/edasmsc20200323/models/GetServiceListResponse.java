// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceListResponse extends TeaModel {
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
    public java.util.List<GetServiceListResponseData> data;

    public static GetServiceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListResponse self = new GetServiceListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetServiceListResponseDataMethods extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ReturnType")
        @Validation(required = true)
        public String returnType;

        @NameInMap("ParameterTypes")
        @Validation(required = true)
        public java.util.List<String> parameterTypes;

        public static GetServiceListResponseDataMethods build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListResponseDataMethods self = new GetServiceListResponseDataMethods();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceListResponseData extends TeaModel {
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

        @NameInMap("RegistryType")
        @Validation(required = true)
        public String registryType;

        @NameInMap("Metadata")
        @Validation(required = true)
        public java.util.Map<String, ?> metadata;

        @NameInMap("Methods")
        @Validation(required = true)
        public java.util.List<GetServiceListResponseDataMethods> methods;

        public static GetServiceListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceListResponseData self = new GetServiceListResponseData();
            return TeaModel.build(map, self);
        }

    }

}
