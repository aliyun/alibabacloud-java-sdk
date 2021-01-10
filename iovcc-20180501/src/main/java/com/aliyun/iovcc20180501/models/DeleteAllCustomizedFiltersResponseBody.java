// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteAllCustomizedFiltersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAllCustomizedFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllCustomizedFiltersResponseBody self = new DeleteAllCustomizedFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAllCustomizedFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
