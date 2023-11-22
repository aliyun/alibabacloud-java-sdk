// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaFromSearchLibResponseBody extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteMediaFromSearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaFromSearchLibResponseBody self = new DeleteMediaFromSearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMediaFromSearchLibResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public DeleteMediaFromSearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
