// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLivePackageConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>72ABAD7B-B14C-52DE-B6C6-C639FECAF5AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLivePackageConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLivePackageConfigResponseBody self = new DeleteLivePackageConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLivePackageConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
