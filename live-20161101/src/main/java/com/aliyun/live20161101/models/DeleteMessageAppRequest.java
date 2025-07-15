// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteMessageAppRequest extends TeaModel {
    /**
     * <p>The ID of the interactive messaging application that you want to delete. You can specify only one ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VKL3***</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static DeleteMessageAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMessageAppRequest self = new DeleteMessageAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMessageAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
