// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusStatisticRequest extends TeaModel {
    /**
     * <p>The date on which the numbers of instances in different states are obtained. Specify the date in the yyyy-MM-dd format.</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The type of the directed acyclic graph (DAG). Valid values:</p>
     * <br>
     * <p>*   MANUAL: DAG for a manually triggered workflow</p>
     * <p>*   SMOKE_TEST: DAG for a smoke testing workflow</p>
     * <p>*   SUPPLY_DATA: DAG for a data backfill instance</p>
     * <p>*   BUSINESS_PROCESS_DAG: DAG for a one-time workflow</p>
     */
    @NameInMap("DagType")
    public String dagType;

    /**
     * <p>The environment of the workspace. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the workspace ID.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SchedulerPeriod")
    public String schedulerPeriod;

    /**
     * <p>The scheduling type of the node. Valid values:</p>
     * <br>
     * <p>*   NORMAL: auto triggered node</p>
     * <p>*   MANUAL: manually triggered node</p>
     * <p>*   PAUSE: paused node</p>
     * <p>*   SKIP: dry-run node</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    public static GetInstanceStatusStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusStatisticRequest self = new GetInstanceStatusStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusStatisticRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetInstanceStatusStatisticRequest setDagType(String dagType) {
        this.dagType = dagType;
        return this;
    }
    public String getDagType() {
        return this.dagType;
    }

    public GetInstanceStatusStatisticRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public GetInstanceStatusStatisticRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public GetInstanceStatusStatisticRequest setSchedulerPeriod(String schedulerPeriod) {
        this.schedulerPeriod = schedulerPeriod;
        return this;
    }
    public String getSchedulerPeriod() {
        return this.schedulerPeriod;
    }

    public GetInstanceStatusStatisticRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

}
