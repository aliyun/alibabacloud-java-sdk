// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetStoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1B3D5E0A-D8B8-4DA0-8127-ED32C851****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Story")
    public Story story;

    public static GetStoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStoryResponseBody self = new GetStoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStoryResponseBody setStory(Story story) {
        this.story = story;
        return this;
    }
    public Story getStory() {
        return this.story;
    }

}
