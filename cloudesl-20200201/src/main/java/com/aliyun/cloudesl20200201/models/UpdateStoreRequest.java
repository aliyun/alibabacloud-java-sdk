// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class UpdateStoreRequest extends TeaModel {
    @NameInMap("AutoUnbindDays")
    public Integer autoUnbindDays;

    @NameInMap("AutoUnbindOfflineEsl")
    public Boolean autoUnbindOfflineEsl;

    @NameInMap("BarCodeEncode")
    public Integer barCodeEncode;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("StoreId")
    public String storeId;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    @NameInMap("Timezone")
    public String timezone;

    @NameInMap("UserStoreCode")
    public String userStoreCode;

    public static UpdateStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStoreRequest self = new UpdateStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStoreRequest setAutoUnbindDays(Integer autoUnbindDays) {
        this.autoUnbindDays = autoUnbindDays;
        return this;
    }
    public Integer getAutoUnbindDays() {
        return this.autoUnbindDays;
    }

    public UpdateStoreRequest setAutoUnbindOfflineEsl(Boolean autoUnbindOfflineEsl) {
        this.autoUnbindOfflineEsl = autoUnbindOfflineEsl;
        return this;
    }
    public Boolean getAutoUnbindOfflineEsl() {
        return this.autoUnbindOfflineEsl;
    }

    public UpdateStoreRequest setBarCodeEncode(Integer barCodeEncode) {
        this.barCodeEncode = barCodeEncode;
        return this;
    }
    public Integer getBarCodeEncode() {
        return this.barCodeEncode;
    }

    public UpdateStoreRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public UpdateStoreRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateStoreRequest setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public UpdateStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public UpdateStoreRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public UpdateStoreRequest setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public UpdateStoreRequest setUserStoreCode(String userStoreCode) {
        this.userStoreCode = userStoreCode;
        return this;
    }
    public String getUserStoreCode() {
        return this.userStoreCode;
    }

}
