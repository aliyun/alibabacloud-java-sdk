// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class RunCloudMetricProfilingRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Duration")
    public Integer duration;

    @NameInMap("Freq")
    public Integer freq;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("ProcessId")
    public Integer processId;

    @NameInMap("RegionId")
    public String regionId;

    public static RunCloudMetricProfilingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunCloudMetricProfilingRequest self = new RunCloudMetricProfilingRequest();
        return TeaModel.build(map, self);
    }

    public RunCloudMetricProfilingRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public RunCloudMetricProfilingRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public RunCloudMetricProfilingRequest setFreq(Integer freq) {
        this.freq = freq;
        return this;
    }
    public Integer getFreq() {
        return this.freq;
    }

    public RunCloudMetricProfilingRequest setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public RunCloudMetricProfilingRequest setProcessId(Integer processId) {
        this.processId = processId;
        return this;
    }
    public Integer getProcessId() {
        return this.processId;
    }

    public RunCloudMetricProfilingRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
