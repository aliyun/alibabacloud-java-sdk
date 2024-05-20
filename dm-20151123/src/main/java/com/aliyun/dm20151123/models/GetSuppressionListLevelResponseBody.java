// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSuppressionListLevelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuppressionListLevel")
    public String suppressionListLevel;

    public static GetSuppressionListLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSuppressionListLevelResponseBody self = new GetSuppressionListLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSuppressionListLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSuppressionListLevelResponseBody setSuppressionListLevel(String suppressionListLevel) {
        this.suppressionListLevel = suppressionListLevel;
        return this;
    }
    public String getSuppressionListLevel() {
        return this.suppressionListLevel;
    }

}
