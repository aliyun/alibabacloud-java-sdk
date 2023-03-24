// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessApplicationRequest extends TeaModel {
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
