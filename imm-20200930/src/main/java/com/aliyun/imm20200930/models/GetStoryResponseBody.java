// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetStoryResponseBody extends TeaModel {
    // Id of the request
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
