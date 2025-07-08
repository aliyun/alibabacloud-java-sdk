// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class SelectTagResourceNewResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public SelectTagResourceNewResponseBodyTags tags;

    public static SelectTagResourceNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SelectTagResourceNewResponseBody self = new SelectTagResourceNewResponseBody();
        return TeaModel.build(map, self);
    }

    public SelectTagResourceNewResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public SelectTagResourceNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SelectTagResourceNewResponseBody setTags(SelectTagResourceNewResponseBodyTags tags) {
        this.tags = tags;
        return this;
    }
    public SelectTagResourceNewResponseBodyTags getTags() {
        return this.tags;
    }

    public static class SelectTagResourceNewResponseBodyTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static SelectTagResourceNewResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            SelectTagResourceNewResponseBodyTags self = new SelectTagResourceNewResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public SelectTagResourceNewResponseBodyTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

}
