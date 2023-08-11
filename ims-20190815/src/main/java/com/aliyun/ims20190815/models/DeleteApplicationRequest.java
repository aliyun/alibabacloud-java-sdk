// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationRequest self = new DeleteApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
