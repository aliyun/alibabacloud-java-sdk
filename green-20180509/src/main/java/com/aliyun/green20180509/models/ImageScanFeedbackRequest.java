// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class ImageScanFeedbackRequest extends TeaModel {
    @NameInMap("ClientInfo")
    public String clientInfo;

    public static ImageScanFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageScanFeedbackRequest self = new ImageScanFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public ImageScanFeedbackRequest setClientInfo(String clientInfo) {
        this.clientInfo = clientInfo;
        return this;
    }
    public String getClientInfo() {
        return this.clientInfo;
    }

}
