// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DettachAssetGroupToInstanceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E54BA258-9DE8-59BE-B7A8-DAD28E6E8DAF</p>
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
