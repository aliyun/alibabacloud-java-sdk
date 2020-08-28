// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryUserOmsDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryUserOmsDataResponseData data;

    public static QueryUserOmsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserOmsDataResponse self = new QueryUserOmsDataResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryUserOmsDataResponseData extends TeaModel {
        @NameInMap("Marker")
        @Validation(required = true)
        public String marker;

        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        @NameInMap("OmsData")
        @Validation(required = true)
        public java.util.List<java.util.Map<String, ?>> omsData;

        public static QueryUserOmsDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryUserOmsDataResponseData self = new QueryUserOmsDataResponseData();
            return TeaModel.build(map, self);
        }

    }

}
