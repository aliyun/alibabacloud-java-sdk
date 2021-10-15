// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogisticsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static SubmitReturnGoodLogisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogisticsResponse self = new SubmitReturnGoodLogisticsResponse();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitReturnGoodLogisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitReturnGoodLogisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
