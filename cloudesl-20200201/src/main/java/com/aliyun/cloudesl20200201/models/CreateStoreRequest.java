// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class CreateStoreRequest extends TeaModel {
    @NameInMap("AutoUnbindDays")
    public Integer autoUnbindDays;

    @NameInMap("AutoUnbindOfflineEsl")
    public Boolean autoUnbindOfflineEsl;

    @NameInMap("BarCodeEncode")
    public Integer barCodeEncode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ExtraParams")
    public String extraParams;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("StoreName")
    public String storeName;

    @NameInMap("TimeZone")
    public String timeZone;

    @NameInMap("UserStoreCode")
    public String userStoreCode;

    public static CreateStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStoreRequest self = new CreateStoreRequest();
        return TeaModel.build(map, self);
    }

    public CreateStoreRequest setAutoUnbindDays(Integer autoUnbindDays) {
        this.autoUnbindDays = autoUnbindDays;
        return this;
    }
    public Integer getAutoUnbindDays() {
        return this.autoUnbindDays;
    }

    public CreateStoreRequest setAutoUnbindOfflineEsl(Boolean autoUnbindOfflineEsl) {
        this.autoUnbindOfflineEsl = autoUnbindOfflineEsl;
        return this;
    }
    public Boolean getAutoUnbindOfflineEsl() {
        return this.autoUnbindOfflineEsl;
    }

    public CreateStoreRequest setBarCodeEncode(Integer barCodeEncode) {
        this.barCodeEncode = barCodeEncode;
        return this;
    }
    public Integer getBarCodeEncode() {
        return this.barCodeEncode;
    }

    public CreateStoreRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateStoreRequest setExtraParams(String extraParams) {
        this.extraParams = extraParams;
        return this;
    }
    public String getExtraParams() {
        return this.extraParams;
    }

    public CreateStoreRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateStoreRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateStoreRequest setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }
    public String getStoreName() {
        return this.storeName;
    }

    public CreateStoreRequest setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public CreateStoreRequest setUserStoreCode(String userStoreCode) {
        this.userStoreCode = userStoreCode;
        return this;
    }
    public String getUserStoreCode() {
        return this.userStoreCode;
    }

}
