// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertSettingStatusRequest extends TeaModel {
    // 报警设置id
    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    // 报警设置状态0:禁用1:启用
    @NameInMap("SettingStatus")
    public Long settingStatus;

    @NameInMap("OperaUid")
    public String operaUid;

    public static PutAlertSettingStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertSettingStatusRequest self = new PutAlertSettingStatusRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertSettingStatusRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    public PutAlertSettingStatusRequest setSettingStatus(Long settingStatus) {
        this.settingStatus = settingStatus;
        return this;
    }
    public Long getSettingStatus() {
        return this.settingStatus;
    }

    public PutAlertSettingStatusRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
