// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class GetScmRsaPubKeyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Identifier")
    @Validation(required = true)
    public String identifier;

    @NameInMap("RsaPub")
    @Validation(required = true)
    public String rsaPub;

    public static GetScmRsaPubKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetScmRsaPubKeyResponse self = new GetScmRsaPubKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetScmRsaPubKeyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetScmRsaPubKeyResponse setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public GetScmRsaPubKeyResponse setRsaPub(String rsaPub) {
        this.rsaPub = rsaPub;
        return this;
    }
    public String getRsaPub() {
        return this.rsaPub;
    }

}
