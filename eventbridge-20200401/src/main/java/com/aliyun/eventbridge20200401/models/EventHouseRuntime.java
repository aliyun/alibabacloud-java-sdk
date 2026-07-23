// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventHouseRuntime extends TeaModel {
    /**
     * <p>The number of CUs that last took effect for the EventHouse Runtime.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cu")
    public Integer cu;

    /**
     * <p>The stable error code returned when the creation or specification change operation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNTIME_OPERATION_TIMEOUT</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The desensitized error message returned when the creation or specification change operation fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Runtime operation timed out</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The name of the EventHouse Runtime. Typically set to default in the initial phase.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The progress of the current creation or specification change operation. Valid values: 0 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("Progress")
    public Integer progress;

    /**
     * <p>The current stage of the creation or specification change operation.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNTIME_HEALTH_CHECK</p>
     */
    @NameInMap("Stage")
    public String stage;

    /**
     * <p>The current status of the EventHouse Runtime. RUNNING indicates that the Runtime is ready and can accept queries. Valid values: CREATING, RUNNING, UPDATING, RECOVERING, CLOSED, CREATE_FAILED, and UPDATE_FAILED.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The target number of CUs during creation, specification change, or the corresponding failed state. This parameter is not returned when the Runtime is running stably.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TargetCu")
    public Integer targetCu;

    public static EventHouseRuntime build(java.util.Map<String, ?> map) throws Exception {
        EventHouseRuntime self = new EventHouseRuntime();
        return TeaModel.build(map, self);
    }

    public EventHouseRuntime setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public EventHouseRuntime setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public EventHouseRuntime setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public EventHouseRuntime setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EventHouseRuntime setProgress(Integer progress) {
        this.progress = progress;
        return this;
    }
    public Integer getProgress() {
        return this.progress;
    }

    public EventHouseRuntime setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public EventHouseRuntime setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public EventHouseRuntime setTargetCu(Integer targetCu) {
        this.targetCu = targetCu;
        return this;
    }
    public Integer getTargetCu() {
        return this.targetCu;
    }

}
