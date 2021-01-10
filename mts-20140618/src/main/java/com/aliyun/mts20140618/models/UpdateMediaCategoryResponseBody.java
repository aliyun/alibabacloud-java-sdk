// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateMediaCategoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateMediaCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaCategoryResponseBody self = new UpdateMediaCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMediaCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
