// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cddc20200320.models;

import com.aliyun.tea.*;

public class TagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static TagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResponseBody self = new TagResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
