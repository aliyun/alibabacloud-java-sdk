// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class UpdateGlobalEventsStorageRegionResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGlobalEventsStorageRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGlobalEventsStorageRegionResponseBody self = new UpdateGlobalEventsStorageRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGlobalEventsStorageRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
