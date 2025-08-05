// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeletePrivateDnsAllDomainNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>B2841452-CB8D-4F7D-B247-38E1CF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeletePrivateDnsAllDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateDnsAllDomainNameResponseBody self = new DeletePrivateDnsAllDomainNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePrivateDnsAllDomainNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
