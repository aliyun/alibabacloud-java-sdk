// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFullTreeResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkTemplateFullTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFullTreeResponseBody self = new GetSparkTemplateFullTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFullTreeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSparkTemplateFullTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
