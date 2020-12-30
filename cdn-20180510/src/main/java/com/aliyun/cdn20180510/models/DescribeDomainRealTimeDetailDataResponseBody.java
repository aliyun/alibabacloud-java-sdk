// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeDetailDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static DescribeDomainRealTimeDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeDetailDataResponseBody self = new DescribeDomainRealTimeDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainRealTimeDetailDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
