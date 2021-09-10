// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteViewRequest extends TeaModel {
    @NameInMap("ViewName")
    public String viewName;

    @NameInMap("AppGuid")
    public String appGuid;

    public static DeleteViewRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteViewRequest self = new DeleteViewRequest();
        return TeaModel.build(map, self);
    }

    public DeleteViewRequest setViewName(String viewName) {
        this.viewName = viewName;
        return this;
    }
    public String getViewName() {
        return this.viewName;
    }

    public DeleteViewRequest setAppGuid(String appGuid) {
        this.appGuid = appGuid;
        return this;
    }
    public String getAppGuid() {
        return this.appGuid;
    }

}
