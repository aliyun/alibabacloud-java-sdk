// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DeleteStorageVolumeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>853D6E71-E087-1557-B65C-32BFBEE5CD97</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteStorageVolumeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteStorageVolumeResponseBody self = new DeleteStorageVolumeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteStorageVolumeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
