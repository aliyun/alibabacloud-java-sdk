// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteIpControlResponseBody extends TeaModel {
    /**
     * <p>Deletes an access control list (ACL).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpControlResponseBody self = new DeleteIpControlResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
