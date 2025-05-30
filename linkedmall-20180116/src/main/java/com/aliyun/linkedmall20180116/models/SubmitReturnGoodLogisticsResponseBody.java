// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class SubmitReturnGoodLogisticsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C27A9456-5FC3-529D-9FDF-B21323E93B63</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitReturnGoodLogisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitReturnGoodLogisticsResponseBody self = new SubmitReturnGoodLogisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitReturnGoodLogisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
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

}
