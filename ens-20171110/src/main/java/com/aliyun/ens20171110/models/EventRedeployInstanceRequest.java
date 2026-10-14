// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventRedeployInstanceRequest extends TeaModel {
    /**
     * <p>The system event ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
     */
    @NameInMap("EventId")
    public String eventId;

    /**
     * <p>The O\&amp;M task type. Valid values:</p>
     * <ul>
     * <li><p>immediate: Immediate execution.</p>
     * </li>
     * <li><p>scheduled: Scheduled execution.</p>
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
     * <p>The scheduled execution time, specified as a timestamp in milliseconds. This parameter is required if \&quot;OpsType\&quot; is set to \&quot;scheduled\&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>1742452232000</p>
     */
    @NameInMap("PlanTime")
    public Long planTime;

    @NameInMap("PlanUtcTime")
    public String planUtcTime;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-55qi8m11rr53c4i964md8a00l</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static EventRedeployInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EventRedeployInstanceRequest self = new EventRedeployInstanceRequest();
        return TeaModel.build(map, self);
    }

    public EventRedeployInstanceRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public EventRedeployInstanceRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public EventRedeployInstanceRequest setPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }
    public Long getPlanTime() {
        return this.planTime;
    }

    public EventRedeployInstanceRequest setPlanUtcTime(String planUtcTime) {
        this.planUtcTime = planUtcTime;
        return this;
    }
    public String getPlanUtcTime() {
        return this.planUtcTime;
    }

    public EventRedeployInstanceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
