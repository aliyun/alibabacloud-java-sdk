// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class InsertMediaToSearchLibResponseBody extends TeaModel {
    @NameInMap("MediaId")
    public String mediaId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InsertMediaToSearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertMediaToSearchLibResponseBody self = new InsertMediaToSearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertMediaToSearchLibResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public InsertMediaToSearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
