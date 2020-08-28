// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class ConvertChargeTypeResponse extends TeaModel {
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
    public ConvertChargeTypeResponseData data;

    public static ConvertChargeTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConvertChargeTypeResponse self = new ConvertChargeTypeResponse();
        return TeaModel.build(map, self);
    }

    public static class ConvertChargeTypeResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        public static ConvertChargeTypeResponseData build(java.util.Map<String, ?> map) throws Exception {
            ConvertChargeTypeResponseData self = new ConvertChargeTypeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
