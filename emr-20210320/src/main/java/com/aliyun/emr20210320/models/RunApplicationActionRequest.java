// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApplicationActionRequest extends TeaModel {
    /**
     * <p>The name of the action. Valid values:</p>
     * <br>
     * <p>*   start</p>
     * <p>*   stop</p>
     * <p>*   config</p>
     * <p>*   restart</p>
     * <p>*   refresh_queues</p>
     * <p>*   refresh_labels</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>The number of applications in each batch.</p>
     */
    @NameInMap("BatchSize")
    public Integer batchSize;

    /**
     * <p>The cluster ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The operation object.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ComponentInstanceSelector")
    public ComponentInstanceSelector componentInstanceSelector;

    /**
     * <p>The description of the execution.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The execution policy. Valid values:</p>
     * <br>
     * <p>*   FAILED_BLOCK: The system stops the execution if the execution fails.</p>
     * <p>*   FAILED_CONTINUE: The system continues the execution if the execution fails.</p>
     */
    @NameInMap("ExecuteStrategy")
    public String executeStrategy;

    /**
     * <p>The interval for rolling execution. Unit: seconds.</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>The region ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to enable rolling execution.</p>
     */
    @NameInMap("RollingExecute")
    public Boolean rollingExecute;

    public static RunApplicationActionRequest build(java.util.Map<String, ?> map) throws Exception {
        RunApplicationActionRequest self = new RunApplicationActionRequest();
        return TeaModel.build(map, self);
    }

    public RunApplicationActionRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public RunApplicationActionRequest setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }
    public Integer getBatchSize() {
        return this.batchSize;
    }

    public RunApplicationActionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RunApplicationActionRequest setComponentInstanceSelector(ComponentInstanceSelector componentInstanceSelector) {
        this.componentInstanceSelector = componentInstanceSelector;
        return this;
    }
    public ComponentInstanceSelector getComponentInstanceSelector() {
        return this.componentInstanceSelector;
    }

    public RunApplicationActionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RunApplicationActionRequest setExecuteStrategy(String executeStrategy) {
        this.executeStrategy = executeStrategy;
        return this;
    }
    public String getExecuteStrategy() {
        return this.executeStrategy;
    }

    public RunApplicationActionRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public RunApplicationActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RunApplicationActionRequest setRollingExecute(Boolean rollingExecute) {
        this.rollingExecute = rollingExecute;
        return this;
    }
    public Boolean getRollingExecute() {
        return this.rollingExecute;
    }

}
