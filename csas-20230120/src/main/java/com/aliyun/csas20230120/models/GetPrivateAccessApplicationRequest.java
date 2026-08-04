// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the internal-facing access application. You can obtain the value from:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: Lists internal-facing access applications.</li>
     * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: Creates an internal-facing access application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    public static GetPrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessApplicationRequest self = new GetPrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
