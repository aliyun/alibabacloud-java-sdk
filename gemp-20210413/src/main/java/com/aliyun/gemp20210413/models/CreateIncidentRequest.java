// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateIncidentRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("assignUserId")
    public Long assignUserId;

    @NameInMap("channels")
    public java.util.List<String> channels;

    /**
     * <strong>example:</strong>
     * <p>2b63cdef-7ac3-4892-a76d-0f3389ef729f</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>LOW</p>
     */
    @NameInMap("effect")
    public String effect;

    @NameInMap("incidentDescription")
    public String incidentDescription;

    /**
     * <strong>example:</strong>
     * <p>P1</p>
     */
    @NameInMap("incidentLevel")
    public String incidentLevel;

    @NameInMap("incidentTitle")
    public String incidentTitle;

    /**
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("relatedServiceId")
    public Long relatedServiceId;

    /**
     * <p>12000</p>
     * 
     * <strong>example:</strong>
     * <p>12312</p>
     */
    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    public static CreateIncidentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIncidentRequest self = new CreateIncidentRequest();
        return TeaModel.build(map, self);
    }

    public CreateIncidentRequest setAssignUserId(Long assignUserId) {
        this.assignUserId = assignUserId;
        return this;
    }
    public Long getAssignUserId() {
        return this.assignUserId;
    }

    public CreateIncidentRequest setChannels(java.util.List<String> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<String> getChannels() {
        return this.channels;
    }

    public CreateIncidentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIncidentRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public CreateIncidentRequest setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
        return this;
    }
    public String getIncidentDescription() {
        return this.incidentDescription;
    }

    public CreateIncidentRequest setIncidentLevel(String incidentLevel) {
        this.incidentLevel = incidentLevel;
        return this;
    }
    public String getIncidentLevel() {
        return this.incidentLevel;
    }

    public CreateIncidentRequest setIncidentTitle(String incidentTitle) {
        this.incidentTitle = incidentTitle;
        return this;
    }
    public String getIncidentTitle() {
        return this.incidentTitle;
    }

    public CreateIncidentRequest setRelatedServiceId(Long relatedServiceId) {
        this.relatedServiceId = relatedServiceId;
        return this;
    }
    public Long getRelatedServiceId() {
        return this.relatedServiceId;
    }

    public CreateIncidentRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
    }

}
