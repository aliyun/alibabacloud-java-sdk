// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ListJobInstanceWorkersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobInstanceWorkers")
    public ListJobInstanceWorkersResponseBodyJobInstanceWorkers jobInstanceWorkers;

    public static ListJobInstanceWorkersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstanceWorkersResponseBody self = new ListJobInstanceWorkersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobInstanceWorkersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListJobInstanceWorkersResponseBody setJobInstanceWorkers(ListJobInstanceWorkersResponseBodyJobInstanceWorkers jobInstanceWorkers) {
        this.jobInstanceWorkers = jobInstanceWorkers;
        return this;
    }
    public ListJobInstanceWorkersResponseBodyJobInstanceWorkers getJobInstanceWorkers() {
        return this.jobInstanceWorkers;
    }

    public static class ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo extends TeaModel {
        @NameInMap("ContainerInfo")
        public String containerInfo;

        @NameInMap("InstanceInfo")
        public String instanceInfo;

        @NameInMap("ApplicationId")
        public String applicationId;

        public static ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo build(java.util.Map<String, ?> map) throws Exception {
            ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo self = new ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo();
            return TeaModel.build(map, self);
        }

        public ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo setContainerInfo(String containerInfo) {
            this.containerInfo = containerInfo;
            return this;
        }
        public String getContainerInfo() {
            return this.containerInfo;
        }

        public ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo setInstanceInfo(String instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public String getInstanceInfo() {
            return this.instanceInfo;
        }

        public ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

    }

    public static class ListJobInstanceWorkersResponseBodyJobInstanceWorkers extends TeaModel {
        @NameInMap("JobInstanceWorkerInfo")
        public java.util.List<ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo> jobInstanceWorkerInfo;

        public static ListJobInstanceWorkersResponseBodyJobInstanceWorkers build(java.util.Map<String, ?> map) throws Exception {
            ListJobInstanceWorkersResponseBodyJobInstanceWorkers self = new ListJobInstanceWorkersResponseBodyJobInstanceWorkers();
            return TeaModel.build(map, self);
        }

        public ListJobInstanceWorkersResponseBodyJobInstanceWorkers setJobInstanceWorkerInfo(java.util.List<ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo> jobInstanceWorkerInfo) {
            this.jobInstanceWorkerInfo = jobInstanceWorkerInfo;
            return this;
        }
        public java.util.List<ListJobInstanceWorkersResponseBodyJobInstanceWorkersJobInstanceWorkerInfo> getJobInstanceWorkerInfo() {
            return this.jobInstanceWorkerInfo;
        }

    }

}
