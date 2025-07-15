// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEventSubRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9qb1****</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListEventSubRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEventSubRequest self = new ListEventSubRequest();
        return TeaModel.build(map, self);
    }

    public ListEventSubRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
