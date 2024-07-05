// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class QueryStoriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3Qx****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>2C5C1E0F-D8B8-4DA0-8127-EC32C771****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Stories")
    public java.util.List<Story> stories;

    public static QueryStoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStoriesResponseBody self = new QueryStoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryStoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStoriesResponseBody setStories(java.util.List<Story> stories) {
        this.stories = stories;
        return this;
    }
    public java.util.List<Story> getStories() {
        return this.stories;
    }

}
