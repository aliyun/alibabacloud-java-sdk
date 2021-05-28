// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class CreateAlertContactRequest extends TeaModel {
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("Email")
    public String email;

    @NameInMap("DingRobotWebhookUrl")
    public String dingRobotWebhookUrl;

    @NameInMap("SystemNoc")
    public Boolean systemNoc;

    @NameInMap("RegionId")
    public String regionId;

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

    public CreateAlertContactRequest setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }

    public CreateAlertContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateAlertContactRequest setDingRobotWebhookUrl(String dingRobotWebhookUrl) {
        this.dingRobotWebhookUrl = dingRobotWebhookUrl;
        return this;
    }
    public String getDingRobotWebhookUrl() {
        return this.dingRobotWebhookUrl;
    }

    public CreateAlertContactRequest setSystemNoc(Boolean systemNoc) {
        this.systemNoc = systemNoc;
        return this;
    }
    public Boolean getSystemNoc() {
        return this.systemNoc;
    }

    public CreateAlertContactRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
