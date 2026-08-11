// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateNacPortalSmsPhoneWhitelistResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4D169859-A4F2-5EC8-853B-8447787C0D8A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNacPortalSmsPhoneWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacPortalSmsPhoneWhitelistResponseBody self = new UpdateNacPortalSmsPhoneWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNacPortalSmsPhoneWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
