// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class SearchNodesByOutputResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("RequestId")
    public String requestId;

    public static SearchNodesByOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchNodesByOutputResponseBody self = new SearchNodesByOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchNodesByOutputResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public SearchNodesByOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
