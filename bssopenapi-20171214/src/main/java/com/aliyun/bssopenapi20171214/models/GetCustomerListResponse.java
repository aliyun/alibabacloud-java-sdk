// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerListResponse extends TeaModel {
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
    public GetCustomerListResponseData data;

    public static GetCustomerListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerListResponse self = new GetCustomerListResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCustomerListResponseData extends TeaModel {
        @NameInMap("UidList")
        @Validation(required = true)
        public java.util.List<String> uidList;

        public static GetCustomerListResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerListResponseData self = new GetCustomerListResponseData();
            return TeaModel.build(map, self);
        }

    }

}
