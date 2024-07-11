// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyInstanceNameResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>959DA199-54E5-569D-AD46-92BED8515E62</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNameResponseBody self = new ModifyInstanceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
