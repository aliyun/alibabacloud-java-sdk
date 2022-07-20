// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyDetailRequest extends TeaModel {
    @NameInMap("TraceId")
    public String traceId;

    public static DescribePalyDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyDetailRequest self = new DescribePalyDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePalyDetailRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
