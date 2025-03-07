// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageChannelResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20B3A1B6-4BD2-5DE6-BCBC-098C9B4F4E91</p>
     */
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
