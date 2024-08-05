// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceSpecResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36BBBAD4-1CFB-489F-841A-8CA52EEA787E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceSpecResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceSpecResponseBody self = new ModifyInstanceSpecResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceSpecResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
