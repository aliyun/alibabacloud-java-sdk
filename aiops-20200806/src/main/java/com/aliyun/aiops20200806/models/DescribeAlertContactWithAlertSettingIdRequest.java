// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertContactWithAlertSettingIdRequest extends TeaModel {
    @NameInMap("ContactType")
    public Long contactType;

    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    public static DescribeAlertContactWithAlertSettingIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertContactWithAlertSettingIdRequest self = new DescribeAlertContactWithAlertSettingIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertContactWithAlertSettingIdRequest setContactType(Long contactType) {
        this.contactType = contactType;
        return this;
    }
    public Long getContactType() {
        return this.contactType;
    }

    public DescribeAlertContactWithAlertSettingIdRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

}
