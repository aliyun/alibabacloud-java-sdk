// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactRequest extends TeaModel {
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("DingRobotWebhookUrl")
    public String dingRobotWebhookUrl;

    @NameInMap("Email")
    public String email;

    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("SystemNoc")
    public Boolean systemNoc;

    public static CreateAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactRequest self = new CreateAlertContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateAlertContactRequest setDingRobotWebhookUrl(String dingRobotWebhookUrl) {
        this.dingRobotWebhookUrl = dingRobotWebhookUrl;
        return this;
    }
    public String getDingRobotWebhookUrl() {
        return this.dingRobotWebhookUrl;
    }

    public CreateAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateAlertContactRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateAlertContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAlertContactRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAlertContactRequest setSystemNoc(Boolean systemNoc) {
        this.systemNoc = systemNoc;
        return this;
    }
    public Boolean getSystemNoc() {
        return this.systemNoc;
    }

}
