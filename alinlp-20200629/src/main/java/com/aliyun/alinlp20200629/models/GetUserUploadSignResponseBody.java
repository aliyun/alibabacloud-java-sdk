// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetUserUploadSignResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetUserUploadSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserUploadSignResponseBody self = new GetUserUploadSignResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserUploadSignResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetUserUploadSignResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
