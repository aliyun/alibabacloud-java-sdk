// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class RenewInstanceResponse extends TeaModel {
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
    public RenewInstanceResponseData data;

    public static RenewInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewInstanceResponse self = new RenewInstanceResponse();
        return TeaModel.build(map, self);
    }

    public static class RenewInstanceResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        public static RenewInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            RenewInstanceResponseData self = new RenewInstanceResponseData();
            return TeaModel.build(map, self);
        }

    }

}
