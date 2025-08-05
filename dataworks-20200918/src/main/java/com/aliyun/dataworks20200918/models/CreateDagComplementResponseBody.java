// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateDagComplementResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Long> data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateDagComplementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDagComplementResponseBody self = new CreateDagComplementResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDagComplementResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public CreateDagComplementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
