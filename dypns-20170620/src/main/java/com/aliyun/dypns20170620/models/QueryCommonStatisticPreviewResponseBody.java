// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryCommonStatisticPreviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static QueryCommonStatisticPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCommonStatisticPreviewResponseBody self = new QueryCommonStatisticPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCommonStatisticPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCommonStatisticPreviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCommonStatisticPreviewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
