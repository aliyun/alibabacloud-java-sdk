// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateIncidentRequest extends TeaModel {
    // 幂等校验Id
    @NameInMap("clientToken")
    public String clientToken;

    // 影响程度
    @NameInMap("effect")
    public String effect;

    // 事件Id
    @NameInMap("incidentId")
    public Long incidentId;

    // 级别
    @NameInMap("incidentLevel")
    public String incidentLevel;

    // 事件标题
    @NameInMap("incidentTitle")
    public String incidentTitle;

    public static UpdateIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIncidentRequest self = new UpdateIncidentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIncidentRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public UpdateIncidentRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

    public UpdateIncidentRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    public UpdateIncidentRequest setIncidentTitle(String incidentTitle) {
        this.incidentTitle = incidentTitle;
        return this;
    }
    public String getIncidentTitle() {
        return this.incidentTitle;
    }

}
