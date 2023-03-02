// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class DescribeMPCoSPhaseInfoRequest extends TeaModel {
    @NameInMap("ApiVersion")
    public String apiVersion;

    @NameInMap("BizChainId")
    public String bizChainId;

    @NameInMap("DataKey")
    public String dataKey;

    @NameInMap("DataSeq")
    public String dataSeq;

    @NameInMap("PhaseGroupId")
    public String phaseGroupId;

    @NameInMap("PhaseId")
    public String phaseId;

    public static DescribeMPCoSPhaseInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMPCoSPhaseInfoRequest self = new DescribeMPCoSPhaseInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMPCoSPhaseInfoRequest setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }
    public String getApiVersion() {
        return this.apiVersion;
    }

    public DescribeMPCoSPhaseInfoRequest setBizChainId(String bizChainId) {
        this.bizChainId = bizChainId;
        return this;
    }
    public String getBizChainId() {
        return this.bizChainId;
    }

    public DescribeMPCoSPhaseInfoRequest setDataKey(String dataKey) {
        this.dataKey = dataKey;
        return this;
    }
    public String getDataKey() {
        return this.dataKey;
    }

    public DescribeMPCoSPhaseInfoRequest setDataSeq(String dataSeq) {
        this.dataSeq = dataSeq;
        return this;
    }
    public String getDataSeq() {
        return this.dataSeq;
    }

    public DescribeMPCoSPhaseInfoRequest setPhaseGroupId(String phaseGroupId) {
        this.phaseGroupId = phaseGroupId;
        return this;
    }
    public String getPhaseGroupId() {
        return this.phaseGroupId;
    }

    public DescribeMPCoSPhaseInfoRequest setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

}
