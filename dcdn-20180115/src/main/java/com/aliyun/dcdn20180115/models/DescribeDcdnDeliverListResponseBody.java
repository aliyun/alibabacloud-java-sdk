// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDeliverListResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDeliverListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDeliverListResponseBody self = new DescribeDcdnDeliverListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDeliverListResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeDcdnDeliverListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
