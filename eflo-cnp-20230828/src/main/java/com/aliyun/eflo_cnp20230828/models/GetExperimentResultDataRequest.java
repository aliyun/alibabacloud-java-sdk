// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetExperimentResultDataRequest extends TeaModel {
    /**
     * <p>Experiment ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>234</p>
     */
    @NameInMap("ExperimentId")
    public Long experimentId;

    /**
     * <p>Hostname</p>
     * 
     * <strong>example:</strong>
     * <p>iZj6ccwd7zwfms7hzaz2riZ</p>
     */
    @NameInMap("Hostname")
    public String hostname;

    /**
     * <p>Resource Group Id</p>
     * 
     * <strong>example:</strong>
     * <p>rg-sfjgskdfj3k4</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Workload Type</p>
     * 
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

    public GetExperimentResultDataRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetExperimentResultDataRequest setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

}
