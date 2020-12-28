// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCloudMetricProfilingsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Profilings")
    public java.util.List<ListCloudMetricProfilingsResponseBodyProfilings> profilings;

    public static ListCloudMetricProfilingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudMetricProfilingsResponseBody self = new ListCloudMetricProfilingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudMetricProfilingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListCloudMetricProfilingsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudMetricProfilingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudMetricProfilingsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudMetricProfilingsResponseBody setProfilings(java.util.List<ListCloudMetricProfilingsResponseBodyProfilings> profilings) {
        this.profilings = profilings;
        return this;
    }
    public java.util.List<ListCloudMetricProfilingsResponseBodyProfilings> getProfilings() {
        return this.profilings;
    }

    public static class ListCloudMetricProfilingsResponseBodyProfilings extends TeaModel {
        @NameInMap("ProfilingId")
        public String profilingId;

        @NameInMap("TriggerTime")
        public String triggerTime;

        @NameInMap("Pid")
        public Integer pid;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("Duration")
        public Integer duration;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Freq")
        public Integer freq;

        public static ListCloudMetricProfilingsResponseBodyProfilings build(java.util.Map<String, ?> map) throws Exception {
            ListCloudMetricProfilingsResponseBodyProfilings self = new ListCloudMetricProfilingsResponseBodyProfilings();
            return TeaModel.build(map, self);
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setProfilingId(String profilingId) {
            this.profilingId = profilingId;
            return this;
        }
        public String getProfilingId() {
            return this.profilingId;
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setTriggerTime(String triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public String getTriggerTime() {
            return this.triggerTime;
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setFreq(Integer freq) {
            this.freq = freq;
            return this;
        }
        public Integer getFreq() {
            return this.freq;
        }

    }

}
