// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetLatestCommitRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static GetLatestCommitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLatestCommitRequest self = new GetLatestCommitRequest();
        return TeaModel.build(map, self);
    }

    public GetLatestCommitRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
