// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageSyncScanResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ImageSyncScanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageSyncScanResponseBody self = new ImageSyncScanResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageSyncScanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
