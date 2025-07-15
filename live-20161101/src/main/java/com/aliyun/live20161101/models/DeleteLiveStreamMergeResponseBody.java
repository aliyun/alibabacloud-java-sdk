// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamMergeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB9*********</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveStreamMergeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamMergeResponseBody self = new DeleteLiveStreamMergeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamMergeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
