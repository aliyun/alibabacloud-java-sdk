// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class ListTagsAllResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTagsAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsAllResponseBody self = new ListTagsAllResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsAllResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListTagsAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
