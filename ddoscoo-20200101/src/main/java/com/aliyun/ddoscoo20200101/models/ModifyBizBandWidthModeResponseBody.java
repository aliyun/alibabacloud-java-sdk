// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyBizBandWidthModeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyBizBandWidthModeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizBandWidthModeResponseBody self = new ModifyBizBandWidthModeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyBizBandWidthModeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
