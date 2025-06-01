// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the office application. You can obtain the value by calling the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: queries office applications.</li>
     * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an office application.</li>
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
