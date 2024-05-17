// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sApplicationBaseInfoRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The description of the application. The description can be up to 256 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The email address of the application owner.</p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The owner of the application. The value can be up to 128 characters in length.</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The phone number of the application owner.</p>
     */
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
