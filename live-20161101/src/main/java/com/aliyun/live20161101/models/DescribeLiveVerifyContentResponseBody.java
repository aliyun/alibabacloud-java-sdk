// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveVerifyContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Content")
    public String content;

    public static DescribeLiveVerifyContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveVerifyContentResponseBody self = new DescribeLiveVerifyContentResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveVerifyContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveVerifyContentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
