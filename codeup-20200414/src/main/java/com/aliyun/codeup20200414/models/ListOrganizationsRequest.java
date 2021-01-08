// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListOrganizationsRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("AccessLevel")
    public Integer accessLevel;

    @NameInMap("MinAccessLevel")
    public Integer minAccessLevel;

    public static ListOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationsRequest self = new ListOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListOrganizationsRequest setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    public ListOrganizationsRequest setMinAccessLevel(Integer minAccessLevel) {
        this.minAccessLevel = minAccessLevel;
        return this;
    }
    public Integer getMinAccessLevel() {
        return this.minAccessLevel;
    }

}
