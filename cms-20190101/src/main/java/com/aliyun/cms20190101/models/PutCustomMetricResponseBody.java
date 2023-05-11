// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutCustomMetricResponseBody extends TeaModel {
    /**
     * <p>The name of the metric. Valid values of N: 1 to 21. For more information, see [Appendix 1: Metrics](~~163515~~).</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static PutCustomMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutCustomMetricResponseBody self = new PutCustomMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public PutCustomMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PutCustomMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PutCustomMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
