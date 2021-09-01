// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class NotifyWithholdFundResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static NotifyWithholdFundResponseBody build(java.util.Map<String, ?> map) throws Exception {
        NotifyWithholdFundResponseBody self = new NotifyWithholdFundResponseBody();
        return TeaModel.build(map, self);
    }

    public NotifyWithholdFundResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NotifyWithholdFundResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public NotifyWithholdFundResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
