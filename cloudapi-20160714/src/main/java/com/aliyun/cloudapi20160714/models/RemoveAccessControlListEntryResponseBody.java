// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveAccessControlListEntryResponseBody extends TeaModel {
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
