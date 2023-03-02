// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class BatchUploadMPCoSPhaseTextInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("PhaseDataList")
    public java.util.Map<String, ?> phaseDataList;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("PhaseId")
    public String phaseId;

    public static BatchUploadMPCoSPhaseTextInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUploadMPCoSPhaseTextInfoRequest self = new BatchUploadMPCoSPhaseTextInfoRequest();
        return TeaModel.build(map, self);
    }

    public BatchUploadMPCoSPhaseTextInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public BatchUploadMPCoSPhaseTextInfoRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public BatchUploadMPCoSPhaseTextInfoRequest setPhaseDataList(java.util.Map<String, ?> phaseDataList) {
        this.phaseDataList = phaseDataList;
        return this;
    }
    public java.util.Map<String, ?> getPhaseDataList() {
        return this.phaseDataList;
    }

    public BatchUploadMPCoSPhaseTextInfoRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public BatchUploadMPCoSPhaseTextInfoRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

}
