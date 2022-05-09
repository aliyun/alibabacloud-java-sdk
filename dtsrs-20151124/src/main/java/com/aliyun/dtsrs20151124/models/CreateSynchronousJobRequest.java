// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class CreateSynchronousJobRequest extends TeaModel {
    @NameInMap("DestinationInstanceId")
    public String destinationInstanceId;

    @NameInMap("FullDataIntialization")
    public Boolean fullDataIntialization;

    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("StructureIntialization")
    public Boolean structureIntialization;

    @NameInMap("SynchronousJobName")
    public String synchronousJobName;

    @NameInMap("SynchronousObjectList")
    public String synchronousObjectList;

    @NameInMap("SynchronousSpeedLimit")
    public String synchronousSpeedLimit;

    public static CreateSynchronousJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSynchronousJobRequest self = new CreateSynchronousJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateSynchronousJobRequest setDestinationInstanceId(String destinationInstanceId) {
        this.destinationInstanceId = destinationInstanceId;
        return this;
    }
    public String getDestinationInstanceId() {
        return this.destinationInstanceId;
    }

    public CreateSynchronousJobRequest setFullDataIntialization(Boolean fullDataIntialization) {
        this.fullDataIntialization = fullDataIntialization;
        return this;
    }
    public Boolean getFullDataIntialization() {
        return this.fullDataIntialization;
    }

    public CreateSynchronousJobRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateSynchronousJobRequest setStructureIntialization(Boolean structureIntialization) {
        this.structureIntialization = structureIntialization;
        return this;
    }
    public Boolean getStructureIntialization() {
        return this.structureIntialization;
    }

    public CreateSynchronousJobRequest setSynchronousJobName(String synchronousJobName) {
        this.synchronousJobName = synchronousJobName;
        return this;
    }
    public String getSynchronousJobName() {
        return this.synchronousJobName;
    }

    public CreateSynchronousJobRequest setSynchronousObjectList(String synchronousObjectList) {
        this.synchronousObjectList = synchronousObjectList;
        return this;
    }
    public String getSynchronousObjectList() {
        return this.synchronousObjectList;
    }

    public CreateSynchronousJobRequest setSynchronousSpeedLimit(String synchronousSpeedLimit) {
        this.synchronousSpeedLimit = synchronousSpeedLimit;
        return this;
    }
    public String getSynchronousSpeedLimit() {
        return this.synchronousSpeedLimit;
    }

}
