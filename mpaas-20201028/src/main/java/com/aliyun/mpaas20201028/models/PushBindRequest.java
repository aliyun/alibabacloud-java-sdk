// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushBindRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeliveryToken")
    public String deliveryToken;

    @NameInMap("OsType")
    public Integer osType;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushBindRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBindRequest self = new PushBindRequest();
        return TeaModel.build(map, self);
    }

    public PushBindRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushBindRequest setDeliveryToken(String deliveryToken) {
        this.deliveryToken = deliveryToken;
        return this;
    }
    public String getDeliveryToken() {
        return this.deliveryToken;
    }

    public PushBindRequest setOsType(Integer osType) {
        this.osType = osType;
        return this;
    }
    public Integer getOsType() {
        return this.osType;
    }

    public PushBindRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PushBindRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PushBindRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
