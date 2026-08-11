// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetNacPortalSmsPhoneWhitelistResponseBody extends TeaModel {
    /**
     * <p>The list of phone numbers.</p>
     */
    @NameInMap("Phones")
    public java.util.List<String> phones;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B608C6AE-623D-55C4-9454-601B88AE937E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetNacPortalSmsPhoneWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNacPortalSmsPhoneWhitelistResponseBody self = new GetNacPortalSmsPhoneWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNacPortalSmsPhoneWhitelistResponseBody setPhones(java.util.List<String> phones) {
        this.phones = phones;
        return this;
    }
    public java.util.List<String> getPhones() {
        return this.phones;
    }

    public GetNacPortalSmsPhoneWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
