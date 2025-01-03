// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentResultDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("ExperimentId")
    public Long experimentId;

    /**
     * <strong>example:</strong>
     * <p>iZj6ccwd7zwfms7hzaz2riZ</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    public static GetExperimentResultDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentResultDataRequest self = new GetExperimentResultDataRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentResultDataRequest setExperimentId(Long experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public Long getExperimentId() {
        return this.experimentId;
    }

    public GetExperimentResultDataRequest setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public GetExperimentResultDataRequest setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

}
