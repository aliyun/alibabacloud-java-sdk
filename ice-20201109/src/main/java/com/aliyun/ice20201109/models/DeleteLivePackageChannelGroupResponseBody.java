// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteLivePackageChannelGroupResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLivePackageChannelGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageChannelGroupResponseBody self = new DeleteLivePackageChannelGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageChannelGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
