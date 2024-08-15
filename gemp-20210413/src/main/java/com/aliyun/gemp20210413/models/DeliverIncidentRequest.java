// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DeliverIncidentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>212321</p>
     */
    @NameInMap("assignUserId")
    public Long assignUserId;

    /**
     * <strong>example:</strong>
     * <p>FD200FAE-E98F-496E-BFE6-4CE61CS9A221</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>1223212</p>
     */
    @NameInMap("incidentId")
    public Long incidentId;

    public static DeliverIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeliverIncidentRequest self = new DeliverIncidentRequest();
        return TeaModel.build(map, self);
    }

    public DeliverIncidentRequest setAssignUserId(Long assignUserId) {
        this.assignUserId = assignUserId;
        return this;
    }
    public Long getAssignUserId() {
        return this.assignUserId;
    }

    public DeliverIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeliverIncidentRequest setIncidentId(Long incidentId) {
        this.incidentId = incidentId;
        return this;
    }
    public Long getIncidentId() {
        return this.incidentId;
    }

}
