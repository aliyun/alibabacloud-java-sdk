// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListPredefinedScopesRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    public static ListPredefinedScopesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPredefinedScopesRequest self = new ListPredefinedScopesRequest();
        return TeaModel.build(map, self);
    }

    public ListPredefinedScopesRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

}
