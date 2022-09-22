// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaMarksResponseBody extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("MediaMarkIds")
    public String mediaMarkIds;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaMarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaMarksResponseBody self = new DeleteMediaMarksResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaMarksResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeleteMediaMarksResponseBody setMediaMarkIds(String mediaMarkIds) {
        this.mediaMarkIds = mediaMarkIds;
        return this;
    }
    public String getMediaMarkIds() {
        return this.mediaMarkIds;
    }

    public DeleteMediaMarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
