// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DeleteUserWhiteListByTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteUserWhiteListByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserWhiteListByTypeResponseBody self = new DeleteUserWhiteListByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteUserWhiteListByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
