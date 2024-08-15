// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentSubtotalsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE62E59A2E9</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>3123</p>
     */
    @NameInMap("incidentId")
    public Long incidentId;

    public static ListIncidentSubtotalsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentSubtotalsRequest self = new ListIncidentSubtotalsRequest();
        return TeaModel.build(map, self);
    }

    public ListIncidentSubtotalsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListIncidentSubtotalsRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

}
