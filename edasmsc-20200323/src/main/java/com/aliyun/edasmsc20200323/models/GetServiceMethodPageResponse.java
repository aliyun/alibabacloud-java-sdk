// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageResponse extends TeaModel {
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
    public GetServiceMethodPageResponseData data;

    public static GetServiceMethodPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageResponse self = new GetServiceMethodPageResponse();
        return TeaModel.build(map, self);
    }

    public static class GetServiceMethodPageResponseDataResultParameterDefinitions extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static GetServiceMethodPageResponseDataResultParameterDefinitions build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseDataResultParameterDefinitions self = new GetServiceMethodPageResponseDataResultParameterDefinitions();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceMethodPageResponseDataResult extends TeaModel {
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
        public java.util.List<GetServiceMethodPageResponseDataResultParameterDefinitions> parameterDefinitions;

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

        public static GetServiceMethodPageResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseDataResult self = new GetServiceMethodPageResponseDataResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceMethodPageResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<GetServiceMethodPageResponseDataResult> result;

        public static GetServiceMethodPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceMethodPageResponseData self = new GetServiceMethodPageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
