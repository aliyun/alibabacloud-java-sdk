// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class RunApplicationActionRequest extends TeaModel {
    /**
     * <p>操作名称。取值范围：</p>
     * <p>- start：启动。</p>
     * <p>- stop：停止。</p>
     * <p>- config: 下发配置。</p>
     * <p>- refresh_queues: 刷新yarn队列。</p>
     * <p>等</p>
     */
    @NameInMap("ActionName")
    public String actionName;

    /**
     * <p>每批数量。</p>
     */
    @NameInMap("BatchSize")
    public Integer batchSize;

    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>组件实例选择器。</p>
     */
    @NameInMap("ComponentInstanceSelector")
    public ComponentInstanceSelector componentInstanceSelector;

    /**
     * <p>描述。</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>运行失败策略。取值范围：</p>
     * <p>- FAILED_BLOCK：失败后阻塞。</p>
     * <p>- FAILED_CONTINUE：失败后继续。</p>
     */
    @NameInMap("ExecuteStrategy")
    public String executeStrategy;

    /**
     * <p>滚动执行间隔时间。</p>
     */
    @NameInMap("Interval")
    public Long interval;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>是否滚动执行。</p>
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
