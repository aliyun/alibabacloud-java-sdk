// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventRebootInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the system Event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e-9d992570200d86b9126d78aa8c37b54b</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The type of the operation. Valid values:</p>
     * <ul>
     * <li><p>immediate: Executes the operation immediately.</p>
     * </li>
     * <li><p>scheduled: Executes the operation at the specified time.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>immediate</p>
     */
    @NameInMap("OpsType")
    public String opsType;

    /**
     * <p>The scheduled execution time, as a Timestamp in milliseconds. This parameter is required when OpsType is set to scheduled.</p>
     * 
     * <strong>example:</strong>
     * <p>1742452232000</p>
     */
    @NameInMap("PlanTime")
    public Long planTime;

    /**
     * <p>Reserved parameter.</p>
     */
    @NameInMap("PlanUtcTime")
    public String planUtcTime;

    /**
     * <p>The ID of the Resource.</p>
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

    public EventRebootInstanceRequest setPlanUtcTime(String planUtcTime) {
        this.planUtcTime = planUtcTime;
        return this;
    }
    public String getPlanUtcTime() {
        return this.planUtcTime;
    }

    public EventRebootInstanceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
