// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceConsumersPageResponse extends TeaModel {
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
    public GetServiceConsumersPageResponseData data;

    public static GetServiceConsumersPageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConsumersPageResponse self = new GetServiceConsumersPageResponse();
        return TeaModel.build(map, self);
    }

    public static class GetServiceConsumersPageResponseDataResult extends TeaModel {
        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        @NameInMap("EdasAppName")
        @Validation(required = true)
        public String edasAppName;

        @NameInMap("EdasAppId")
        @Validation(required = true)
        public String edasAppId;

        public static GetServiceConsumersPageResponseDataResult build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConsumersPageResponseDataResult self = new GetServiceConsumersPageResponseDataResult();
            return TeaModel.build(map, self);
        }

    }

    public static class GetServiceConsumersPageResponseData extends TeaModel {
        @NameInMap("TotalSize")
        @Validation(required = true)
        public Integer totalSize;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("Result")
        @Validation(required = true)
        public java.util.List<GetServiceConsumersPageResponseDataResult> result;

        public static GetServiceConsumersPageResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetServiceConsumersPageResponseData self = new GetServiceConsumersPageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
