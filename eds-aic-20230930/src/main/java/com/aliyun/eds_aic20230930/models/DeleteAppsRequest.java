// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteAppsRequest extends TeaModel {
    @NameInMap("AppIdList")
    public java.util.List<String> appIdList;

    public static DeleteAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppsRequest self = new DeleteAppsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppsRequest setAppIdList(java.util.List<String> appIdList) {
        this.appIdList = appIdList;
        return this;
    }
    public java.util.List<String> getAppIdList() {
        return this.appIdList;
    }

}
