// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SetSuppressionListLevelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SuppressionListLevel")
    public String suppressionListLevel;

    public static SetSuppressionListLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetSuppressionListLevelResponseBody self = new SetSuppressionListLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public SetSuppressionListLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetSuppressionListLevelResponseBody setSuppressionListLevel(String suppressionListLevel) {
        this.suppressionListLevel = suppressionListLevel;
        return this;
    }
    public String getSuppressionListLevel() {
        return this.suppressionListLevel;
    }

}
