// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateForwardStrategyRequest extends TeaModel {
    /**
     * <p>The description. The description must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. The description can also contain Chinese characters.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an internal access policy</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The target instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connector-4178bc59bec56df1</p>
     */
    @NameInMap("DestinationId")
    public String destinationId;

    /**
     * <p>The destination type. Valid values:</p>
     * <ul>
     * <li><strong>Connector</strong>: connector.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Connector</p>
     */
    @NameInMap("DestinationType")
    public String destinationType;

    /**
     * <p>The name. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). The name can also contain Chinese characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>jogg-K8sapi</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The policy priority. A value of 1 indicates the highest priority. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The policy status. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enabled.</li>
     * <li><strong>Disabled</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("Status")
    public String status;

    public static CreateForwardStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardStrategyRequest self = new CreateForwardStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateForwardStrategyRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateForwardStrategyRequest setDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    public String getDestinationId() {
        return this.destinationId;
    }

    public CreateForwardStrategyRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateForwardStrategyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateForwardStrategyRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public CreateForwardStrategyRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
