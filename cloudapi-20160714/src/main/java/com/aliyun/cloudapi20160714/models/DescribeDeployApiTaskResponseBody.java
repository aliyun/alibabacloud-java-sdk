// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployApiTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeployedResults")
    public DescribeDeployApiTaskResponseBodyDeployedResults deployedResults;

    public static DescribeDeployApiTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployApiTaskResponseBody self = new DescribeDeployApiTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeployApiTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeployApiTaskResponseBody setDeployedResults(DescribeDeployApiTaskResponseBodyDeployedResults deployedResults) {
        this.deployedResults = deployedResults;
        return this;
    }
    public DescribeDeployApiTaskResponseBodyDeployedResults getDeployedResults() {
        return this.deployedResults;
    }

    public static class DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult extends TeaModel {
        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("ApiUid")
        public String apiUid;

        @NameInMap("DeployedStatus")
        public String deployedStatus;

        public static DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult self = new DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult();
            return TeaModel.build(map, self);
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setApiUid(String apiUid) {
            this.apiUid = apiUid;
            return this;
        }
        public String getApiUid() {
            return this.apiUid;
        }

        public DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult setDeployedStatus(String deployedStatus) {
            this.deployedStatus = deployedStatus;
            return this;
        }
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

    }

    public static class DescribeDeployApiTaskResponseBodyDeployedResults extends TeaModel {
        @NameInMap("DeployedResult")
        public java.util.List<DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult> deployedResult;

        public static DescribeDeployApiTaskResponseBodyDeployedResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployApiTaskResponseBodyDeployedResults self = new DescribeDeployApiTaskResponseBodyDeployedResults();
            return TeaModel.build(map, self);
        }

        public DescribeDeployApiTaskResponseBodyDeployedResults setDeployedResult(java.util.List<DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult> deployedResult) {
            this.deployedResult = deployedResult;
            return this;
        }
        public java.util.List<DescribeDeployApiTaskResponseBodyDeployedResultsDeployedResult> getDeployedResult() {
            return this.deployedResult;
        }

    }

}
