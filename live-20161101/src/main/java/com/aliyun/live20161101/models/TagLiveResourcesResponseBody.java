// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class TagLiveResourcesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagLiveResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagLiveResourcesResponseBody self = new TagLiveResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagLiveResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
