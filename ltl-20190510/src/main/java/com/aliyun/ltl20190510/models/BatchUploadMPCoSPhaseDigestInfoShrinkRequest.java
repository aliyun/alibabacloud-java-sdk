// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseDigestInfoShrinkRequest extends TeaModel {
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

    public static BatchUploadMPCoSPhaseDigestInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseDigestInfoShrinkRequest self = new BatchUploadMPCoSPhaseDigestInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseDigestInfoShrinkRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public BatchUploadMPCoSPhaseDigestInfoShrinkRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public BatchUploadMPCoSPhaseDigestInfoShrinkRequest setPhaseDataListShrink(String phaseDataListShrink) {
        this.phaseDataListShrink = phaseDataListShrink;
        return this;
    }
    public String getPhaseDataListShrink() {
        return this.phaseDataListShrink;
    }

    public BatchUploadMPCoSPhaseDigestInfoShrinkRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public BatchUploadMPCoSPhaseDigestInfoShrinkRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

}
