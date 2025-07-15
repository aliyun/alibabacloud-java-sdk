// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveRecordVodConfigResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>61C96B9A-F203-4EC5-8E43-CB92E68F67DF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveRecordVodConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRecordVodConfigResponseBody self = new UpdateLiveRecordVodConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRecordVodConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
