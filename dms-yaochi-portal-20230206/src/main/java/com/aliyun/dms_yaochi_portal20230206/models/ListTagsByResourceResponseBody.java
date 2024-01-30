// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_yaochi_portal20230206.models;

import com.aliyun.tea.*;

public class ListTagsByResourceResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListTagsByResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsByResourceResponseBody self = new ListTagsByResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsByResourceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ListTagsByResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
