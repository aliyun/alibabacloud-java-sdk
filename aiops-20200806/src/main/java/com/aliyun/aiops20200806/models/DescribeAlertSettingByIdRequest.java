// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertSettingByIdRequest extends TeaModel {
    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    public static DescribeAlertSettingByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertSettingByIdRequest self = new DescribeAlertSettingByIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertSettingByIdRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

}
