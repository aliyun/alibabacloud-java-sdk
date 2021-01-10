// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateCategoryNameResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateCategoryNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCategoryNameResponseBody self = new UpdateCategoryNameResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCategoryNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
