// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSecurityGroupPermissionsResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSecurityGroupPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityGroupPermissionsResponseBody self = new CreateSecurityGroupPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityGroupPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
