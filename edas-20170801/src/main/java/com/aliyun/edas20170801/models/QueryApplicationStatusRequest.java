// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryApplicationStatusRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static QueryApplicationStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationStatusRequest self = new QueryApplicationStatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationStatusRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
