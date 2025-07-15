// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class VerifyLiveDomainOwnerResponseBody extends TeaModel {
    /**
     * <p>The verification information.</p>
     * 
     * <strong>example:</strong>
     * <p>verify_dffeb6610035dcb77b413******</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1BA6D7CE-55F1-5926-8764-F8663473AD0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static VerifyLiveDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyLiveDomainOwnerResponseBody self = new VerifyLiveDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyLiveDomainOwnerResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public VerifyLiveDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
