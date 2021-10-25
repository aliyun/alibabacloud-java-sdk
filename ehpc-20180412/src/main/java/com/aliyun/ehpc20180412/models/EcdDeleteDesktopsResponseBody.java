// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class EcdDeleteDesktopsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static EcdDeleteDesktopsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EcdDeleteDesktopsResponseBody self = new EcdDeleteDesktopsResponseBody();
        return TeaModel.build(map, self);
    }

    public EcdDeleteDesktopsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
