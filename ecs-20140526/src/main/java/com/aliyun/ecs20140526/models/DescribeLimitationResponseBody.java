// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLimitationResponseBody extends TeaModel {
    @NameInMap("Limitation")
    public String limitation;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Value")
    public String value;

    public static DescribeLimitationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLimitationResponseBody self = new DescribeLimitationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLimitationResponseBody setLimitation(String limitation) {
        this.limitation = limitation;
        return this;
    }
    public String getLimitation() {
        return this.limitation;
    }

    public DescribeLimitationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLimitationResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
