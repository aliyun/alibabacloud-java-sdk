// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAppKeyRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>110840611</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The AppKey of the application. The AppKey is used for calling an API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>203708622</p>
     */
    @NameInMap("AppKey")
    public String appKey;

    public static DeleteAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppKeyRequest self = new DeleteAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppKeyRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppKeyRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

}
