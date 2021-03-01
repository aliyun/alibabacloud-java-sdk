// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListHistoryDeployVersionRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListHistoryDeployVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHistoryDeployVersionRequest self = new ListHistoryDeployVersionRequest();
        return TeaModel.build(map, self);
    }

    public ListHistoryDeployVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
