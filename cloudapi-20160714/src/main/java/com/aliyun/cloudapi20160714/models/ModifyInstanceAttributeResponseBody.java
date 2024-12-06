// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttributeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F3186326-2C57-58E1-B6E9-XXXXXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyInstanceAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttributeResponseBody self = new ModifyInstanceAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
