// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventRebootInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the system event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e-9d992570200d86b9126d78aa8c37b54b</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The type of the O\&amp;M task. Valid values:</p>
     * <ul>
     * <li>immediate</li>
     * <li>scheduled</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immediate</p>
     */
    @NameInMap("OpsType")
    public String opsType;

    /**
     * <p>The execution time of the reservation. The timestamp is measured in milliseconds. If the OpsType parameter is set to scheduled, this parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1742452232000</p>
     */
    @NameInMap("PlanTime")
    public Long planTime;

    /**
     * <p>The ID of the resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static EventRebootInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EventRebootInstanceRequest self = new EventRebootInstanceRequest();
        return TeaModel.build(map, self);
    }

    public EventRebootInstanceRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public EventRebootInstanceRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public EventRebootInstanceRequest setPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }
    public Long getPlanTime() {
        return this.planTime;
    }

    public EventRebootInstanceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
