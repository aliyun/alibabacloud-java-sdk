// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnDomainResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDcdnDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnDomainResponseBody self = new UpdateDcdnDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
