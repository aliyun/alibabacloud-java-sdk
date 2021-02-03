// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaInfoResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // ICE媒资ID
    @NameInMap("MediaId")
    public String mediaId;

    public static UpdateMediaInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaInfoResponseBody self = new UpdateMediaInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMediaInfoResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
