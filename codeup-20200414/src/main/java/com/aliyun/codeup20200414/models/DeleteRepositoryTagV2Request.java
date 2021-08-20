// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryTagV2Request extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("TagName")
    public String tagName;

    public static DeleteRepositoryTagV2Request build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryTagV2Request self = new DeleteRepositoryTagV2Request();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryTagV2Request setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public DeleteRepositoryTagV2Request setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DeleteRepositoryTagV2Request setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
