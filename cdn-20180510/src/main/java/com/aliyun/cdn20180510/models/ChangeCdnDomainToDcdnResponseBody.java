// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ChangeCdnDomainToDcdnResponseBody extends TeaModel {
    /**
     * <p>The content of the migration instructions.</p>
     */
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ChangeCdnDomainToDcdnResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeCdnDomainToDcdnResponseBody self = new ChangeCdnDomainToDcdnResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeCdnDomainToDcdnResponseBody setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public ChangeCdnDomainToDcdnResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
