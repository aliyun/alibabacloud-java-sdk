// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    public static VerifyDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyDomainOwnerResponseBody self = new VerifyDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
