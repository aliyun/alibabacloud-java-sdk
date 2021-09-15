// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ListAppModulesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    public static ListAppModulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppModulesRequest self = new ListAppModulesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppModulesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
