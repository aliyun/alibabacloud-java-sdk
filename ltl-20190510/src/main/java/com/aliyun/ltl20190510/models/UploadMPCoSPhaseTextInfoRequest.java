// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class UploadMPCoSPhaseTextInfoRequest extends TeaModel {
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
    public java.util.Map<String, ?> relatedDataList;

    public static UploadMPCoSPhaseTextInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadMPCoSPhaseTextInfoRequest self = new UploadMPCoSPhaseTextInfoRequest();
        return TeaModel.build(map, self);
    }

    public UploadMPCoSPhaseTextInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public UploadMPCoSPhaseTextInfoRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public UploadMPCoSPhaseTextInfoRequest setDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public String getDataKey() {
        return this.dataKey;
    }

    public UploadMPCoSPhaseTextInfoRequest setDataSeq(String dataSeq) {
        this.dataSeq = dataSeq;
        return this;
    }
    public String getDataSeq() {
        return this.dataSeq;
    }

    public UploadMPCoSPhaseTextInfoRequest setPhaseData(String phaseData) {
        this.phaseData = phaseData;
        return this;
    }
    public String getPhaseData() {
        return this.phaseData;
    }

    public UploadMPCoSPhaseTextInfoRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public UploadMPCoSPhaseTextInfoRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public UploadMPCoSPhaseTextInfoRequest setRelatedDataList(java.util.Map<String, ?> relatedDataList) {
        this.relatedDataList = relatedDataList;
        return this;
    }
    public java.util.Map<String, ?> getRelatedDataList() {
        return this.relatedDataList;
    }

}
