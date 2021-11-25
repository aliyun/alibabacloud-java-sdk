// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetContentKeyResponseBody extends TeaModel {
    @NameInMap("KeyInfos")
    public String keyInfos;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionId")
    public String versionId;

    public static GetContentKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContentKeyResponseBody self = new GetContentKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContentKeyResponseBody setKeyInfos(String keyInfos) {
        this.keyInfos = keyInfos;
        return this;
    }
    public String getKeyInfos() {
        return this.keyInfos;
    }

    public GetContentKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContentKeyResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
