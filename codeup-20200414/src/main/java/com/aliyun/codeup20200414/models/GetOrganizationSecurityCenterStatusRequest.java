// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetOrganizationSecurityCenterStatusRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    public static GetOrganizationSecurityCenterStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationSecurityCenterStatusRequest self = new GetOrganizationSecurityCenterStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetOrganizationSecurityCenterStatusRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
