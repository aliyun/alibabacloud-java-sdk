// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseTextInfoShrinkRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("PhaseDataList")
    public String phaseDataListShrink;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("PhaseId")
    public String phaseId;

    public static BatchUploadMPCoSPhaseTextInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseTextInfoShrinkRequest self = new BatchUploadMPCoSPhaseTextInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseTextInfoShrinkRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public BatchUploadMPCoSPhaseTextInfoShrinkRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public BatchUploadMPCoSPhaseTextInfoShrinkRequest setPhaseDataListShrink(String phaseDataListShrink) {
        this.phaseDataListShrink = phaseDataListShrink;
        return this;
    }
    public String getPhaseDataListShrink() {
        return this.phaseDataListShrink;
    }

    public BatchUploadMPCoSPhaseTextInfoShrinkRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public BatchUploadMPCoSPhaseTextInfoShrinkRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

}
