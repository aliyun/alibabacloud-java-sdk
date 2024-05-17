// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushUnBindRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeliveryToken")
    public String deliveryToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushUnBindRequest build(java.util.Map<String, ?> map) throws Exception {
        PushUnBindRequest self = new PushUnBindRequest();
        return TeaModel.build(map, self);
    }

    public PushUnBindRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushUnBindRequest setDeliveryToken(String deliveryToken) {
        this.deliveryToken = deliveryToken;
        return this;
    }
    public String getDeliveryToken() {
        return this.deliveryToken;
    }

    public PushUnBindRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushUnBindRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
