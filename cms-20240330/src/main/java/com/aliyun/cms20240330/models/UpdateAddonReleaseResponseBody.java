// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAddonReleaseResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9F00A7AF-2728-5424-B321-79D39C00A1EC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateAddonReleaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAddonReleaseResponseBody self = new UpdateAddonReleaseResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAddonReleaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
