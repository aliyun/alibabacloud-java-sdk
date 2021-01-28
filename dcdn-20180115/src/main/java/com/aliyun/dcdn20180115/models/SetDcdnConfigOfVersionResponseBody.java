// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnConfigOfVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDcdnConfigOfVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnConfigOfVersionResponseBody self = new SetDcdnConfigOfVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDcdnConfigOfVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
