// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateConfigurationVariateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateConfigurationVariateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigurationVariateResponseBody self = new UpdateConfigurationVariateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateConfigurationVariateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
