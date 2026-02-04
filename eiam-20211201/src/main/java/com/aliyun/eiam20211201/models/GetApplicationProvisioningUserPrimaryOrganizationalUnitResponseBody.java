// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>ou_12121xxxxxx</p>
     */
    @NameInMap("UserPrimaryOrganizationalUnitId")
    public String userPrimaryOrganizationalUnitId;

    public static GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody self = new GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody setUserPrimaryOrganizationalUnitId(String userPrimaryOrganizationalUnitId) {
        this.userPrimaryOrganizationalUnitId = userPrimaryOrganizationalUnitId;
        return this;
    }
    public String getUserPrimaryOrganizationalUnitId() {
        return this.userPrimaryOrganizationalUnitId;
    }

}
