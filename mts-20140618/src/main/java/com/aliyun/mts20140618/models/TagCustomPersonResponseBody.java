// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class TagCustomPersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagCustomPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagCustomPersonResponseBody self = new TagCustomPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public TagCustomPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
