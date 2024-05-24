// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class PipelineTriggerEventStatus extends TeaModel {
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("firedPipelineName")
    public String firedPipelineName;

    @NameInMap("releaseDetail")
    public ReleaseDetail releaseDetail;

    @NameInMap("status")
    public String status;

    public static PipelineTriggerEventStatus build(java.util.Map<String, ?> map) throws Exception {
        PipelineTriggerEventStatus self = new PipelineTriggerEventStatus();
        return TeaModel.build(map, self);
    }

    public PipelineTriggerEventStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PipelineTriggerEventStatus setFiredPipelineName(String firedPipelineName) {
        this.firedPipelineName = firedPipelineName;
        return this;
    }
    public String getFiredPipelineName() {
        return this.firedPipelineName;
    }

    public PipelineTriggerEventStatus setReleaseDetail(ReleaseDetail releaseDetail) {
        this.releaseDetail = releaseDetail;
        return this;
    }
    public ReleaseDetail getReleaseDetail() {
        return this.releaseDetail;
    }

    public PipelineTriggerEventStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
