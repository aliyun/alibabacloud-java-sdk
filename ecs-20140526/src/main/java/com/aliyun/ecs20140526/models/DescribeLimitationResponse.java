// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeLimitationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Limitation")
    @Validation(required = true)
    public String limitation;

    @NameInMap("Value")
    @Validation(required = true)
    public String value;

    public static DescribeLimitationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLimitationResponse self = new DescribeLimitationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLimitationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLimitationResponse setLimitation(String limitation) {
        this.limitation = limitation;
        return this;
    }
    public String getLimitation() {
        return this.limitation;
    }

    public DescribeLimitationResponse setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
