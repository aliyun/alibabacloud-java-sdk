// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainTranscodeParamsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainTranscodeParamsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainTranscodeParamsResponseBody self = new DescribeLiveDomainTranscodeParamsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainTranscodeParamsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
