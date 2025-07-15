// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAISubtitleResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0df228-4a64-af62-20e91b96****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the subtitle template.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("SubtitleId")
    public String subtitleId;

    public static AddLiveAISubtitleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAISubtitleResponseBody self = new AddLiveAISubtitleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddLiveAISubtitleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddLiveAISubtitleResponseBody setSubtitleId(String subtitleId) {
        this.subtitleId = subtitleId;
        return this;
    }
    public String getSubtitleId() {
        return this.subtitleId;
    }

}
