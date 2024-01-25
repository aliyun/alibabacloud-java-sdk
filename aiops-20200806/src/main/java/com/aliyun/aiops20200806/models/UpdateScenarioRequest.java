// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateScenarioRequest extends TeaModel {
    @NameInMap("AlertSettingId")
    public Long alertSettingId;

    @NameInMap("Id")
    public String id;

    @NameInMap("Level")
    public Long level;

    @NameInMap("Name")
    public String name;

    @NameInMap("OperaUid")
    public String operaUid;

    public static UpdateScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScenarioRequest self = new UpdateScenarioRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScenarioRequest setAlertSettingId(Long alertSettingId) {
        this.alertSettingId = alertSettingId;
        return this;
    }
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    public UpdateScenarioRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateScenarioRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public UpdateScenarioRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateScenarioRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
