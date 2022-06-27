// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateContactRequest extends TeaModel {
    // 告警联系人ID
    @NameInMap("ContactId")
    public Long contactId;

    // 告警联系人名称
    @NameInMap("ContactName")
    public String contactName;

    // 告警联系人邮箱
    @NameInMap("Email")
    public String email;

    // 告警联系人手机号码
    @NameInMap("Phone")
    public String phone;

    // 电话通知失败补发类型：0. 不补发   1. 重复拨打一次电话   2. 发送短信通知   3. 使用全局默认值（当前为不补发）
    @NameInMap("ReissueSendNotice")
    public Long reissueSendNotice;

    public static CreateOrUpdateContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateContactRequest self = new CreateOrUpdateContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public CreateOrUpdateContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateOrUpdateContactRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public CreateOrUpdateContactRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateOrUpdateContactRequest setReissueSendNotice(Long reissueSendNotice) {
        this.reissueSendNotice = reissueSendNotice;
        return this;
    }
    public Long getReissueSendNotice() {
        return this.reissueSendNotice;
    }

}
