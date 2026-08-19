// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ModifyForwardStrategyRequest extends TeaModel {
    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an internal access policy</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The target instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-e3152978fb32443b</p>
     */
    @NameInMap("DestinationId")
    public String destinationId;

    /**
     * <p>The destination type. Valid values:</p>
     * <ul>
     * <li><strong>Connector</strong>: connector.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Connector</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The forwarding rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fs-051199361a1fbefc</p>
     */
    @NameInMap("ForwardId")
    public String forwardId;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>CollegeStudentsOnline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The policy priority. A value of 1 indicates the highest priority, and a value of 100 indicates the lowest priority.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The policy status. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    public static ModifyForwardStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyForwardStrategyRequest self = new ModifyForwardStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyForwardStrategyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyForwardStrategyRequest setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public String getDestinationId() {
        return this.destinationId;
    }

    public ModifyForwardStrategyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ModifyForwardStrategyRequest setForwardId(String forwardId) {
        this.forwardId = forwardId;
        return this;
    }
    public String getForwardId() {
        return this.forwardId;
    }

    public ModifyForwardStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyForwardStrategyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public ModifyForwardStrategyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
