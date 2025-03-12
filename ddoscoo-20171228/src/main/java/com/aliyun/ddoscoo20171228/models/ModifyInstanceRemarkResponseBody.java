// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class ModifyInstanceRemarkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceRemarkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceRemarkResponseBody self = new ModifyInstanceRemarkResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceRemarkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
