// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageScanFeedbackResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ImageScanFeedbackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImageScanFeedbackResponseBody self = new ImageScanFeedbackResponseBody();
        return TeaModel.build(map, self);
    }

    public ImageScanFeedbackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
