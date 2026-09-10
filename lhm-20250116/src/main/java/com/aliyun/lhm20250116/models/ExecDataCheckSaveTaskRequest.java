// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckSaveTaskRequest extends TeaModel {
    /**
     * <p>The global parameters for the validation phase. Separate multiple parameters with a line feed (<code> </code>).</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("checkGlobalParams")
    public String checkGlobalParams;

    /**
     * <p>Specifies whether to perform full-table validation. Valid values:</p>
     * <ul>
     * <li>0: Partition-level validation. This is the default value.</li>
     * <li>1: Full-table validation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("fullTableCount")
    public Integer fullTableCount;

    /**
     * <p>The global parameters for the source. Separate multiple parameters with a line feed (<code> </code>).</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("sourceGlobalParams")
    public String sourceGlobalParams;

    /**
     * <p>Specifies whether to execute immediately after saving. Valid values:</p>
     * <ul>
     * <li>0: No. This is the default value.</li>
     * <li>1: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("startImmediately")
    public Integer startImmediately;

    /**
     * <p>The global parameters for the target. Separate multiple parameters with a line feed (<code> </code>).</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("targetGlobalParams")
    public String targetGlobalParams;

    /**
     * <p>The ID of the validation task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    /**
     * <p>The total data volume comparison threshold, used to determine whether the data volume difference between the source and target is within an acceptable range.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("totalCountThreshold")
    public Float totalCountThreshold;

    public static ExecDataCheckSaveTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckSaveTaskRequest self = new ExecDataCheckSaveTaskRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckSaveTaskRequest setCheckGlobalParams(String checkGlobalParams) {
        this.checkGlobalParams = checkGlobalParams;
        return this;
    }
    public String getCheckGlobalParams() {
        return this.checkGlobalParams;
    }

    public ExecDataCheckSaveTaskRequest setFullTableCount(Integer fullTableCount) {
        this.fullTableCount = fullTableCount;
        return this;
    }
    public Integer getFullTableCount() {
        return this.fullTableCount;
    }

    public ExecDataCheckSaveTaskRequest setSourceGlobalParams(String sourceGlobalParams) {
        this.sourceGlobalParams = sourceGlobalParams;
        return this;
    }
    public String getSourceGlobalParams() {
        return this.sourceGlobalParams;
    }

    public ExecDataCheckSaveTaskRequest setStartImmediately(Integer startImmediately) {
        this.startImmediately = startImmediately;
        return this;
    }
    public Integer getStartImmediately() {
        return this.startImmediately;
    }

    public ExecDataCheckSaveTaskRequest setTargetGlobalParams(String targetGlobalParams) {
        this.targetGlobalParams = targetGlobalParams;
        return this;
    }
    public String getTargetGlobalParams() {
        return this.targetGlobalParams;
    }

    public ExecDataCheckSaveTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public ExecDataCheckSaveTaskRequest setTotalCountThreshold(Float totalCountThreshold) {
        this.totalCountThreshold = totalCountThreshold;
        return this;
    }
    public Float getTotalCountThreshold() {
        return this.totalCountThreshold;
    }

}
