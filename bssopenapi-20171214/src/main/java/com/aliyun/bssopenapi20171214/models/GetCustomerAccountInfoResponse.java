// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class GetCustomerAccountInfoResponse extends TeaModel {
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
    public GetCustomerAccountInfoResponseData data;

    public static GetCustomerAccountInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerAccountInfoResponse self = new GetCustomerAccountInfoResponse();
        return TeaModel.build(map, self);
    }

    public static class GetCustomerAccountInfoResponseData extends TeaModel {
        @NameInMap("LoginEmail")
        @Validation(required = true)
        public String loginEmail;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("Mpk")
        @Validation(required = true)
        public Long mpk;

        @NameInMap("HostingStatus")
        @Validation(required = true)
        public String hostingStatus;

        @NameInMap("CreditLimitStatus")
        @Validation(required = true)
        public String creditLimitStatus;

        @NameInMap("IsCertified")
        @Validation(required = true)
        public Boolean isCertified;

        public static GetCustomerAccountInfoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetCustomerAccountInfoResponseData self = new GetCustomerAccountInfoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
