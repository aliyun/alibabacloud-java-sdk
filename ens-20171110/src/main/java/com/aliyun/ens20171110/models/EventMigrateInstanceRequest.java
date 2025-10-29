// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class EventMigrateInstanceRequest extends TeaModel {
    /**
     * <p>The data migration policy. Valid values:</p>
     * <ul>
     * <li>abandon: does not migrate data. This is the default value.</li>
     * <li>force_transfer: forcibly migrates data.</li>
     * <li>try_transfer: Migrate data as much as possible.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>abandon</p>
     */
    @NameInMap("DataPolicy")
    public String dataPolicy;

    /**
     * <p>The ID of the system event.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e-d71ff150945b9c02eb6ebc0016328468</p>
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
     * <p>The password of the instance. This parameter is optional. If you do not specify this parameter, a random password is used.</p>
     * <p>The password must be 8 to 30 characters in length. The password must contain uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>Note that you cannot enter a password for scheduled execution.</p>
     * 
     * <strong>example:</strong>
     * <p>AAaa1234</p>
     */
    @NameInMap("Password")
    public String password;

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
     * <p>i-55qi8m11rr53c4i964md8a00l</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    public static EventMigrateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        EventMigrateInstanceRequest self = new EventMigrateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public EventMigrateInstanceRequest setDataPolicy(String dataPolicy) {
        this.dataPolicy = dataPolicy;
        return this;
    }
    public String getDataPolicy() {
        return this.dataPolicy;
    }

    public EventMigrateInstanceRequest setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }
    public String getEventId() {
        return this.eventId;
    }

    public EventMigrateInstanceRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public EventMigrateInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public EventMigrateInstanceRequest setPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }
    public Long getPlanTime() {
        return this.planTime;
    }

    public EventMigrateInstanceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

}
