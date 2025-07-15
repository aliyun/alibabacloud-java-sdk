// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCdnDiagnoseInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveCdnDiagnoseInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCdnDiagnoseInfoResponseBody self = new DescribeLiveCdnDiagnoseInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCdnDiagnoseInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
