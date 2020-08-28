// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetBusinessResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Data")
    @Validation(required = true)
    public GetBusinessResponseData data;

    public static GetBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessResponse self = new GetBusinessResponse();
        return TeaModel.build(map, self);
    }

    public static class GetBusinessResponseData extends TeaModel {
        @NameInMap("BusinessId")
        @Validation(required = true)
        public Long businessId;

        @NameInMap("BusinessName")
        @Validation(required = true)
        public String businessName;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("Owner")
        @Validation(required = true)
        public String owner;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("UseType")
        @Validation(required = true)
        public String useType;

        public static GetBusinessResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetBusinessResponseData self = new GetBusinessResponseData();
            return TeaModel.build(map, self);
        }

    }

}
