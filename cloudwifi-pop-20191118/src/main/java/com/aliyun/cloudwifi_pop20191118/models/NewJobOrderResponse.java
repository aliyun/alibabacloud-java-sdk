// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewJobOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public NewJobOrderResponseData data;

    public static NewJobOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        NewJobOrderResponse self = new NewJobOrderResponse();
        return TeaModel.build(map, self);
    }

    public static class NewJobOrderResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public Long orderId;

        public static NewJobOrderResponseData build(java.util.Map<String, ?> map) throws Exception {
            NewJobOrderResponseData self = new NewJobOrderResponseData();
            return TeaModel.build(map, self);
        }

    }

}
