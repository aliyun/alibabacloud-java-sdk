// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryTreeRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("Path")
    public String path;

    @NameInMap("Type")
    public String type;

    @NameInMap("RefName")
    public String refName;

    @NameInMap("SubUserId")
    public String subUserId;

    public static ListRepositoryTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryTreeRequest self = new ListRepositoryTreeRequest();
        return TeaModel.build(map, self);
    }

    public ListRepositoryTreeRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public ListRepositoryTreeRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public ListRepositoryTreeRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListRepositoryTreeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListRepositoryTreeRequest setRefName(String refName) {
        this.refName = refName;
        return this;
    }
    public String getRefName() {
        return this.refName;
    }

    public ListRepositoryTreeRequest setSubUserId(String subUserId) {
        this.subUserId = subUserId;
        return this;
    }
    public String getSubUserId() {
        return this.subUserId;
    }

}
