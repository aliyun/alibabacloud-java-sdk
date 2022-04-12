// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sApplicationBaseInfoRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Email")
    public String email;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static UpdateK8sApplicationBaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sApplicationBaseInfoRequest self = new UpdateK8sApplicationBaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateK8sApplicationBaseInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateK8sApplicationBaseInfoRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateK8sApplicationBaseInfoRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public UpdateK8sApplicationBaseInfoRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateK8sApplicationBaseInfoRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
