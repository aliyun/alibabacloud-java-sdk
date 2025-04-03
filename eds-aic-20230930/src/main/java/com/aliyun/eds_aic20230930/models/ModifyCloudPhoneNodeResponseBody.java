// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ModifyCloudPhoneNodeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7B9EFA4F-4305-5968-BAEE-BD8B8DE5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyCloudPhoneNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudPhoneNodeResponseBody self = new ModifyCloudPhoneNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCloudPhoneNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
