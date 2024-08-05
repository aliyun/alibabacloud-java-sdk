// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveAccessControlListEntryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>D1B18FFE-4A81-59D8-AA02-1817098977CD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemoveAccessControlListEntryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessControlListEntryResponseBody self = new RemoveAccessControlListEntryResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveAccessControlListEntryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
