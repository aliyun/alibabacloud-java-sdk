// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListOauthAccessRequest extends TeaModel {
    @NameInMap("RepoType")
    @Validation(required = true)
    public String repoType;

    public static ListOauthAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOauthAccessRequest self = new ListOauthAccessRequest();
        return TeaModel.build(map, self);
    }

    public ListOauthAccessRequest setRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }
    public String getRepoType() {
        return this.repoType;
    }

}
