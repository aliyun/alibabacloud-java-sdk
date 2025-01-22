// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLivePackageChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageChannelResponseBody self = new DeleteLivePackageChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
