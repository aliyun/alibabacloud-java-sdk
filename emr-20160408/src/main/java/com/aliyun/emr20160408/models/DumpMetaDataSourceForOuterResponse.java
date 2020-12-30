// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DumpMetaDataSourceForOuterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DumpMetaDataSourceForOuterResponseBody body;

    public static DumpMetaDataSourceForOuterResponse build(java.util.Map<String, ?> map) throws Exception {
        DumpMetaDataSourceForOuterResponse self = new DumpMetaDataSourceForOuterResponse();
        return TeaModel.build(map, self);
    }

    public DumpMetaDataSourceForOuterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DumpMetaDataSourceForOuterResponse setBody(DumpMetaDataSourceForOuterResponseBody body) {
        this.body = body;
        return this;
    }
    public DumpMetaDataSourceForOuterResponseBody getBody() {
        return this.body;
    }

}
