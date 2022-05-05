// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTagNamesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    public static SearchTagNamesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchTagNamesResponseBody self = new SearchTagNamesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchTagNamesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchTagNamesResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

}
