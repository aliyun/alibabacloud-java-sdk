// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class TagLiveResourcesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static TagLiveResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        TagLiveResourcesResponse self = new TagLiveResourcesResponse();
        return TeaModel.build(map, self);
    }

    public TagLiveResourcesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
