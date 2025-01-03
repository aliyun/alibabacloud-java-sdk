// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListOrganizationsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("accessLevel")
    public Integer accessLevel;

    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("minAccessLevel")
    public Integer minAccessLevel;

    public static ListOrganizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrganizationsRequest self = new ListOrganizationsRequest();
        return TeaModel.build(map, self);
    }

    public ListOrganizationsRequest setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    public ListOrganizationsRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListOrganizationsRequest setMinAccessLevel(Integer minAccessLevel) {
        this.minAccessLevel = minAccessLevel;
        return this;
    }
    public Integer getMinAccessLevel() {
        return this.minAccessLevel;
    }

}
