// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class VerifyDcdnDomainOwnerResponseBody extends TeaModel {
    /**
     * <p>The verification result.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyDcdnDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyDcdnDomainOwnerResponseBody self = new VerifyDcdnDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyDcdnDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public VerifyDcdnDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
