// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class RespondIncidentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61E59A221</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>影响程度</p>
     */
    @NameInMap("incidentIds")
    public java.util.List<Long> incidentIds;

    public static RespondIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        RespondIncidentRequest self = new RespondIncidentRequest();
        return TeaModel.build(map, self);
    }

    public RespondIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RespondIncidentRequest setIncidentIds(java.util.List<Long> incidentIds) {
        this.incidentIds = incidentIds;
        return this;
    }
    public java.util.List<Long> getIncidentIds() {
        return this.incidentIds;
    }

}
