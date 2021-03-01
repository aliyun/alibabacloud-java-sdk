// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationEcuRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListApplicationEcuRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationEcuRequest self = new ListApplicationEcuRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationEcuRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
