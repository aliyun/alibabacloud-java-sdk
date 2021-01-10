// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class VerifyLiveDomainOwnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    public static VerifyLiveDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyLiveDomainOwnerResponseBody self = new VerifyLiveDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyLiveDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyLiveDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
