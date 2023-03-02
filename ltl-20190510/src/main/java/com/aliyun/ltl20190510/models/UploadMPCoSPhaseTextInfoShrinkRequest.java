// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseTextInfoShrinkRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("DataKey")
    public String dataKey;

    @NameInMap("DataSeq")
    public String dataSeq;

    @NameInMap("PhaseData")
    public String phaseData;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("PhaseId")
    public String phaseId;

    @NameInMap("RelatedDataList")
    public String relatedDataListShrink;

    public static UploadMPCoSPhaseTextInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseTextInfoShrinkRequest self = new UploadMPCoSPhaseTextInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public String getDataKey() {
        return this.dataKey;
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setDataSeq(String dataSeq) {
        this.dataSeq = dataSeq;
        return this;
    }
    public String getDataSeq() {
        return this.dataSeq;
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setPhaseData(String phaseData) {
        this.phaseData = phaseData;
        return this;
    }
    public String getPhaseData() {
        return this.phaseData;
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public UploadMPCoSPhaseTextInfoShrinkRequest setRelatedDataListShrink(String relatedDataListShrink) {
        this.relatedDataListShrink = relatedDataListShrink;
        return this;
    }
    public String getRelatedDataListShrink() {
        return this.relatedDataListShrink;
    }

}
