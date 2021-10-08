// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingRequest extends TeaModel {
    // 报警设置ID
    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    public static DeleteAlertSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertSettingRequest self = new DeleteAlertSettingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertSettingRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

}
