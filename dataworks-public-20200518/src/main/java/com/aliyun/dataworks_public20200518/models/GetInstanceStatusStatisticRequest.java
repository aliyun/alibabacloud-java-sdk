// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusStatisticRequest extends TeaModel {
    /**
     * <p>The date on which the numbers of instances in different states are obtained. Specify the date in the yyyy-MM-dd format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-01</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The type of the directed acyclic graph (DAG). Valid values:</p>
     * <ul>
     * <li>MANUAL: DAG for a manually triggered workflow</li>
     * <li>SMOKE_TEST: DAG for a smoke testing workflow</li>
     * <li>SUPPLY_DATA: DAG for a data backfill instance</li>
     * <li>BUSINESS_PROCESS_DAG: DAG for a one-time workflow</li>
     * </ul>
     * <!---->
     * 
     * <ul>
     * <li>DAILY</li>
     * <li>MANUAL</li>
     * <li>SMOKE_TEST</li>
     * <li>SUPPLY_DATA</li>
     * <li>BUSINESS_PROCESS_DAG</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MANUAL</p>
     */
    @NameInMap("DagType")
    public String dagType;

    /**
     * <p>The runtime environment. Valid values: PROD and DEV.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The DataWorks workspace ID. You can log on to the DataWorks console and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The scheduling cycle. Valid values:</p>
     * <ul>
     * <li>MINUTE</li>
     * <li>HOUR</li>
     * <li>DAY</li>
     * <li>WEEK</li>
     * <li>MONTH</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("SchedulerPeriod")
    public String schedulerPeriod;

    /**
     * <p>The scheduling type of the node. Valid values:</p>
     * <ul>
     * <li>NORMAL: auto triggered node</li>
     * <li>MANUAL: manually triggered node</li>
     * <li>PAUSE: paused node</li>
     * <li>SKIP: dry-run node</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
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
