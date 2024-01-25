// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateStoreConfigRequest extends TeaModel {
    @NameInMap("EnableNotification")
    public Boolean enableNotification;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("NotificationSilentTimes")
    public String notificationSilentTimes;

    @NameInMap("NotificationWebHook")
    public String notificationWebHook;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("SubscribeContents")
    public String subscribeContents;

    public static UpdateStoreConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreConfigRequest self = new UpdateStoreConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoreConfigRequest setEnableNotification(Boolean enableNotification) {
        this.enableNotification = enableNotification;
        return this;
    }
    public Boolean getEnableNotification() {
        return this.enableNotification;
    }

    public UpdateStoreConfigRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public UpdateStoreConfigRequest setNotificationSilentTimes(String notificationSilentTimes) {
        this.notificationSilentTimes = notificationSilentTimes;
        return this;
    }
    public String getNotificationSilentTimes() {
        return this.notificationSilentTimes;
    }

    public UpdateStoreConfigRequest setNotificationWebHook(String notificationWebHook) {
        this.notificationWebHook = notificationWebHook;
        return this;
    }
    public String getNotificationWebHook() {
        return this.notificationWebHook;
    }

    public UpdateStoreConfigRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public UpdateStoreConfigRequest setSubscribeContents(String subscribeContents) {
        this.subscribeContents = subscribeContents;
        return this;
    }
    public String getSubscribeContents() {
        return this.subscribeContents;
    }

}
