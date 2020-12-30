// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetQueueSubmissionStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("QueueSubmissionList")
    public GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList queueSubmissionList;

    public static GetQueueSubmissionStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueSubmissionStatisticInfoResponseBody self = new GetQueueSubmissionStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueSubmissionStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueueSubmissionStatisticInfoResponseBody setQueueSubmissionList(GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList queueSubmissionList) {
        this.queueSubmissionList = queueSubmissionList;
        return this;
    }
    public GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList getQueueSubmissionList() {
        return this.queueSubmissionList;
    }

    public static class GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission extends TeaModel {
        @NameInMap("Submission")
        public Long submission;

        @NameInMap("Queue")
        public String queue;

        public static GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission build(java.util.Map<String, ?> map) throws Exception {
            GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission self = new GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission();
            return TeaModel.build(map, self);
        }

        public GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission setSubmission(Long submission) {
            this.submission = submission;
            return this;
        }
        public Long getSubmission() {
            return this.submission;
        }

        public GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission setQueue(String queue) {
            this.queue = queue;
            return this;
        }
        public String getQueue() {
            return this.queue;
        }

    }

    public static class GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList extends TeaModel {
        @NameInMap("ClusterStatQueueSubmission")
        public java.util.List<GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission> clusterStatQueueSubmission;

        public static GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList build(java.util.Map<String, ?> map) throws Exception {
            GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList self = new GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList();
            return TeaModel.build(map, self);
        }

        public GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionList setClusterStatQueueSubmission(java.util.List<GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission> clusterStatQueueSubmission) {
            this.clusterStatQueueSubmission = clusterStatQueueSubmission;
            return this;
        }
        public java.util.List<GetQueueSubmissionStatisticInfoResponseBodyQueueSubmissionListClusterStatQueueSubmission> getClusterStatQueueSubmission() {
            return this.clusterStatQueueSubmission;
        }

    }

}
