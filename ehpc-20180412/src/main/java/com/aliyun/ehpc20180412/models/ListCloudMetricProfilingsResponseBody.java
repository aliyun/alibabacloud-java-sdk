// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ListCloudMetricProfilingsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries that are returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The profiling information of a specified cluster.</p>
     */
    @NameInMap("Profilings")
    public ListCloudMetricProfilingsResponseBodyProfilings profilings;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCloudMetricProfilingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudMetricProfilingsResponseBody self = new ListCloudMetricProfilingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudMetricProfilingsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloudMetricProfilingsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloudMetricProfilingsResponseBody setProfilings(ListCloudMetricProfilingsResponseBodyProfilings profilings) {
        this.profilings = profilings;
        return this;
    }
    public ListCloudMetricProfilingsResponseBodyProfilings getProfilings() {
        return this.profilings;
    }

    public ListCloudMetricProfilingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCloudMetricProfilingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo extends TeaModel {
        /**
         * <p>The duration of the profiling process. Unit: seconds</p>
         * <br>
         * <p>Valid values: 10 to 300</p>
         */
        @NameInMap("Duration")
        public Integer duration;

        /**
         * <p>The frequency of the profiling process. Unit: Hz</p>
         * <br>
         * <p>Valid values: 1 to 2000</p>
         */
        @NameInMap("Freq")
        public Integer freq;

        /**
         * <p>The name of the host.</p>
         */
        @NameInMap("HostName")
        public String hostName;

        /**
         * <p>The ID of the node.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the profiling process.</p>
         */
        @NameInMap("Pid")
        public Integer pid;

        /**
         * <p>The ID of the profiling process.</p>
         */
        @NameInMap("ProfilingId")
        public String profilingId;

        /**
         * <p>The time when the profiling process is triggered.</p>
         */
        @NameInMap("TriggerTime")
        public String triggerTime;

        public static ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo self = new ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo();
            return TeaModel.build(map, self);
        }

        public ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo setFreq(Integer freq) {
            this.freq = freq;
            return this;
        }
        public Integer getFreq() {
            return this.freq;
        }

        public ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo setPid(Integer pid) {
            this.pid = pid;
            return this;
        }
        public Integer getPid() {
            return this.pid;
        }

        public ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo setProfilingId(String profilingId) {
            this.profilingId = profilingId;
            return this;
        }
        public String getProfilingId() {
            return this.profilingId;
        }

        public ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo setTriggerTime(String triggerTime) {
            this.triggerTime = triggerTime;
            return this;
        }
        public String getTriggerTime() {
            return this.triggerTime;
        }

    }

    public static class ListCloudMetricProfilingsResponseBodyProfilings extends TeaModel {
        @NameInMap("ProfilingInfo")
        public java.util.List<ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo> profilingInfo;

        public static ListCloudMetricProfilingsResponseBodyProfilings build(java.util.Map<String, ?> map) throws Exception {
            ListCloudMetricProfilingsResponseBodyProfilings self = new ListCloudMetricProfilingsResponseBodyProfilings();
            return TeaModel.build(map, self);
        }

        public ListCloudMetricProfilingsResponseBodyProfilings setProfilingInfo(java.util.List<ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo> profilingInfo) {
            this.profilingInfo = profilingInfo;
            return this;
        }
        public java.util.List<ListCloudMetricProfilingsResponseBodyProfilingsProfilingInfo> getProfilingInfo() {
            return this.profilingInfo;
        }

    }

}
