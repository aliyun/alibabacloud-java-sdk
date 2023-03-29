// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class VerifyDomainOwnerResponseBody extends TeaModel {
    /**
     * <p>The verification result.</p>
     * <br>
     * <p>> This parameter is returned only if the operation fails.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyDomainOwnerResponseBody self = new VerifyDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public VerifyDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
