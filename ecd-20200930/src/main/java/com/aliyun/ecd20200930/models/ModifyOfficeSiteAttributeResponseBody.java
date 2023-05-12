// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyOfficeSiteAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteAttributeResponseBody self = new ModifyOfficeSiteAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
