// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLivePackageConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05D00B48-DF50-5DC0-A07D-A250DFAE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddLivePackageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLivePackageConfigResponseBody self = new AddLivePackageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLivePackageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
