// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetUserSubmissionStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserSubmissionList")
    public GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList userSubmissionList;

    public static GetUserSubmissionStatisticInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserSubmissionStatisticInfoResponseBody self = new GetUserSubmissionStatisticInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserSubmissionStatisticInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserSubmissionStatisticInfoResponseBody setUserSubmissionList(GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList userSubmissionList) {
        this.userSubmissionList = userSubmissionList;
        return this;
    }
    public GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList getUserSubmissionList() {
        return this.userSubmissionList;
    }

    public static class GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission extends TeaModel {
        @NameInMap("Submission")
        public Long submission;

        @NameInMap("User")
        public String user;

        public static GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission build(java.util.Map<String, ?> map) throws Exception {
            GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission self = new GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission();
            return TeaModel.build(map, self);
        }

        public GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission setSubmission(Long submission) {
            this.submission = submission;
            return this;
        }
        public Long getSubmission() {
            return this.submission;
        }

        public GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission setUser(String user) {
            this.user = user;
            return this;
        }
        public String getUser() {
            return this.user;
        }

    }

    public static class GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList extends TeaModel {
        @NameInMap("ClusterStatUserSubmission")
        public java.util.List<GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission> clusterStatUserSubmission;

        public static GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList build(java.util.Map<String, ?> map) throws Exception {
            GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList self = new GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList();
            return TeaModel.build(map, self);
        }

        public GetUserSubmissionStatisticInfoResponseBodyUserSubmissionList setClusterStatUserSubmission(java.util.List<GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission> clusterStatUserSubmission) {
            this.clusterStatUserSubmission = clusterStatUserSubmission;
            return this;
        }
        public java.util.List<GetUserSubmissionStatisticInfoResponseBodyUserSubmissionListClusterStatUserSubmission> getClusterStatUserSubmission() {
            return this.clusterStatUserSubmission;
        }

    }

}
