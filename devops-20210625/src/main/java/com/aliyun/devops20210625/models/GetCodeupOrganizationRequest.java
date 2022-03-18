// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCodeupOrganizationRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    public static GetCodeupOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCodeupOrganizationRequest self = new GetCodeupOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public GetCodeupOrganizationRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
