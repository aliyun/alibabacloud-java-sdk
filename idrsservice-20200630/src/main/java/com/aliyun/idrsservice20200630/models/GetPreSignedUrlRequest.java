// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetPreSignedUrlRequest extends TeaModel {
    @NameInMap("ClientBaseParam")
    public String clientBaseParam;

    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("Prefix")
    public String prefix;

    public static GetPreSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPreSignedUrlRequest self = new GetPreSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPreSignedUrlRequest setClientBaseParam(String clientBaseParam) {
        this.clientBaseParam = clientBaseParam;
        return this;
    }
    public String getClientBaseParam() {
        return this.clientBaseParam;
    }

    public GetPreSignedUrlRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetPreSignedUrlRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
