// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceProvidersPageResponse extends TeaModel {
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
    public GetServiceProvidersPageResponseData data;

    public static GetServiceProvidersPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvidersPageResponse self = new GetServiceProvidersPageResponse();
        return TeaModel.build(map, self);
    }

    public static class GetServiceProvidersPageResponseDataResult extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("SerializeType")
        @Validation(required = true)
        public String serializeType;

        @NameInMap("Timeout")
        @Validation(required = true)
        public String timeout;

        public static GetServiceProvidersPageResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvidersPageResponseDataResult self = new GetServiceProvidersPageResponseDataResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceProvidersPageResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<GetServiceProvidersPageResponseDataResult> result;

        public static GetServiceProvidersPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceProvidersPageResponseData self = new GetServiceProvidersPageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
