// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLivePackageConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLivePackageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLivePackageConfigResponseBody self = new UpdateLivePackageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLivePackageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
