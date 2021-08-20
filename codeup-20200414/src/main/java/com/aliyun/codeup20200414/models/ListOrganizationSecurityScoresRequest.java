// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListOrganizationSecurityScoresRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    public static ListOrganizationSecurityScoresRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationSecurityScoresRequest self = new ListOrganizationSecurityScoresRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationSecurityScoresRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
