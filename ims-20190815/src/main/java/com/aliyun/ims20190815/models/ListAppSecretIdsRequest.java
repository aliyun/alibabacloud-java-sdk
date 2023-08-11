// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ListAppSecretIdsRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static ListAppSecretIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppSecretIdsRequest self = new ListAppSecretIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppSecretIdsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
