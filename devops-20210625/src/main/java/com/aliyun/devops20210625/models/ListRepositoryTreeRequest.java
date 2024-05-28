// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryTreeRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    @NameInMap("path")
    public String path;

    @NameInMap("refName")
    public String refName;

    @NameInMap("type")
    public String type;

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

    public ListRepositoryTreeRequest setRefName(String refName) {
        this.refName = refName;
        return this;
    }
    public String getRefName() {
        return this.refName;
    }

    public ListRepositoryTreeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
