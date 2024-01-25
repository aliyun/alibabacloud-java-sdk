// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingRequest extends TeaModel {
    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    @NameInMap("OperaUid")
    public String operaUid;

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

    public DeleteAlertSettingRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
