// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateIncidentRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("effect")
    public String effect;

    @NameInMap("incidentId")
    public Long incidentId;

    @NameInMap("incidentLevel")
    public String incidentLevel;

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
