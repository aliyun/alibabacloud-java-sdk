// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnVerifyContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    public static DescribeDcdnVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnVerifyContentResponseBody self = new DescribeDcdnVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
