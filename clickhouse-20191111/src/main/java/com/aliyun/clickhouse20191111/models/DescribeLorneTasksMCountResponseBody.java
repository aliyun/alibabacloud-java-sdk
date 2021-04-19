// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksMCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Float data;

    public static DescribeLorneTasksMCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksMCountResponseBody self = new DescribeLorneTasksMCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksMCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneTasksMCountResponseBody setData(Float data) {
        this.data = data;
        return this;
    }
    public Float getData() {
        return this.data;
    }

}
