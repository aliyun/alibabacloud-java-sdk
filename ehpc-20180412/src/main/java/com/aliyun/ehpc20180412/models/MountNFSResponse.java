// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class MountNFSResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MountNFSResponseBody body;

    public static MountNFSResponse build(java.util.Map<String, ?> map) throws Exception {
        MountNFSResponse self = new MountNFSResponse();
        return TeaModel.build(map, self);
    }

    public MountNFSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MountNFSResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MountNFSResponse setBody(MountNFSResponseBody body) {
        this.body = body;
        return this;
    }
    public MountNFSResponseBody getBody() {
        return this.body;
    }

}
