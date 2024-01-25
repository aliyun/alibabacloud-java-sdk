// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class AddScenarioRequest extends TeaModel {
    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperaUid")
    public String operaUid;

    public static AddScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        AddScenarioRequest self = new AddScenarioRequest();
        return TeaModel.build(map, self);
    }

    public AddScenarioRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    public AddScenarioRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public AddScenarioRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddScenarioRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
