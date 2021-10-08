// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeAlertBusinessGroupWithAlertSettingIdRequest extends TeaModel {
    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    public static DescribeAlertBusinessGroupWithAlertSettingIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertBusinessGroupWithAlertSettingIdRequest self = new DescribeAlertBusinessGroupWithAlertSettingIdRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertBusinessGroupWithAlertSettingIdRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

}
