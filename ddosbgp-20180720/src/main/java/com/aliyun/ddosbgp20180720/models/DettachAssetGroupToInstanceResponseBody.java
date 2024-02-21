// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DettachAssetGroupToInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DettachAssetGroupToInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DettachAssetGroupToInstanceResponseBody self = new DettachAssetGroupToInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DettachAssetGroupToInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
