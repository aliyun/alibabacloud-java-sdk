// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class SwitchApiForInnerResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchApiForInnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchApiForInnerResponseBody self = new SwitchApiForInnerResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchApiForInnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
