// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaMarksResponseBody extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaMarkIds")
    public String mediaMarkIds;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaMarksResponseBody self = new UpdateMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UpdateMediaMarksResponseBody setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    public UpdateMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
