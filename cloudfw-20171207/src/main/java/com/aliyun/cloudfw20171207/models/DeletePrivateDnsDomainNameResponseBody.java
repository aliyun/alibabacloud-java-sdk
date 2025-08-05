// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeletePrivateDnsDomainNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-0009012****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrivateDnsDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateDnsDomainNameResponseBody self = new DeletePrivateDnsDomainNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrivateDnsDomainNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
