// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteIpfilterByEdmIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIpfilterByEdmIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpfilterByEdmIdResponseBody self = new DeleteIpfilterByEdmIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIpfilterByEdmIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
