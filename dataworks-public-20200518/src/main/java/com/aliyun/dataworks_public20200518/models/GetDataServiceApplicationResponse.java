// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetDataServiceApplicationResponse extends TeaModel {
    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetDataServiceApplicationResponseData data;

    public static GetDataServiceApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApplicationResponse self = new GetDataServiceApplicationResponse();
        return TeaModel.build(map, self);
    }

    public static class GetDataServiceApplicationResponseData extends TeaModel {
        @NameInMap("ApplicationCode")
        @Validation(required = true)
        public String applicationCode;

        @NameInMap("ApplicationId")
        @Validation(required = true)
        public Long applicationId;

        @NameInMap("ApplicationKey")
        @Validation(required = true)
        public String applicationKey;

        @NameInMap("ApplicationName")
        @Validation(required = true)
        public String applicationName;

        @NameInMap("ApplicationSecret")
        @Validation(required = true)
        public String applicationSecret;

        @NameInMap("ProjectId")
        @Validation(required = true)
        public Long projectId;

        public static GetDataServiceApplicationResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApplicationResponseData self = new GetDataServiceApplicationResponseData();
            return TeaModel.build(map, self);
        }

    }

}
