// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogisticsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static SubmitReturnGoodLogisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogisticsResponseBody self = new SubmitReturnGoodLogisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitReturnGoodLogisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitReturnGoodLogisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
