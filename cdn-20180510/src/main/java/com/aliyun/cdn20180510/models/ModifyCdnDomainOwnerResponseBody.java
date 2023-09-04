// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainOwnerResponseBody extends TeaModel {
    /**
     * <p>Procedure</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCdnDomainOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainOwnerResponseBody self = new ModifyCdnDomainOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainOwnerResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public ModifyCdnDomainOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
