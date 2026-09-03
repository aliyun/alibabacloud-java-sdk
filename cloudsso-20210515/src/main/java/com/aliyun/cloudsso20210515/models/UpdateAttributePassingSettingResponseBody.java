// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class UpdateAttributePassingSettingResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>63160579-2E1B-57B0-8273-B27427172385</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAttributePassingSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttributePassingSettingResponseBody self = new UpdateAttributePassingSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAttributePassingSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
