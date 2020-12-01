// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneTasksMCountResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public Float data;

    public static DescribeLorneTasksMCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneTasksMCountResponse self = new DescribeLorneTasksMCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneTasksMCountResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneTasksMCountResponse setData(Float data) {
        this.data = data;
        return this;
    }
    public Float getData() {
        return this.data;
    }

}
