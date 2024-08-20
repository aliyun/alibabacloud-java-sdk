// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafGroupResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>79B78B62-9006-5D6A-9DAB-303E134CD7AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDcdnWafGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafGroupResponseBody self = new ModifyDcdnWafGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
