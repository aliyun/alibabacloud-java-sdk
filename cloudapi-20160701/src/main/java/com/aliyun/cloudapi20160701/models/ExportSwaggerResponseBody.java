// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class ExportSwaggerResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ExportSwaggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportSwaggerResponseBody self = new ExportSwaggerResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportSwaggerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExportSwaggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
