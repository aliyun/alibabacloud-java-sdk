// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class InsertCustomResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static InsertCustomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertCustomResponseBody self = new InsertCustomResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertCustomResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public InsertCustomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
