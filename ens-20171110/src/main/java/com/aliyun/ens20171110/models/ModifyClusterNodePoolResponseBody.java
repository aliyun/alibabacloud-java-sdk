// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyClusterNodePoolResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyClusterNodePoolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterNodePoolResponseBody self = new ModifyClusterNodePoolResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyClusterNodePoolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
