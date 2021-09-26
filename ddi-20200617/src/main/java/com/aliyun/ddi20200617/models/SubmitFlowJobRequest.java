// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class SubmitFlowJobRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("Conf")
    public String conf;

    public static SubmitFlowJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitFlowJobRequest self = new SubmitFlowJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitFlowJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SubmitFlowJobRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public SubmitFlowJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitFlowJobRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SubmitFlowJobRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public SubmitFlowJobRequest setConf(String conf) {
        this.conf = conf;
        return this;
    }
    public String getConf() {
        return this.conf;
    }

}
