// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DeleteIpResponseBody extends TeaModel {
    /**
     * <p>Removes specific IP addresses from an Anti-DDoS Origin Enterprise instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpResponseBody self = new DeleteIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
