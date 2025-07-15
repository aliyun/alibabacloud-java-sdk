// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddRtsLiveStreamTranscodeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddRtsLiveStreamTranscodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRtsLiveStreamTranscodeResponseBody self = new AddRtsLiveStreamTranscodeResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRtsLiveStreamTranscodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
