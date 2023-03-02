// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseDigestInfoShrinkRequest extends TeaModel {
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

    public static UploadMPCoSPhaseDigestInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseDigestInfoShrinkRequest self = new UploadMPCoSPhaseDigestInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public String getDataKey() {
        return this.dataKey;
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setDataSeq(String dataSeq) {
        this.dataSeq = dataSeq;
        return this;
    }
    public String getDataSeq() {
        return this.dataSeq;
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setPhaseData(String phaseData) {
        this.phaseData = phaseData;
        return this;
    }
    public String getPhaseData() {
        return this.phaseData;
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public UploadMPCoSPhaseDigestInfoShrinkRequest setRelatedDataListShrink(String relatedDataListShrink) {
        this.relatedDataListShrink = relatedDataListShrink;
        return this;
    }
    public String getRelatedDataListShrink() {
        return this.relatedDataListShrink;
    }

}
